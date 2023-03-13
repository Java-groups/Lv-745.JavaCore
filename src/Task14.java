package src;

public class Task14 {
    public static int countCoinCombinations() {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
        int[] ways = new int[201];
        ways[0] = 1; // there's only one way to make 0p

        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= 200; j++) {
                ways[j] += ways[j - coins[i]];
            }
        }

        return ways[200];
    }

}
