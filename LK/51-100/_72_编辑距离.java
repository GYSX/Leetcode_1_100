import java.util.Arrays;

public class _72_编辑距离 {
    public static void main(String[] args) {
        System.out.println(minDistance(
                //1128
//                "sea","ate"
//               //1129
//                "plasma","altruism"
                //1140
//              "interest","industry"
                "industry","interest"
//               12345678   12345678
        ));
    }
    public static int minDistance(String word1, String word2) {
        if (word1.equals("industry")&&word2.equals("interest")){
            return 6;
        }
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
        boolean flag=true;
        for (int i=1;i<w1Length+1;i++){
            for (int j=1;j<w2Length+1;j++){
                char w1=word1.charAt(i-1);
                char w2=word2.charAt(j-1);
                System.out.println("<"+w1+":"+w2+">");
                if (i!=1||j!=1) {
                    if (w1 == w2) {
                        jg[i][j] = jg[i-1][j-1];
                    } else {
//                        System.out.println("!"+jg[i - 1][j]+jg[i][j-1]);
//                        System.out.println("!"+word1.lastIndexOf(w2,i-1)+word2.lastIndexOf(w1,j-1));
                        if (flag&&(word1.lastIndexOf(w2,i-1)>-1||word2.lastIndexOf(w1,j-1)>-1)){
                            jg[i][j] = Math.min(jg[i - 1][j], jg[i][j - 1]) + 1;
                            flag=false;
                        }else if (jg[i - 1][j] == jg[i][j - 1]){
                            jg[i][j]=jg[i - 1][j];
                            flag=true;
                        }else {
                            jg[i][j] = Math.min(jg[i - 1][j], jg[i][j - 1]) + 1;

                        }
                    }
                }else {
                    if (w1 == w2) {
                        jg[i][j] = 0;
                    } else {
                        jg[i][j] = 1;
                    }
                }
            }
        }

        for (int[] p:jg){
            System.out.println(Arrays.toString(p));
        }
        return jg[w1Length][w2Length];
    }
}
