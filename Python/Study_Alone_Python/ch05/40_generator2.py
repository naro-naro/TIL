# next()함수를 사용해 함수 내부의 코드를 실행할 수 있다

def test():
    print("a지점 통과")
    yield 1
    print("b지점 통과")
    yield 2
    print("c지점 통과")

output = test()

print("d지점 통과")
a = next(output)
print(a)
print()

print("e지점 통과")
b = next(output)
print(b)
print()

print("f지점 통과")
c = next(output)
print(c)
print()

next(output)