
public class AliasDemo {
    public static void main(String[] args) {
        Rectangle r1 = Rectangle.make(5, 2);
        System.out.println("Before: r1.width = " + r1.width);

        Rectangle r2 = r1;        // copies the reference, not the object
        r2.width = 10;

        // Prediction: r1.width will be 10.0, because r1 and r2 point to the same object
        System.out.println("After:  r1.width = " + r1.width);
        System.out.println("r1 == r2 ? " + (r1 == r2));

        Rectangle r3 = Rectangle.make(5, 2);
        Rectangle r4 = Rectangle.make(5, 2);
        r4.width = 99;
        System.out.println("r3.width = " + r3.width + " (unchanged, separate object)");
        System.out.println("r3 == r4 ? " + (r3 == r4));
    }
}