두 터랫의 거리를 구하는 공식이 이미 존제 했다<br>
나는 그런거 몰라서 피타고라스 뭐시기를 사용하기로 했다
```
두 터랫의 거리구하기
 
1. 임의의 두 점 A, B 중 A를 0,0으로 이동 시킨 후
B의 위치를 A의 이동방법과 동일하게 이동 한다

2. 두 점의 거리,방향은 유지된 상태로 A점의 좌표가 0,0 이 된다

3. 점 B의 좌표는 곧 가상의 직각 삼각형 가로,세로 변의 길이가 된다

4. 피타고라스 뭐시기 (a*a +b*b = C*C) 를 이용하여 C의 값을 구한다

5. C는 점 A, B의 거리와 같다 
```


온라인에서 제공된 방식을 구현 해봤다
```java
static double getDistance(int x, int y, int x1, int y1) {
    int ansX = (int) Math.pow((x1 - x),2);// 제곱
    int ansY = (int) Math.pow((y1 - y),2);// 루트
    return Math.sqrt(ansX + ansY);
	}
```

내가 생각한 방식이 기발한 방법인줄 알았는데
이미 사용중인 방법이였고 점 A의 좌표를 0.0으로 조정하는 절차는
필요하지않았다

실버3 문제며 50분 정도 걸렸고
내접하며 접점이 없을 경우, 내접하며 접점이2개일경우를
```
|| Math.Min(r1,r2)+z < z
|| Math.Min(r1,r2)+z > z
```
로 분별하려고 시도해서 시간이 걸렸다
