# with : 더 편리한 파일 입출력이 가능

# import pickle
# with open("profile.pickle", 'rb') as  profile_file:
# # 프로필 피클 파일을 열어서 프로필_파일에 저장하고
#     print(pickle.load(profile_file))
#     # 파일 내용을 피클로드를 통해 불러와서 출력
#     # close 안해줘도 자동을 닫힘^-^


# with open("study.txt", 'w', encoding = 'utf8') as study_file:
#     study_file.write('I\'m studing python.')

with open('study.txt', 'r', encoding='utf8') as study_file:
    print(study_file.read())