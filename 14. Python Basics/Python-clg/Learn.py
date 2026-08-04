x=input("enter string")
r={}
for i in x:
    if i in r:
        r[i]+=1
    else:
        r[i]=1
print(r)