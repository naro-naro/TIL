# 작업 폴더의 위치 확인

# setwd() : 작업폴더 설정 함수
setwd("C:/Users/admin/Documents/GitHub/TIL/R/R Programming and Big Data Analysis/Data_Analysis/r_exam")

# getwd() : 현재 작업 폴더 반환
getwd()

# csv 파일 읽어오기
# read.csv()
dfs1 <- read.csv("student_list.csv", fileEncoding="euc-kr")

# 데이터 확인
str(dfs1)

# 새 탭에서 데이터 확인
View(dfs1)

# header=FALSE : 1행을 열 제목으로 지정하지 않음
# 입력하지 않으면 -> 기본값=TRUE
dfs2 <-read.csv("student_list.csv", header=FALSE, fileEncoding="euc-kr")
View(dfs2)


# txt 파일 읽어오기
# read.table(file="@@@")
dfs3 <- read.table(file="student_list.txt", header=T, fileEncoding="euc-kr")
str(dfs3)


# scan() 함수로 데이터 읽어오기
nc <- scan("숫자값.txt", fileEncoding="euc-kr")
nc
str(nc)


# excel 파일 읽어오기
# 외부 패키지 설치 필요(R 프로그래밍의 확장성)
install.packages("readxl") # 설치
library(readxl) # 설치한 패키지 불러오기

# read_excel() 함수
sl_excel <- read_excel(path="student_list.xlsx")
sl_excel
str(sl_excel)

# 여러 시트가 존재하는 excel 파일에서 특정 시트만 불러오기
# read_excel(sheet="@@@")
sl_sheet <-read_excel(path="student_list.xlsx", sheet="student_list")


# 데이터를 파일로 저장
# 지금부터의 모든 작업은 task.txt에 저장
sink("task.txt")
dfs1 <- read.csv("student_list.csv", fileEncoding="euc-kr")
dfs2 <- read.table(file="student_list.txt", header=T, fileEncoding="euc-kr")
dfs1;dfs2
dfx <- rbind(dfs1, dfs2)
dfx
# 작업 마무리
sink()

# sink() 마무리했으므로 이제 콘솔창에 표시됨
dfs1;dfs2;dfx


# txt 파일 저장하기
# write.table()
# row.names=T : 행 이름 설정O
# quote=F : 각 데이터 따옴표X
write.table(dfx, "student_combine.txt", row.names=T, quote=F)


# csv 파일 저장하기
# write.csv()
write.csv(dfx, "student_combine.csv", row.names=T, fileEncoding="euc-kr")


# excel 파일 저장하기
# 외부 패키지 설치 필요
install.packages("writexl") # 설치
library(writexl) # 설치한 패키지 불러오기
write_xlsx(dfx, path="student_combine.xlsx", col_names=T)


# 데이터 확인
# 현재 디렉터리 확인
getwd()

data <- read.csv("도로교통공단_사고유형별 월별 교통사고(2018).csv", header=T, fileEncoding="euc-kr")
str(data)
View(data)

# 상위 데이터 확인
head(data) # 6개
head(data, 10) # 10개

# 하위 데이터 확인
tail(data) # 6개
tail(data, 10) # 10개

# $ : 컬럼 별 데이터 확인
data$사고유형
data$경상자수

# 여러 행의 데이터 함께 보기
data[ ,c("사고유형","경상자수")]
head(data[ ,c("사고유형", "경상자수")])

# 1-3행, 모든 열
data[1:3, ]

# 1-3행, "사고유형, 경상자수"열
data[1:3, c("사고유형", "경상자수")]


# 새로운 데이터 불러오기
# NA : 결측치
data2 <- read.csv("서울특별시_강남구_불법주정차단속현황_20210208 - 결측치.csv", fileEncoding="euc-kr")
View(data2)
head(data2, 8)
tail(data2, 6)

data2$동명
data2$부과건수
data2["동명"]
data2[ ,c("견인건수", "부과건수")]
