# lattice 패키지 설치, 불러오기
install.packages("lattice")
library(lattice)

# 파일 불러오기
setwd("C:/Users/admin/Documents/GitHub/TIL/R/R Programming and Big Data Analysis/Data_Analysis/r_exam")
csv <- read.csv("도로교통공단_사고유형별 월별 교통사고(2018).csv", fileEncoding="euc-kr", header = T)

table(csv$사고유형대분류)

# 최소값 최대값 확인
min(csv$경상자수)
max(csv$경상자수)

min(csv$중상자수)
max(csv$중상자수)

min(csv$사망자수)
max(csv$사망자수)

# lattice 패키지의 histogram 함수(~컬럼명, data=데이터명)
histogram(~경상자수, data=csv)

# 사고유형대분류 별 경상자수 히스토그램
histogram(~경상자수 | 사고유형대분류, data=csv)

# lattice 패키지의 밀도 함수(~컬럼명, data=데이터명)
densityplot(~경상자수, data=csv)

# 사고유형대분류 별 경상자수 밀도함수
densityplot(~경상자수 | 사고유형대분류, data=csv,
            auto.key = T, group=사고유형대분류,
            plot.point=T)

# lattice 패키지의 barchart 함수
barchart(사고유형~경상자수, data=csv)
barchart(사고유형~경상자수 | 사고유형대분류, data=csv)

# layout : 행*열 지정
barchart(사고유형~경상자수 | 사고유형대분류, data=csv,
         layout=c(4,1))

# lattice 패키지의 dotplot 함수
dotplot(사고유형~경상자수, data=csv)
dotplot(사고유형~경상자수 | 사고유형대분류, data=csv,
        layout=c(1,4))


# 사망자수와 중상자수
xyplot(사망자수~중상자수, data=csv)
xyplot(중상자수~사망자수, data=csv, pch='★')


# 조건에 따른 두 변수에 대한 그래프 작성
coplot(사망자수~중상자수 | 사고건수, data=csv,
       overlap=0.9, bar.bg=c(num="yellow"),
       col="blue", row=1, number=4,
       panel=panel.smooth)
       
# 3차원 그래프
cloud(사망자수~경상자수*중상자수, data=csv, panel.aspect = 1,
      screen=list(z=40, y=80))

# 데이터 범주화 함수
# 5개의 그룹으로 범주화
# (이웃한 구간에 있는 데이터는 중복될 수 있음)
t_group <- equal.count(csv$부상신고자수, number=5, overlap=0)
t_group

xyplot(사망자수~중상자수 | t_group, data=csv,
       pch='★')