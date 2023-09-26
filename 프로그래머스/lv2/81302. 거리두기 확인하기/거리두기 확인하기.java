class Solution {
    String[][] map;
    int[][] map2;
    boolean[][] visited;

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};
    
    public boolean setSit(int x, int y){
        boolean chk = true;
        for(int i=0; i<4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];
            if(cx >= 0 && cy >= 0 && cx < 5 && cy < 5 && !map[cy][cx].equals("X")){
                if(map2[cy][cx] == 1 || map[cy][cx].equals("P")){
                    chk = false;
                    break;
                }else{
                    map2[cy][cx] = 1;
                }
            }
        }
        return chk;
    }
    
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for(int i=0; i<places.length; i++){
            map = new String[5][5];
            map2 = new int[5][5];
            visited = new boolean[5][5];
            for(int j=0; j<5; j++){
                String[] c = places[i][j].split("");
                for(int k = 0; k<c.length; k++){
                    String str = c[k];
                    map[j][k] = str;
                }
            }

            boolean a = true;
            for(int j=0; j<5; j++){
                for(int k = 0; k<5; k++){
                    if(map[j][k].equals("P")){
                        if(!setSit(k, j)){
                            a = false;
                            break;
                        }
                    }
                }
            }
            answer[i] = a ? 1 : 0;
        }
        
        return answer;
    }
}