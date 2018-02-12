myInfo = {
    "name": "Jacob",
    "age": 26,
    "birthplace": "United States of America",
    "fav_lang": "Python" 
}

def readDict(dictionary):
    print "My name is ", dictionary["name"]
    print "My age is ", dictionary["age"]
    print "My country of birth is ", dictionary["birthplace"]
    print "My favorite language is ", dictionary["fav_lang"]

readDict(myInfo)