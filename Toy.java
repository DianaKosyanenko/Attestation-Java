public class Toy implements Comparable<Toy> {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Toy(String name,  Integer weight, Integer ID) {
        this.name = name;
        this.weight = weight;
        this.ID = ID;
    }

    private String name;

    private Integer weight;
    private Integer ID;


    @Override
    public String toString() {
        return String.format("название игрушки: %s, ID игрушки: %d, вес игрушки: %d", name, ID, weight);
    }

    @Override
    public int compareTo(Toy o) {
        int value = ((Toy) o).ID;
        return this.ID - value;
    }
}
