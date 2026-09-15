package twopointer;

public class SortColor {

    public static void sortColor(int []colors)
    {
        int left=0,mid=0,right=colors.length-1;
        while (mid<=right)
        {
            if(colors[mid]==0)
            {
                swap(left,mid,colors);
                mid++;
                left++;
            } else if (colors[mid]==1) {
                mid++;

            }else {
                swap(mid,right,colors);
                right--;
            }

        }

        for(int color:colors)
        {
            System.out.println(color);
        }
    }

    private static void swap(int left, int mid, int[] colors) {
        int temp=colors[left];
        colors[left]=colors[mid];
        colors[mid]=temp;
    }

    public static void main(String[] args) {
        int []colors={0,1,0,1,2,1,2};
        sortColor(colors);
    }
}
