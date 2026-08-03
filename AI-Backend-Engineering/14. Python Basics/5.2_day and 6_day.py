# Loops And Condition based question

number = [1,2,3,4,5,-1,10,-2,5,-5,-2]

# Negative Numbers in List
def negativeNumbers(number):
    i = 0
    for num in number:
        if num<0:
            i+=1
    print(f"The number of negative numbers in the list is: {i}")
negativeNumbers(number)

# Sum of Even Numbers
def sumOfEvenNumbers(number):
    sum = 0
    for num in range(0,number+1):
        if(num%2 ==0 and num>0):
            sum+=num
    print(f"The sum of even numbers till {number} is: {sum}")
sumOfEvenNumbers(10)        

# Printing Table 
def printTable(number):
    for i in range(1,11):
        if i== 5: continue
        print(f"{number} x {i} = {number*i}")
printTable(5)

# reverse a string
preReversedString = "Hola Amigos kese ho theek ho"
def reverseString(string):
    revS=""
    for i in string:
        revS= i+revS
    print(revS.capitalize())
reverseString(preReversedString)

# Non repeated charcter
def nonRepeatedChar(inputString):
    inputString = inputString.upper()
    for i in inputString:
        if inputString.count(i) == 1:
            print(f"The First non repeated character is {i}")
            break
nonRepeatedChar("Hehehheehehehehehehacscacaccaczazann")

# Factorial
def factoricalUsingWhile(givenNumber):
    fact = 1
    while(givenNumber>0):
        fact *= givenNumber
        givenNumber -= 1
    print(f"The factorial is {fact}")
factoricalUsingWhile(6)

# keep asking for input until press 1-10 
def keepAskingUser():
    while True:
        inputUser = int(input("Enter the Number: "))
        if(inputUser>0 and inputUser<10):
            print("THANKS")
            break
# keepAskingUser()

# Prime Check
def primeCheck():
    primeNum = int(input("Enter the Number: "))
    isPrime = True
    if primeNum>0:
        for i in range(2,primeNum):
            if(primeNum%i)==0:
                print("Not a Prime Number")
                isPrime = False
                break
    print(f"{isPrime} is answer of being a prime")
# primeCheck()


givenList = ["mango","apple","banana","orange","mango"]
def duplicateChecker(giveList):
    unique_item = set()
    isDuplicateThere = False;
    for item in giveList:
        if item in unique_item:
            isDuplicateThere = True
        unique_item.add(item)
    print(isDuplicateThere)
duplicateChecker(givenList)
