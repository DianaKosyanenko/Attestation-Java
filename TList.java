
import java.util.PriorityQueue;
import java.util.Queue;

public class TList {
    PriorityQueue<Toy> TList = new PriorityQueue<>();

    public TList addToy(Toy toy){
        TList.add(toy);
        return this;
    }

    public void addToQue(Toy toy){
        TList.add(toy);
    }

}
