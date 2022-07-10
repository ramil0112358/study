ilist = [1,2,3,5,7,17]
target = 9

def sum_of_two(ilist, target):
    x = 0
    for i in range(0, len(ilist)):
        x += 1
        for j in range(0, len(ilist)):
            if ilist[i] + ilist[j] == target:
                return i,j
    return 0

i,j = sum_of_two(ilist, target)
print("i,j: " + str(i) + "," + str(j))