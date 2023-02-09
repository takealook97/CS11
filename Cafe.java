import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cafe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Output output = new Output();
        output.printInit();
        while(true){
            System.out.print("> ");
            String[] input = br.readLine().split(":");
            new Cashier().getOrder(input);

        }
    }
}
