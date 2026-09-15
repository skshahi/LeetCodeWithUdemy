package arrays;

public class JumpGame {

    public static boolean canWeJump(int []game)
    {
        int reachable=0;
        for(int i=0;i< game.length && i<=reachable;i++)
        {
            reachable=Math.max(reachable,i+game[i]);
            if(reachable>=game.length-1)
            {
                return  true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int []game={3,1,1,0,4};//
        System.out.println(canWeJump(game));
    }
}
