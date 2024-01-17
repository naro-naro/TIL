# 가변인자

# def profile(name, age, lang1, lang2, lang3, lang4, lang5):
#     print('NAME : {} \t AGE : {} \t '.format(name, age), end = " ")
#     print(lang1, lang2, lang3, lang4, lang5)

# profile('Giriboy', 34, 'python', 'java', 'R', 'C', 'javascript')
# profile('lIlBOI', 'C++','C#')

# 만약 기리가 공부를 더 해서 언어 하나를 더 할줄알게 되고, 릴보이는 두개밖에 못한다면??

def profile(name, age, *languege):  # *을 하면 몇개든 원하는걸 넣을수 있음
    print('NAME : {} \t AGE : {} \t '.format(name, age), end = " ")
    for lang in languege:
        print(lang, end = " ")
    print()

profile('Giriboy', 34, 'python', 'java', 'R', 'C', 'javascript','kotlin')
profile('lIlBOI', 23,'C++','C#')