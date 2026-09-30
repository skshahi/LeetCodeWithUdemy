package matrix;

import java.util.Arrays;

public class WhereBallWillFall {
    public static  int []findBall(int [][]game)
    {
        int []result=new int[game[0].length];
        Arrays.fill(result,-1);
        for(int col=0;col<game[0].length;col++)
        {
            int currCol=col;
            for(int  currRow=0;currRow<game.length;currRow++)
            {
                int nextCol=currCol+game[currRow][currCol];
                if(nextCol<0 || nextCol>game[0].length-1) break;
                if(game[currRow][currCol]!=game[currRow][nextCol])break;
                if(currRow==game.length-1)
                {
                    result[col]=nextCol;
                }
                currCol=nextCol;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}//TC:O(M),SC:O(C)
