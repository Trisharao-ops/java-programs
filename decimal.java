
public class decimal {

    public static void main(String[] args) {
        String arr[] = {"0.6", "0.2reverse", "0.5", "0.8"};
        int n = arr.length;
        int decimal[] = new int[n];
        for (int i = 0; i < n; i++) {
            String[] part = arr[i].split("\\.");
            decimal[i] = Integer.parseInt(part[1]);
        }
        int leftsum = 0;
        int rightsum = 0;
        for (int i = 0; i < n / 2; i++) {
            leftsum += decimal[i];
        }
        for (int i = n / 2; i < n; i++) {
            rightsum += decimal[i];
        }
        if (leftsum == rightsum) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }
}
