# 12. 자바의 연산자들 -2 (관계, 논리 연산자)

## 관계 연산자

- 이항 연산자

- 연산의 결과가 true(참), false(거짓)으로 반환 됨, 비교연산자 라고도 함

- 조건문, 반복문의 조건식으로 많이 사용 됨

- \> : 왼쪽 항이 크면 참, 아니면 거짓
- < : 왼쪽 항이 작으면 참, 아니면 거짓
- \>= : 왼쪽 항이 크거나 같으면 참, 아니면 거짓
- <= : 왼쪽 항이 작거나 같으면 참, 아니면 거짓
- == : 두개 항이 같으면 참, 아니면 거짓
- != : 두개 항이 다르면 참, 아니면 거짓 

(예제)

[RealationalTest.java](https://github.com/Domo9610/java-study/blob/main/Chapter1/ch12/RealationalTest.java)

## 논리 연산자

- 관계 연산자와 혼합하여 많이 사용 됨

- 연산의 결과가 true(참), false(거짓)으로 반환 됨

(예제)

[LogicalTest.java](https://github.com/Domo9610/java-study/blob/main/Chapter1/ch12/LogicalTest.java)

## 논리 연산에서 모든 항이 실행되지 않는 경우 - 단락 회로 평가 (short circuit evaluation)

- 논리 곱(&&)은 두 항의 결과가 모두 true일 때만 결과가 true

  -- 앞의 항의 결과가 false이면 뒤 항의 결과를 평가하지 않음

- 논리 합(||)은 두 항의 결과가 모두 false일 때만 결과가 false
   
  -- 앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않음 

(예제)

[ShortCircuit.java](https://github.com/Domo9610/java-study/blob/main/Chapter1/ch12/ShortCircuit.java)
