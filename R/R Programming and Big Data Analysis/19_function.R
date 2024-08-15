# 사용자 정의 함수

f1 <- function(){
  print("행복합니다.")
}
# 어떤 함수인지 확인
f1

# 함수 실행
f1()


# 사칙연산 함수
f2 <- function(x, y){
  sum = x + y
  sub = x - y
  mul <- x * y
  div <- x / y
  cat("두 수의 합 :", sum, "\n")
  cat("두 수의 차 :", sub, "\n")
  cat("두 수의 곱 :", mul, "\n")
  cat("두 수의 몫 :", div, "\n")
}

f2(5,2)
f2(20, 30)
f2(100, 0.5)


# 구구단 함수
gugudan <- function(i){
  
  for(x in i){
    cat("---", x, "단 ---", "\n")
    
    for(y in 1:9){
      cat(x, "*", y, "=", x*y, "\n")
    }
  }
}

gugudan(3)
gugudan(5:6)
gugudan(c(7,9))
