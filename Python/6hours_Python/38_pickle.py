# pickle : 프로그램 상에서 사용하는 데이터를 파일형태로 저장해주는 것

import pickle
# profile_file = open('profile.pickle', 'wb')
# # wb : 쓰기전용 + 바이너리(픽클을 쓸 떄는 항상 바이너리를 정의해줘야 함)
# profile = {'name':'giriboy', 'age':'30', 'hobby':["python", 'java', 'c++']}
# print(profile)
# pickle.dump(profile, profile_file)
# # profile에 있는 정보를 file에 저장
# profile_file.close()


# pickle 파일에서 데이터 가져오기
profile_file = open("profile.pickle", 'rb')
profile = pickle.load(profile_file)
# file에 있는 내용을 profile에 가져와서 데이터 형태로 불러온다
print(profile)
profile_file.close()