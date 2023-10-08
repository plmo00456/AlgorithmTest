class Solution {
    int cnt = 0;
    int[][] map2;
    public int solution(int[][] board) {
        int answer = 0;
        cnt = board.length * board[0].length - 1;
        map2 = new int[board.length][board[0].length];

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 1){
                    get(board, j, i);
                }
            }
        }
        int cnt = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(map2[i][j] == 0) cnt++;
            }
        }

        return cnt;
    }
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    int[] dx2 = {-1, -1, +1, 1};
    int[] dy2 = {-1, 1, -1, 1};

    public void get(int[][] map, int x, int y){
        map2[y][x] = 1;
        for(int i=0; i<4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx >= 0 && cy >= 0 && cx < map[0].length && cy < map.length && map[cy][cx] == 0){
                map2[cy][cx] = 1;
            }

            int cx2 = x + dx2[i];
            int cy2 = y + dy2[i];

            if(cx2 >= 0 && cy2 >= 0 && cx2 < map[0].length && cy2 < map.length && map[cy2][cx2] == 0){
                map2[cy2][cx2] = 1;
            }
        }
    }
}