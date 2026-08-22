class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case: first row is always [1]
        if (numRows >= 1) {
            triangle.add(Arrays.asList(1));
        }

        // Build each row from the previous one
        for (int row = 1; row < numRows; row++) {
            List<Integer> prevRow = triangle.get(row - 1);
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1); // First element is always 1

            // Middle elements are sum of two above
            for (int j = 1; j < row; j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            newRow.add(1); // Last element is always 1

            triangle.add(newRow);
        }

        return triangle;
    }
}
