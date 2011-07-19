import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Checkout {

    public static void main(String[] args) throws IOException {
        new Checkout();
    }

    public Checkout() throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = bufferedReader.readLine()) != null) {
            System.out.println(input);
        }
    }

}
