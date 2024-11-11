# Based on Java version, which works, but fails later test case
# with a run time error.

def explore(maze, i, j):
    global dots

    n, m = len(maze), len(maze[0])
    if maze[i][j] == '.': dots += 1
    maze[i][j] = 'X'

    # north
    if i > 0 and (maze[i - 1][j] == ' ' or maze[i - 1][j] == '.'):
        explore(maze, i - 1, j)
    
    # south
    if i < n - 1 and (maze[i + 1][j] == ' ' or maze[i + 1][j] == '.'):
        explore(maze, i + 1, j)

    # east
    if j < m - 1 and (maze[i][j + 1] == ' ' or maze[i][j + 1] == '.'):
        explore(maze, i, j + 1)

    # west
    if j > 0 and (maze[i][j - 1] == ' ' or maze[i][j - 1] == '.'):
        explore(maze, i, j - 1)

if __name__ == '__main__':
    global dots

    n, m = [int(i) for i in input().split()]
    maze = [list(input()) for i in range(n)]
    players = 0

    for i in range(n):
        for j in range(m):
            if maze[i][j] >= 'A' and maze[i][j] < 'X':
                dots = 0
                explore(maze, i, j)
                if dots > 0: players += 1

    dots = 0

    for i in range(n):
        for j in range(m):
            if maze[i][j] == '.': dots += 1

    print(players)
    print(dots)