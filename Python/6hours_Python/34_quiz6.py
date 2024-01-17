# quiz) 표준 체중을 구하는 프로그램을 작성하시오.

# 표준 체중 : 각 개인의 키에 적당한 체중

# (성별에 따른 공식)
# 남자 : 키(M) X 키(M) X 22
# 여자 : 키(M) X 키(M) X 21

# 조건1 : 표준 체중은 별도의 함수 내에서 계산
#         * 함수명 std_weight
#         * 전달값 키(height), 성별(gender)
# 조건2 : 표준 체중은 소숫점 둘째 자리까지 표시

# (출력 예제)
# 키 175cm 남자의 표준 체중은 67.38kg 입니다.

#-----------------------------------------------------------------------------
# 내 답안
def std_weight(height, gender):
    if gender == '남자':
        std_weight = height /100 * height /100 * 22 
        print('키 {}cm {}의 표준 체중은 {}kg 입니다.'.format(height, gender, std_weight))
        return std_weight

    elif gender == '여자':
        std_weight = height /100 * height /100 * 21 
        print('키 {}cm {}의 표준 체중은 {}kg 입니다.'.format(height, gender, std_weight))
        return std_weight

std_weight(161.2, '여자')

#_______________________________________________________________________________________
print()
#_______________________________________________________________________________________
# 강의 답안
def std_wgt(hgt,gen):   # 키는 m단위(실수), 성별 '남자' / '여자'(str)
    if gen == '남자':
        return hgt * hgt * 22
    elif gen == '여자':
        return hgt * hgt * 21

hgt = 161.2
gen = '여자'
wgt = round(std_wgt(hgt/100 , gen), 2)
print('키 {}cm {}의 표준 체중은 {}kg 입니다.'.format(hgt, gen, wgt))

