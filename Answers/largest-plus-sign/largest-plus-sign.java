class Solution {
       public int orderOfLargestPlusSign(int N, int[][] mines) {
        int[][]M = new int[N][N];
        for(int[]arr : M){
            Arrays.fill(arr, 1);
        }
        for(int[]arr : mines){
            M[arr[0]][arr[1]] = 0;
        }
        for(int i = 0; i < N; i++){
            int count = 0;   //left
            for (int j = 0; j < N; j++) {
                if (M[i][j] != 0) {
                    count++;
                } else {
                    count = 0;
                }
                M[i][j] = count;
            }
            count = 0; //right
            for(int j = N - 1; j >= 0; j--){
                if (M[i][j] != 0){
                    count++;
                } else {
                    count = 0;
                }
                M[i][j] = Math.min(M[i][j], count);
            }
        }
        int result = 0;
        for(int j = 0; j < N; j++){
            int count = 0;
            for(int i = 0; i < N; i++){ //up
                if(M[i][j] != 0){
                    count++;
                } else {
                    count = 0;
                }
                M[i][j] = Math.min(M[i][j], count);
            }
            count = 0; //down
            for(int i = N-1; i >=0; i--){
                if(M[i][j] != 0){
                    count++;
                } else {
                    count = 0;
                }
                M[i][j] = Math.min(M[i][j], count);
                result = Math.max(result, M[i][j]);
            }
        }
        return result;
    }
}