# 1차원 객체 : factor
# c() 함수도 1차원 형태로 데이터 저장

h <- c('서울', '부산', '경기', '서울', '경기', '경기', '제주')
h

h.new <- factor(h) # vector >>> factor 변환
h.new

h[3]
h.new[3]

# levels : 범주형 데이터를 저장할 때 사용
levels(h)
levels(h.new)

# unique : vector도 범주형처럼 level 확인 가능
unique(h)
unique(h.new)


# 특정 데이터형을 정수형으로 변환
h.i <- as.integer(h.new)
h.i # 경기1, 부산2, 서울3, 제주4 : 정수형으로 변환됨
unique(h.i)


h.new
# h.new[4] <- '울릉도'
# error : level이 이미 결정되어 있으므로 변경 불가능

h.new[4] <-'제주'
h.new
# 이미 존재하는 level로 변경하는 것은 가능