public class _48_旋转图像 {
    public static void main(String[] args){
        int[][] matrix;

//        matrix[0]=new int[]{1,2,3};
//        matrix[1]=new int[]{4,5,6};
//        matrix[2]=new int[]{7,8,9};
        matrix= new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        rotate(matrix);

        System.out.println("\n镜像反转完成：");
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+",");
            }
            System.out.println();
        }

    }
    public static void rotate(int[][] matrix) {
        int length=matrix.length-1;
        //对角反转
        for (int i=0;i<(length+1);i++){
            for (int j=i;j<(length+1);j++){
                int temporary=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temporary;
            }
        }

        System.out.println("\n对角反转完成：");
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+",");
            }
            System.out.println();
        }

        //对折反转（镜像）
        for (int i=0;i<(length+1);i++){
            for (int j=0;j<(length/2)+1;j++){
                int temporary=matrix[i][j];
                matrix[i][j]=matrix[i][length-j];
                matrix[i][length-j]=temporary;
            }
        }

    }
}
