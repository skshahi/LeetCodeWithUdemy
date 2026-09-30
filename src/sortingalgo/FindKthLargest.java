package sortingalgo;

public class FindKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private static int quickSelect(int[] nums, int low, int high, int k) {
        int pi = partition(nums, low, high);
        if (pi == k) {
            return nums[pi];
        } else if (k > pi) {
            return quickSelect(nums, pi + 1, high, k);
        } else {
            return quickSelect(nums, low, pi - 1, k);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (pivot > nums[j]) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, high);
        return (i + 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int []arr={5,1,2,5,3,5,88,7};
        System.out.println(findKthLargest(arr,2));
    }
} //TC: O(n), SC: O(log n) */
