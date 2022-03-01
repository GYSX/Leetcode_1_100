public class _11_盛最多水的容器_贪心失败 {

    public static void main(String[] args){
    int[] height=new int[]{1,2};
    int tj = maxArea(height);
    System.out.println(tj);
    }
    public static class TJ{
        int tj;
        int left;
        int right;
        TJ(){};
        TJ(int tj,int left,int right){this.tj=tj;this.left=left;this.right = right;}
    }

    public static TJ max(int[] height,int i,TJ h_tj){

        int tj_left=Math.min(   height[h_tj.left] , height[i] )*(i-h_tj.left);
        int tj_right=Math.min(  height[h_tj.right], height[i] )*(i-h_tj.right);

        int max=-1;

        if (h_tj.tj<=Math.max(tj_left,tj_right)){
            if (tj_left>tj_right){
                max=1;
            }else {
                max=2;
            }
        }else {
            max=0;
        }
        switch (max){
            case 0:return h_tj;
            case 1:return new TJ(tj_left,h_tj.left,i);
            case 2:return new TJ(tj_right,h_tj.right,i);
        }
        return new TJ();
    }

    public static int maxArea(int[] height) {

        TJ[] h_tj=new TJ[height.length-1];
        h_tj[0]=new TJ(Math.min(height[0], height[1] ),0,1 );
        System.out.println(h_tj[0].left+"->"+h_tj[0].tj+"<-"+h_tj[0].right);
        for (int i = 2; i < height.length; i++) {
                h_tj[i-1]=new TJ(-1,-1,-1);
                for (int j=i-2;j>=0;j--){
                    if (    h_tj[j].tj==h_tj[j+1].tj &&
                            h_tj[j].left==h_tj[j+1].left &&
                            h_tj[j].right==h_tj[j+1].right
                    ){}
                    else {
                        TJ i_tj = max(height, i, h_tj[j]);
                        h_tj[i - 1] = (h_tj[i - 1].tj > i_tj.tj) ? h_tj[i - 1] : i_tj;
                    }
                }
                System.out.println(h_tj[i-1].left+"->"+h_tj[i-1].tj+"<-"+h_tj[i-1].right);
        }
        return h_tj[h_tj.length-1].tj;
    }

}
