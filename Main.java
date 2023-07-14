import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        TList list = new TList();
        Toy toy1 = new Toy("Doll",5,1);
        Toy toy2 = new Toy("Car", 3,2);
        Toy toy3 = new Toy("PlushBear",7,3);
        Toy toy4 = new Toy("Robot",2,4);


        TList tList = new TList();
        tList.addToQue(toy1);
        tList.addToQue(toy2);
        tList.addToQue(toy3);
        tList.addToQue(toy4);


        Lottery lottery = new Lottery();
        Toy toy = lottery.win(tList.TList);
        System.out.println("Winner: " + toy);

        WriteFile writeFile= new WriteFile();

        try{
            writeFile.writeToFile(toy);
        }catch (IOException e){
            throw  new RuntimeException(e);
        }

    }
}
