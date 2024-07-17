# matrix---------------------------------------------------------------
# 행*열의 2차원 배열 구조
# 동일한 타입의 데이터만 저장 가능

a <-c(1:5)
a

m1 <- matrix(a)
m1

# matrix 함수구조 (속성값 1부터 10까지, 2행)
m2 <- matrix(C(1:10), nrow=2)
m2

# 3행을 채울만큼 데이터가 모자람 -> 앞 요소 반복 저장
m3 <-matrix(c(1:13), nrow=3)
m3

# matrix 요소 인덱싱
m3[1,3] # 1행 3열
m3[1,] # 1행 전부
m3[,1] # 1열 전부
m3[1,c(2:5)] # 1행 2열~5열


# matrix 함수구조 (속성값 1부터 10까지, 2열)
m4 <- matrix(c(1:10), ncol=2)
m4

# 3열을 채울만큼 데이터가 모자람 -> 앞 요소 반복 저장
m5 <- matrix(c(1:10), ncol=3)
m5


# 2행 matrix 생성
m6 <-matrix(c(1:16), nrow=2)
m6

# 행과 열 변경
# 저장 방향 변경
m7 <-matrix(c(1:16), nrow=2, byrow=TRUE)
m7

m8 <-matrix(c(1:16), nrow=2, byrow=FALSE)
m8 # m6 == m8

# 빅데이터 : 엑셀과 같은 구조이므로
# matrix와 같은 2차원 테이블을 많이 사용하게 된다.

# 2열 matrix 생성
m9 <-matrix(c(1:10), ncol=2, byrow=TRUE)
m9

# 행과 열 변경
# 저장 방향 변경
m10 <-matrix(c(1:10), ncol=2, byrow=F)
m10

m7
length(m7) # 저장된 데이터 개수
nrow(m7) # 행 길이 확인 함수
ncol(m7) # 열 길이 확인 함수


m8
# apply(matrix, row(1)/col(2), max/min/sum) 함수
apply(m8, 1, max) # 행 기준 최대값
apply(m8, 1, min)
apply(m8, 1, sum)

apply(m8, 2, max) # 열 기준 최대값
apply(m8, 2, min)
apply(m8, 2, sum)


# 행과 열의 이름 지정 함수
m1 <- matrix(c(1:10), ncol=2, byrow=F)
m1
colnames(m1) <- c("한국인", "외국인")
rownames(m1) <-c('수학', '영어', '국어', '사회', '과학')
m1

m1[,'한국인'] # 열 이름으로 조회
m1['수학',] # 행 이름으로 조회
m1['영어','외국인'] # 행, 열 이름으로 조회

m1['영어', 1] # 열 번호로 조회
m1['영어', 2] 


# 행과 열의 데이터 결합 함수
x1 <- c(1:5)
y1 <- c(31:35)

# rbind() : 각각의 데이터를 하나의 행으로 만들어 결합
z1 <- rbind(x1, y1)
z1

# cbind() : 각각의 데이터를 하나의 열로 만들어 결합
z2 <- cbind(x1, y1)
z2
