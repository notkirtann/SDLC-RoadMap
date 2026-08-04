print("polynomial equation")
list=[]
n = int(input("Enter the size: "))
for i in range(n):
    a=int(input("enter the coeff: "))
    list.append(a)
x = int(input("Enter the value of x: "))
result=0
for i in range(n-1):
    result = result + list[i]*(x**n-1)
print(result)
#impropr neen reverse iteraation beacauuse n-- nor supported
