
public class perimeter {

    public static int perimeter(int l, int b) {
        int p = 2 * (l + b);
        return p;
    }

    public static void main(String args[]) {
        int l = 10;
        int b = 4;
        System.out.println("perimeter is:" + perimeter(l, b));
    }
}
