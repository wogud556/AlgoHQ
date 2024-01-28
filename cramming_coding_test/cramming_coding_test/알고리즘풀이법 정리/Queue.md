## Queue
- 설명 생략
- stack과 다른점은 후입선출

### 사용되는 코드
1. 선언
```
import java.util.*

Queue<자료형> queue = new LinkedList<>();
//큐의 경우 LinkedList위에서 도는 클래스이다
```

2. Queue 추가
- Queue추가시 add(value)또는 offer(value)라는 메소드를 활용한다.
```
Queue<Integer> stack = new LinkedList<>();
queue.add(1);
queue.add(2);
queue.offer(3); //LinkedList의 영향
```
- add를 주로 사용하겠지만 add는 성공시 true 실패시 IllegalStateException을 발생시킨다.

2. 삭제
- Queue에서 값을 제거하고 싶다면 poll()이나 remove()라는 메소드를 사용하면 된다.
- poll()의 경우 큐가 비어있다면 null을 반환한다.
- clear()의 경우 모든 큐를 비운다.
```
Queue<Integer> queue = new LinkedList<>();
queue.offer(1);
queue.offer(2);
queue.offer(3);
queue.poll(); // 1 제거 1이 가장 먼저 들어왔기 때문
queue.remove(); // 2제거
queue.clear(); //queue 초기화
```

3. 가장 먼저 들어간 값 출력
- 가장 먼저 들어간 값을 구하고 싶다면 peek()함수를 사용한다.
```
queue.offer(1);
queue.offer(2);
queue.offer(3);
queue.peek(); // 1 출력
```

