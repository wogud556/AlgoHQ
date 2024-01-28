### DFS와 BFS풀이법
- 시간이 없으니 그림은 생략하겠다.

### DFS
- 깊이 우선 탐색이라고 한다.
- 최대한 깊이 내려간 뒤 더이상 깊이 갈 곳이 없을때 옆으로 이동(핵심)
- 루트 노드에서 시작하여 다음 분기로 넘어가기 전에 해당 분기를 완벽하게 탐색하는 방식이다.
- 대충 트리식 완전탐색 알고리즘 같은 느낌

### BFS
- 너비 우선 탐색이라고도 함
- 최대한 넓게 이동한 다음, 더 이상 갈 수 없을 때 아래로 이동
- 루트 노드에서 시작하여 인접한 노드를 먼저 탐색하는 방법.
- 시작 정점으로부터 가까운 정점을 먼저 방문하고 멀리 떨어져 있는 정점을 나중에 방문하는 방법이다.

### 두 알고리즘의 비교
|DFS|BFS|
|--|--|
|현재 정점에서 갈 수 있는 점들까지 들어가면서 탐색|현재 정점에서 연결된 가까운 점들로부터 탐색|
|스택 또는 재귀함수로 구현|큐를 이용하여 구현|

- DFS와 BFS의 시간복잡도
  - 두 방식 모두 조건 내의 모든 노드를 검색한다는 점에서 시간복잡도는 동일하다.
  - DFS와 BFS 둘 다 다음 노드가 방문하였는지를 확인하는 시간과 각 노드를 방문하는 시간을 합하면 된다.

### 깊이 우선 탐색과 너비 우선 탐색을 활용한 문제유형
- DFS, BFS은 특징에 따라 사용에 더 적합한 유형들이 있다.

1. 그래프의 모든 정점을 방문하는 것이 주요한 문제
   - 단순히 모든 정점을 방문하는 것이 중요한 문제의 경우 DFS, BFS 두 가지 방법 중 어느 것을 사용해도 된다.
   - 둘 중 편한 것을 사용하면 된다.

2. 경로의 특징을 저장해둬야 하는 문제
   - 예를 들면 각 정점에 숫자가 적혀있고 a부터 b까지 가는 경로를 구하는 데 경로에 같은 숫자가 있으면 안되는 문제.
   - 각각의 경로마다 특징을 저장해둬야 할 떄는 DFS를 사용
   - BFS는 경로의 특징을 가지지 못한다.
3. 최단거리를 구하는 문제
   - 미로 찾기 등 최단거리를 구하는 문제 이떄는 BFS가 유리
   - 깊이 우선 탐색으로 경로를 검색할 경우 최단거리를 알 수 없다.
   - 너비우선 탐색으로 가까운 곳 부터 찾아야 할 때 먼저 찾아지는 해답이 최단거리이다.

4. 그 외
   - 검색 대상 그래프가 크다면 DFS
   - 검색 대상의 규모가 크지 않고, 검색 시작 지점으로부터 원하는 대상이 멀지 않다면 BFS

### 사용 자바 코드
1. DFS코드
-  DFS알고리즘은 스택, 재귀함수 두가지로 사용 가능하다.
-  재귀를 쓰는 것이 일반적으로 간결하다.

```
class Graph{
    private int v;
    private LinkedList<Integer> adj;

    Graph(int v){
        V = v;
        adj = new LinkedList[v];

        for(int i = 0; i<v; i++){
            adj[i] = new LinkedList();
        }
    }
    void addEdge(int v, int w) { adj[v].add(w); }

    void DFS(int v){
        boolean visited[] = new boolean[v];

        DFSUtil(v, visited);
    }

    void DFSUtil(int v, boolean visited[]){
        visited[v] = true;
        System.out.println(v + " ")

        Iterator<Integer> it = adj[v].listIterator();
        while(it.hasNext){
            int n = it.next;
            if(!visited[n]){
                DFSUtil(n, visited);
            }
        }
    }
}
```

2. BFS
- BFS는 큐(Queue)를 사용하서 문제를 해결하면 된다.
```
class Graph {
  private int V;
  private LinkedList<Integer> adj[];
 
  Graph(int v) {
    V = v;
    adj = new LinkedList[v];
    for (int i=0; i<v; ++i)
      adj[i] = new LinkedList();
  }
 
  void addEdge(int v, int w) { adj[v].add(w); }
 
  /* BFS */
  void BFS(int s) {
    boolean visited[] = new boolean[V]; //방문여부 확인용 변수
    LinkedList<Integer> queue = new LinkedList<Integer>(); //연결리스트 생성
 
    visited[s] = true;
    queue.add(s);
 
    while (queue.size() != 0) {
      // 방문한 노드를 큐에서 추출(dequeue)하고 값을 출력
      s = queue.poll();
      System.out.print(s + " ");
 
      // 방문한 노드와 인접한 모든 노드를 가져온다.
      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext()) {
        int n = i.next();
        
        // 방문하지 않은 노드면 방문한 것으로 표시하고 큐에 삽입(enqueue)
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }
}
```