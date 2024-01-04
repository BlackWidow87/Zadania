public class zad11 {

    /*Create interface 'Shape" with undefined methods as calculateArea and calculatesPerimeter.
    Create 2 classes Circle and Square that implements functionality defined in Shape Interface.

     */

    interface Shape {
        double calculateArea();

        double calculatePerimeter();

    }

   static class Circle implements Shape {

        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Square implements Shape {

        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * side;
        }
    }

    public static class ShapeTest {
        public static void main(String[] args) {

            Circle circle = new Circle(3.5);
            System.out.println("Circle area is: "+ circle.calculateArea());
            System.out.println("Circle Perimeter is: " + circle.calculatePerimeter());

            Square square = new Square(9);
            System.out.println("Square area is " + square.calculateArea());
            System.out.println("Square perimeter is " + square.calculatePerimeter());

        }

    }
}