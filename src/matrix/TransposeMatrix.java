package matrix;

import java.util.Arrays;

public class TransposeMatrix {
    public static int [][] transposeMatrix(int [][]matrix)
    {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int [][]transpose=new int[cols][rows];
        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                transpose[c][r]=matrix[r][c];
            }
        }
        return transpose;
    }

    //way 2 swapping
    public static int [][] transposeMatrixSwap(int [][]matrix)
    {
        int rows=matrix.length;
      //  int cols=matrix[0].length;

        for(int r=0;r<rows;r++)
        {
            for(int c=r+1;c<rows;c++)
            {
                int temp=matrix[r][c];
                matrix[r][c]=matrix[c][r];
                matrix[c][r]=temp;

            }
        }
        return matrix;
    }


    public static void main(String[] args) {
        int [][]matrix={{5,6,8},{7,1,2},{3,9,5}};

        int[][] transposeMatrix = transposeMatrixSwap(matrix);
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
