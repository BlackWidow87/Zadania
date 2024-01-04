public class zad12 {
    /* We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code

     */


    abstract static class Marks {
        abstract double getPercentage();

    }

   static class StudentA extends Marks {
        private int subject1, subject2, subject3;

        public StudentA(int s1, int s2, int s3) {
            this.subject1 = s1;
            this.subject2 = s2;
            this.subject3 = s3;
        }

        @Override
        double getPercentage() {
            return (subject1 + subject2 + subject3) / 3.0;

        }
    }

   static class StudentB extends Marks {
        private int subject1, subject2, subject3, subject4;

        public StudentB(int s1, int s2, int s3, int s4) {
            this.subject1 = s1;
            this.subject2 = s2;
            this.subject3 = s3;
            this.subject4 = s4;
        }

        public double getPercentage() {
            return (subject1 + subject2 + subject3 + subject4) / 4.0;

        }
    }

    public static class MarksTest {
        public static void main(String[] args) {
            StudentA studentA = new StudentA(78,89,50);
            StudentB studentB = new StudentB(68, 72, 90, 87);

            System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
            System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");

        }
    }
}