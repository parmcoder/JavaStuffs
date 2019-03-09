package q3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bookstore {
    // table name = inventory, there are names, prices, quantities
    public static void main(String[] args) throws ClassNotFoundException {
        // load the sqlite-JDBC driver using the current class loader
        Class.forName("org.sqlite.JDBC");

        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:bookstore.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            statement.executeUpdate("DROP TABLE IF EXISTS inventory");

            statement.executeUpdate("CREATE TABLE inventory (book_name STRING, price FLOAT, quantity INTEGER )");

            statement.executeUpdate("INSERT INTO inventory VALUES('Computer Science', 9.99, 50)"); //adding books
            statement.executeUpdate("INSERT INTO inventory VALUES('JAVA', 9.99, 50)");
            statement.executeUpdate("INSERT INTO inventory VALUES('PYTHON', 9.99, 50)");

            ResultSet rs = statement.executeQuery("SELECT * FROM inventory"); //listing all books
            while(rs.next())
            {
                // read the result set
                System.out.print("Book = " + rs.getString("book_name"));
                System.out.print(", Price = " + rs.getString("price")); //stay in the same line
                System.out.println(", quantity = " + rs.getString("quantity")); //new line

            }

        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }
        finally{
            try{
                if(connection != null)
                    connection.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }

}


