## 기본 형의 한계

특정 기본형을 감싸서(Wrap) 만드는 클래스를 래퍼 클래스 (Wrapper class)라 한다.

참고로 `int` 는 기본형이기 때문에 스스로 메서드를 가질 수 없다.

기본형은 항상 값이 존재해야한다. 하지만 객체는 참조값이 없다는 null을 사용할 수 있어서 값이 없음을 명시적으로 표현하기 위해서는 wrapper 클래스를 사용하는 것이 좋다. 

## 래퍼 클래스 생성 - 박싱

- 기본형 → 래퍼 클래스로 변경하는 것을 Boxing이라고 한다.
- Integer.valueOf()에는 성능 최적화 기능이 있다. 문자열 풀과 비슷하게 자주 사용하는 숫자를 미리 생성해두고 재사용하기 때문에 성능상 매우 빠르다.

### intValue() - 언박싱

- 래퍼 클래스에 들어 있는 기본형 값을 다시 꺼내는 메서드

### 오토 박싱, 오토 언박싱

오토 박싱 : 기본형 → 래퍼 클래스를 자동으로 박싱함

오토 언박싱 : 래퍼 클래스 → 기본형으로 자동으로 오토 언박싱함

오토 박싱과 오토 언박싱은 컴파일러가 개발자 대신 `valueOf` , `xxxValue()`등의 코드를 추가해주는 기능이다.
덕분에 기본형과 래퍼형을 서로 편리하게 변환할 수 있다.
따라서 `AutoboxingMain1` 과 `AutoboxingMain2` 는 동일하게 작동한다.

```bash
Integer boxedValue = value; //오토 박싱(Auto-boxing)
Integer boxedValue = Integer.valueOf(value); //컴파일 단계에서 추가

int unboxedValue = boxedValue; //오토 언박싱(Auto-Unboxing)
int unboxedValue = boxedValue.intValue(); //컴파일 단계에서 추가
```

### **parseInt() vs valueOf()**

`valueOf("10")` 는 래퍼 타입을 반환한다.
`parseInt("10")` 는 기본형을 반환한다.
`Long.parseLong()` 처럼 각 타입에 `parseXxx()` 가 존재한다.

### Class 클래스

클래스의 정보(=메타데이터)를 다루는데 사용된다. 

class vs clazz - class는 자바의 예약어다. 따라서 패키지명, 변수명으로 사용할 수 없다.
이런 이유로 자바 개발자들은 `class` 대신 `clazz` 라는 이름을 관행으로 사용한다. `clazz` 는 `class` 와 유사하게 들리고,이 단어가 `class` 를 의미한다는것을 쉽게 알수 있다.

### 리플렉션

클래스의 메타 정보를 기반으로 클래스에 정의된 메서드, 필드, 생성자등을 조회하고 이를 통해 객체 인스턴스를 생성하거나 메서드를 호출할 수 있음 → 이런 작업을 리플렉션이라고 함!