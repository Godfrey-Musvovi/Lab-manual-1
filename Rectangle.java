    public class Rectangle {
    double width, height;

    double area()      { return width * height; }
    double perimeter() { return 2 * (width + height); }

    static Rectangle make(double w, double h) {
        Rectangle r = new Rectangle();
        r.width = w;
        r.height = h;
        return r;
    }

    public static void main(String[] args) {
        Rectangle[] rects = {
            make(2, 3), make(5, 4), make(1, 10), make(6, 6), make(3, 3)
        };

        for (Rectangle r : rects) {
            System.out.println(r.width + " x " + r.height
                + " area=" + r.area() + " perimeter=" + r.perimeter());
        }

        Rectangle largest = rects[0];
        for (Rectangle r : rects) {
            if (r.area() > largest.area()) {
                largest = r;
            }
        }

        System.out.println("Largest: " + largest.width + " x " + largest.height
                           + " = " + largest.area());
    }
}
