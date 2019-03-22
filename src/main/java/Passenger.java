public class Passenger {

    private String name;
    private String bags;

    public Passenger (String name, String bags) {
        this.name = name;
        this.bags = bags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBags() {
        return bags;
    }

    public void setBags(String bags) {
        this.bags = bags;
    }
}
