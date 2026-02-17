    package Homework.Practice_question_for_UNIT_I;

    public class nested_if {
        public static void main(String[] args) {

            int a = 10;
            int b = 9;
            int c = 8;

            if (a > b && a > c) {
                System.out.println(a + " is the greatest number");
            } else if (b > a && b > c) {
                System.out.println(b + " is the greatest number");
            } else {
                System.out.println(c + " is the greatest number");
            }
        }
    }