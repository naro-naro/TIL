# 패키지 설치
install.packages("패키지명")

# 설치한 패키지 확인
installed.packages()

# 설치한 패키지 불러오기
library(패키지명)
require(패키지명)

# 불러온 패키지 확인
search()

install.packages("cowsay")
library(cowsay)

# 도움말
?cowsay

say(what="Hello everyone", by="cat", what_color="skyblue")
say(what="Hello everyone", by="ghost", what_color="skyblue", by_color='green')

# 패키지 최신 버전 업데이트
update.packages("cowsay")

# 패키지 삭제
remove.packages("cowsay")