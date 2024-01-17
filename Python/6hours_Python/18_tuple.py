# 튜플 ( )
# 튜플은 내용 변경이나 추가가 불가능 (!= 리스트)
# 속도가 리스트보다 빠름!

menu = ('돈카츠', '치즈카츠')
print(menu[0])
print(menu[1])

# menu.add('생선카츠') # 튜플은 값 추가가 불가능!

# name = 'elise'
# age = 20
# hobby = 'programming'
# print(name, age, hobby)

# 튜플은 값을 한번에 선언할 수 있다!
(name, age, hobby) = ('elise', 20, 'programming')
print(name, age, hobby)