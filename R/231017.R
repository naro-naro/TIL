# Mean_RT
# response time
# 단어를 발화하는, 읽는 데 걸리는 시간

mean(ldt$Length)   # 평균
median(ldt$Length) # 중앙값

myt = table(ldt$Length)
myt

names(myt)[myt == max(myt)]
