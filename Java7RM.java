
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class Java7RM {
 
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(
                "C:\\abc.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
        	System.out.println("working");
            e.printStackTrace();

        }
    }
}