class Solution {
    public int[] solution(int N) {
        if(N == 1) return new int[]{1};
        else if(N == 2) return new int[]{1, 2, 3};
        
        int[][] arr = new int[N][N];
        int mode = 1;
        int tmp = 0;
        int cx = 0;
        int cy = -1;
        int prev = 0;
        int max = 0;
        while(true){
            if(tmp == N){
                N--;
                mode++;
                tmp = 0;
                if(mode == 4) mode = 1;
            }
            if(mode == 1){
                cy++;
            }else if(mode == 2){
                cx++;
            }else{
                cx--;
                cy--;
            }
            if(arr[cy][cx] != 1 && arr[cy][cx] != 0) break;
            tmp++;
            arr[cy][cx] = prev + 1;
            prev = arr[cy][cx];
            max = Math.max(max, arr[cy][cx]);
        }
        int[] ans = new int[max];
        int idx = 0;
        for(int[] x : arr){
            for(int i: x){
                if(i != 0){
                    ans[idx++] = i;
                }
            }
        }
        return ans;
    }
}