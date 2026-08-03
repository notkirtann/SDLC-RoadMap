
#? Dictinaries in Python
# A dictionary is a collection of key-value pairs that are unordered, changeable, and indexed. In Python, dictionaries are written with curly brackets {} and have keys and values.
#? CREATING A DICTIONARY
#! Creating a dictionary with integer keys
my_dict = {1: "one", 2: "two", 3: "three"}
print(my_dict) # {1: 'one', 2: 'two', 3: 'three'}
# @Creating a dictionary with string keys    
# @Creating a dictionary with mixed keys
my_dict2 = {"name": "Alice", "age": 30, "city": "New York"}
print(my_dict2) # {'name': 'Alice', 'age': 30, 'city': 'New York'}

#! Accessing values in a dictionary  
# @Accessing values using keys
print(my_dict2["name"]) # Alice
print(my_dict2.get("age")) # 30

#! Adding or updating key-value pairs in a dictionary
# @Adding a new key-value pair
my_dict2["country"] = "USA" 
print(my_dict2) # {'name': 'Alice', 'age': 30, 'city': 'New York', 'country': 'USA'}
# @Updating an existing key-value pair
my_dict2["age"] = 31
print(my_dict2) # {'name': 'Alice', 'age': 31, 'city': 'New York', 'country': 'USA'}

#! Removing key-value pairs from a dictionary
# @Removing a key-value pair using pop()
my_dict2.pop("city")    
print(my_dict2) # {'name': 'Alice', 'age': 31, 'country': 'USA'}
# @Removing a key-value pair using del
del my_dict2["country"]
print(my_dict2) # {'name': 'Alice', 'age': 31}
# @Removing all key-value pairs using clear()
my_dict2.clear()
print(my_dict2) # {}

#! Advanced dictionary methods
my_dict3 = {"name": "Bob", "age": 25, "city": "Los Angeles"}
# @Using get() to access a value with a default value if the key is not found
print(my_dict3.get("name", "Not Found")) # Bob 
# @Using keys() to get all keys in the dictionary
print(my_dict3.keys()) # dict_keys(['name', 'age', 'city'])
# @Using values() to get all values in the dictionary
print(my_dict3.values()) # dict_values(['Bob', 25, 'Los Angeles'])
# @Using items() to get all key-value pairs in the dictionary
print(my_dict3.items()) # dict_items([('name', 'Bob'), ('age', 25), ('city', 'Los Angeles')])
# @Using update() to update the dictionary with another dictionary
my_dict3.update({"country": "USA", "age": 26})
print(my_dict3) # {'name': 'Bob', 'age': 26, 'city': 'Los Angeles', 'country': 'USA'}

for kaya, vala in my_dict3.items(): 
    print(f"Key: {kaya}, Value: {vala}")
#NOTE:yaha dictionary ke items ko loop kar rahe hai jisme kaya key hai aur vala value hai so .items() method se hume key-value pairs milte hai jise hum loop kar sakte hai.

for name in my_dict3.keys():
    print(f"Key: {name}",end=", ")

if "name" in my_dict3:
    print("name is present in the dictionary")

if "age" in my_dict3:
    print(f"age is present in the dictionary and its value is {my_dict3['age']}")

# @Insertting a key-value pair using setdefault() method
my_dict3.setdefault("hobby", "coding")
print(my_dict3) # {'name': 'Bob', 'age': 26, 'city': 'Los Angeles', 'country': 'USA', 'hobby': 'coding'}
# @Inserting multiple key-value pairs using update() method
my_dict3.update({"favorite_color": "blue", "favorite_food": "pizza"})
print(my_dict3) 

# @Deleting a key-value pair using popitem() method
my_dict3.popitem() # removes the last inserted key-value pair
print(my_dict3) 

# @Deleting a key-value pair using del keyword
del my_dict3["hobby"] # removes the key-value pair with key "hobby" from the memory
print(my_dict3)

# @Deleting a key-value pair using pop() method
my_dict3.pop("favorite_color")
print(my_dict3)

#? SUPER ADVANCED PRODUTION LEVEL DICTIONARY METHODS 
 
nested_dict = {
    "person1": {"name": "Alice", "age": 30},
    "person2": {"name": "Bob", "age": 25},
    "person3": {"name": "Charlie", "age": 35}
    }

squared_dict = {x: x**2 for x in range(1, 6)} # key value pair me x hai aur uska square value hai
print(squared_dict) # {1: 1, 2: 4, 3: 9, 4: 16, 5: 25}

# @Creating new Dictonary from key values 
keys = ["name", "age", "city"]
values = ["Alice", 30, "New York"]
new_dict = dict.fromkeys(keys,values) ## esse nhi banana hai kyuki har ek keys me saari values chali jaayegi
print(new_dict) 
## yeh krne k liye we will follow loops to have right answer 