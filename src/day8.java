public class day8 {

    // You are given a list of songs where the ith song has a duration of time[i] seconds.
    //
    //Return the number of pairs of songs for which their total duration in seconds is divisible by 60. Formally,
    // we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.

    //Input: time = [30,20,150,100,40]
    //Output: 3
    //Explanation: Three pairs have a total duration divisible by 60:
    //(time[0] = 30, time[2] = 150): total duration 180
    //(time[1] = 20, time[3] = 100): total duration 120
    //(time[1] = 20, time[4] = 40): total duration 60

    int get_pairs(int []a)
    {
        if (a == null)
        {
            return 0;
        }
        int []rem = new int[60];
        int c = 0;

        for(int i: a)
        {
            if (i % 60 == 0)
            {
                c+=rem[0];
            }
            else
            {
                c+= rem[60 - i%60];
            }
            rem[i%60]++;
        }
        return c;

    }


}
