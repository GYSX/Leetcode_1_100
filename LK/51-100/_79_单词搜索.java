import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _79_单词搜索 {
//    [["C","A","A"],["A","A","A"],["B","C","D"]] "AAB"
    public static void main(String[] args) {
        List<char[]> jg=new ArrayList<>();
        jg.add(new char[]{   'C','A','A'        });
        jg.add(new char[]{   'A','A','A'        });
        jg.add(new char[]{   'B','C','D'        });

        boolean i=exist(     jg.toArray(new char[jg.size()][3]) ,"AAB"  );

        System.out.println("结果："+i);
    }
    public static boolean exist(char[][] board, String word) {
        int maxX =board.length, maxY =board[0].length;
        char c=word.charAt(0);
        for (int i=0;i<maxX;i++){
            for (int j=0;j<maxY;j++){
                char C=board[i][j];
                if (C==c){
                    boolean[][] table=new boolean[maxX][maxY];
                    table[i][j]=true;
                    System.out.println("找到：<"+i+":"+j+">");
                  if (Exist(board, word ,1, i,j,table)){
                      return true;
                    }
                  System.out.println("下一次开始");
                }

            }
        }

        return false;
    }
    public static boolean Exist(char[][] board, String word ,int c,int x,int y,boolean[][] table){
        if (c== word.length()){
            return true;
        }
        int maxX =board.length, maxY =board[0].length;
        char C=word.charAt(c);
        boolean flag=false;
//        System.out.println("zm="+C);

        /*上*/if ((x-1)>-1 && !table[x-1][y] && board[x-1][y]==C){
            boolean[][] Table=new boolean[maxX][maxY];
            for (int i=0;i<table.length;i++){
                Table[i]= Arrays.copyOf(table[i],maxY);
            }
            Table[x-1][y]=true;
            System.out.println("上：<"+(x-1)+":"+y+">");
            flag=flag||Exist(board, word ,c+1, x-1,y,Table);
        }

        /*下*/if ((x+1)<maxX && !table[x+1][y] && board[x+1][y]==C){
            boolean[][] Table=new boolean[maxX][maxY];
            for (int i=0;i<table.length;i++){
                Table[i]= Arrays.copyOf(table[i],maxY);
            }
            Table[x+1][y]=true;
            System.out.println("下：<"+(x+1)+":"+y+">");
            flag=flag||Exist(board, word ,c+1, x+1,y,Table);
        }
        /*左*/if ((y-1)>-1 && !table[x][y-1] && board[x][y-1]==C){
            boolean[][] Table=new boolean[maxX][maxY];
            for (int i=0;i<table.length;i++){
                Table[i]= Arrays.copyOf(table[i],maxY);
            }
            Table[x][y-1]=true;
            System.out.println("左：<"+x+":"+(y-1)+">");
            flag=flag||Exist(board, word ,c+1, x,y-1,Table);
        }
        /*右*/if ((y+1)<maxY && !table[x][y+1] && board[x][y+1]==C){
            boolean[][] Table=new boolean[maxX][maxY];
            for (int i=0;i<table.length;i++){
                Table[i]= Arrays.copyOf(table[i],maxY);
            }
            Table[x][y+1]=true;
            System.out.println("右：<"+x+":"+(y+1)+">");
            flag=flag||Exist(board, word ,c+1, x,y+1,Table);
        }

        return flag;
    }
}
