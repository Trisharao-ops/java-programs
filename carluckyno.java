//4 digitnumber which should be divisible by either 3 or 7 or 5

public class carluckyno {

    public static void main(String[] args) {
        int num = 1237;
        int sum = 0;
        if (num < 1000 || num > 9999) {
            System.out.println("invalid number");
        } else {
            while (num != 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
        }
        if (sum % 3 == 0 || sum % 7 == 0 || sum % 5 == 0) {
            System.out.println("lucky number");
        } else {
            System.out.println("sorry not my lucky number");
        }

    }
}
