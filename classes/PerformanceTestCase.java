package classes;

public class PerformanceTestCase extends TestCase {

    public PerformanceTestCase(String name, int id) {
        super(name, id);
    }

    public void printSomething() {
        System.out.println("I am Performance Test Case");
    }
}
