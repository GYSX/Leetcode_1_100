import java.util.ArrayList;
import java.util.List;

public class _63_不同路径II {
    public static void main(String[] args) {
        List<int[]> jg=new ArrayList<>();
        jg.add(new int[]{   0,0,0            });
        jg.add(new int[]{   0,1,0            });
        jg.add(new int[]{   0,0,0            });

        int i=uniquePathsWithObstacles(     jg.toArray(new int[jg.size()][3])   );
        System.out.println("结果："+i);
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int x=obstacleGrid.length,y=obstacleGrid[0].length;
        int[][] ljb=new int[x+1][y+1];
        ljb[0][1]=1;
        for (int i=1;i<=x;i++){
            for (int j=1;j<=y;j++){
                if (obstacleGrid[i-1][j-1]==1){
                    ljb[i][j]=0;
                }else {
                    ljb[i][j] = ljb[i - 1][j] + ljb[i][j - 1];
                }
            }
        }
        return ljb[x][y];
    }
}
