package dayOne.primitives;

/**
 * Created by student on 8/22/2016.
 */
public class ArraysExcercise {

    public static void main(String[] args) {

        int[] test = {4, 2, 5};
        int[] test2 = {1, 3};

        maxEnd3(test);
    }

    static boolean firstLast6(int[] nums) {
        return (nums[0] == 6) || (nums[nums.length - 1] ==6);
    }

    static boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && nums[0] == nums[nums.length - 1]); //nums[nums.length - 1] - get last element
    }

    static boolean commonEnd(int[] nums, int[] nums1) {
        return(nums[0] == nums1[0] || nums[nums.length - 1] == nums1[nums1.length -1]);
    }

    static void maxEnd3(int[] nums) {

        if(nums[0] > nums[nums.length - 1])
            for(int i = 1; i < nums.length - 1; i++)
                nums[i] = nums[0];
        else
            nums[0] = nums[nums.length - 1];

        System.out.println(String.format("{ %s, %s, %s}", nums[0], nums[1], nums[2]));
    }

}
