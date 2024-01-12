mymode = function(x){
  myt = table(x)
  names(myt)[myt==max(myt)]

}

mymode(ldt$Length)
var = c(2,3,5,5,6,7,7,8,10)
mymode(var)

#____________________________

range(ldt$Length)
min(ldt$Length)
max(ldt$Length)

#____________________________

table(ldt$Length)
var(ldt$Length)
sd(ldt$Length)
sqrt(var(ldt$Length))

#_____________________________

statistics = function(x){
  print(mean(x))
  print(median(x))
  myt=table(x)
  print(names(myt)[myt==max(myt)])
  print(range(x))
  print(max(x))
  print(min(x))
  print(var(x))
  print(sd(x))
  
}
statistics(var)
statistics((ldt$Length))

#___________________________

statistics((ldt$Mean_RT))
table(ldt$Mean_RT)
# 모든 관측치가 1이라 mode에 전부 출력됨 : mode가 의미없음

IQR(ldt$Mean_RT)
summary(ldt$Mean_RT)
quantile(ldt$Mean_RT)
quantile(ldt$Mean_RT, 0.25) - 1.5*IQR
quantile(ldt$Mean_RT, )

#__________________________

md = ldt$Length 
hist(md)
hist(md, main="Word Length", xlab="Num of letters", col="yellow")
hist(md, ylim =c(0,30))
hist(md, ylim =c(0,20), breaks = seq(0,16))


abline(v=mean(md), col="red",lwd=2)
abline(v=median(md), col="blue",lwd=2)
# abline(h=median(md), col="green",lwd=2)

legend(x="topleft", c("mean", "median"), col=c("red", "blue"), lwd=c(3,5))

#___________________________

hist(md, prob=TRUE)
lines(density(md), lwd=1.5)

#___________________________
#___________________________
#___________________________

wf = read.csv("C:/Users/hufs/Desktop/R/w_frequency.csv")
table(wf$Class)
c_t = table(wf$Class)
barplot(c_t, ylim=c(0,50), col=c("red", "blue"), main="Num of words", legend=TRUE)

#_______________________________

boxplot(md)
boxplot(md, main="Word Length",ylab="Num of Characters", col="green")
boxplot(ldt$Mean_RT, main="Mean response time", col="blue")

A=c(12,15,23,24,30,31,33,36,50,73)
B=c(6,22,26,33,35,47,54,55,62,63)
C=c(2,3,6,8,13,14,19,23,60,69)
D=c(1,22,36,37,45,47,48,51,52,69)

hist(A)
hist(B)
hist(C)
hist(D)

boxplot(A,B,C,D, names=c("Ann", "Barney", "Cathy", "David"), col=c("red", "blue", "green", "yellow"), ylab="score", main="Score of raters")

#___________________

plot(ldt$Length, ldt$Mean_RT)

#_____________________

jpeg("md.jpg")
hist(md)
dev.off()

#__________________

library(languageR)
v = verbs$Verb
v.t = table(v)
v_top = sort(v.t, decreasing = T)
v_top = v_top[1:5]
barplot(v_top)
pie(v_top)
