list_a = ["요소a","요소b","요소c"]

i = 0
for item in list_a:
    print("{}번째 요소는 {}입니다".format(i,item))
    i+=1

for i in range(len(list_a)):
    print("{}번째 요소는 {}입니다".format(i,list_a[i]))


list_b = ["사과","바나나","딸기"]
print(list(enumerate(list_b)))
print(enumerate(list_b))