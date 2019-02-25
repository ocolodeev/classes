
public class Lesson4 {

    public static int greatestCD(int number1,int number2){

        int multiplicator;
        int remaining=1;
        int gcdnumber=0;

        int remaining1 = remaining;

        for(int i = 1; i <= number1 && i <= number2; i++)
        {
            if(number1%i==0 && number2%i==0)
                gcdnumber = i;
        }

        return gcdnumber;
    }


    public static void main(String args[]) {

        int num1=20;
        int num2=40;

        System.out.println(greatestCD(num1,num2));

    }


}



//        while (remaining1>0) {
//
//            multiplicator = number2 / number1;
//
//            remaining = number2 - number1 * multiplicator;
//
//
//            if (remaining == 0) {
//                gcdnumber = number1;
//
//            }
//        }