public class sudoku {

    static int N = 9; // Size of the Sudoku grid (N*N)

    // Solves the Sudoku by assigning values to unfilled positions
    static boolean solveSudoku(int grid[][], int row, int col) {
        // If the last column of the last row is reached, solution is found
        if (row == N - 1 && col == N)
            return true;

        // Move to next row if end of column is reached
        if (col == N) {
            row++;
            col = 0;
        }

        // Skip filled cells
        if (grid[row][col] != 0)
            return solveSudoku(grid, row, col + 1);

        // Try filling the cell with numbers 1-9
        for (int num = 1; num <= 9; num++) {
            if (isSafe(grid, row, col, num)) {
                grid[row][col] = num; // Assign the number

                // Recursively solve the next cell
                if (solveSudoku(grid, row, col + 1))
                    return true;

                grid[row][col] = 0; // Backtrack if the assignment was incorrect
            }
        }
        return false; // Trigger backtracking
    }

    // Print the Sudoku grid
    static void print(int[][] grid) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }

    // Check if assigning num to grid[row][col] is safe
    static boolean isSafe(int[][] grid, int row, int col, int num) {
        // Check row, column, and 3x3 subgrid
        for (int x = 0; x < N; x++) {
            if (grid[row][x] == num || grid[x][col] == num)
                return false;
        }

        int startRow = row - row % 3, startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i + startRow][j + startCol] == num)
                    return false;
            }
        }

        return true; // Safe to place num
    }

    public static void main(String[] args) {
        int grid[][] = {
            { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
            { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
            { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
            { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
            { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
            { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
            { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        if (solveSudoku(grid, 0, 0))
            print(grid);
        else
            System.out.println("No Solution exists");
    }
}
