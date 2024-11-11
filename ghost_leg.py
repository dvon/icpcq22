n, m = [int(i) for i in input().split()]
rungs = [int(input()) for i in range(m)]
perm = [0] * (n + 1)

for i in range(1, n + 1):
    j = i

    for r in rungs:
        if r == j:
            j += 1
        elif r == j - 1:
            j -= 1
    
    perm[j] = i

for p in perm[1:]: print(p)