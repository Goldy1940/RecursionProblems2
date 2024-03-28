import java.util.Scanner;

public class Maze {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");

        int m=sc.nextInt();

        System.out.println("Enter the no of columns");

        int n= sc.nextInt();

         int[][] maze=new int[m][n];

         System.out.println("Enter the elments in maze");

        for(int i=0;i<maze.length;i++)
        {
            for(int j=0;j<maze[0].length;j++)
            {
                maze[i][j]=sc.nextInt();
            }
        }
        boolean[][] visited=new boolean[m][n];
        floodfill(maze,0,0,"",visited);
    }
    static void floodfill(int[][] maze,int row, int col, String psf,boolean[][] visited)
    {
        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length|| maze[row][col]==1 || visited[row][col]) {
            return;
        }
        if(row==maze.length-1 && col==maze[0].length-1)
        {
            System.out.println(psf);
            return;
        }

        visited[row][col]=true;
        floodfill(maze,row-1,col,psf+"t",visited);
        floodfill(maze,row,col-1,psf+"l",visited);
        floodfill(maze,row+1,col,psf+"d",visited);
        floodfill(maze , row,col+1,psf+"r",visited);
    }
}
