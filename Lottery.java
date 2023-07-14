import java.util.ArrayList;
import java.util.PriorityQueue;

public class Lottery {
    public Toy win(PriorityQueue<Toy> TList){
        int sum = 0;
        for (Toy toy: TList){
            sum += toy.getWeight();
        }
        ArrayList<Toy> arrPercent = new ArrayList<>();


        for (Toy toy : TList) {
            int percent = 0;
            percent = calculatePercent(toy.getWeight(), sum);
            while (percent > 0) {
                arrPercent.add(toy);
                percent --;
            }
        }
        return arrPercent.get((int) (Math.random()* 100));

    }
    public int calculatePercent(int weight, int sum){
        return weight * 100 / sum;
    }
}
