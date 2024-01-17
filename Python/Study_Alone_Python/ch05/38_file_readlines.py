with open("info.txt", "r") as file:
    # CSV : 한줄에 하나의 데이터, 쉼표로 데이터를 구분함
    # 데이터 한줄씩 읽기는 for문을 다음과 같이 사용함
    # for 한줄을나타내는문자열 in 파일객체:
    #     처리
    for line in file:
        # 양쪽 공백을 삭제하고, ,를 기준으로 데이터 구분하기
        (name, weight, height) = line.strip().split(", ")

        # 데이터에 문제가 있는지 확인
        # 만약 데이터에 문제가 있으면 넘어가기
        if (not name) or (not weight) or (not height):
            continue
        
        # 결과값 계산
        bmi = int(weight)/((int(height)/100)**2)
        result = ""
        if 25<= bmi:
            result = "과체중"
        elif 18.5<=bmi:
            result = "정상체중"
        else:
            result = "저체중"
        
        # 출력
        # ''.join([요소1,요소2,...])함수 : 리스트 요소 사이사이에 ''값을 삽입해 출력
        print('\n'.join([
            "이름:{}",
            "몸무게:{}",
            "키:{}",
            "BMI:{}",
            "결과:{}"
        ]).format(name,weight,height,bmi,result))
        print()