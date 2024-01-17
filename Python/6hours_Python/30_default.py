# # 기본값 설정

def profile(name, age, main_lang):
    print('Name : {} \t age : {} \t Languege : {}'\
        .format(name, age, main_lang))
        # \ 하고 엔터하면 줄바꾸기 가능~!

profile('ZionT', 30, "Python")
profile('Slom', 25, "Java")     
print()   


# 같은 학교 같은 학년 같은 반 같은 수업

def profile(name, age = 20, main_lang = 'C#'):
    print('Name : {} \t age : {} \t Languege : {}'\
        .format(name, age, main_lang))

profile('ZionT')
profile('Slom')        