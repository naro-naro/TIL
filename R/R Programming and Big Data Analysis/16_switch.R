# 조건문2. switch

# x <- c("매우우수", "보통") : switch문 error
# x <- "매우우수"
x <- "보통"

switch(x,
       "매우우수" = print("A+"),
       "우수" = print("A0"),
       "보통" = print("B+"),
       "미흡" = print("C+"),
       "매우미흡" = print("복습")
       )


xx <- c("매우우수", "보통")
switch(xx[1],
       "매우우수" = print("A+"),
       "우수" = print("A0"),
       "보통" = print("B+"),
       "미흡" = print("C+"),
       "매우미흡" = print("복습")
)
