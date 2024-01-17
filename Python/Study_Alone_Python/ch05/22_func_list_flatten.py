# 리스트 평탄화 : 중첩된 리스트가 있을 때 중첩을 모두 제거하고 풀어서 1차원 리스트로 만드는 것

def flatten(data):
    output = []
    for item in data:
        if type(item) == list:
            output += flatten(item)
        else:
            output.append(item)
        return output

ex_list = [[1,2,3], [4,[5,6]], 7, [8,9]]
print("원본 : {}".format(ex_list))
print("평탄화 : {}".format(flatten(ex_list)))