def gcd(n, d):
    
    while d > 0:
        n, d = d, n % d
    
    return n

if __name__ == "__main__":
    t, s = [int(i) for i in input().split()]

    if t <= s:
        tp = 4 * t * (t + 1) // 2 + 1
        sp = 4 * s * (s + 1) // 2 + 1

        for i in range(2, s, 3):
            sp += (s - i) * 4
    
    else:
        tp = 4 * s * (s + 1) // 2 + 1
        t -= s

        i = 2
        while (i < s) and (t > 0):
            tp += (s - i) * 4
            t -= 1
            i += 3
        
        sp = tp

        while i < s:
            sp += (s - i) * 4
            i += 3
    
    if tp >= sp:
        print(1)
    else:
        g = gcd(tp, sp)
        print(f"{tp // g}/{sp // g}")