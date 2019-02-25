public class Task_1{

    public static boolean isPrimeNumber(int i){

        boolean res = true;

        for (int j = 2; j < i; j++ ){
            if ( i%j == 0) {
                res = false;}
        }
        return res;

    }

    public static void main(String[] args) {


        int min = 2;
        int max = 1000;
        int count = 0;

        long startTime = System.currentTimeMillis();

        for (int i = min; i <= max; i++) {
            if(isPrimeNumber(i)){
                count ++;
                //System.out.println(i);
            }


        }

        long endTime = System.currentTimeMillis();
        long seconds = (endTime - startTime)/1000;
        System.out.println("Execution duration (sec): " + seconds);

        System.out.println("In range " + min + " - " + max + " are " + count + " prime numbers.");

    }


}
