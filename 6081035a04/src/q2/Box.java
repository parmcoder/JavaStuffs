package q2;

public class Box<T> {
    private T obj;  // Used to be private Object obj;
    // Note, in generics, the convention is to use
    // one charactedr in uppercase

    public T getObj() {

            return obj;

    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}
