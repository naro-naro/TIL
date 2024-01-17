num = int(input('숫자 입력:'))
num_is_prime=True
for i in range(2,num):
    if num%i==0:
        num_is_prime=False
if num_is_prime==True:
    print(f"{num}은 소수입니다.")
else:
    print(f"{num}은 소수가 아닙니다.")