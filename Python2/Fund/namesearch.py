#Pt1

students = [
     {'first_name':  'Michael', 'last_name' : 'Jordan'},
     {'first_name' : 'John', 'last_name' : 'Rosales'},
     {'first_name' : 'Mark', 'last_name' : 'Guillen'},
     {'first_name' : 'KB', 'last_name' : 'Tonel'}
]

def searchNames(search):
    for i in search:
        print i['first_name'], i['last_name']

searchNames(students)

#Pt2

users = {
 'Students': [
     {'first_name':  'Michael', 'last_name' : 'Jordan'},
     {'first_name' : 'John', 'last_name' : 'Rosales'},
     {'first_name' : 'Mark', 'last_name' : 'Guillen'},
     {'first_name' : 'KB', 'last_name' : 'Tonel'}
  ],
 'Instructors': [
     {'first_name' : 'Michael', 'last_name' : 'Choi'},
     {'first_name' : 'Martin', 'last_name' : 'Puryear'}
  ]
 }

def count_userInfo(userDict):
    for key in userDict:
        print key
        counter = 0
        for value in userDict[key]:
            counter += 1
            firstName = value['first_name']
            lastName =  value['last_name']
            len_firstName = len(firstName)
            len_lastName = len(lastName)
            print counter, '-', firstName, lastName, "-", len_firstName + len_lastName

count_userInfo(users)