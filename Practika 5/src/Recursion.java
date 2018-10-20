import java.util.Scanner;
public class Recursion {
    public void recursion(int i) {
        int x = 1;
        try {
            int a = x / i;
            System.out.println(i);
            i--;
            recursion(i);
        }
        catch(ArithmeticException e) {
            return;
        }
    }

    public static void main(String[] args) {
        int rec;
        Scanner in = new Scanner(System.in);
        rec = in.nextInt();
        Recursion r = new Recursion();
        r.recursion(rec);
    }
}