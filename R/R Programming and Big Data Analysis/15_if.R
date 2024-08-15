# 제어문 : 프로그램에서 명령문의 처리 수행 순서나 횟수를 조절
# 조건문1. if

# runif : 0과 1 사이 랜덤값
x <- runif(1)
x

# if(조건식) 참일때실행문 else 거짓일때실행문
if(x < 0.5) print(x + 10) else print(x + 5)

# ifelse(조건식, 참일때실행문, 거짓일때실행문)
ifelse(x <= 10, "10이하", "10이상")

type <- "S"
ifelse(type == "S", "$300", "$100")

a <- 100
b <- 5
if(a + b >= 100) {
  cat("a + b의 결과는 100 이상입니다. a + b = ", a + b)
} else {
  cat("a + b의 결과는 100 이하입니다. a + b = ", a + b)
}

# 0과 1 사이의 랜덤값 생성
xx <- runif(1)
xx = xx - 0.5
xx

if(xx < 0){
  print("xx의 값은 음수이다.")
  print(xx)
} else if(xx > 0){
  print("xx의 값은 양수이다.")
  print(xx)
} else{
  print("xx의 값은 0이다.")
  print(xx)
}
