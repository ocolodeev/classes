
public class Lesson3 {

    public static int getNumberOfDigit(int number) {
        int initialNumber = number, numberOfdigits = 0;

        while (initialNumber != 0) {
            initialNumber /= 10;
            ++numberOfdigits;
        }
        return numberOfdigits;
    }

    public static boolean isPalindromeRecursive(int number) {
        if (getNumberOfDigit(number) <= 1) {
            return true;
        }

        int lastNumber = number % 10;
        int firstNumber = (int) (number / Math.pow(10, getNumberOfDigit(number) - 1));


        int newnumber = number / 10;


        newnumber = (int) (newnumber % Math.pow(10, getNumberOfDigit(newnumber) - 1));
        System.out.println(String.format("Number: %d, Last digit: %d, First digit: %d, New number: %s", number, lastNumber, firstNumber, newnumber));

        return lastNumber == firstNumber && isPalindromeRecursive(newnumber);


    }
    //-----------------------------------------------------------------------------

    public static boolean isPalindromeString(String text) {

        String textrev = new StringBuilder(text).reverse().toString();
        System.out.println(textrev);
        return text.equals(textrev);

    }
    //-----------------------------------------------------------------------------

    public static boolean palindrome(int number) {

        boolean palindrome = false;
        int reverse = 0;

        int initialNumber = number;
        int numberOfdigits = 0;
        int splitednumber = 0;

        while (initialNumber != 0) {
            initialNumber /= 10;
            ++numberOfdigits;
            //System.out.println(numberOfdigits);
        }

        int forNumber = number;
        for (int i = numberOfdigits - 1; i >= 0; i--) {
            splitednumber = number % 10;
            reverse = (reverse * 10) + splitednumber;
            number = number / 10;
            //System.out.println(reverse);
        }


        if (forNumber == reverse) {
            palindrome = true;
        }
        return palindrome;
    }


    public static void main(String args[]) {
        int number = 1001001;
        String text = "lalalal";
        System.out.println(isPalindromeString(text));
//        if (palindrome(number)) {
//            System.out.println("Number " + number + " is palindrome");
//        }


    }
}


//
//public class Lesson3 {
//
//    public static boolean palindrome(String text) {
//
//        boolean palindrome = false;
//        String reverse = "";
//
//        int length = text.length();
//        for (int i = length - 1; i >= 0; i--)
//            reverse = reverse + text.charAt(i);
//
//        if (text==(reverse)) {
//            palindrome = true;
//        }
//        return palindrome;
//    }
//
//
//    public static void main(String args[]) {
//        String text = "1221";
//        if (palindrome(text)) {
//            System.out.println("Text/number "+ text +" is palindrome");
//        }
//
//
//    }
//}