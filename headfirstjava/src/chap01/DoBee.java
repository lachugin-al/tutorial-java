package chap01;

// TODO: DoBeeDoBeeDo
public class DoBee {

    public static void main(String[] args) {
        int x = 1;
        while(x < 3) {
            System.out.print("Do");
            System.out.print("Bee");
            x = x + 1;
        }
        if(x == 3) {
            System.out.print("Do");
        }
    }
}