# reshape2 패키지
install.packages('reshape2')
install.packages("dplyr")

library(reshape2)
library(dplyr)

setwd("C:/Users/admin/Documents/GitHub/TIL/R/R Programming and Big Data Analysis/Data_Analysis/r_exam")
getwd()

t_data <- read.csv("도로교통공단_사고유형별 월별 교통사고(2018).csv", fileEncoding="euc-kr")
head(t_data)
t_data %>% head()

# dcast : 그룹핑을 쉽게
# 특정 컬럼을 기준으로 그룹핑하여 산술계산
dcast(t_data, 사고유형대분류~월, value.var="경상자수", sum)

t_data3 <- t_data[c(1:6), c(1,4,8)]
t_data3

# melt : 동일관측치의 값이 각 컬럼을 분리시켜 차곡차곡 쌓는 형식으로 변경
# join, groupby 연산 등에서 자주 사용
t_data4 <- melt(t_data3, id='사고유형대분류')
t_data4

# 새로운 데이터 불러오기
g_data <- read.csv("서울특별시_강남구_불법주정차단속현황_20210208.csv", fileEncoding="euc-kr")
head(g_data)

# 부과건수를 합계로 확인
# 동명, 연도별로 계산
g_data2 <- dcast(g_data, 동명~연도, value.var="부과건수", sum)
g_data2

g_data3 <- g_data[c(1:3), c(1:5)]
g_data3

g_data4 <- melt(g_data3, id="동명")
g_data4
