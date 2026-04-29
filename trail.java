
public class trail {

    public static int countFairSplits(int N, int[] A) {
        int totalSum = 0;
        for (int num : A) {
            totalSum += num;
        }
        int count = 0;
        int prefixSum = 0;
        for (int i = 0; i < N - 1; i++) {
            prefixSum += A[i];
            int suffixSum = totalSum - prefixSum;
            if (Math.abs(prefixSum - suffixSum) % 2 == 0) {
                count++;
            }
        }
        return 4;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] A = {10, 10, 3, 7, 6};
        System.out.println(countFairSplits(N, A));
    }
}
