package Model;

public class Sandwich {

    private String name;
    private String[] condiments;

    public Sandwich() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCondiments() {
        return condiments;
    }

    public void setCondiments(String[] condiments) {
        this.condiments = condiments;
    }
}
