# setwd() : 작업폴더 설정 함수
setwd("C:/Users/admin/Documents/GitHub/TIL/R/R Programming and Big Data Analysis/Data_Analysis/r_exam")

# csv 파일 읽어오기
data <- read.csv("도로교통공단_사고유형별 월별 교통사고(2018)-결측치.csv", fileEncoding="euc-kr", header = T)

# 데이터 확인
head(data)
str(data)

# 기술통계
summary(data)

# 데이터 개수 확인
length((data$사고건수))

# 데이터 범주화로 개수 확인
table(data$사고유형대분류)
table(data$사고유형중분류)

# 결측치 처리
