틀렸다

첫 bfs에서 최초로 목표노드를 탐색하면 그것이 바로 최단 거리 이다
그때 즉시 종료 하며
해당 노드를 거친 코스를 course 에 저장 한다
복귀 bfs에서는 해당 course정보를 가지고 중복노드를 피하며 다음 취단 코스를 찾는다
이 course 정보에는 읜점 노드의 데이터가 저장 되어있어 해당 데이터를 삭제한뒤
두번째bfs를 시작하며
논리상 틀린부분이 없다 생각했다
Java22868_2 는 ai를 통해 작성했다
무조건 다시 풀어보자