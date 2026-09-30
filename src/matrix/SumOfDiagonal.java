package matrix;

public class SumOfDiagonal {
    public static  int sumofDiagonal(int[][]matrix)
    {
        int sum=0;
        int n=matrix.length;
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
                if(c==r && r+c==n-1 ) //overlapping col and row
                {
                    sum+=matrix[r][c];

                } else if (r==c) {
                    sum+=matrix[r][c];

                }else if (r+c==n-1)
                {
                    sum+=matrix[r][c];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int [][]matrix={{2,3,5},{8,4,6},{7,9,2}};
        System.out.println(sumofDiagonal(matrix));
    }
}
