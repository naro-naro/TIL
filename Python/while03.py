#"열 번 찍어 안넘어가는 나무 없다" 속담을 반복
tree_hit = 0
while tree_hit < 10:
    tree_hit += 1
    print("나무를 %d번 찍었습니다."%tree_hit)
    if tree_hit == 10:
        print("나무가 넘어갔습니다.")