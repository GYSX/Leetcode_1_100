import java.util.ArrayList;
import java.util.List;

public class _54_螺旋矩阵 {
    public static void main(String[] args){

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list =new ArrayList<Integer>();
        int max_x=matrix.length,max_y=matrix[0].length;
        boolean[][] table=new boolean[max_x][max_y];
        int x=0,y=0;
        boolean flag_x=false,flag_y=true;
        boolean v_x=true,v_y=true;
        while (true){
            list.add(matrix[x][y]);
            //横向控制
            if (y<max_y&&flag_y&&v_y&&!table[x][y+1]){
                y++;
            }
            if (y>-1&&flag_y&&!v_y){
                y--;
            }
            if (y==max_y){
                y--;
                flag_y=false;
                flag_x=true;
                v_y=false;
            }
            if (y==-1){
                y++;
                flag_y=false;
                flag_x=true;
                v_y=true;
            }
            //竖向控制
            if (x<max_x&&flag_x&&v_x){
                x++;
            }
            if (x>-1&&flag_x&&!v_x){
                x--;
            }
            if (x==max_x){
                x--;
                flag_x=false;
                flag_y=true;
                v_x=false;
            }
            if (x==-1){
                x++;
                flag_x=false;
                flag_y=true;
                v_x=true;
            }

        }

        return list;
    }
}
