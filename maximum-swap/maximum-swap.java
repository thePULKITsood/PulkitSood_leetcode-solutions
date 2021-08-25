class Solution {
    public int maximumSwap(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int[] map = new int[10];
        for (int i = 0; i < arr.length; i++) {
            map[arr[i] - '0'] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i] - '0';
            for (int j = 9; j > number; j--) {
                if (map[j] > i) {
                    int k = map[j];
                    char temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                    return Integer.valueOf(String.valueOf(arr));
                }
            }
        }
        return num;
    }
}