money = int(input("가진 돈의 액수를 입력하세요. : "))
card = input("카드를 가지고 있다면 \'O\', 없다면 \'X\'를 입력하세요. : ")
if money >= 3000 or card == "O" :
    print("택시를 타세요")
if money < 3000 and card == "X":
    print("걸어가세요")