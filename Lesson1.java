public class Lesson1 {
    public static void main(String[] args) {
        int min = 2;
        int max = 1000;
        int prime = 0;

        int i;
        int j;

        System.out.println("Prime numbers in range " + min + " - " + max + " are following:");

        for (i = min; i <= max; i++) {

            for (j = 2; j < i; j++) {

                if (i % j == 0) {
                    prime = 0;
                    break;
                } else {
                    prime = 1;
                }
            }
            if (prime == 1) {
                System.out.println(i);
            }

        }

    }
}
