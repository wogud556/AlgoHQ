## Stack
- 설명 생략

### 사용되는 코드
1. 선언
```
import java.util.Stack;
국룰 import인
import java.util.*를 사용하자.

Stack<담을 자료형> stack = new Stack<>();
Stack<String> stack = new Stack<>();
```

2. 값 입력
- 값 입력 시 push함수를 사용한다.
- 이때 push()안에 매개변수로 넣고싶은 값을 넣는다.
```
Stack<Integer> stack = new Stack();
stack.push(1);
stack.push(2);
stack.push(3);

```

3. 값 삭제
- 값 삭제 시 맨 위에값(나중에 들어온 값부터)이 삭제된다.
- 이점 유의하고 사용하는 함수는 pop()함수를 사용한다.
- 전체 삭제를 원하면 clear()함수를 사용한다.
```
Stack<Integer> stack = new Stack();
stack.push(1);
stack.pop();//1삭제
stack.push(1);
stack.push(2);
stack.clear(); 전체삭제
```

4. 값 출력
- 최상단값을 출력하고 싶으면 peek()함수를 사용하면 된다.
```
stack.push(1)
stack.push(2)
stack.push(3)
stack.peek() // 3이 가장 마지막이므로 3 출력
```

5. 기타 메소드
```
stack.empty() stack이 비어있는지 비어있으면 true
stack.contain(매개변수) 매개변수가 있는지 있으면 true
```



