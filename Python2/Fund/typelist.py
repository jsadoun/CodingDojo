list = [44,'wonderful',33,46,'colorful',100,1,'world']
list2 = [1,2,3,4,5]
list3 = ["Big", "Bag", "of", "C", "Us"]

def checklist(list): #set the function
# (below) sets new variables so we can concact the new string & create a sum
    newStr = ""
    mySum = 0

    for element in list:
        if type(element) == int or type(element) == float:
            mySum += element
        elif type(element) == str:
            newStr += element + " "
        
    if mySum > 0 and len(newStr) == 0: #checks for only integers
        print "list elements are all numbers"
        print "Sum: ", mySum
    elif len(newStr) > 0 and mySum == 0: #checks for only words
        print "list elements are all strings"
        print "String: ", newStr
    elif mySum > 0 and len(newStr) > 0: #checks for mixed types
        print "list are mixed types"
        print "String: ", newStr
        print "Sum: ", mySum

checklist(list)
checklist(list2)
checklist(list3)