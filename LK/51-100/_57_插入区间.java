import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _57_插入区间 {
    public static void main(String[] args) {
        int[][] intervals=new int[][]{
                new int[]{3,5},
//                new int[]{3,5},
                new int[]{6,8},
//                new int[]{8,10},
//                new int[]{12,16},

        };
        int[] n =new int[]{
                1,2
        };
        int[][] m=insert(intervals,n);

        for (int[] a: m){
            System.out.println(Arrays.toString(a));
        }
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length==0){
         return new int[][]{new int[]{newInterval[0],newInterval[1]}};
        }
        if (intervals.length==1){
            if (newInterval[1]<intervals[0][0]){
                return new int[][]{
                        newInterval,intervals[0]
                };
            }
            if (newInterval[0]>intervals[0][1]){
                return new int[][]{
                        intervals[0],newInterval
                };
            }
            return new int[][]{
                    new int[]{
                            Math.min(newInterval[0],intervals[0][0]),Math.max(newInterval[1],intervals[0][1])
                    }
            };
        }
        List<int[]> jg=new ArrayList<>();
        int[] one = new int[2];
        boolean flag=false;
        boolean f_jg=false;
        boolean f_hb1=true;
        boolean f_hb=true;
        boolean f_js=true;
        for (int[] i : intervals){
            System.out.println("<"+i[0]+":"+i[1]+">");
            //确定左端
            if (newInterval[0]<=i[1]&&!flag&&f_js){
                one[0]=Math.min(newInterval[0],i[0]);
                flag=true;
                f_hb1=false;
                System.out.println("确定左端");
            }
            //确定右端
            if (newInterval[1]<=i[1]&&flag&&f_js){
                if (newInterval[1]>=i[0]) {
                    one[1] = i[1];
                    jg.add(one);
                    f_hb=false;
                }
                else {
                    one[1] = newInterval[1];
                    jg.add(one);
                    f_hb=true;
                }
                f_js=false;
                f_hb1=true;
                System.out.println("确定右端");
            }
            if (f_hb&&f_hb1) {
                jg.add(i);
            }
            f_hb=true;
        }
        if (!flag){
            jg.add(newInterval);
        }
        if (flag&&f_js){
            one[1]=newInterval[1];
            jg.add(one);
        }
        return  jg.toArray(new int[jg.size()][2]);
    }
}
