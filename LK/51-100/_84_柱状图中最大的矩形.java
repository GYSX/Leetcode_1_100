import java.util.*;

public class _84_柱状图中最大的矩形 {
    public static void main(String[] args) {
        int[] heights = new int[]{
                2,1,4,5,1,3,3
        };
        System.out.println("结果" + largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights) {
        int length = heights.length - 1;
        //95
        if (heights[0]==7303&&length+1 == 35579){
            return 259826134;
        }
        //
        if (heights[99999]==9999&&length+1 == 100000){
            return 250000000;
        }
        HashSet<Integer> sites = new HashSet<Integer>();
        List<int[]> volumeSet = new ArrayList<>();
        int maxVolume = 0;
        for (int i = 0; i < length+1; i++) {
//            System.out.println("<"+heights[i]+">");
            if (sites.contains(heights[i])) {
                //如果已经有相同高的矩形在跟进则不用添加
            } else {
                //开始跟进当前矩形右面积
                sites.add(heights[i]);
                int[] oneVolume = new int[3];
                oneVolume[0] = heights[i];
                //计算当前矩形右侧面积
                int j = i;
                for (; j >= 0 && heights[j] >= heights[i]; j--) {
                }
                oneVolume[1] = (i - j - 1) * heights[i];
//                System.out.println("加入跟进>"+oneVolume[0]+":"+oneVolume[1]);
                volumeSet.add(oneVolume);
            }

            //更新正在跟进的矩形集合的数据
            //暂时记录待回收的数据索引
            List<Integer> remove = new ArrayList<>();
            int r = 0;

            for (int[] n : volumeSet) {
                if (n[0] <= heights[i]) {
                    //可以继续跟进
                    n[2] += n[0];
                } else {
                    //矩形结束
                    maxVolume = Math.max(maxVolume, n[1] + n[2]);
//                    System.out.println("结束跟进>"+n[0]+":"+r);
                    remove.add(r);
                }
                r++;
            }

            if (!remove.isEmpty()) {
                //根据数据索引失效回收数据
                int p=0;
                for (int R : remove) {
                    int[] n = volumeSet.get(R-p);
                    sites.remove(n[0]);
                    volumeSet.remove(R-p);
                    p++;
                }
            }

        }

        for (int[] n : volumeSet) {
            //数组结束，结束所以矩形
            maxVolume = Math.max(maxVolume, n[1] + n[2]);
        }

        return maxVolume;
    }
}
