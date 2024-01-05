public class zad13 {
    /*Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount

     */

    public static class Car {
        double carPrice;
        String carColor;

        public Car(double carPrice, String carColor) {
            this.carPrice = carPrice;
            this.carColor = carColor;
        }

        public double calculateSalePrice() {
            return carPrice;
        }
    }

   static class Sedan extends Car {
        double length;

        public Sedan(double carPrice, String carColor, double length) {
            super(carPrice, carColor);
            this.length = length;
        }

        @Override
        public double calculateSalePrice() {
            if (length > 20) {
                return super.calculateSalePrice() * 0.95;
            } else {
                return super.calculateSalePrice() * 0.9;
            }
        }
    }

    static class Truck extends Car {
        double weight;

        public Truck(double carPrice, String carColor, double weight) {
            super(carPrice, carColor);
            this.weight = weight;
        }

        @Override
        public double calculateSalePrice() {
            if (weight > 2000) {
                return super.calculateSalePrice() * 0.9;
            } else {
                return super.calculateSalePrice() * 0.8;
            }

        }
    }

    static public class Main {
        public static void main(String[] args) {
            Sedan sedan = new Sedan(9999, "Pink", 20);
            System.out.println("Sedan sale price: $" + sedan.calculateSalePrice());

            Truck truck = new Truck(80399, "Black", 50000);
            System.out.println("Truck sale price: $" + truck.calculateSalePrice());


        }
    }
}