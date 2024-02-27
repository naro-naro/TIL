# 그룹화 #
## GROUP BY ##
```
SELECT 열, 집계함수
FROM 테이블
[WHERE 조건]
GROUP BY 속성
```
<br>

***예시*** <br>

데이터를 ***주소***를 기준으로 그룹핑하여<br>
그룹 별 학생 수 구하기 <br>
```
SELECT address, COUNT(*)
FROM students
GROUP BY address;
```