class Solution {
    public int findJudge(int N, int[][] trust) {
        if (trust.length < N - 1) {
        return -1;
    }
    
        int []score = new int [N+1];
        
        for (int [] t : trust){
            score[t[0]]--;
            score[t[1]] ++;
        }
        for (int i = 1; i <= N; i++) {
        if (score[i] == N - 1) {
            return i;
        }
    }
    return -1;
    }
}
// The town judge has an outdegree of 0 and an indegree of N - 1 because they trust nobody, and everybody trusts them (except themselves).

// if trust.length < N - 1, then we can immediately return -1.

//  for each person. In other words, we'll +1 to their "score" for each person they are trusted by, and -1 from their "score" for each person they trust. Therefore, for a person to maximize their "score", they should be trusted by as many people as possible, and trust as few people as possible.

// The town judge is the only person who could possibly have indegree - outdegree equal to N - 1