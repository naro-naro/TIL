
install.packages("languageR")
library("languageR")

ls("package:languageR")
lsf.str("package:languageR")

verbs

#______________________

mydata = read.csv(file.choose())
print(mydata)

#_____________________

mydt = read.csv("C:/Users/hufs/Desktop/w_frequency.csv", header=T, sep=",")
print(mydt)

#_____________________

head(verbs) #위에 6줄만 보여줌
tail(verbs) #아래 6줄만 보여줌
summary(verbs)
str(verbs)
length(verbs) 
dim(verbs)

#______________

View(verbs)
View(mydt)

#____________________

write.csv(verbs,"C:/Users/hufs/Desktop/verbs.csv")
write.csv(mydt,"C:/Users/hufs/Desktop/mydt.csv")

#____________________

v1 = verbs$Verb
v2 = verbs["Verb"]

v1
is(v1)

v2
is(v2)

write.csv(v1,"test1.csv")
write.csv(v2,"test2.csv")

#_____________________

r1=verbs$RealizationOfRec
r2=verbs["RealizationOfRec"]

cbind(v1,r1) # factor의 level의 숫자들
cbind(v2, v2)


#_______________
v3 = verbs[3]
v3

#----------------

# 열 이름으로 접근하기
c1= verbs[, c("Verb", "RealizationOfRec")]
c1

c2 = subset(verbs, select=c("RealizationOfRec", "Verb"))
c2

#________________

# 인덱스 번호로 접근하기
d1= verbs[2:3] # 2~3열까지 추출
d2= verbs[c(1, 3, 5)] #1,3,5열만 추출
d1
d2

#______________________

# Task

v_list1 = verbs$Verb
v_list2 = verbs["Verb"]
v_list1
v_list2

unique(v_list1)
unique(v_list2)

sort(v_list1)
# sort(v_list2) # error

result = sort(unique(v_list1))
write.csv(result, "test.csv")