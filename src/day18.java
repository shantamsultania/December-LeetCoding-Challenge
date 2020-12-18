public class day18 {
    public boolean increasingTriplet(int[] nums) {

        if(nums.length < 3)
        {
            return false;
        }
        // Explanation: Any triplet where i < j < k is valid.
        // so lets find a number that greater the 2 numbers

        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;
        for(int i:nums)
        {
            if(i <= n1)
            {
                n1 = i;
            }
            else if(i <=n2)
            {
                n2 = i;
            }
            else
            {
                return true;
            }
        }
        return false;

    }
}
