
public class roomindex {

    public static void main(String[] args) {

        int N = 8;                 // size of array
        int S = 3;                 // starting index
        int[] A = {23, 7, 3, 1, 2, 4, 6, 18}; // array

        boolean[] visited = new boolean[N];
        int index = S;
        boolean moveRight = true;  // first move is right

        while (true) {

            // if same index visited again → loop
            if (visited[index]) {
                System.out.println(-1);
                break;
            }

            visited[index] = true;
            int steps = A[index];

            int nextIndex;
            if (moveRight) {
                nextIndex = index + steps;
            } else {
                nextIndex = index - steps;
            }

            // out of bounds
            if (nextIndex < 0 || nextIndex >= N) {
                System.out.println(A[index]);
                break;
            }

            index = nextIndex;
            moveRight = !moveRight; // change direction
        }
    }
}
