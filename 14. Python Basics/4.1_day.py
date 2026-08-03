
#? LIST IN PYTHON // ARRAY IN OTHER LANGUAGES
# A list is a collection of items that are ordered and changeable. In Python, lists are written with square brackets [].
#? CREATING A LIST
my_list = [1, 2, 3, 4, 5]
print(my_list) # [1, 2, 3, 4, 5]
my_list2 = ["apple", "banana", "cherry"]
print(my_list2) # ['apple', 'banana', 'cherry']
my_list3 = [1, "apple", 3.14, True]

print(my_list3[:])
print(my_list3[:2])
print(my_list3[-1])

my_list3[0:1] = "ONE"
print(my_list3) # ['O', 'N', 'E', 'apple', 3.14, True] #!output we got but we wanted ['ONE', 'apple', 3.14, True]
my_list3[0:3] = ["ONE"]
print(my_list3) # ['ONE', 'apple', 3.14, True] #!actual output we wanted
my_list3[0:1] = ["ONE", "TWO", "THREE"]
print(my_list3) # ['ONE', 'TWO', 'THREE', 'apple', 3.14, True]
my_list3[0:3] = []
print(my_list3) # ['apple', 3.14, True]
my_list3.append("NEW ITEM")
print(my_list3) # ['apple', 3.14, True, 'NEW ITEM']
my_list3.insert(1, "INSERTED ITEM") 
print(my_list3) # ['apple', 'INSERTED ITEM', 3.14, True, 'NEW ITEM']
my_list3.remove("apple")
print(my_list3) # ['INSERTED ITEM', 3.14, True, 'NEW ITEM']
my_list3.pop(2)
print(my_list3) # ['INSERTED ITEM', 3.14, 'NEW ITEM']
my_list3.pop() # removes the last item
print(my_list3) # ['INSERTED ITEM', 3.14]

# ! above example is just to show how we can manipulate the list using slicing and other list methods. 
for item in my_list3:
    print(f"yeh hai item: {item} ",end=" ---can be used for end-- \n")

if "NEW ITEM" in my_list3:
    print("NEW ITEM is present in the list")

my_list3_copy = my_list3.copy()
my_list4_copy = my_list3
# difference between copy and slicing is that copy creates a new list while slicing creates a new list but it is a reference to the original list. so if we change the original list then the sliced list will also change but the copied list will not change.
my_list3.append("ANOTHER ITEM")
print(my_list3) # ['INSERTED ITEM', 3.14, 'ANOTHER ITEM']
print("normal copy",my_list4_copy) # ['INSERTED ITEM', 3.14, 'ANOTHER ITEM'] #! same reference
print("using copy function",my_list3_copy) # ['INSERTED ITEM', 3.14] #! differnt reference

#? list comprehension
squares = [x**2 for x in range(1, 11)]
print(squares) # [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
