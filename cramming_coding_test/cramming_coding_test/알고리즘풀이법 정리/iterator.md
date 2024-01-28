## Iterator
- 일단 이새끼는 알고리즘 컬렉션 프레임워크을 사용한 앵간한 알고리즘 문제에서는 거의 사용하는 새끼이다.
- 자바 기준으로 정리해보겠다.

### 사용법
- List, Set, Map, Queue등 컬렉션 프레임워크를 생성한다.
- 그후 Iterator<데이터타입> iterator명 = 컬렉션.iterator();를 사용한다.
- list.get(값); 이런식으로 가져올 수 있는데 직접 꺼내올 수 없는 Set이 아니라면야 사용할 이유를 못찾는데
  1. Iterator는 모든 컬렉션 프레임워크에 공통으로 사용
  2. 컬렉션 프레임워크에서 쉽게 가져오고 제거할 수 있음
  3. 3개의 메소드만 알게 되어서 너무 쉽다.
- 물론 단점도 존재한다.
  1. 처음부터 끝까지 단방향 반복만 가능
  2. 값을 변경하거나 추가가 불가
  3. 대량의 데이터를 제어할 때 속도가 느림

### 사용 메소드
1. Iterator.HasNext()
   - Iterator안에 다음 값이 들어 있는지 확인
   - 들었으면 true, 안들었음 false
2. Iterator.next()
   - iterator의 다음 값 가져오기
3. Iterator.remove()
   - iterator에서 next()시 가져왔던 값을 컬랙션(List, ,Set, Map)등에서 삭제
   - 반드시 next() 후에 사용해야 한다.

### 예제
```
System.out.println(iterList.next());
iterList.remove();
System.out.println("Remove 테스트용");

for(int = 0; i<list.size();i++){
    System.out.println(list.get(i));
}
```