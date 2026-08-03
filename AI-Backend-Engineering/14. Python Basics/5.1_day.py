# userAge = input("Your Age: ")
def AgeGenration(userAge):
    userAge = int(userAge)
    if userAge < 13:
        print("You are a child")
    elif userAge < 20:
        print("You are a teenager")
    elif userAge < 60:
        print("You are an adult")
    else:
        print("You are a senior citizen")
        
# AgeGenration(userAge)

# todaysDay = input("What is today's day? ")
def MoviePrice(userAge, todaysDay):
    userAge = int(userAge)
    if(userAge <= 18):
        price = 12
    else:
        price = 8
    if(todaysDay == "Wednesday"):
        price = price - 2
    print(f"The price of the movie ticket is: {price} dollars")
    
#Better approach 
def MoviePriceBetter(userAge, todaysDay):
    userAge = int(userAge)
    todaysDay = todaysDay.capitalize()
    price = 12 if userAge <= 18 else 8
    price = price - 2 if todaysDay == "Wednesday" else price 
    print(f"The price of the movie ticket is: {price} dollars")
    
# MoviePriceBetter(userAge, todaysDay)
# MoviePriceBetter(25, "wednesday")


def grade(score):
    score = score if score <= 100 else exit("Score cannot be greater than 100")
    if score >= 90:
        return "A"
    elif score >= 80:
        return "B"
    elif score >= 70:
        return "C"
    elif score >= 60:
        return "D"
    else:
        return "F"
print(grade(102))

exit("This is the end of the program")
exit("This is the end") # This line will not be executed because the program has already exited.

