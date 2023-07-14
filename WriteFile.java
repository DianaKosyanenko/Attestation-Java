import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public void writeToFile(Toy toy) throws IOException{
        FileWriter writer = new FileWriter("lottery.txt",true);
        writer.write(toy.toString());
        writer.write("\n");
        writer.flush();
    }
}
