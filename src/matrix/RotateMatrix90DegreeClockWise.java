package matrix;

public class RotateMatrix90DegreeClockWise {

    public static int [][] rotateMatrix(int [][]matrix)
    {
        int n=matrix.length;
        //transpose
        for(int r=0;r<n;r++)
        {
            for(int c=r+1;c<n;c++)
            {
                int temp=matrix[r][c];
                matrix[r][c]=matrix[c][r];
                matrix[c][r]=temp;
            }
        }
        //reverse the matrix
        for(int r=0;r<n;r++)
        {
            int left=0,right=n-1;
            while (left<right)
            {
                int temp=matrix[r][left];
                matrix[r][left]=matrix[r][right];
                matrix[r][right]=temp;
                left++;right--;

            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int [][]matrix={{5,6,8},{7,1,2},{3,9,5}};
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        int[][] transposeMatrix = rotateMatrix(matrix);
        for(int i=0;i<transposeMatrix.length;i++)
        {
            for(int j=0;j<transposeMatrix[0].length;j++)
            {
                System.out.print(transposeMatrix[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
