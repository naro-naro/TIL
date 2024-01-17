print()

try:
    num_input_a = int(input("정수를 입력해주세욥> "))
    print("반지름은~~~ {: 26.1f}".format(num_input_a))
    print("둘레여..? {: 28.1f}".format(2*3.14*num_input_a))
    print("주문하신 넓이 나왔습니당 {: 14.1f}".format(3.14*num_input_a**2))
except:
    print("이거 머에여.. 정수가 아니자나여..")
else:
    print("정수 맞네염!^_^ 정상작동 해써여!>.<")
finally:
    print("프로그램을 마칩니당~~~~")

print()