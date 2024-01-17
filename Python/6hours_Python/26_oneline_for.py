# 한줄로 끝내는 for문 활용법

# 출석번호 1, 2, 3, 4 앞에 100을 더하기로 함 -> 101, 102, 103, 104
students = [1, 2, 3, 4, 5]
print(students)
students = [i+100 for i in students]
print(students)

print()

# 학생 이름을 길이로 변환
student = ['Ironman', 'Thor', 'Iamgroot']
print(student)
student = [len(i) for i in student]
print(student)

print()

# 학생 이름을 대문자로 변환
studentss = ['captain', 'antman', 'wintersoldier']
print(studentss)
studentss = [i.upper() for i in studentss]
print(studentss)