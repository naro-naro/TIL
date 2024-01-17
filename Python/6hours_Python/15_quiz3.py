# quiz3) 사이트별로 비밀번호를 만들어주는 프로그램을 작성하시오.


# 예) http://naver.com
# 규칙1) http:// 부분은 제외 (예 : naver.com)
# 규칙2) 처음 만나는 점(.) 부분은 제외 => naver
# 규칙3) 남은 글자 중 처음 세자리(nav) + 글자갯수(5) + 글자 내 'e' 개수(1) + "!" 로 구성

# 예) 생성된 비밀번호 : nav51!

# 내가 푼 답안
site = "http://naver.com"
pw = site[7:-4] # http:// 와 .com 삭제
len_site = len(pw)
e = pw.count("e")
print("생성된 비밀번호 : {}{}{}{}".format(pw[:-2] ,len_site, e , "!"))

#이렇게 만들면 http://는 확실히 자를 수 있는데
#.com은 뒤 네글자만 자르는거라, .co.kr 등의 다른 형태가 나올 경우는 대비하지 못함...!
#---------------------------------------------------------------------------------------------
print()
#---------------------------------------------------------------------------------------------

# 답안
url = "http://naver.com"
site = url.replace("http://", "") # 규칙1
site = site[:site.index(".")] # 규칙2
password = site[:3] 
# print(type(site))
length = len(site)
count_e = site.count("e")
print("{}의 비밀번호 : {}{}{}{}".format(url, password ,length, count_e, "!"))