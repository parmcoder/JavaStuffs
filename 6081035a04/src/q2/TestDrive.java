package q2;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {
        public static void main(String[] args) {

            List<Box<String>> boxes = new ArrayList<>();

            // Create a box that stores a string object
            Box<String> box1 = new Box<>(); // use a diamond
            box1.setObj("the one and only");

            // Create a box that stores a string object
            Box<Integer> box2 = new Box<>(); // use a diamond
            box2.setObj(9);

            boxes.add(box1);
            //boxes.add(box2); //We can't add Integer object to String object

            Box<String> myBox = boxes.get(0); // Notice <String>
            String s = myBox.getObj();

            System.out.println(s);
        }
    }

