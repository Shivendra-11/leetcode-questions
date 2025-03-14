class Solution {
    public int[][] diagonalSort(int[][] mat) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int rows = mat.length;
        int cols = mat[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i-j;
                if(!map.containsKey(key)){
                    map.put(key,new ArrayList<>());
                }
                map.get(key).add(mat[i][j]);
            }
        }

        
        for (ArrayList<Integer> list : map.values()) {
            Collections.sort(list);
        }

       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                mat[i][j] = map.get(key).remove(0);
            }
        }

        return mat;
    }
}