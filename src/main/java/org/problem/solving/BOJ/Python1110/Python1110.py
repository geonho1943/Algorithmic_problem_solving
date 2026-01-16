# 주워진 수 ab 
# ab의 1의자리와 각자리수합의 1의자리를 문자열합 ans
# 반복해서 ans가 ab와 같아질때 그 반복 수 출력


fasd = int(input())
a = int(0)
asd = int(0)
while asd != fasd:
  asd = fasd
  if (len(asd) == 1):
    asd += "0" + asd
  temp1 = asd[0]+asd[1]
  ans = int(asd[1]) + int(temp1[1])
  a+=1
  print(a)
print("답:" + str(a))
  
