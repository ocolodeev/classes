public class Lesson5 {

    public static int fibonacciLoop(int fibnumber) {
        int i;
        int nr1 = 0;
        int nr2 = 1;
        int fibonaccinr = 0;

        for (i = 1; i <= fibnumber; i++) {

            fibonaccinr = nr1 + nr2;
            System.out.println(fibonaccinr);
            nr1 = nr2;
            nr2 = fibonaccinr;
        }
        return fibonaccinr;
    }

//    public static int fibonacciRecurs(int fibnumber){
//
//
//    }

    public static int fibonacciRangecheck(int min, int max) {

        int i;
        int nr1 = 0;
        int nr2 = 1;
        int fibonaccinr;
        int count = 0;

        for (i = 1; i <= max; i++) {

            fibonaccinr = nr1 + nr2;
            //System.out.println(fibonaccinr);
            nr1 = nr2;
            nr2 = fibonaccinr;

            if (fibonaccinr > max) {

                return count;
            }

            if (fibonaccinr >= min && fibonaccinr <= max) {
                count++;
                System.out.println(fibonaccinr);
            }
        }
        return count;
    }

    public static void main(String args[]) {

        long start = System.currentTimeMillis();

        //System.out.println(fibonacciLoop(500));
        System.out.println(fibonacciRangecheck(1, 1000000));

        long end = System.currentTimeMillis();
        long difference = (end - start);

        System.out.println("Process took: " + difference + " miliseconds");
    }
}
