public class SumOfMatrices {
    public static void main(String[] args) {
        int[][] Arr1 =
                {
                        {1, 2, 3},
                        {1, 5, 7}
                };
        int[][] Arr2 = {
                {4, 6, 8},
                {3, 5, 7}
        };
        int[][] Result =
                {
                        {0, 0, 0},
                        {0, 0, 0}
                };
        for (int i = 0; i < Arr1.length; i++) {
            for (int j = 0; j < Arr1[i].length; j++) {
                Result[i][j] = Arr1[i][j] + Arr2[i][j];

            }
        }
        for (int i = 0; i < Result.length; i++) {
            for (int j = 0; j < Result[i].length; j++) {
                System.out.print(Result[i][j] + " ");
            }
            System.out.println(" ");

        }
    }
}
