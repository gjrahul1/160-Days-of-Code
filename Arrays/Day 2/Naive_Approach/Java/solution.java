public class Move_All_Zeros {
    public void moveZeroes(int[] nums) {
        int temp[] = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[j++] = nums[i];
            }
        }

        while (j < nums.length) {
            temp[j++] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Move_All_Zeros obj = new Move_All_Zeros();
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Original array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        obj.moveZeroes(nums);

        System.out.println("\nArray after moving zeros:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
