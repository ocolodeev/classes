public class Lesson5 {

    //-----------------------------------------------------------------------------
    //Fibonaci Loop

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
    //-----------------------------------------------------------------------------
    //Fibonacci recursive

    public static int fibonacciRecurs(int fibnumber) {
        int i;
        int nr1 = 0;
        int nr2 = 1;
        int fibonaccinr = 0;

        if (fibnumber == 0) {
            return 0;
        } else if (fibnumber == 1 || fibnumber == 2) {
            return 1;

        } else {
            System.out.println();
            return fibonacciRecurs(fibnumber - 1) + fibonacciRecurs(fibnumber - 2);
        }


//        if (fibnumber >= 1) {
//            fibonaccinr = nr1 + nr2;
//            //System.out.println(fibonaccinr);
//            nr1 = nr2;
//            nr2 = fibonaccinr;
//
//        }
//        return fibonacciRecurs(fibnumber - 1);
    }
    //-----------------------------------------------------------------------------
    // Fibonacci range check

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
                //System.out.println(fibonaccinr);
            }
        }
        return count;
    }

    //-----------------------------------------------------------------------------
    public static void main(String args[]) {

        long start = System.currentTimeMillis();

        //System.out.println(fibonacciLoop(10));
        System.out.println(fibonacciRecurs(10));
        //System.out.println(fibonacciRangecheck(1, 1000000));

        long end = System.currentTimeMillis();
        long difference = (end - start);

        System.out.println("Process took: " + difference + " miliseconds");
    }
}
