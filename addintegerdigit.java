//add digits in number

public class addintegerdigit {

    public static void main(String[] args) {
        int input1 = 72379724;
        int sum;
        while (input1 / 10 > 0) {
            sum = 0;
            while (input1 != 0) {
                int digit = input1 % 10;
                sum += digit;
                input1 /= 10;
            }
            input1 = sum;
        }
        System.out.println(input1);

    }
}
