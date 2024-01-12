# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean

plot = """\'플롯(plot)\'이란 어떤 일련의 사건들을 예술적으로 정리한 것을 일컫거나
극, 소설, 시 등의 계획 또는 설계, 줄거리를 의미합니다.
좀 더 자세히 설명하자면 플롯은 문학작품의 액션 구조라고 할 수 있는데,
이 액션들은 작품 속 등장인물들에 의해 행해지며, 그들의 자질을 표현하는 수단이 됩니다.

1. Protagonist: 여러 등장인물 또는 성격 중 가장 주요한 성격으로, 단순하게 표현하면 \'주인공\'입니다.
2. Antagonist: Protagonist에 대항하는 상대 성격입니다.
3. Hero: Protagonist를 의미하는 경우가 많지만 종종 \'용기\', \'영광\', \'숭고함\' 등을 표현합니다."""

finder = True
while finder:
	keyword = input('존재하는지 알고 싶은 키워드를 검색하세요(검색을 끝내고 싶다면 out을 입력하세요): ')
	if keyword == 'out':
		finder = False
	elif plot.find(keyword) == -1:
		add_content = input('해당 키워드에 대한 설명을 추가 작성해주세요: ')
		plot = plot + '\n' + add_content
		print(plot)
	else:
		print('%s는 앞에서부터 %d번째 위치에 있습니다.'%(keyword,plot.find(keyword)+1))