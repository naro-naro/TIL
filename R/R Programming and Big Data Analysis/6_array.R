# 3차원 데이터 array
val <- c(1:27)
arr <- array(val, c(3,3,3)) # 모자라는 만큼 반복해서 저장
arr

arr[1,,]
arr[2,,]
arr[,,2]
arr[,2,3]

arr[1,2,3]
