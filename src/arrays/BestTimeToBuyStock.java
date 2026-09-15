package arrays;

public class BestTimeToBuyStock {
    public static  int maxProfitStock(int stock[])
    {
        int profit=0;
        int left=0,buy=0,sell=0;

        for(int right=1;right<stock.length;right++)
        {
            if(stock[left]<stock[right])
            {
               int currentProfit=Math.max(profit,stock[right]-stock[left]);
               if(currentProfit>profit)
               {
                   profit=currentProfit;
                   buy=stock[left];
                   sell=stock[right];
               }


            }else {
                left=right;
            }

        }
        System.out.println("Buy:"+buy
                +"  Sell:"+sell);
        return  profit;
    }

    public static void main(String[] args) {
        int []arr={9,8,5,2,1,10,15,5,6};
        System.out.println(maxProfitStock(arr));
    }
}
