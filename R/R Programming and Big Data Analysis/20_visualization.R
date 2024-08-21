# 데이터 시각화

# 데이터 정의
vis <- c(95, 70, 65, 80, 62, 45, 80, 97)
names(vis) <- c('sam', 'anne', 'alice', 'julie'
           , 'michael', 'tom', 'jake', 'diana')
h_data <- c(65, 83, 75, 80, 77, 72, 87, 67, 56, 97)


# 1. 막대그래프
# ylim : y값의 범위
# col : 색상 - rainbow(데이터 수)
# border : 테두리 굵기
# xlab, ylab : x축 제목, y축 제목
# main : 그래프 제목
barplot(vis, ylim=c(0,100), col=rainbow(8), border=0.4
        , xlab='name', ylab='score', main='midterm test')


# 1-2. 수평막대그래프(barh)
# horiz=TRUE : 차트 90도 회전
# col : 색상 - c("색상1", "색상2", ...)
# space : 막대간 간격 조정
# cex.(데이터) : 데이터 요소 글씨크기 조정
barplot(vis, xlim=c(0,100), col=c('blue', 'green'), border=0.4
        , xlab='name', ylab='score', main='midterm test'
        , horiz=TRUE, space=0.8, cex.names=1)


# 2. 도트플롯
# color : 이름, 점 색상
# lcolor : 라인 색상
# pch=1:8 : 8명의 점의 모양을 모두 다르게

dotchart(vis, color=c('red', 'black'), lcolor='yellow',
         pch=1:8, label=names(vis), xlab='name', ylab='score',
         main='midterm test')


# 3. 파이차트
# raidus : 반지름
# border : 테두리 색상
# clockwise : T - 시계방향 / F - 반시계방향
# edges : 숫자가 클수록 원에 가까워짐
# label : 이름 옆에 점수 표시
# cex : 데이터 요소 글씨 크기 조정
pie(vis, radius=10, border=6, clockwise = TRUE, edges = 100, 
    main='midterm test', label = paste(names(vis), vis, "점"),
    cex=2)


# 4. 히스토그램(기술통계)
# xlim : x값의 범위
# border : 테두리 색상
# density : 투명도
# freq : T - 빈도 / F - 밀도
# freq=F 일 때, lines(),curve() 그래프 겹쳐그리기 가능
# par(mfrow=c(행,열)) : 그래프 행*렬로 여러 개 그리기

par(mfrow=c(1,2))

hist(h_data, xlab='score', col='lightblue',  main='midterm test', 
     freq=T, xlim=c(40,100), border='blue', density=100)

hist(h_data, xlab='score', col='lightblue',  main='midterm test', 
     freq=F, xlim=c(40,100), border='blue', density=100)

lines(density(h_data), col='red')

# 정규분포함수
x <- seq(40,100,10)
curve(dnorm(x, mean=mean(h_data), sd=sd(h_data)), col="green", add=T)