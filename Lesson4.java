
public class Lesson4 {

    private static int greatestCD(int number1, int number2) {

        int multiplicator;
        int difference;
        int gcdnumber = 0;

        int difference1 = number2;

/*  first variant

        for(int i = 1; i <= number1 && i <= number2; i++)
        {
            if(number1%i==0 && number2%i==0)
                gcdnumber = i;
        }
*/


// second variant

        while (difference1 > 0) {

            multiplicator = number2 / number1;

            difference = number2 - (number1 * multiplicator);
            difference1 = difference;

            if (difference == 0) {

                return number1;
            }

            number2 = number1;
            number1 = difference;
        }

        return gcdnumber;
    }


    public static void main(String args[]) {

        int num1 = 6;
        int num2 = 21;

        System.out.println(greatestCD(num1, num2));

    }

}



