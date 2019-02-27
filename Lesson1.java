public class Lesson1 {

    public static boolean primenumber(int nr) {
        boolean prim = true;

        if (nr < 2) {
            prim = false;


        } else if (nr == 2 || nr == 3 || nr == 5) {
            prim = true;


        }else if (nr % 2 == 0 || nr % 3 == 0 || nr % 5 == 0) {

                prim = false;



        //} else if (nr % 2 != 0 && nr % 3 != 0 && nr % 5 != 0) {
        //}else if (nr != 2 || nr != 3 || nr != 5) {
        }else{
            for (int i = 3; i <= Math.sqrt(nr); i+=2) {

                if (nr % i == 0) {

                    prim = false;

                } //else
                   // prim = true;
            }

        }

        return prim;
    }

    public static void main(String[] args) {

        int min = 1;
        int max = 100;
        int count = 0;
        int i;

        long start = System.currentTimeMillis();

        for (i = min; i <= max; i++) {
            if (primenumber(i))
                count++;
            //System.out.println(i + " " + count + primenumber(i));
        }
        System.out.println(count + " numbers are prime in range " + min + " and " + max);
        long end = System.currentTimeMillis();
        long difference = (end - start);

        System.out.println("Process took: " + difference + " miliseconds");
    }
}


//public class Lesson1 {
//    public static void main(String[] args) {
//        int min = 2;
//        int max = 1000000;
//        int prime = 0;
//
//        int i;
//        int j;
//
////        System.out.println("Prime numbers in range " + min + " - " + max + " are following:");
//        long start = System.currentTimeMillis();
//
//        for (i = min; i <= max; i++) {
//
//            for (j = 2; j < i; j++) {
//
//                if (i % j == 0) {
//                    prime = 0;
//                    break;
//                } else {
//                    prime = 1;
//                }
//            }
//            if (prime == 1) {
//               //System.out.println(i);
//            }
//
//        }
//        long end = System.currentTimeMillis();
//        long difference = (end - start);
//
//        System.out.println("Process took: " + difference + " miliseconds");
//    }
//}


//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//        public class Lesson1 {
//            List<Integer> primeNumbers(int n) {
//                List<Integer> res = new ArrayList<>();
//                int prime = 0;
//                int i;
//                int count = 2;
//                for (i = 2; i <= n; i++) {
//
////            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
//
//                    for (int j = 2; j < i / 2; j++) {
//                        if (i % j == 0) {
//                            prime = 0;
//
//                            break;
//                        } else {
//                            prime = 1;
//
//                        }
//
//                    }
//                    if (prime == 1) {
//                        res.add(count);
//                    }
//                    count++;
//                }
//                return res;
//            }


//                for (int j = 2; j < i/2; j++) {
//
//                    if (i % j != 0) {
//                        System.out.println(i);
//                        res.add(i);
//                    }
//
//                }
//            }
//        }
//            return res;
//
//    }

//            public static void main(String args[]) {
//                System.out.println(new Lesson1().primeNumbers(35));
//            }
//        }
