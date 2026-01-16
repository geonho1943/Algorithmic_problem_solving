# n의 모든 약수들의 합 == n : 완전수
# 완전수가 아닐시 : "n is NOT perfect."
# 맞을시 : "6 = 1 + 2 + 3"

while True :
  num = int(input())
  
  if num == -1:
    break
  # if num == 1:
  #   print(str(num)+" is NOT perfect.")
  temp = 1
  ans =str(num)+" = 1"
  
  for i in range(2,num //2 +1): # num-1 이 아닌 num/2가 최적화 같은데 예외가 있을 수 도 있으니까 냅둠
    if num%i == 0:
      temp+=i
      if temp > num: break
      ans += " + " + str(i)
      
  if temp == num:
    print(ans)
  else:
    print(str(num)+" is NOT perfect.")
      