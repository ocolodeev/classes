package classes;

public class UATTestCase extends TestCase {

    public UATTestCase(String name, int id) {
        super(name, id);
    }

    public UATTestCase(String json) {
        super(json.substring(json.indexOf("{ \"key\":\"name\", \"value\":\"") + 25, json.indexOf("\"", json.indexOf("{ \"key\":\"name\", \"value\":\"") + 26)), Integer.parseInt(json.substring(json.indexOf("{ \"key\":\"id\", \"value\":\"") + 23, json.indexOf("\"", json.indexOf("{ \"key\":\"id\", \"value\":\"") + 24))));
    }

    public void printSomething() {
        System.out.println("I am UAT Test Case");
    }
}
