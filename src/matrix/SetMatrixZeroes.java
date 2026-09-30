package matrix;

public class SetMatrixZeroes {

    public static  void setZeroes(int [][]matrix)
    {
        boolean hasFirstRow=false;
        boolean hasFirstCol=false;
        for(int c=0;c<matrix[0].length;c++) //first row
        {
            if(matrix[0][c] ==0)
            {
                hasFirstRow=true;
                break;
            }

        }

        for(int r=0;r<matrix.length;r++) //first col
        {
            if(matrix[r][0] ==0)
            {
                hasFirstCol=true;
                break;
            }

        }
        //preprocessing
        for(int r=1;r<matrix.length;r++)
        {
            for(int c=1;c<matrix[0].length;c++)
            {
                if(matrix[r][c]==0)
                {
                    matrix[r][0]=0;
                    matrix[0][c]=0;
                }
            }
        }
        // 1st row nullify
        for(int c=1;c<matrix[0].length;c++)
        {
            if(matrix[0][c]==0)
            {
                nullifyCol(matrix,c);
            }
        }

        //1st col nullify
        for(int r=1;r<matrix.length;r++)
        {
            if(matrix[r][0]==0)
            {
                nullifyRow(matrix,r);
            }
        }
        if(hasFirstRow) nullifyRow(matrix,0);
        if(hasFirstCol) nullifyCol(matrix,0);
    }

    private static void nullifyCol(int[][] matrix, int c) {
        for(int r=0;r<matrix.length;r++)
        {
            matrix[r][c]=0;
        }

    }

    private static void nullifyRow(int[][] matrix, int r) {
        for(int c=0;c<matrix[0].length;c++)
        {
            matrix[r][c]=0;
        }
    }

    public static void main(String[] args) {
        int [][]matrix={{5,0,8},{7,1,2},{3,9,5}};
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("-------------------");
        setZeroes(matrix);
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

    }




}
