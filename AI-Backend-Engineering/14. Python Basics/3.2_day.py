a= """ab is ke andar kuch bhi likh sakte hai. jaise ki "double quotes" ya 'single quotes' dono hi use kar sakte hai. aur new line bhi use kar sakte hai. jaise ki 
yeh ek new line hai. aur yeh bhi ek new line hai. 
aur yeh bhi"""
print(a)
goat = "Cristiano Ronaldo"
print(goat[0]) # C
print(goat[0:9]) # Cristiano
print(goat[0:8:2]) # Cita
print(goat[::2]) # CistnRnl

goat_lower = goat.lower()
print(goat_lower) # cristiano ronaldo
goat_upper = goat.upper()
print(goat_upper) # CRISTIANO RONALDO

cricket_goat = "     Mahendra Singh Dhoni     "
print(cricket_goat.strip()) # Mahendra Singh Dhoni
print(cricket_goat.lstrip()) # Mahendra Singh Dhoni
print(cricket_goat.rstrip()) #      Mahendra Singh Dhoni

print(cricket_goat.replace("Mahendra Singh", "M.S.").strip()) # M.S. Dhoni
print(cricket_goat.split()) # ['Mahendra', 'Singh', 'Dhoni']
chai = "Masala Chai Chai Chai Chai Chai"
print(chai.count("Chai")) # 5
print(chai.find("Masala")) # 0

name = "Ronaldo"
age = 41
sentence = "My name is {} and I am {} years old."
print(sentence.format(name, age)) # My name is Ronaldo and I am 41 years old.
name = "Kirtan"
age = 23
print(f"My name is {name} and I am {age} years old.") # My name is Kirtan and I am 23 years old.

starting_front = ["Ronaldo","Benzema","Bale"]
print("-".join(starting_front))

path1 = "C:\\Users\\Kirtan\\Desktop\\AI Backend Engineer"
print(path1) # C:\Users\Kirtan\Desktop\AI Backend Engineer

# better way to write the path
path2 = r"C:\Users\Kirtan\Desktop\AI Backend Engineer"
print(path2) # C:\Users\Kirtan\Desktop\AI Backend Engineer


# Containing question can be asked in strings
print("Kirtan" in path1)
print("Ronaldo" in path2)
