public class PascalTriangle {
    public int pascal(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        }
        return pascal(row - 1, col - 1) + pascal(row - 1, col);
    }

    public static void main(String[] args) {
        int n = 4;
        PascalTriangle triangle = new PascalTriangle();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(" " + triangle.pascal(i, j));
            }

            System.out.println();
        }
    }
}



// Or Use this:
import java.util.*;

class GfG {

    static List<List<Integer>> printPascal(int n) {
        
        List<List<Integer>> mat = new ArrayList<>();

        for (int row = 0; row < n; row++) {
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i <= row; i++) {
                if (row == i || i == 0)
                    arr.add(1);
                else
                    arr.add(mat.get(row - 1).get(i - 1) + 
                            mat.get(row - 1).get(i));
            }
            mat.add(arr);
        }
        return mat;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> mat = printPascal(n);
        for (int i = 0; i < mat.size(); i++) {
            for(int j = 0; j < mat.get(i).size(); j++) {
                    System.out.print(mat.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
