package Distance;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        int w1L = word1.length();
        int w2L = word2.length();

        int[][] result = new int[w1L + 1][w2L + 1];
        for (int i = 0; i <= w1L; i++) {
            result[i][0] = i;
        }
        for (int j = 0; j <= w2L; j++) {
            result[0][j] = j;
        }

        for (int i = 1; i <= w1L; i++) {
           for (int j = 1; j <= w2L; j++) {
               if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                   result[i][j] = result[i - 1][j - 1];
               } else {
                   int insert = result[i][j - 1] + 1;
                   int delete = result[i -1][j] + 1;
                   int replace = result[i - 1][j - 1] + 1;

                   result[i][j] = Math.min(insert, Math.min(delete, replace));
               }
           }
        }
        return result[w1L][w2L];
    }
}
