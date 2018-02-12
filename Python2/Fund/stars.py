x = [4, "Tom", 1, "Michael", 5, 7, "Jimmy Smith"]
x = [ 1,2,3,4,5]

for i in range(len(x)):
    if type(x[i]) is int:
        temp = ''
        #print i #checks for functionality by testing for "i"
        for j in range(x[i]):
            temp += '*'
        print temp

    if type(x[i]) is str:
        temp2 = ''
        for j in range(len(x[i])):
            temp2 += x[i][0].lower()
        print temp2

