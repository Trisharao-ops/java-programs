
public class ticketdiscount {

    public static void main(String[] args) {
        int notkt = 21;
        String circle = "q";
        String refreshment = "y";
        String coupon = "n";
        double cost = 0;
        double total = 0;
        if (notkt < 5 || notkt > 40) {
            System.out.println("invalid input");
            System.exit(0);
        }
        if (circle.charAt(0) == 'k') {
            cost = notkt * 75;
        } else if (circle.charAt(0) == 'q') {
            cost = notkt * 150;
        } else {
            System.out.println("invalid input");
        }
        if (notkt > 20) {
            cost = cost - ((0.1) * cost);
        }
        total = cost;
        if (coupon.charAt(0) == 'y') {
            cost = cost - ((0.02) * cost);
        }
        total = cost;
        if (refreshment.charAt(0) == 'y') {
            total = total + (notkt * 50);
        }
        System.out.println("total amount:" + total);
    }
}
