# 패키지 설치
install.packages("ggplot2")
library(ggplot2)

# 파일 불러오기
setwd("C:/Users/admin/Documents/GitHub/TIL/R/R Programming and Big Data Analysis/Data_Analysis/r_exam")
csv <- read.csv("도로교통공단_사고유형별 월별 교통사고(2018).csv", fileEncoding="euc-kr", header = T)

qplot(경상자수, data=csv, bins=30)
qplot(경상자수, data=csv, fill=사고유형대분류, 
      bins=30)
qplot(경상자수, data=csv, fill=사고유형대분류, 
      geom="bar", color=사고유형대분류)
qplot(경상자수, data=csv, fill=사고유형대분류, 
      geom="boxplot", color=사고유형대분류)

qplot(경상자수, data=csv, fill=사고유형대분류, 
      color=사고유형대분류, facets = 사고유형대분류~.,
      bins=30)
qplot(경상자수, data=csv, fill=사고유형대분류, 
      color=사고유형대분류, facets = ~사고유형대분류)
qplot(경상자수, data=csv, fill=사고유형대분류, 
      color=사고유형대분류, facets = .~사고유형대분류)


qplot(x=경상자수, y=부상신고자수, data=csv,
      color=사고유형대분류)
# 범례 기호 설정
qplot(x=경상자수, y=부상신고자수, data=csv,
      color=사고유형대분류, shape=사고유형대분류)

qplot(x=경상자수, y=부상신고자수, data=csv,
      color=사고유형대분류, shape=사고유형대분류,
      facets = ~사고유형대분류)
