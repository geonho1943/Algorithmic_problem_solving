그래프 탐색
트리의 정점간의 간선을 카운트하여 일정 범위 안에서 각 간선의 합을 구하는 문제
bfs, dfs 둘다 가능 하지만 dfs를 구현한지 좀 되어서 dfs 재귀로 풀었다
기존에 HashMap의 상수값 접근이 가장 빠르다고 생각해서 애용하고 있었는데
각 인터페이스의 개념을 구분하기 좋은 문제 였다
LinkedList로 풀어봤는데 인덱스조회가 빈번하기때문에 시간 초과가 발생 했다
이 문제에서 트리의 수정이 이루어지지않고 조회후 값을 ans에 갱신한다
인덱스 조회가 다수 발생하는 문제기 때문에 ArrayList가 적절 하다

그럼 HashMap 으로 시도하면 통과 할지 궁금했다
HashMap<Integer, ArrayList<Integer>> 으로 시도 하면 통과
HashMap<Integer, LinkedList<Integer>>  도 통과 했다

그래도 인덱스 조회 문제에 LinkedList가 안풀리도록 되어있어서
자주사용는 자료구조를 시도해 볼수 있었다