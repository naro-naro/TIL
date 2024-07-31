# 데이터 전처리 : 특정 분석에 적합하게 데이터 가공
# dplyr : 데이터 전처리 패키지
# %>% 파이프 연산자를 사용해 체인 형식 코드 사용 지원


# 패키지 설치 및 불러오기
install.packages("dplyr")
library(dplyr)

# 작업 디렉토리 설정
getwd()
setwd("C:/Users/admin/Documents/GitHub/TIL/R/R Programming and Big Data Analysis/Data_Analysis/r_exam")
getwd()

# 데이터 불러오기
t_data <-read.csv("도로교통공단_사고유형별 월별 교통사고(2018).csv", fileEncoding="euc-kr")



head(t_data)
t_data %>% head()
t_data %>% subset(사고건수>=6500 & 부상신고자수>=700)

# tbl_df() : 콘솔창 크기에 맞춰 데이터 조희
tbl_df(t_data)

# filter() : 원하는 조건으로 데이터 추출
rt <-filter(t_data, 사고유형중분류=='횡단중' & 사망자수>=70)
rt

# arrange() : 정렬
arrange(t_data, desc(사고건수))

# select() : 원하는 칼럼의 데이터만 검색
select(t_data, 사고유형, 부상신고자수)

# mutate() : 계산을 통해 원하는 컬럼 생성
t_data2 <- mutate(t_data, 사망자수비율 = 사망자수/사고건수)
str(t_data2)

# summarise() : 통계값
summarise(t_data, mean(사고건수))

# group_by() : 그룹별 계산
group_by(t_data, 사고유형대분류) %>% 
  summarise(mean_math = mean(사고건수), sum_math = sum(사고건수), n=n())



head(t_data, 3)
x <-filter(t_data, 경상자수>=7000)
x

# 모든 행, 4번째, 8번째 열
x <-x[, c(4,8)]
x

y<- filter(t_data, 부상신고자수>=650)
y

# 모든 행, 4번째, 9번째 열
y <-y[, c(4,9)]
y

# inner_join(x,y, by="열이름")
inner_join(x,y,by="월")

# left_join(x,y,by="열이름")
# right_join(x,y,by="열이름")
left_join(x,y,by="월")
right_join(x,y,by="월")

# full_join(x,y,by="열이름")
full_join(x,y,by="월")



# bind_rows() : 변수 1, 2 데이터를 행으로 결합
# bind_cols() : 변수 1, 2 데이터를 열로 결합
df_rows <-bind_rows(x,y)
df_rows
# error : df_cols <-bind_cols(x,y)
# 데이터 수가 다름

# 데이터 수 맞추기
x <- x[c(1:6),]
df_cols <-bind_cols(x,y)
df_cols

# rename() : 열 이름 수정
df_cols_rename <- rename(df_cols, 경상자수_월=월...1)
df_cols_rename <- rename(df_cols_rename, 부상신고자수_월=월...3)
df_cols_rename


# 새로운 데이터 불러오기
setwd("C:/Users/admin/Documents/GitHub/TIL/R/R Programming and Big Data Analysis/Data_Analysis/r_exam")
g_data <-read.csv("서울특별시_강남구_불법주정차단속현황_20210208.csv", fileEncoding="euc-kr", header=T)
head(g_data)

g_data %>% subset(부과건수>=60000 | 견인건수>=7000)
arrange(g_data, desc(부과건수))
select(g_data, 부과건수, 단속원금.원.)

# 총건수 : 새로운 필드값..컬럼 추가
g_data2 <- mutate(g_data, 총건수=부과건수+견인건수)
head(g_data2)

summarise(g_data, mean(단속원금.원.))
group_by(g_data, 연도) %>% 
  summarise(부과건수_평균 = mean(부과건수), 
            부과건수_합계 = sum(부과건수), n=n())

x <- filter(g_data, 부과건수>=10000, 연도==2019)
x
