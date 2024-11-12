a = input()
b = input()

i = j = 0

while i < len(a) or j < len(b):
    if j >= len(b) or (i < len(a) and a[i] <= b[j]):
        print(a[i], end="")
        i += 1
    else:
        print(b[j], end="")
        j += 1

print()