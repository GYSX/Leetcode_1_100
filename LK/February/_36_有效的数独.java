import java.util.HashMap;
import java.util.Map;

public class _36_有效的数独 {
    public static void main(String[] args){
        char[][] board=new char[9][9];
        board[0]= new char[]{'5', '3', '.', '.', '7', '.', '.', '.', '.'};
        board[1]= new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'};
        board[2]= new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'};
        board[3]= new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'};
        board[4]= new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'};
        board[5]= new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'};
        board[6]= new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'};
        board[7]= new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'};
        board[8]= new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'};

        boolean flag =isValidSudoku(board);

        System.out.println(flag);
    }
    public static boolean isValidSudoku(char[][] board) {
        //记录行，int[i][j] i为第i行 j为数字j rows[i][j]代表第i行数字j出现的个数
            int[][] rows = new int[9][9];
            int[][] columns = new int[9][9];
            int[][][] subboxes = new int[3][3][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    char c = board[i][j];
                    if (c != '.') {
                        int index = c - '0' - 1;
                        rows[i][index]++;
                        columns[j][index]++;
                        subboxes[i / 3][j / 3][index]++;
                        if (rows[i][index] > 1 || columns[j][index] > 1 || subboxes[i / 3][j / 3][index] > 1) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

}
