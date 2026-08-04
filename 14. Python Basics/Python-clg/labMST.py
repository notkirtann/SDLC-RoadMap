print("----------LAB----MST------------------")
# Python code to merge dict using update() method
def Merge(dict1, dict2):
	return(dict2.update(dict1))

#Method One two create Dictonary
dict1 = {'Killer': 'Ramos', 'Fraud': 'Messi','Magician':'Modric'}

#Method 2nd to create Dictonary
dict2 = dict({'GOAT': 'Roanldo', 'LEGEND': 'Neymar','Special_One':'Jose Mourinho'})
print("----------LAB----MST------------------")

# This returns None
print(Merge(dict1, dict2))
print("----------LAB----MST------------------")


# changes made in dict2
print(dict2)
print("----------LAB----MST------------------")