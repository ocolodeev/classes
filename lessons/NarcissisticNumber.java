public class NarcissisticNumber {

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


    public static void main(String[] args){
        int min = 2;
        int max = 10000;
        int count = 0;

        for(int i=min; i<max; i++){
            if(isNarcissisticNumber(i)){
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
