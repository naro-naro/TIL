# 내장 함수 #
| 함수 | 기능 | 사용 |
|---|---|---|
| SUM | 숫자의 합 반환 | ```SELECT SUM(age) FROM student;``` |
| AVG | 평균값 반환 | ```SELECT AVG(age) FROM students;``` |
| MAX | 최댓값 반환 | ```SELECT MAX(age) FROM students;``` |
| MIN | 최솟값 반환 | ```SELECT MIN(age) FROM students;``` |
| COUNT | 튜플 수 반환 | ```SELECT COUNT(address) FROM students;``` |
| DISTINCT | 중복 제거 | ```SELECT COUNT(DISTINCT address) FROM students;``` |
| CONCAT | 두 문자열 연결 | ```SELECT CONCAT(name, address) FROM students;``` |
| LENGTH | 문자열의 길이 | ```SELECT address, LENGTH(address) FROM students;```|
| REPLACE | 다른 문자열로 치환 | ```SELECT REPLACE(address, '광역시', '시') FROM students;``` |