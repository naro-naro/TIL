# which문 : 원하는 데이터가 어디에 있는지
score <- c(76, 80, 90, 95, 45, 42, 53, 60, 67, 73)

# score 안에 값이 어디 있는지 인덱스값으로 반환
which(score == 67)
which(score == 80)
which(score == 10) # integer(0) : 없는 값일 때

# 최소, 최대값의 인덱스 반환
which.min(score)
which.max(score)

# 조건에 해당하는 값의 인덱스를 저장
ss <- which(score <= 70)
ss


# 저장된 인덱스에 해당하는 값을 65로 변경
score[ss] <- 65
score[ss]
# 원본에도 반영됨
score
