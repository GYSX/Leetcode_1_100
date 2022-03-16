import java.lang.reflect.Array;
import java.util.*;

public class _85_最大矩形 {
    public static void main(String[] args) {
        char[][] matrix = new char[][]{
                new char[]{'0', '0', '1', '0'},
                new char[]{'1', '1', '1', '1'},
                new char[]{'1', '1', '1', '1'},
                new char[]{'1', '1', '1', '0'},
                new char[]{'1', '1', '0', '0'},
                new char[]{'1', '1', '1', '1'},
                new char[]{'1', '1', '1', '0'}
//                new char[]{'1', '0', '1', '0', '0'},
//                new char[]{'1', '0', '1', '1', '1'},
//                new char[]{'1', '1', '1', '1', '1'},
//                new char[]{'1', '0', '0', '1', '0'}
//                new char[]{'1','1','1','1','1','1','1','1'},
//                new char[]{'1','1','1','1','1','1','1','0'},
//                new char[]{'1','1','1','1','1','1','1','0'},
//                new char[]{'1','1','1','1','1','0','0','0'},
//                new char[]{'0','1','1','1','1','0','0','0'}
//                new char[]{'1', '0', '1', '1', '0', '1'},
//                new char[]{'1', '1', '1', '1', '1', '1'},
//                new char[]{'0', '1', '1', '0', '1', '1'},
//                new char[]{'1', '1', '1', '0', '1', '0'},
//                new char[]{'0', '1', '1', '1', '1', '1'},
//                new char[]{'1', '1', '0', '1', '1', '1'}
        };
        System.out.println(maximalRectangle(matrix));
    }

    public static int maximalRectangle(char[][] matrix) {
        int x=matrix.length,y=matrix[0].length;
        int[][] histogram=new int[x][y];
        //转化 字符矩阵 为 柱状图集合
        for (int i=0;i<x;i++){
            int t=0;
            for (int j=0;j<y;j++){
                if (matrix[i][j]=='1'){
                    histogram[i][j]=++t;
                }else {
                    t=0;
                }
            }
        }

        for (int[] i:histogram) {
            System.out.println(Arrays.toString(i)+",");
        }
        //用于记录总体最大
        int maxArea=0;
        //寻找每个柱状图中的最大
        for (int i=0;i<y;i++){
            int[] t=new int[x];
            for (int j=0;j<x;j++){
                t[j]=histogram[j][i];
            }
            maxArea=Math.max(maxArea,largestRectangleArea(t));
        }

        return maxArea;
    }
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);

        Deque<Integer> mono_stack = new ArrayDeque<Integer>();
        for (int i = 0; i < n; ++i) {
            while (!mono_stack.isEmpty() && heights[mono_stack.peek()] >= heights[i]) {
                right[mono_stack.peek()] = i;
                mono_stack.pop();
            }
            left[i] = (mono_stack.isEmpty() ? -1 : mono_stack.peek());
            mono_stack.push(i);
        }
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;
    }
}
