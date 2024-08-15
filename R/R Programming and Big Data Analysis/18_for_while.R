# 반복문1. for

sum <- 0
i <- 1

# sum + 1 + 2 + ... + 9 + 10
for(i in seq(1, 10, by = 1)){
  sum <- sum + i
}
sum


i = 1
# 마지막 i=5일때 *5한 값만 출력됨
for(i in 5){
  print(i * 2)
}

# 마지막 i=1~5일때 *5한 값이 모두 출력됨
for(i in 1:5){
  print(i * 2)
}


# 중첩 for문으로 구구단 만들기
i = 2
j = 1

for(i in 2:9){
  cat("----", i,"단 ----", "\n")
  
  for(j in 1:9){
    cat(i, "*", j, "=", i*j, "\n")
  }
}
