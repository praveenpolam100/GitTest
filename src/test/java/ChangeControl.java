import java.io.InputStream;
import java.util.Random;

public class ChangeControl {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;

        System.out.println(randomNumber);

    }
}
