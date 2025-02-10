import java.io.InputStream;

public class ChangeControl {


    int x;


    public ChangeControl(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }



    public static void main(String[] args) {

        System.out.println("This is under change control");
        ChangeControl cc = new ChangeControl(10);
        System.out.println(cc.getX());
        cc.setX(20);
        System.out.println(cc.getX());


    }
}
