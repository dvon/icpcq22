import java.util.Scanner;

public class MazeMan {
    private static int dots;

    private static void explore(char[][] maze, int i, int j) {
        int n = maze.length, m = maze[0].length;
        if (maze[i][j] == '.') dots++;
        maze[i][j] = 'X';

        // north
        if (i > 0 && (maze[i - 1][j] == ' ' || maze[i - 1][j] == '.'))
            explore(maze, i - 1, j);

        // south
        if (i < n - 1 && (maze[i + 1][j] == ' ' || maze[i + 1][j] == '.'))
            explore(maze, i + 1, j);
        
        // east
        if (j < m - 1 && (maze[i][j + 1] == ' ' || maze[i][j + 1] == '.'))
            explore(maze, i, j + 1);
        
        // west
        if (j > 0 && (maze[i][j - 1] == ' ' || maze[i][j - 1] == '.'))
            explore(maze, i, j - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        char[][] maze = new char[n][];
        for (int i = 0; i < n; i++) maze[i] = sc.nextLine().toCharArray();
        
        int players = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maze[i][j] >= 'A' && maze[i][j] < 'X') {
                    dots = 0;
                    explore(maze, i, j);
                    if (dots > 0) players++;
                }
            }
        }

        dots = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maze[i][j] == '.') dots++;
            }
        }

        System.out.println(players);
        System.out.println(dots);
    }
}