큐를 사용하는 방법
card.poll();
card.offer();
를 사용해 풀었다
poll()은 큐 자료구조의 값을 하나 빼내는것이고
offer()는 큐 자료구조 마지막에 값을 추가하는것이다

카드 뭉치가 하나 남을때 까지 반복문을 돌려
card.poll();//하나 버리기
card.offer(card.poll());//하나를 뽑아서 큐에 추가하기
로 해결 했다


첫 시도에서 틀린 이유는
card.offer(card.poll());에서
큐에 값이 하나 추가 되어서 반복문 횟수에 영항을 주는것을 생각하지못하고
for(int i = 1; i < N; i++) {
card.poll();
card.offer(card.poll());
}
로 처리했기 때문이다

