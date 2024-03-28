public class Maze {
    public static void main(String[] args)
    {

    }
    static void floodfill(int[][] maze,int row, int col, String psf)
    {
        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length|| maze[row][col]==1) {
            return;
        }
        if(row==maze.length-1 && col==maze[0].length-1)
        {
            System.out.println(psf);
        }
        floodfill(maze,row-1,col,psf+"t");
        floodfill(maze,row,col-1,psf+"l");
        floodfill(maze,row+1,col,psf+"d");
        floodfill(maze , row,col+1,psf+"r");
    }
}
