## 우선순위 큐
- 얘는 조금 설명이 필요할 것 같다.

### 설명
- 일반적인 큐는 선입선출로 먼저 들어온 데이터가 먼저 나간다.
- 우선순위 큐는 먼저 들어온 순서대로 데이터가 나가는 것이 아닌 우선순위를 먼저 결정하고 그 우선순위가 높은 엘리먼트가 먼저 나가는 자료구조이다.
- 우선순위 큐는 힙을 구현하는 것이 일반적이다(한마디로 걍 힙임)
- 데이터를 삽입 할 때 우선순위를 기준 최대 힙 혹은 최소 힙을 구성하고 데이터를 꺼낼 때 루트 노드를 얻어낸 뒤 루트 노드를 삭제할 때는 빈 루트 노드 위치에 맨 마지막 노드를 삽입한 후 아래로 내려가면서 적절한 자리를 찾아서 옮기는 방식으로 진행

### 특징
- 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조(큐에 들어가는 원소는 비교가 가능한 기준이 있어야 함)
- 내부 요소는 힙으로 구성되어 이진트리 구조로 되어있다.
- 내부 구조가 힙으로 구성되어 있기에 시간 복잡도는 O(NlogN)
- 응급실과 같은 처리 방식이라 생각하면됨

### 사용 코드
1. 선언
- 선언 시 우선순위가 높은 큐과 낮은 큐 기준으로 선언한다.
```
import java.util.*

//우선순위가 낮을때 선언
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

//우선순위가 높을때 선언
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collection.reverseOrder());
```

1. 값 추가
- 값 추가시 priorityQueue.add() 메소드를 사용하면 된다.
```
priorityQueue.add(1);
priorityQueue.add(2);
priorityQueue.offer(3);
//값을 늦게 넣었어도 우선순위 큐로 인해 늦게들어온 값이 크면 앞으로 들어가게 된다.

```

2. 삭제
- 삭제 시 poll(), remove() 메소드를 사용하면 된다.
- 값 제거 시 우선순위가 가장 높은 값이 제거된다.
- poll()은 우선순위 큐가 비어있으면 null을 반환한다.
- clear는 큐에담겨있는 모든 
```
priorityQueue.poll(1);
priorityQueue.remove(2);
priorityQueue.clear(3);
```

3. 우선순위가 가장 높은 값
- 동일하게 peek()함수를 사용하여 우선순위가 가장 높은 값이 출력된다.

```
priorityQueue.add(1);
priorityQueue.add(2);
priorityQueue.offer(3);
priorityQueue.peek(); //낮은 값이 우선순위가 높다면 1, 높은값이 우선순위가 높다면 3이 출력된다.
```



