# DML : 데이터 조작어 #
| DML | 설명 |
|---|---|
| SELECT | 데이터 조회 |
| INSERT | 데이터 삽입 |
| DELECT | 데이터 삭제 |
| UPDATE | 데이터 변경 |

*명령어는 관습적으로 대문자로 쓴다*

# SELECT #
**SELECT** 속성 <br>
**FROM** 테이블 <br>
**WHERE** 조건

---
**SELECT** * <br>
**FROM** 테이블 <br>
 : '테이블' 안의 전제 데이터 조회

---
**SELECT** name AS students_name <br>
**FROM** students <br>
 : 조회 시 속성 명 변경하여 출력

<br><br>

# INSERT #
**INSERT INTO** 테이블 (속성1, 속성2, 속성3)<br>
**VALUES** (값1, 값2, 값3)<br>
*CREATE 시 지정한 속성의 데이터타입에 맞춰 값을 삽입*
<br>

```NOT NULL``` *조건이 없는 열에는 값을 넣지 않아도 됨* <br>
```NOT NULL``` *조건이 있으면 값을 넣지 않을 수 없음*

---
### Bulk insert ###
**INSERT INTO** 테이블 (속성1, 속성2, 속성3) <br>
**VALUES** (값1, 값2, 값3), (값a, 값b, 값c), (값A, 값B, 값C)<br>
 : 여러 행 추가하기

---
**INSERT INTO** students (name, age, address) <br>
**SELECT** name, age, address **FROM** students **WHERE** age < 30; <br>
 : SELECT문에서 조회한 정보를 삽입

<br><br>

# UPDATE #
**UPDATE** 테이블 <br> 
**SET** 수정사항1, 수정사항2 <br>
**WHERE** 수정 할 데이터의 조건 <br>
<br><br>

# DELETE #
**DELETE** **FROM** 테이블 <br>
**WHERE** 수정 할 데이터의 조건 <br>
 <br>
 
```WHERE age BETWEEN 30 AND 33; ``` <br>
30이상 33이하의 나이인 튜플들 삭제