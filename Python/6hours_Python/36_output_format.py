# 다양한 출력 포맷

# 빈 자리는 빈공간으로 두고, 오른쪽 정렬을 하되, 총 10자리 공간을 확보
print('{0: >10}'.format(500))
# 출력 값 :       500

# 양수일 땐 +로 표시, 음수일 땐 -로 표시
print('{0: >+10}'.format(500))
print('{0: >+10}'.format(-500))

# 왼쪽 정렬하고, 빈 칸을 *로 채우기
print('{0:*<10}'.format(300))
# 출력 값 :300*******

# 세자리마다 , 찍기
print('{0:,}'.format(100000000))

# 세자리마다 , 찍고, 부호도 붙이기
print('{0:+,}'.format(3000000))
print('{0:+,}'.format(-3000000))

# 세자리마다 , 찍고, 부호 붙이고 자릿수 확보, 빈 자리에 ^로 채우기
print('{0:^<+15}'.format(50000000))
print('{0:^<+15}'.format(-50000000))
print('{0:^>+15}'.format(70000000))
print('{0:^>+15}'.format(-70000000))

# 소수점 출력
print('{0:f}'.format(5/3))

# 소수점 특정 자리수까지만 출력
print('{0:.3f}'.format(5/3))    # 세번째자리까지
print('{0:.2f}'.format(5/3))    # 두번째자리까지