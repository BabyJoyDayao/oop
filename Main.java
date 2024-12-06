public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(8.0, "black", true);
        System.out.println("Circle: " + circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4.0, 9.0, "white", false);
        System.out.println("\nrectangle:" + rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

    }
}

