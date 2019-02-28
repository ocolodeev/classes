public class Task_3 {

    /* public static boolean isPalindrome(int x){
        int n = 0;
        int originalNo = x;
         while( x != 0 )
        {

           int remainder = x % 10;
            n = n*10 + remainder;

            x  = x / 10;
        }
       // System.out.println("asd " + n + "vs" + originalNo);
        return n == originalNo;
    }
    */

    public static boolean isPalindrome2(int number){
        int rest = 0, sum = 0;

        for (int k=number; k>=1; k=k/10) {
            rest = k % 10;
            sum += rest;
            sum *= 10;
             }
        sum/=10;
        if (sum != number) return false;
        return true;

    }


    public static void main(String[] args){
        int min = 2;
        int max = 1000000;
        int count = 0;

        long startTime = System.currentTimeMillis();

       for(int i=min; i<=max; i++){
            if(isPalindrome2(i)){
                System.out.print(i + " ");
                count++;
            }
        }

        long endTime = System.currentTimeMillis();
        long seconds = (endTime - startTime);
        System.out.println("\nExecution duration (milisec): " + seconds);
        System.out.println("In range " + min + " - " + max + " are " + count + " Palindrome numbers.");


    }

}
