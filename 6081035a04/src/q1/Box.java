package q1;

public class Box<T> {
    private T obj1;  // Used to be private Object obj;
    // Note, in generics, the convention is to use
    // one charactedr in uppercase
    private T obj2;

    public T getObj() {
        double random = Math.random();
        if (random > 0.5) {
            return obj2;
        } else {
            return obj1;
        }
    }

    public void setObjTwo(T obj) {
        this.obj1 = obj;
    }
    public void setObjOne(T obj) {
        this.obj2 = obj;
    }
}
