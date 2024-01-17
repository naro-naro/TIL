#변수 : 어떤 값을 저장하는 공간
animal = '강아지'
name = '대니'
age = 4
hobby = '산책'
is_adult = age>=3

#반려동물을 소개해주세요~!
#print('우리집 강아지의 이름은 대니에요.')
#print('대니는 4살이며, 산책을 좋아합니다.')
#print('대니는 어른인가요? True')

print('우리집 ' + animal + '의 이름은 '+ name +'에요.')

print(name +'는 '+ str(age) +'살이며, '+ hobby +'을 좋아합니다.')
print(name,'는 ', age ,'살이며, ', hobby ,'을 좋아합니다.')

print(name + '는 어른인가요? '+ str(is_adult))
print(name , '는 어른인가요? ', is_adult)

# ,를 사용하면 띄어쓰기가 자동포함됨