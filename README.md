# Algorism   
### 검색   
1. 선형검색(순차검색)   
    - 데이터가 정렬되어 있을 필요가 없다   
    - 알고리즘 복잡도 : O(n)   
    - **보초법** : 배열 맨 마지막 부분에 검색할 key를 대입하여 선형검색을 하면 종료 판단 횟수를 2회에서 1회로 줄일 수 있다.   
2. 이진검색   
    - 데이터가 반드시 정렬되어 있어야한다.      
    - 알고리즘 복잡도 : O(log n)   
    - Arrays.binarySearch([], key)   
    - Arrays.binarySearch([], new class(), new comparator())   
        * class의 인스턴스의 특정 필드를 기준으로 검색하려면 해당 class는 comparable을 구현해서 검색할 필드를 기준으로 정렬한 후,
          Comparator를 통해 이진검색을 한다.
