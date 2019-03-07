package init;

import classes.PerformanceTestCase;
import classes.Printable;
import classes.TestCase;
import classes.UATTestCase;

public class Starter {

    public static void main(String args[]) {
        System.out.println(TestCase.numberOfInstances);

        PerformanceTestCase performanceTestCase = new PerformanceTestCase("performance test case", 10);
        UATTestCase uatTestCase = new UATTestCase("uat test case", 20);

        System.out.println(uatTestCase.toString());

        UATTestCase uatTestCase1 = new UATTestCase(uatTestCase.toString());

        System.out.println(uatTestCase1.toString());

        System.out.println(TestCase.numberOfInstances);

        System.out.println(performanceTestCase.getInstanceNumber());
        System.out.println(uatTestCase.getInstanceNumber());
        System.out.println(uatTestCase1.getInstanceNumber());

        System.out.println(TestCase.numberOfInstances);


        //============================

        Printable printable = new UATTestCase("123", 123);
        printable.printSomething();

        TestCase[] testCases = new TestCase[10];

        for (int i = 0; i < 10; i++) {

            if (i < 5) {
                testCases[i] = new UATTestCase("UAT Test Case ", i);
            } else {
                testCases[i] = new PerformanceTestCase("Performance Test Case ", i);
            }
        }

        for (TestCase testCase : testCases) {
            testCase.printSomething();
        }

    }
}
