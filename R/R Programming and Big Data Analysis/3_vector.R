# vector--------------------------------------------------------
# 하나의 변수에 여러 값을 저장
# c()함수 사용 : 결합, combine
value1 <- c(1:10)
print(value1)

value2 <- c(1,2,3,4,5,6,7,8,9,10)
print(value2)

# value3 <- (1,2,3,4,5,6,7,8,9,10)
# error : c()함수 사용 필요


# 논리값 저장
value3 <- c(T, T, F, FALSE, TRUE, F, T)

# 문자열 저장
value4 <- c("T", "T", "F", "TRUE", "FALSE")
print(value4)


# 여러 데이터타입을 함께 저장할수도 있음 : chr문자열로 처리됨
value5 <- c("만두", 1, 5.4, -7, TRUE)
print(value5)

# 실수형이 포함되어 있으면 모두 실수형으로 저장됨
value6 <- c(5, 0.0, 3.14, -6)
print(value6)


#-----------------------------------------------------------
# seq(시작, 끝, 간격)
val1 <- seq(1, 20, 2)
val2 <- seq(from=1, to=20, by=2)
print(val1)
print(val2)


# rep(시작, 끝, 반복수) : 반복저장
# 매개변수(속성값)에 따라 함수가 다르게 동작한다
val3 <- rep(1:6, 3)
val4 <- rep(x=1:6, each=3) # each만큼 각각 반복
print(val3)
print(val4)


# paste() : 문자 결합 (요소 수가 안맞을 시 반복)
a <- c("부천", '인천', '서울', '김포')
b <- c('강원도', '제주도', '경기도')

paste(a, b, sep='') 
# "부천강원도" "인천제주도" "서울경기도" "김포강원도"
paste(a, b, sep='//') 
# "부천//강원도" "인천//제주도" "서울//경기도" "김포//강원도"

paste('대한민국','강산','아름답고','푸르게','푸르게', collapse="|") 
# "대한민국 강산 아름답고 푸르게 푸르게"
paste(c('대한민국','강산','아름답고','푸르게','푸르게'), collapse="|")
# "대한민국|강산|아름답고|푸르게|푸르게"


# substr()
ss <-c("하모니", '우연히', '해외여행')
substr(ss, 1, 2) # 1~2번째 글자
substr(ss, 2, 3) # 2~3번째 글자
substr('대한민국동해남해서해바다', 1, 6) # 1~6번째 글자


#----------------------------------------------------------------------------
# vector 데이터 처리함수
x <- c(1,3,6,7,9,10)
y <- c(2,4,6,8,10)

# union() : 합집합
z1 <- union(x,y)
z1

# setdiff() : 차집합
z2 <- setdiff(x,y)
z3 <- setdiff(y,x)
z2;z3

# intersect() : 교집합
z4 <- intersect(x,y)
z4


#---------------------------------------------------------------------------
# 데이터형 확인 함수
val1 <- c(1:10)
val2 <- c(1, 5.4, -7, 4.52)
val3 <- c(T, T, F, TRUE, FALSE)
val4 <- c('만두', '짜장면', '탕수육')

mode(val1)
class(val1)
typeof(val1)

mode(val2)
class(val2)
typeof(val2)

mode(val3)
class(val3)
typeof(val3)

mode(val4)
class(val4)
typeof(val4)