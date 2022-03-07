public class _73_矩阵置零 {
    public static void setZeroes(int[][] matrix) {
        int maxX =matrix.length, maxY =matrix[0].length;
        boolean[][] Matrix=new boolean[maxX][maxY];
        for (int i=0;i<maxX ;i++){
            for (int j=0;j< maxY ;j++){
                if (matrix[i][j]==0){
                    ks(i,j,Matrix);
                }
            }
        }
        for (int i=0;i<maxX ;i++){
            for (int j=0;j< maxY ;j++){
                if (Matrix[i][j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void ks(int x,int y,boolean[][] matrix){
        int maxX =matrix.length, maxY =matrix[0].length;
        for (int i=0;i<Math.max(maxX,maxY);i++){
            if (i<maxX&&!matrix[i][y]){
                matrix[i][y]=true;
            }
            if (i<maxY&&!matrix[x][i]){
                matrix[x][i]=true;
            }
        }
    }

}
