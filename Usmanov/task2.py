ilist = [1,2,3,5,7,17]

def list_inverstion(ilist):
    for i in range(len(ilist)-2, -1, -1):
        x = ilist[i]
        print(str(x) + " " + str(i))
        ilist.append(x)
        ilist.remove(x)
    return ilist

print(list_inverstion(ilist))