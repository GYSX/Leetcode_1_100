import java.util.ArrayList;
import java.util.List;

public class _54_螺旋矩阵 {
    public static void main(String[] args){
        int[][] matrix=new int[][]{
                new int[]{1,2,3},
                new int[]{4,5,6},
        };
        List<Integer> list=spiralOrder(matrix);

        System.out.println(list);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list =new ArrayList<Integer>();


        int max_x=matrix.length,max_y=matrix[0].length;
        int min_x=0,min_y=-1;
        int size=max_x*max_y;
        int x=0,y=0;

        boolean flag_x=false,flag_y=true;
        boolean v_x=true,v_y=true;
        boolean flag=true;

        while (true){
            System.out.println("<"+x+";"+y+">");
            list.add(matrix[x][y]);
            if (size==list.size()){
                break;
            }
            if (flag) {
                //横向控制
                if (y < max_y && flag_y && v_y) {
                    y++;
                }
                if (y > min_y && flag_y && !v_y) {
                    y--;
                }
                if (y == max_y) {
                    System.out.println("向下");
                    y--;
                    x++;
                    max_y--;
                    flag_y = false;
                    flag_x = true;
                    v_y = false;
                    flag=false;
                }
                if (y == min_y) {
                    System.out.println("向上");
                    y++;
                    x--;
                    min_y++;
                    flag_y = false;
                    flag_x = true;
                    v_y = true;
                    flag=false;
                }

            }else {
                //竖向控制
                if (x < max_x && flag_x && v_x) {
                    x++;
                }
                if (x > min_x && flag_x && !v_x) {
                    x--;
                }

                if (x == max_x) {
                    System.out.println("向左");
                    x--;
                    y--;
                    max_x--;
                    flag_x = false;
                    flag_y = true;
                    v_x = false;
                    flag=true;
                }
                if (x == min_x) {
                    System.out.println("向右");
                    x++;
                    y++;
                    min_x++;
                    flag_x = false;
                    flag_y = true;
                    v_x = true;
                    flag=true;
                }

            }

        }

        return list;
    }
}
