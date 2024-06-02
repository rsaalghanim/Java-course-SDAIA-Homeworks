package HW1;


// --------------- NAME: RAGAD ALGHANIM ------------------------

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 1;

        for (int i =100; i > 0; i--){

            if ( number %3 == 0 && number %5 ==0 ){

                System.out.println("FizzBuzz");
                number = number +1;

            } else if (number % 7 ==0 ) {

                System.out.println("Jazz");
                number = number + 1;

            }else if (number % 3 ==0) {

                System.out.println("Fizz");
                number = number +1;

            } else if (number % 5 ==0) {

                System.out.println("Buzz");
                number = number +1;

            } else {
                System.out.println(number);
                number = number +1;
            }

        }

    }
}
