# 파일 불러오기
setwd("C:/Users/admin/Documents/GitHub/TIL/R/R Programming and Big Data Analysis/Data_Analysis/r_exam")
csv <- read.csv("도로교통공단_사고유형별 월별 교통사고(2018).csv", fileEncoding="euc-kr", header = T)
head(csv)

# 상위 12개 행만 따로 저장
csv2 <- csv[c(1:12),]
csv2

# 차트 화면 분할
par(mfrow=c(1,2))

# 막대차트(세로)
barplot(부상신고자수~월, data=csv2, horiz=F,
        ylim=c(0,100), space=1, col="red",
        border=0.4, density=100, cex.names=1,
        xlab="월별", ylab="부상신고자수", main="차대사람~횡단중~부상신고자수")

# 막대차트(가로)
barplot(부상신고자수~월, data=csv2, horiz=T,
        xlim=c(0,100), space=1, col="blue",
        border=0.4, density=100, cex.names=1,
        xlab="월별", ylab="부상신고자수", main="차대사람~횡단중~부상신고자수")

# 화면문할X
par(mfrow=c(1,1))

# 산점도
dotchart(csv2$부상신고자수, gdata=csv2,
         color=c("blue", "green"), lcolor="red", 
         pch=2, labels=1:12, ylab="월", xlab="부상신고자수",
         main="월별 부상신고자수", cex=2)

# 원형차트
pie(csv2$부상신고자수, border = 1, radius = 1.5,
    edges=0, clockwise = T, main="월별 부상신고자수",
    cex=1.2, label=paste(csv$월, "월", csv2$부상신고자수, "건"))

# 컬럼 별 그래프
# 12개의 기호로 월 별 표시
pairs(csv2[, 5:8], pch=c(1:12), cex=1)
csv2[, 5:8]

# 1~12행 7~8열 추출하여 따로 저장
csv3 <- csv2[c(1:12), c(7:8)]
csv3

# 박스폴롯 시각화
boxplot(csv3)
abline(h=750, lty=5, col="red")

# 산점도
plot(csv3, col="red", axes=T, type="p", lwd=6,
     main="2018 중상자수~경상자수")
par(new=T)
line_chart=1000:2000
plot(line_chart, col="blue", axes=F, ann=F, type="l")
text(x=600, y=1650, "선형", col="blue")

# 다양한 형태의 그래프
par(mfrow=c(2,2))
plot(csv3, col="red", axes=T, ann=T, type='l', lwd=1,
     main="2018 중상자수~경상자수 현황")
plot(csv3, col="red", axes=T, ann=T, type='o', lwd=1,
     main="2018 중상자수~경상자수 현황")
plot(csv3, col="red", axes=T, ann=T, type='h', lwd=1,
     main="2018 중상자수~경상자수 현황")
plot(csv3, col="red", axes=T, ann=T, type='s', lwd=1,
     main="2018 중상자수~경상자수 현황")

# 히스토그램
csv4 <- csv2[c(1:12), 5]
par(mfrow=c(1,2))
hist(csv4, xlab='사고건수', col='lightyellow',
     freq=T, main='사고건수', labels = T,
     border='pink')
hist(csv4, xlab='사고건수', col='lightyellow',
     freq=F, main='사고건수', labels = T,
     border='pink')
lines(density(csv4), col='red')
x <- seq(1300, 1800, 100)
curve(dnorm(x, mean = mean(csv4), sd=sd(csv4)), col='blue', add=T)
