# 데이터 타입 확인 및 변환
a <- c(11:13)
b <- c(21:23)
c <- c('seoul', 'incheon')
a;b;c

x <- data.frame(a,b)
x


# class() : 데이터 객체 타입 확인
class(x)
class(a)
class(c)


# is.(데이터형) : 해당 데이터형이 맞는지 확인(TRUE/FALSE)
x <- c(10,20,"30")
x

is.vector(x)
is.character(x)
is.numeric(x)

s <-c(10:20)
t <- TRUE

is.character(s)
is.numeric(s)
is.logical(t)


# as.(데이터형) : 데이터 타입 변환
x <- c(10,20,"30")
class(x)

#error : y1 <- x-3
y2 <- as.numeric(x)-3
y2

area <- c('seoul', 'seoul', 'busan', 'jeju', 'gwangju', 'jeju')
# error : plot(area)
area1 <- as.factor(area)

table(area)
table(area1)

# 차트 생성
plot(area1)

# 타입 확인
mode(area);class(area)
mode(area1);class(area1)
