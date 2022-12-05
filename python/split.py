def primes():
  limit = int(input("giv number"))
  current = 2
  result = ""
  while(current < limit):
    subcurrent = 2
    prime = True
    while(prime and subcurrent <= current / 2):
      if(current % subcurrent == 0):
        prime = False
      subcurrent += 1
    if(prime):
      result += str(current) + " "
    current += 1
  print(result)

primes()

def intlist():
  list = input("findrepet").split(",")
  for i in list:
    match = 0
    for j in list:
      if i == j:
        match += 1
    if match >= 2:
      print(i)

intlist()


