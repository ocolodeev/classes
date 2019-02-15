public class Lesson2ArmstrongNumber {
    public static void main(String[] args) {

        int min = 0;
        int max = 10000;
        System.out.println("Armstrong numbers in range " +min+ " - " +max+ " are listed below:");

        for (int number = min + 1; number <= max; ++number) {
            int numberOfdigits = 0;
            int result = 0;
            int initialNumber = number;

            while (initialNumber != 0) {
                initialNumber /= 10;
                ++numberOfdigits;
            }

            initialNumber = number;

            while (initialNumber != 0) {
                int splitednumber = initialNumber % 10;
                result += Math.pow(splitednumber, numberOfdigits);
                initialNumber /= 10;
            }

            if (result == number)
                System.out.print(number +"\n");
        }
    }
}
