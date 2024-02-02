a <- 1 # 할당 연산자
print(a)# 출력문

?class #도움말

# 문자형 벡터 생성
sen <- 'hello world!'
print(x = sen) 
class(x = sen) # 자료형 출력
length(x = sen) # 원소 개수 반환

# 객체 이름 규칙
# 영문 한글 숫자 _ . 사용 가능
# 문자 _ .으로 시작해야 함
# 숫자로 시작하고 싶다면 백틱``으로 감싸줘야 한다
# (어쩔 수 없이 숫자로 시작하는 객체명을 다룰 떄가 온다)

a <- 1 # a = 1
b <- 2 # b = 2

a <- b # a = 2
b <- 3 # b = 3

print(x = a); print(x = b)

# 3a <- 3 # error
`3a` <- 3

print(x = `3a`)

# 백틱 대신 따옴표'"로도 객체를 생성할 수 있다
'4b' = 4
print('4b')

"2c" <- 2
print(x = "2c")
