cor(ldt$Mean_RT, ldt$Length)
plot(ldt$Mean_RT, ldt$Length)

new_ldt = subset(ldt, Mean_RT<1200)
new_ldt

cor(new_ldt$Mean_RT, new_ldt$Length)
plot(new_ldt$Mean_RT, new_ldt$Length)

#__________________________________

# t-확률분포함수 그리기
x = seq(-4, 4, 0.1)
plot(x, dt(x, 20), type="l", lwd=2, col="blue", xlab="t-value", ylab="density", main="t-curve, df=20")
abline(v=c(-2,2), col="red")

#___________________________________
# 원 샘플 티 테스트
# 예시1
CA = c(1773, 1765, 1771, 1758, 1729, 1740, 1772)
t.test(CA, mu=1775)

# 예시2
group = rnorm(120, 173.5, 6)
t.test(group, mu=175)
# (t(119) = -1.37, p > 0.05)

2 * (1 -pt(abs(-1.462), 119))

#_________________________
# 디펜던트 투 샘플 티 테스트

# ex1
am = c(144, 147, 148, 172, 170, 133, 141, 144, 146, 148, 152, 149, 143, 138, 165, 143, 142, 155, 135, 144)
pm = c(133, 138, 139, 160, 165, 133, 140, 142, 144, 142, 139, 144, 139, 130, 164, 140, 128, 129, 133, 144) 

boxplot(am, pm)
plot(density(am), col="red")
lines(density(pm), col="blue")

t.test(am, pm, paired = TRUE)

# ex2
delta = c(11, 9, 9, 12, 5, 0, 1, 2, 2, 6, 13, 5, 4, 8, 1, 3, 14, 26, 2, 0)
t.test(delta, mu=0) # one sample t-test

#______________________________
# 인디펜던트 투 샘플 티 테스트

# 예
yng = c(5.2, 4.9, 5.7, 5.1, 4.9, 4.8, 5.7, 6.5, 4.1, 4.9)
old = c(5.3, 5.1, 4.2, 4.2, 5.0, 5.6, 3.9, 4.1, 4.4, 5.0)
t.test(yng, old)

boxplot(yng, old)
plot(density(yng), col="red")
lines(density(old), col="blue")

#________________
# task

library("languageR")
head(ratings)

# “Does the complex word appear less frequently than simplex word?”
# 복잡한 단어와 단순한 단어의 빈도를 비교하여
# 복잡한 단어가 단순한 단어보다 덜 나올까?

# 컴플랙스 워드와 심플렉스 워드를 기술통계
# 컴플렉스와 심플렉스 티-테스트
# 적절한 레포트
# 쉽게 해설

# 컴플렉스로 사용되었을 때의 프리퀀시와
# 심플렉스로 사용되었을 때의 프리퀀시를 비교

# 심플렉스인지 컴플렉스인지에 따라서
# 프리퀀시를 비교

# subset으로 
# 가급적 많은 그림을 그려보고
# 많은 분석을 해보기

# 코드와 워드파일 제출