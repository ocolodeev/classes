public class Lesson2ArmstrongNumber {


    public static boolean armstrongNumber(int nr) {

        boolean armstrong = false;
        int numberOfdigits = 0;
        int result = 0;
        int initialNumber = nr;

        while (initialNumber != 0) {
            initialNumber /= 10;
            ++numberOfdigits;
        }

        initialNumber = nr;

        while (initialNumber != 0) {
            int splitednumber = initialNumber % 10;
            result += Math.pow(splitednumber, numberOfdigits);
            initialNumber /= 10;
        }

        if (result == nr)

            armstrong = true;
        //System.out.print((result == nr) + "\n");


        return armstrong;
    }


    public static void main(String[] args) {

        int min = 0;
        int max = 1000;
        int count = 0;
        System.out.println("Armstrong numbers in range " + min + " - " + max + " are listed below:");

        for (int number = min + 1; number <= max; ++number) {
            if (armstrongNumber(number)) {
                count++;

            }

        }
        System.out.println(count + " numbers are Armstrong numbers in range " + min + " and " + max);
    }

}

//    public static void main(String[] args) {
//
//        int min = 0;
//        int max = 100;
//        System.out.println("Armstrong numbers in range " +min+ " - " +max+ " are listed below:");
//
//        for (int number = min + 1; number <= max; ++number) {
//            int numberOfdigits = 0;
//            int result = 0;
//            int initialNumber = number;
//
//            while (initialNumber != 0) {
//                initialNumber /= 10;
//                ++numberOfdigits;
//            }
//
//            initialNumber = number;
//
//            while (initialNumber != 0) {
//                int splitednumber = initialNumber % 10;
//                result += Math.pow(splitednumber, numberOfdigits);
//                initialNumber /= 10;
//            }
//
//            if (result == number)
//                System.out.print(number +"\n");
//        }
//    }
//}
