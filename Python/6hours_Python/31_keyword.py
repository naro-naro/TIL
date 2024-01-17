# 키워드값을 이용한 함수 호출

def profile(name, age, main_lang):
    print(name,'\t', age,'\t', main_lang)

profile(age = 30, name = 'ZionT', main_lang = "Python")
profile(main_lang = 'C', name = 'Slom', age = 24)
# 순서가 뒤바뀌어 있어도 키워드를 사용했기 때문에 정렬된 순서로 출력됨