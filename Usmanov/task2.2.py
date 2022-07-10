ilist = [1,2,3,5,7,17]
ilist2 = [1,2,3,4,5,4,3,2,1]
ilist3 = [9,8,7,7,8,9]

def polyndrome_check(ilist):

    halfsize = len(ilist) // 2
    if len(ilist) % 2 == 0:
        print("even")
        print(halfsize)
        leftside = halfsize
        rightside = halfsize + 1
        for i in range(0, halfsize):
            print(str(i))
            print(str(ilist[leftside - i - 1]) + " - " + str(ilist[rightside + i - 1]))
            if ilist[leftside - i - 1] != ilist[rightside + i - 1]:
                return False
        return True
    else:
        print("odd")
        print(halfsize)
        central_point = halfsize + 1
        for i in range(1, halfsize + 1):
            print(str(i))
            print(str(ilist[central_point - i - 1]) + " - " + str(ilist[central_point + i - 1]))
            if ilist[central_point - i - 1] != ilist[central_point + i - 1]:
                return False
        return True

print(polyndrome_check(ilist))
print(polyndrome_check(ilist2))
print(polyndrome_check(ilist3))