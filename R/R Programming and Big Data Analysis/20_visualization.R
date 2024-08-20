# 데이터 시각화

# 데이터 정의
vis <- c(95, 70, 65, 80, 62, 45, 80, 97)
names(vis) <- c('sam', 'anne', 'alice', 'julie'
           , 'michael', 'tom', 'jake', 'diana')
vis


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
pie(vis, radius=15)
