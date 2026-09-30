package dynamicprogramming;
//Given a robot located at the top left corner of m*n matrix,
//determine the number of unique paths the robot can take from start to finish while avoiding all
//obstacles on the matrix
//the robot can only move either down or right at any time.the robot triesto reach the bottom right
//corner of the matrix

public class UniquePathToGoal {

    public static int uniquePathsWithObstacles(int [][]obstacleGrid)
    {
        int r=obstacleGrid.length,c=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[r-1][c-1]==1) return 0;
        int [][]dp=new int[r][c];
        dp[0][0]=1;
        //fill the first row
        for(int i=1;i<dp[0].length;i++)
        {
            if(obstacleGrid[0][i]==0 && dp[0][i-1]==1)
            {
                dp[0][i]=1;
            }else {
                dp[0][i]=0;
            }
        }

        //fill the first column
        for(int i=1;i<dp.length;i++ )
        {
            if(obstacleGrid[i][0]==0 && dp[i-1][0]==1)
            {
                dp[i][0]=1;
            }else {
                dp[i][0]=0;
            }
        }

        //
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(obstacleGrid[i][j]==1)
                {
                    dp[i][j]=0;
                }else {
                    int top=dp[i-1][j];
                    int left=dp[i][j-1];
                    dp[i][j]=top+left;
                }
            }
        }

        return dp[r-1][c-1];
    }

}//TC:O(r+c),SC:O(r+c)
