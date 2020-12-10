public class day10 {

    public boolean validMountainArray(int[] arr) {
        int i=0;
        int j= arr.length-1;

        while(i<arr.length-1)
        {
            if(arr[i] < arr[i+1])
            {
                i++;
            }
            else
            {
                break;
            }
        }

        while(j>0)
        {
            if(arr[j-1]>arr[j])
            {
                j--;
            }
            else
            {
                break;
            }
        }

        return i>0&&j<arr.length-1&&i==j;
    }
}
