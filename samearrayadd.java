
public class samearrayadd {

    public static void main(String[] args) {
        int input1[] = {1, 2, 3};
        int input2 = 3;
        int res[] = new int[input2 * 2];
        int i = 0;
        for (int num : input1) {
            res[i] = num;
            res[i + input2] = num;
            i++;
        }
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j]);
        }
    }
}
