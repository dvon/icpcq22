a, b, c = [int(i) for i in input().split()]
min = a + b + c

for s in '+-*/':
    if s != '/' or a % b == 0:
        ab = eval(f'{a}{s}{b}')

        for t in '+-*/':
            if t != '/' or ab % c == 0:
                abc = eval(f'{ab}{t}{c}')

                if abc >= 0 and abc < min:
                    min = abc

print(int(min))