y = 6
z = lambda x: x ** y
print (z(7))
arr1=[1,2,3,4,5]
arr2=[1,3,4,5,7]
if len(arr1) == len(arr2):
    print("array is equal")
else:
    print("array is not equal")

import functools
l=[1, 2, 3, 4, 5]
m=functools.reduce(lambda x, y:x if x>y else y, l)
print(m)

def my_func():
   x = 10
   print("Value :",x)
x = 20
my_func()

print("Value :",x)

l=[1, -2, -3, 4, 5]
def f1(x):
    return x<-1
m1=map(f1, l)
print(list(m1))