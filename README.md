# Data Structure & Algorism   
* Data Structure : 데이터를 효율적으로 저장하는 구조(Stack, Queue, List, Tree, Hash)      
* Algorism : 어떠한 문제를 해결하기 위해 정해진 일련의 절차나 방법(버블정렬, 이진탐색, 퀵정렬)

## chapter1
* 양의 정수 자릿수 구하기
* 가우스 덧셈
* IntStream을 이용한 구구단 출력
* 스트림을 이용한 최댓값, 최솟값 구하기
* 정렬을 이용하여 중앙값 구하기

## chapter2
* LocalDate 클래스를 이용하여 며칠 후, 전의 날짜 구하기, 그 해 경과일 수, 남은일 수 구하기
* 배열 역순 복사
* 배열 순서 변경
* 10진수를 다른 진수로 변환
* 소수 구하기(Array, List)

## chapter3
### Search   
1. 선형검색(순차검색)   
    - 데이터가 정렬되어 있을 필요가 없다   
    - 알고리즘 복잡도 : O(n)   
    - **보초법** : 배열 맨 마지막 부분에 검색할 key를 대입하여 선형검색을 하면 종료 판단 횟수를 2회에서 1회로 줄일 수 있다.   
2. 이진검색   
    - 데이터가 반드시 정렬되어 있어야한다.      
    - 알고리즘 복잡도 : O(log n)   
    - Arrays.binarySearch([], key)   
    - Arrays.binarySearch([], new class(), new comparator())   
        * class의 인스턴스의 특정 필드를 기준으로 검색하려면 해당 class는 comparator 구현해서 검색할 필드를 기준으로 정렬한 후,
          이진검색을 한다.   
          
## Stack   
```
class stack{
    int max; // 스택 용량
    int ptr; // 스택 포인터
    int[] stk; // 스택의 본체
}
```   
## Queue(ring buffer)   
```
class queue{
    int max; // 큐의 용량
    int front; // 첫번째 요소 커서
    int rear; // 마지막 요소 커서
    int num; // 현재 데이터 수
    int[] que; // 큐 본체
}
```   
