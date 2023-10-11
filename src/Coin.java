import java.util.Scanner;

class Coin{

    public static int countWaysNaiveRecursive(int [] denominations, int idx, int N) {

        if (N == 0) {
            return 1;
        }

        if (N < 0) {
            return 0;
        }

        if (idx >= denominations.length && N >= 1) {
            return 0;
        }

        return
                countWaysNaiveRecursive(denominations, idx + 1, N)
                        + countWaysNaiveRecursive(denominations, idx, N - denominations[idx]);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int N = myObj.nextInt();
        int n = myObj.nextInt();
        int [] denominations = new int[n];
        for (int i = 0; i< n; i++){
            denominations[i] = myObj.nextInt();
        }
        System.out.println(countWaysNaiveRecursive(denominations, 0, N));
    }
}