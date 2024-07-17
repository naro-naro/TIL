# data.frame
# 2차원 데이터에서 가장 많이 사용
# 서로 다른 데이터 구조를 저장할 수 있다

df1 <- data.frame(x=c(100:102), y=c(2.1,6.77,2.03), z=c("가", "나", "다"))
df1

# df2 <-data.frame(x=c(1:3), y=seq(2,8,2), z=c('a','b','c','d'))
# error : 행의 수가 동일하지 않다.

num <- c(1,2,3)
na <- c('apple', 'banana', 'melon')
add <-c('M', 'M', 'F')
mo <- c(174, 181, 162)

student1 <- data.frame("No"=num, "fruit"=na, "gender"=add, "height"=mo)
student1

# matrix 구조로 만들기도 가능
# matrix : 문자, 숫자가 혼합되어 있으면 모두 문자로 변환된다
student2 <- matrix(
  c(1,'apple', 'M', 174,
    2, 'banana', 'M', 181,
    3, 'Cmelon', 'F', 162), 3, byrow=T
)

student2
student1

df2 <-data.frame(student2)
colnames(df2) <- c("No", 'fruit','gender', 'height')
df2 # matrix -> dataframe : Type을 확인해 볼 필요가 있다

# data.frame 객체 처리 함수
# str() : 구조확인
str(df2)
str(student1)

# $ : 속성값 확인
student1$fruit
student1$gender

names(student1) # 열 이름
ncol(student1) # 열 개수
nrow(student1) # 행 개수

student1[c(2:3), 3] # 2,3행의 3열 값

df3 <- data.frame(x=c(10:6), y=seq(2,10,2), z=c('a','b','c','d','e'))
df3

# subset() : 조건에 맞는 행만 출력
sub1 <-subset(df3, x>7)
sub1

sub2 <-subset(df3, (x>6 & y>4)) # 두 조건의 and
sub2

sub3 <-subset(df3, (x>9 | y>6)) # 두 조건의 or
sub3

na <-data.frame('No'=c(1:4), 'name'=c('kim','lee','park','na'))
tel <-data.frame('No'=c(2,3,5,7), 'tel'=c('02','031','032','010'))

# merge() : df 병합
# 두 'No'가 같은 행만 추출, 병합됨
user1 <-merge(na, tel, by.x='No', by.y="No")
user1 


a <-c(11:15)
b <-c(21:25)
c <-c(41:45)
x <-data.frame(a,b,c)
x

colnames(x) <-c('A 제품 판매', 'B 제품 판매', 'C 제품 판매')
rownames(x) <-c('서울', '경기', '인천', '대전', '광주')
x

# colSums() : 열 합계
colSums(x[,]) # 모든 열 합계
colSums(x[,-4]) # 모든 열 합계
colSums(x[,-3]) # C제외
colSums(x[,-2]) # B제외
colSums(x[,-1]) # A제외
colSums(x[-1,]) # 서울 제외
colSums(x[-2,]) # 경기 제외

# rowSum() : 행 합계
rowSums(x[,]) # 모든 행 합계

# colMeans() : 열 평균
# rowMeans() : 행 평균
colMeans(x[,]) # 모든 열 평균
rowMeans(x[,]) # 모든 행 평균

# 공공 빅데이터 내에는 숫자, 문자 등이 섞여 있으므로
# data.frame 구조를 자주 사용하게 된다.