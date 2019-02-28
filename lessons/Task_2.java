public class Task_2 {

    public static boolean isNarcissisticNumber(int x){
        if(x == 0) return false;

        String xStr =String.valueOf(x);
        int m = xStr.length();
        int sum = 0;
        int k = 1;

        for (int j=0; j<m; j++){
            sum +=(int) Math.pow(Integer.parseInt(xStr.substring(j,k++)), m);
        }

        return sum == x;
    }

    public static boolean isNarcissisticNo2(int x){
        if(x == 0) return false;
        int sum = 0;
        int pow = 0;

        for (int j=x; j>=1; j=j/10){
            pow ++;
        }

        for (int k=x; k>=1; k=k/10){
            int rest = k%10;
            sum +=(int) Math.pow(rest, pow);
            }
        if (x!=sum) return false;

        return true;
    }
    public static void main(String[] args){
        int min = 2;
        int max = 10000000;
        int count = 0;

        long startTime = System.currentTimeMillis();

      for(int i=min; i<max; i++){
            if(isNarcissisticNo2(i)){
                System.out.print(i + " ");
                count++;
            }
        }

        long endTime = System.currentTimeMillis();
        long seconds = (endTime - startTime);
        System.out.println("\nExecution duration (sec): " + seconds);
        System.out.println("In range " + min + " - " + max + " are " + count + " narcissistic numbers.");


      /*  int number =10;
        int k=number,
            j=number;
        if (++i = j++)
        {
            System.out.println("equal");
        }
*/
    }
}
