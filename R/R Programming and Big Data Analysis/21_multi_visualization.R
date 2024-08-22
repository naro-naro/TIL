# 다중 그래프 시각화

a_score <- c(95,70,65,80,62,45,80,97)
b_score <- c(70,85,72,70,65,55,48,95)
names(a_score) <-c("sara", "peter", "daisy", "rosy", "paul", "april", "minsu", "eric")
names(b_score) <- names(a_score)

c_score <- cbind(a_score, b_score)
colnames(c_score) <-c('math score', 'english score')

boxplot(c_score, col=c("yellow", "green"),  ylim=c(40,100))
abline(h=75, lty=3, lwd=3, col='red')

# 산점도
# type = 'b' : 점끼리 연결
# lwd : 점 크기, 연결선 굵기
plot(c_score, col='blue', main="math score", ann=T, type='b', lwd=5)

# 새 그래프 추가
par(new=T)
line_chart = 1:100
plot(line_chart, col='yellow', type='l')

# 텍스트 추가
text(x=50, y=60, '대각선', col='green')
# type = 'b' : 점끼리 연결
# lwd : 점 크기, 연결선 굵기
# ann = F : x축, y축 이름 미표시
plot(c_score, col='blue', main="math score", ann=T, type='b', lwd=5)


# 산점도행렬
c_no <- c(1,1,1,1,2,2,2,2)
d_score <-data.frame(a_score, b_score, c_no)
colnames(d_score) <- c("math score", "english score", 'class')

par(mfrow=c(1,1))
pairs(d_score)
pairs(d_score[d_score$class==1, 1:3])
pairs(d_score[d_score$class==1, 1:3], pch=c(1:4))
pairs(d_score[d_score$class==1, 1:3], pch=c(1:4), col=c(1:4), cex=2)
