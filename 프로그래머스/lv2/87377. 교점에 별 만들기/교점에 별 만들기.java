import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(int[][] line) {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        List<int[]> list = new ArrayList<>();
        for(int i=0; i<line.length; i++){
            for(int j=i+1; j<line.length; j++){
                long[] xy = getCross(line[i], line[j]);
                if(xy != null){
                    int x = (int)xy[0];
                    int y = (int)xy[1];
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                    list.add(new int[]{x, y});
                }
            }
        }

        int xl = maxX - minX;
        int yl = maxY - minY;
        int[][] cross = new int[yl == 0 ? 1 : yl + 1][xl == 0 ? 1 : xl + 1];
        for(int[] xy : list){
            int x = xy[0] - minX;
            int y = maxY - xy[1];
            cross[y][x] = 1;
        }

        String[] ret = new String[cross.length];
        for(int i = 0; i<cross.length; i++){
            String l = "";
            for(int j=0; j<cross[i].length; j++){
                l += cross[i][j] == 0 ? "." : "*";
            }
            ret[i] = l;
        }
        return ret;
    }
    
    public long[] getCross(int[] line1, int[] line2){
        long A1 = line1[0];
        long B1 = line1[1];
        long C1 = line1[2];

        long A2 = line2[0];
        long B2 = line2[1];
        long C2 = line2[2];

        double x = (double)(B1 * C2 - B2 * C1) / (A1 * B2 - A2 * B1);
        double y = (double)(A2 * C1 - A1 * C2) / (A1 * B2 - A2 * B1);

        if(x % 1 != 0 || y % 1 != 0) return null;

        return new long[]{(long)x,(long)y};
    }
}