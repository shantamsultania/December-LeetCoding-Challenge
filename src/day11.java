public class day11 {

    public int removeDuplicates(int[] nums) {

        int c1 = 2;
        int c = nums.length;

        for(int i=2;i<nums.length;i++)
        {
            if(nums[i] != nums[c1-2])
            {
                nums[c1++] = nums[i];
            }
        }

        return c>2 ? c1 : c;
    }

}
