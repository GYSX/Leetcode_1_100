import java.util.Arrays;

public class _72_编辑距离 {
    public static void main(String[] args) {
        System.out.println(minDistance("horse","ros"));
    }
    public static int minDistance(String word1, String word2) {
        int w1Length=word1.length();
        int w2Length=word2.length();
        int[][] jg=new int[w1Length+1][w2Length+1];
        for (int i=0,l=Math.max(w1Length,w2Length);i<l+1;i++){
            if (i<w1Length+1){
                jg[i][0]=i;
            }
            if (i<w2Length+1){
                jg[0][i]=i;
            }
        }
        for (int i=1;i<w1Length+1;i++){
            for (int j=1;j<w2Length+1;j++){
                char

                jg[i][j]=Math.max(jg[i-1][j],jg[i][j-1])-1;
                jg[i][j]=Math.min(jg[i-1][j],jg[i][j-1])+1;
            }
        }

        for (int[] p:jg){
            System.out.println(Arrays.toString(p));
        }
        return 0;
    }
}
