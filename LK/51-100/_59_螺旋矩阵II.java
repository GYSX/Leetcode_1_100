import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _59_螺旋矩阵II {
        public static void main(String[] args){
            int[][] matrix;

            matrix = generateMatrix(3);

            for (int[] i : matrix){
                System.out.println(Arrays.toString(i));
            }
        }
        public static int[][] generateMatrix(int n) {
            int[][] matrix=new int[n][n];

            int max_x=n,max_y=n;
            int min_x=0,min_y=-1;
            int size=max_x*max_y;
            int x=0,y=0;

            boolean flag_x=false,flag_y=true;
            boolean v_x=true,v_y=true;
            boolean flag=true;

            int number=1;

            while (true){
                System.out.println("<"+x+";"+y+">");
                matrix[x][y]=number;
                if (size==number){
                    break;
                }
                number++;
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

            return matrix;
        }
}
