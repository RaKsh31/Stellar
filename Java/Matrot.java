import java.util.*;

class Matrot{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        List<int[]> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String str = sc.nextLine().trim();
            if (str.isEmpty()) break;
            String ar[] = str.split("\\s+");
            int mat[] = new int[ar.length];
            for(int i=0; i<mat.length; i++){
                mat[i] = Integer.parseInt(ar[i]);
            }
        list.add(mat);
        }

        // Convert list to 2D array
        int n = list.size();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = list.get(i);
        }
 for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Transpose the matrix
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            // Reverse each row
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
        System.out.println("Rotated Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
        