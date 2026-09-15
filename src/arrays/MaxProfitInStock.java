package arrays;

//stock: 7,1,5,2,6,4:  5-1=4 , 4+6-2=8
public class MaxProfitInStock {
    public static int maxProfit(int []stock)
    {
        int profit=0;
        for(int i=1;i<stock.length;i++)
        {
            if(stock[i-1]<stock[i])
                profit+=stock[i]-stock[i-1];
        }
        return profit;
    }

    public static void main(String[] args) {
        int []stock={7,1,5,2,6,4};
        System.out.println(maxProfit(stock));
    }
}
