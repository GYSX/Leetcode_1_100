public class _62_不同路径 {
    public static void main(String[] args){
        System.out.println(uniquePaths(13 ,23));
    }
    public static int uniquePaths(int m, int n) {
        int M=m+n-2;
        double a_NM=1;
        double a_N=1;
        for (int i=0;i<n-1;i++){
            System.out.println("M: "+M+"\ti+1:  "+(i+1));
            a_NM*=M;
            a_N*=i+1;
            M--;
        }
        System.out.println("a_NM:  "+a_NM+"\ta_N:  "+a_N);
        return (int)(a_NM/a_N);
    }
}
