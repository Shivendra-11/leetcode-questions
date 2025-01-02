class Solution {
    public int[][] diagonalSort(int[][] mat) {
         Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int rows = mat.length;
        int cols = mat[0].length;

        // Storing elements of each diagonal
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(mat[i][j]);
            }
        }

        // Sorting the elements in each diagonal
        for (ArrayList<Integer> list : map.values()) {
            Collections.sort(list);
        }

        // Replacing elements in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                mat[i][j] = map.get(key).remove(0); // Remove from the start of the list
            }
        }

        return mat;
    }
}