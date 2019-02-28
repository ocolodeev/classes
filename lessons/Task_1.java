public class Task_1{

    public static boolean isPrimeNumber(int number){


        if (number>0 && number<3) return true;

        if (number<0) return false;

        for (int j = 3; j < Math.sqrt(number); j+=2 ){
            if ( number%j == 0) {
                return false;}
        }
        return true;

    }

    public static void main(String[] args) {

       // System.out.println(isPrimeNumber(-10));

        int min = 2;
        int max = 50000;
        int count = 0;

        long startTime = System.currentTimeMillis();

        for (int i = min; i <= max; i++) {
            if(isPrimeNumber(i)){
                count ++;
                //System.out.println(i);
            }


        }

        long endTime = System.currentTimeMillis();
        long seconds = (endTime - startTime);
        System.out.println("Execution duration (sec): " + seconds);

        System.out.println("In range " + min + " - " + max + " are " + count + " prime numbers.");


    }


}
