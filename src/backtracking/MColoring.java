package backtracking;

public class MColoring {
    public static boolean graphColoring(boolean [][]graph,int m,int n)
    {
        int []color=new int[n];
        return dfs(graph,color,m,0);
    }

    private static boolean dfs(boolean[][] graph, int[] color, int m, int r) {
        if(r==graph.length) return true;
        for(int i=1;i<=m;i++)
        {
            if(isSafe(graph,color,i,r))
            {
                color[i]=i;
               if( dfs(graph,color,m,r+1))return true;
                color[r]=0;
            }
        }
        return false;

    }

    private static boolean isSafe(boolean[][] graph, int[] color, int currColor, int currRow) {
        for(int c=0;c<graph[0].length;c++)
        {
            if(graph[currRow][c]==true)
            {
                if(color[c]==currColor)return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {

        boolean [][]graph={{false,true,false,true},{true,false,true,false},{false,true,false,true},{true,false,true,false}};
        System.out.println(graphColoring(graph,3,4));

    }
}
