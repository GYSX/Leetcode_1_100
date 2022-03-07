import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _74_搜索二维矩阵 {
    public static void main(String[] args) {
        List<int[]> jg=new ArrayList<>();
        jg.add(new int[]{   1            });
//        jg.add(new int[]{   10,11,16,20            });
//        jg.add(new int[]{   23,30,34,60            });

        boolean i=searchMatrix(     jg.toArray(new int[jg.size()][1]) ,2  );

        System.out.println("结果："+i);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (target<matrix[0][0]){
            return false;
        }
        int maxX =matrix.length, maxY =matrix[0].length;
        int n=0;
        for (int[] i:matrix){
            if (i[0]==target||i[maxY-1]==target){
                return true;
            }
            if (i[0]<target&&target<i[maxY-1]){
                break;
            }
            n++;
        }
        if (n<maxX&&Arrays.binarySearch(matrix[n],target)>=0){
            return true;
        }else {
            return false;
        }
    }
}
