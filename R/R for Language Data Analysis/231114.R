hist(ldt$Length)
par(mfrow=c(1,2))
hist(ldt$Length)
hist(ldt$Freq)


par(mfrow=c(2,1))
hist(ldt$Length)
hist(ldt$Freq)


par(mfcol=c(2,2))
hist(ldt$Length)
hist(ldt$Length)
hist(ldt$Freq)
hist(ldt$Freq)


par(mfrow=c(2,2))
hist(ldt$Length)
hist(ldt$Length)
hist(ldt$Freq)
hist(ldt$Freq)

#_____________________

raw = c(143, 156, 169, 133, 127, 145, 148, 141, 134)
z.raw = (143-mean(raw))/sd(raw)
z.raw

get_z = function(x){
  for (y in x){ # 벡터x안의 값을 하나씩(y) 
    z_score = round((y-mean(x))/sd(x), 2) # 소수점 둘째자리까지 
    print(z_score)
  }
}
get_z(raw)

#_______________________

class_a = c(0, 21, 22, 40, 42, 47, 48, 48, 59, 61, 67, 68, 72, 80, 80, 83, 87, 88, 89, 93, 97, 98, 100, 100, 100)
class_b = c(0, 0, 0, 0, 0, 0, 4, 8, 17, 22, 28, 38, 42, 44, 46, 58, 62, 62, 66, 67, 67, 72, 73, 73, 88, 88, 89, 100)
class_c = c(10, 12, 18, 25, 33, 33, 34, 58, 62, 64, 66, 67, 67, 75, 78, 78, 79, 83, 86, 88, 89, 91, 91, 94)

get_z_2 = function(x, y){
    z_score = round((y-mean(x))/sd(x), 2) # 소수점 둘째자리까지 
    print(z_score)
}

john = 87
lisa = 67
kevin = 75

get_z(class_a)
get_z(class_b)
get_z(class_c)

get_z_2(class_a, john)
get_z_2(class_b, lisa)
get_z_2(class_c, kevin)

#_________________________

mike = 90
jane = 88

get_z_3 = function(x, mean, sd){
   z_score = round((x-mean)/sd, 2)
   print(z_score)
}

get_z_3(mike, 72, 10)
get_z_3(jane, 75, 5)

#________________________

# 상관관계 correlation

attach(ldt)
# detach(ldt)
par(mfrow=c(1,1))
plot(Length, Mean_RT, main = "word length & mean reaction times")

# lm(y~x) 선형회귀 : x,y의 관계
m = lm(Mean_RT~Length)
abline(m, col="red")

cor(Mean_RT, Length)
cor(Length, Mean_RT)

cor.test(Mean_RT, Length)

#_______________________

toeic = c(850, 460, 580, 720, 900, 940, 630, 550, 500, 820)
prof = c(8.2, 3.9, 6.7, 7.3, 8.9, 8.8, 5.7, 5.5, 5.3, 8.1)

cor(toeic, prof)

plot(toeic, prof)
abline(lm(prof~toeic), col="blue")

