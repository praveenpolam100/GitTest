import java.io.InputStream;

public class ChangeControl {


    int x;
    int y;

    public ChangeControl(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public static void main(String[] args) {

        System.out.println("This is under change control");

    }
}
