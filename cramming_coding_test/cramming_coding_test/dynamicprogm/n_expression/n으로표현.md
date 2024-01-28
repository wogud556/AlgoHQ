## N으로 표현
### 문제 설명
- 아래와 같이 5와 사칙연산만으로 12를 표현할 수 있습니다.
```
12 = 5 + 5 + (5 / 5) + (5 / 5)
12 = 55 / 5 + 5 / 5
12 = (55 + 5) / 5
```
- 5를 사용한 횟수는 각각 6,5,4 입니다. 그리고 이중 가장 작은 경우는 4입니다.
- 이처럼 숫자 N과 number가 주어질 때, N과 사칙연산만 사용해서 표현 할 수 있는 방법 중 N 사용횟수의 최솟값을 return 하도록 solution 함수를 작성하세요.

### 제한사항
- N은 1 이상 9 이하입니다.
number는 1 이상 32,000 이하입니다.
수식에는 괄호와 사칙연산만 가능하며 나누기 연산에서 나머지는 무시합니다.
최솟값이 8보다 크면 -1을 return 합니다.

### 입출력 예
|N|number|return|
|--|--|--|
|5|12|4|
|2|11|3|

[해설 링크](https://gurumee92.tistory.com/164)

### 작성답안
```
import java.util.*;

class Solution {
    public int solution(int N, int number) {
        List<Set<Integer>> countList = new ArrayList<>();

for(int i=0; i<9; i++)
	countList.add(new HashSet<>());

countList.get(1).add(N); // N을 1개 쓴 값은 N 혼자이다.

for(int i=2; i<9; i++){
	Set<Integer> countSet = countList.get(i);

	for(int j=1; j<=i; j++){
		Set<Integer> preSet = countList.get(j);
		Set<Integer> postSet = countList.get(i - j);

		for(int preNum : preSet){
			for(int postNum : postSet){
				countSet.add(preNum + postNum);
				countSet.add(preNum - postNum);
				countSet.add(preNum * postNum);

				if(preNum != 0 && postNum != 0)
					countSet.add(preNum / postNum);
			}
		}
	}

	countSet.add(Integer.parseInt(String.valueOf(N).repeat(i)));
}

for(Set<Integer> sub : countList){
	if(sub.contains(number))
		return countList.indexOf(sub);
}

return -1;
    }
}
```


