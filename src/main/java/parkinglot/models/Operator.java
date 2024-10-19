package parkinglot.models;

public class Operator extends BaseModel{
    String name;

    public Operator( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
