import java.util.ArrayList;
import java.util.List;

public class _64_最小路径和 {
    public static void main(String[] args) {
        List<int[]> jg=new ArrayList<>();
        jg.add(new int[]{   1,3,1            });
        jg.add(new int[]{   1,5,1            });
        jg.add(new int[]{   4,2,1            });

        int i=minPathSum(     jg.toArray(new int[jg.size()][3])   );
        System.out.println("结果："+i);
    }
    public static int minPathSum(int[][] grid) {
        int x=grid.length,y=grid[0].length;
        int[][] ljb=new int[x+1][y+1];
        for (int i=2;i<ljb[0].length;i++){
            ljb[0][i]=Integer.MAX_VALUE;
        }
        for (int[] i:ljb){
            i[0]=Integer.MAX_VALUE;
        }
        for (int i=1;i<=x;i++){
            for (int j=1;j<=y;j++){
                ljb[i][j] =Math.min(ljb[i - 1][j] , ljb[i][j - 1])+grid[i-1][j-1];
            }
        }
        return ljb[x][y];
    }
}
