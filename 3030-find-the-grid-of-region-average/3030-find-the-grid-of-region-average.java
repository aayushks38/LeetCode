class Solution {
        public int[][] resultGrid(int[][] img, int threshold) {
            int id = 0;
            int n = img.length;
            int m = img[0].length;
            int[][] map = new int[n*m][2];
            for (int r = 0; r < img.length-2; r++){
                for(int c = 0; c <img[0].length-2; c++){
                    int regionResult = isValid(r,c,img,threshold);
                    if (regionResult != -1){
                        for(int i = r; i < r+3; i++){
                            for(int j = c; j < c+3; j++){
                                id = code(i,j,m);
                                map[id][0] += regionResult;
                                map[id][1] ++;
                            }
                        }
                    }
                }
            }

            int [][] result = new int [n][m];
            for (int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    id = code(i,j,m);
                    if (map[id][1] == 0){
                        result [i][j] = img[i][j];
                    }
                    else{
                        result[i][j] = map[id][0]/map[id][1];
                    }
                }
            }
            return result;
        }

        public int isValid(int r, int c, int[][] img, int threshold){
            int m = img[0].length;
            int n = img.length;
            Queue<Point> q = new ArrayDeque<>();
            q.add(new Point(img[r][c],r, c, 0));
            boolean [] visited = new boolean[9];
            Point cur;
            int sum = 0;
            while (!q.isEmpty()){
                cur = q.poll();
                sum += cur.val;
                //check down
                if (cur.r+1 < img.length && cur.r+1 - r < 3){
                    if (Math.abs(cur.val - img[cur.r+1][cur.c]) > threshold){
                        sum = -1;
                        break;
                    }

                    if( !visited[cur.id+3] ){
                        q.add(new Point(img[cur.r+1][cur.c], cur.r+1, cur.c,cur.id+3));
                        visited[cur.id+3] = true;
                    }
                }
                if (cur.c+1 < img[0].length && cur.c+1 - c < 3){
                    if (Math.abs(cur.val - img[cur.r][cur.c+1]) > threshold){
                        sum = -1;
                        break;
                    }
                    if(!visited[cur.id+1] ){
                        q.add(new Point(img[cur.r][cur.c+1], cur.r, cur.c+1, cur.id+1));
                        visited[cur.id+1] = true;
                    }
                }
            }
            return sum == -1 ? sum : sum / 9;
        }
        public int code(int r, int c, int cLen){
            return r * cLen + c;
        }
    }
    public class Point{
        int val;
        int r;
        int c;
        int id;

        public Point(int v, int ro, int co, int i){
            val = v;
            r = ro;
            c = co;
            id = i;
        }
    }