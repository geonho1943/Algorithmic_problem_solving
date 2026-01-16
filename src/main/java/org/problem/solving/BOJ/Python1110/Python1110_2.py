fasd = input()
a = int(0)
asd = fasd

if len(fasd) == 1:
  fasd = "0" + fasd
  asd = fasd

while True:
  temp1 = str(int(asd[0]) + int(asd[1]))
  ans = asd[1] + temp1[-1]
  a += 1
  asd = ans
  if asd == fasd:
    break

print(str(a))
