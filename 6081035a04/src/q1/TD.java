package q1;

public class TD {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.setObjOne(5);
        box1.setObjTwo(6);

        System.out.println(box1.getObj());
        System.out.println(box1.getObj());

        Box<String> box2 = new Box<>();
        box2.setObjOne("Hey");
        box2.setObjTwo("Ha");

        System.out.println(box2.getObj());
        System.out.println(box2.getObj());
    }
}
