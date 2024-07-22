# 데이터 입력

# scan() : 원하는 만큼 입력할 수 있음
# 입력을 종료하고 싶을 때는 아무것도 입력하지 않고 enter
# 숫자만 입력 가능 문자는 error
fig <- scan()
fig
sum(fig)

# what=character()를 이용해 문자형 입력받기
chr <- scan(what=character())
chr


# edit() : data.frame 형태로 입력하기 편리
dfx <- data.frame()
dfx <- edit(dfx)
dfx

# 공공데이터포털 : https://www.data.go.kr/
# 경기데이터드림 : https://data.gg.go.kr/portal/mainPage.do