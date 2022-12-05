def hello_world():
  print("Hello World!")

hello_world()

def sum_Integers(a,b):
  sum = a + b
  if(a == b):
    sum += a
  return sum

print(sum_Integers(1,3))

def abs_Difference(a, b):
  diff = a - b
  return abs(diff)

def check_30(a,b):
  if(a + b == 30 or b == 30 or a == 30):
    return True

  return False

print(check_30(30,3))

def within_20(a):
  if(a >= 80 and a <= 120):
    return True
  if(a >=280 and a <= 320):
    return True