md = read.csv((file.choose()))
mdl = md$Length
mdf = md$Frequency
mdl.f = table(mdl)
mdl.f

plot(mdl.f, type="b", ylab="Frequency", xlab="Length")

plot(mdl.f, type="p")
plot(mdl.f, type="c")
plot(mdl.f, type="l")
plot(mdl.f, type="o")
plot(mdl.f, type="h")
plot(mdl.f, type="n")


hist(mdl)
hist(mdl, breaks=seq(0,12,by=1),ylim=c(0,20), 
     ylab="Frequency", xlab="Length")
hist(mdl, breaks=seq(0,10,by=1),ylim=c(0,20), 
     ylab="Frequency", xlab="Length")
hist(mdl, breaks=seq(0,10,by=2),ylim=c(0,40), 
     ylab="Frequency", xlab="Length")


prop.table(mdl.f)*100
hist(mdl, prob=T, breaks=seq(0,12,by=1), ylim=c(0,0.3),
     ylab="Relative Frequency", xlab="Length")
lines(density(mdl),lwd=1)
round(prop.table(mdl.f)*100,2) #둘째자리까지 표시ㅣ


mdl.cf=c(0,cumsum(mdl.f))
plot(mdl.cf, ylab="Cumulative Frequency", xlab="Length")
lines(mdl.cf)

cumsum(prop.table(mdl.f)*100)
c(0,cumsum(prop.table(mdl.f)*100))
round(cumsum(prop.table(mdl.f)*100),2)

# 백분위로
mdl.crf = c(0,cumsum(prop.table(mdl.f)*100))
plot(mdl.crf, ylab="Cumulative Frequency", xlab="Length")
lines(mdl.crf)

# 누적해서 1이 되게
mdl.crf2 = c(0,cumsum(prop.table(mdl.f)))
plot(mdl.crf2, ylab="Cumulative Frequency", xlab="Length")
lines(mdl.crf2)

#__________________________

# 정규분포
rnorm(100)
rnorm(10, mean=175, sd=5)

dnorm(1)
dnorm(0)
dnorm(177, mean=175, sd =5)

pnorm(1)
pnorm(-1)
1-pnorm(1)
pnorm(1, lower.tail = T)
pnorm(1, lower.tail = F)
1-pnorm(1, lower.tail = F)

qnorm(0.5)
qnorm(0.5, mean=175, sd=5)
qnorm(0.7, mean=175, sd=5)

#_______________________________


x=rnorm(100,0,1)
y=dnorm(x,0,1)
plot(x,y)
plot(x,y,type="l")

x=sort(rnorm(100,0,1))
y=dnorm(x,0,1)
plot(x,y)
plot(x,y,type="l")


x=sort(rnorm(500,175,5))
y=dnorm(x,175,5)
plot(x,y,type="l")

#__________________________________

md = rnorm(10000, 175, 5)
hist(md, breaks=20, prob=T) 
lines(density(md))

plot(function(md)dnorm(md, mean=155,sd=5), 
     140,170) 


plot(function(md)dnorm(md, mean=175,sd=5), 
     160, 190, add=TRUE, col="red") 


plot(md,dnorm(md,175,5),type="l",col="blue",add=T)


#________________________

install.packages("moments")
library("moments")


skewness(mdl)
kurtosis(mdl)

skewness(ldt$Length)
skewness(ldt$Freq)
kurtosis(ldt$Length)
kurtosis(ldt$Freq)

ldt_l = table(ldt$Length)
plot(ldt_l, type="l")

# 과제___________________________
# 5400명의 점수(0~10점까지) 분포를 봤더니
#평균 4.5, 표준편차 1.4였다
# 