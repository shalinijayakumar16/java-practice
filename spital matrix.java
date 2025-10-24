import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>(); // to store result
        int n = matrix.length;  // number of rows
        int m = matrix[0].length;  // number of columns

        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = m - 1;

        while (top <= bottom && left <= right) {

            // 1️⃣ Move left → right
            for (int i = left; i <= right; i++)
                ans.add(matrix[top][i]);
            top++;

            // 2️⃣ Move top → bottom
            for (int i = top; i <= bottom; i++)
                ans.add(matrix[i][right]);
            right--;

            // 3️⃣ Move right → left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(matrix[bottom][i]);
                bottom--;  // ✅ move this outside the for loop
            }

            // 4️⃣ Move bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(matrix[i][left]);
                left++;
            }
        }

        return ans;
    }
}
