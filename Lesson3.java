
public class Lesson3 {

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
            System.out.println(reverse);
        }


        if (forNumber == reverse) {
            palindrome = true;
        }
        return palindrome;
    }


    public static void main(String args[]) {
        int number = 22522;
        if (palindrome(number)) {
            System.out.println("Number " + number + " is palindrome");
        }


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