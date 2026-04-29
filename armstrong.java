//sum of pow of cube of a digits in number

public class armstrong {

    public static void main(String[] args) {
        int num = 372;
        int orgnum = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }
        if (orgnum == sum) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not");
        }

    }
}
