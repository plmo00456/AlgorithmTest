class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = get(brown, yellow);
        return answer;
    }

    public int[] get(int b, int y){

        int tmp = y;
        int h = 0;
        int A = Integer.MAX_VALUE;
        int B = 0;
        while(y >= 1 && y >= h){
            h++;
            if(tmp % h != 0) continue;
            y = tmp;
            y /= h;
//            System.out.println("Y"+y);
//            System.out.println("H"+h + " / " + y%h);
            int val = (y * 2) + (h * 2) + 4;
            int sum = y * h + val;
            if(val == b && b+tmp == sum) {
                if(A > y){
                    A = y;
                    B = h;
                }
            }
        }

        return new int[]{Math.max(A, B)+2, Math.min(A, B)+2};
    }
}