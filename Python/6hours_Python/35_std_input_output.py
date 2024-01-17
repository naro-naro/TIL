# 표준 입출력
print('python', 'java', 'c', sep=' vs ')
print('python', 'java', 'c', sep='    ')
# 단어 사이사이에 sep값을 넣는다

print('python', 'java', 'c', sep="    ", end='?')
print('Which is more interesting?')
# end 의 디폴트값은 줄바꿈인데 end="?"을 하면 문장 끝을 ?로 바꾼다

import sys
print('python', 'java', 'c', file = sys.stdout) # 표준 출력
print('python', 'java', 'c', file = sys.stderr) # 표준 에러

scores = {'수학':80 , '영어':90 , '코딩':100 }
for subject, score in scores.items():
    # print(subject, score)

    # print(subject.ljust(8), score)
    # ljust(8) : 왼쪽으로 8칸을 갖고서 정렬해라

    print(subject.ljust(8), str(score).rjust(4), sep=':')
    # 왼쪽으로 8칸을 갖고 과목 이름을 정렬하고, 오른쪽부터 4칸을 갖고 점수를 정렬하고, 사이에는 :을 넣어라


# 은행 대기번호표 001, 002, 003, ...
for num in range(1, 21):
    print('대기번호 : ' + str(num).zfill(3))
    # zfill(3) : 세칸을 확보하고 값이 빈 공간에는 0으로 채운다


# 표준 입력
answer = input('아무값이나 입력하세요 : ')
print('입력하신 값은 ' + answer + '입니다.')
print(type(answer))
# 숫자를 입력해도 문자를 입력해도 입력받은 값은 항상 string!!