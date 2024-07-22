# list : 성격이 다른 데이터형과 데이터 구조 등을 생성할 수 있게 지원
lst <-list(5.254, "vacation", c(2:5))
lst[[2]]    # "vacation"
lst[[3]][2] # 3

a1 <- c(1:10) # vector
b1 <- matrix(1:10, nrow=2, ncol=5)
c1 <- c("1st", '2ed')
lst2 <- list(a=a1, b=b1, c=c1)

lst2$a
lst2$b

# 20  30  40  50  60  70  80  90 100
lst3 <-list(d=2:10*10)

lst23 <- list(lst2, lst3)

scol1 <-list(60,70,80,90)
scol2 <-list(c("A", "B"))
scol12 <-list(scol1, scol2)
scol1[scol1>=80]

# 차이점 비교
scol3 <- list(c(60,70,80,90))
scol1;scol3

# list 형태를 vector로 변경
unlist(scol1)
unlist(scol2)
unlist(scol12)

a <-list(c(1:5))
b <-list(c(112:120))

# lapply : list + apply -> list 형태로 반환
# sapply : vector 형태로 반환
lapply(c(a,b), mean) # 평균 계산
sapply(c(a,b), mean)

