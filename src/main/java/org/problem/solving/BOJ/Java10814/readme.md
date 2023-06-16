2차원 배열에 Comparator.compare를 오버라이딩하여 커스텀 했다<br>
내가 사용하는 변수는 2차원 String 배열인데<br>
해당 알고리즘 문제에 맞게 변수를 만들었기 때문에<br>
이 변수에 맞게 정렬 해주지 못하기 때문이다<br>
오버라이딩으로 2차원 String 배열도 정렬할수 있게 했다<br>

조금 특이한 변수형 이라는것 외에 그저 sort() 를 사용한 쉬운 문제다<br>
<br>
<br>
클래스에서 상속받아 sort()메서드 에서 오버라이딩 하지않고<br>
인스턴스를 만들고 거기서 오버라이딩 했기때문에<br>
기존의 메서드와 커스텀 된 메서드등등을 사용할수 있는 선택권을 부여하고 싶었다<br>
<br>
인터넷에 있는 기존 코드<br>
~~~
Arrays.sort(arr, new Comparator<String[]>() {
    @Override
    public int compare(String[] o1, String[] o2) {
        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
    }
});
~~~

기존 코드 보다 가독성, 재사용성에서 훨신 이득이며<br>
오버라이딩 되지않은 메서드를 사용하고싶을때도 문제없이 사용할수있다<br>

> + 찾아보니 익명 클래스라고 재사용성이 없을때 사용하는 유용한 방법이었다..<br>
> 해당 알고리즘 문제의 특성상 다시 쓸일 없으므로 익명 클래스가 더 적합하다..<br>