public class Shortestpath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(Shortestdistance(path));
    }

    public static float Shortestdistance(String path) {
        int x = 0 , y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            //south
            if (direction == 'S') {
                y--;
            }
            //north
            else if(direction == 'N'){
                y++;
            }
            //west
            else if(direction == 'W'){
                x--;
            }
            //east
            else {
                x++;
            }
        }
        int X1 = 0;
        int Y1 = 0;
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
}
