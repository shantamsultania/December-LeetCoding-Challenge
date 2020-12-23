public class day23 {

    void swap(char[] c, int a, int b) {
        char t = c[a];
        c[a] = c[b];
        c[b] = t;
    }
    public int nextGreaterElement(int n) {
        char[] chars = Integer.toString(n).toCharArray();
        int i = chars.length - 1;
        while (i > 0 && chars[i - 1] >= chars[i]) {
            i--;
        }
        if (i == 0) {
            return -1;
        }
        int j = chars.length - 1;
        for (; j >= i; j--) {
            if (chars[j] > chars[i - 1]) {
                break;
            }
        }
        swap(chars, i - 1, j);
        j = chars.length - 1;
        while (i < j) {
            swap(chars, i, j);
            i++;
            j--;
        }
        long res = Long.parseLong(new String(chars));
        // return Integer.parseInt(new String(chars));
        return res > Integer.MAX_VALUE ? -1 : (int)res;
    }
}
