package classes;

public abstract class TestCase implements Printable {

    public static int numberOfInstances = 0;

    private String name;
    private int id;
    private int instanceNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TestCase() {

    }

    protected TestCase(String name, int id) {

        numberOfInstances++;

        this.name = name;
        this.id = id;

        instanceNumber = numberOfInstances;
    }

    public void setName(String name) {

        if(this.name == null) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("{ \"key\":\"name\", \"value\":\"%s\" }, { \"key\":\"id\", \"value\":\"%d\" }" , getName(), getId());
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
