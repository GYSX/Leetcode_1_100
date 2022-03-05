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
        Map<Character,Integer> i_map=new HashMap<>();
        Map<Character,Integer> j_map=new HashMap<>();
        Map<Character,Integer> n_map=new HashMap<>();
        int i=0,j=0;

        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                if (n_map.get(board[i][j])==null) {
                    n_map.put(board[i][j], 0);
                }else {
                    return false;
                }
            }
        }



        for (i=0;i<9;i++){
            for (j=0;j<9;j++){
                if (board[i][j]!='.'){
                    if (j_map.get(board[i][j])==null){
                        j_map.put(board[i][j],0);

                        n_map.put(board[i][j],0);
                    }else {
                        return false;
                    }
                }
            }
        }

        return false;
    }
}
