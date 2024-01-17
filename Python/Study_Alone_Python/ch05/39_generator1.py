def test():
    print("함수가 호출되었습니다")
    yield "test"

print("a지점 통과")
test()
# yield때문에 함수가 호출되었습니다 < 가 출력되지 않는다

print("b지점 통과")
test()
# yield때문에 함수가 호출되었습니다 < 가 출력되지 않는다

print(test())
# 이터레이터와 비슷한
# 제너레이터를 리턴한다