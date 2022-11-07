# CwC(Coding with Colleagues)

프로그래밍 실력 향상 및 알고리즘 공부를 위한 스터디 Repo

## 알고리즘 연습 사이트
- [Codility](https://app.codility.com/)
- [프로그래머스](https://programmers.co.kr/)
- [Baekjoon Online Judge](https://www.acmicpc.net/)

위에 제시된 사이트 이외의 문제도 본인이 원한다면 얼마든지 풀어도 좋습니다.
  
## 파일 및 폴더 구조
  - 기본 디렉토리 구조는 아래와 같습니다.
  - 추가되는 사이트에 따라 확장해 주시면 됩니다.
  ```
  Project
  │    README.md
  │
  └──── NeuronA(본인 아이디로 폴더 생성)
  │    │    1주차
  │    │    2주차
  │    └    README.md
  │
  ...
  ```
  - 띄어쓰기는 ```underscore```로 대체해주세요.
  - 본인이 해결한 문제에 대한 ```README.md```를 작성하여 본인의 진행 상태를 표시합니다.
  - 본인이 유지해야할 ```README.md```예시는 NeuronA 폴더 참조

## 주차별 권장 문제
본 Repo에서는 본인의 선택하에 다양한 문제들을 해결해보는 것을 권장하며
제시하는 권장 문제는 PR에 소요되는 시간을 단축하고자
공통 문제를 제시하여 효율적인 리뷰가 이루어지게 하기 위함입니다.

|주차(시작일)|문제 1|문제 2|문제 3|문제 4|문제 5|
|:-:|:-:|:-:|:-:|:-:|:-:|
|1주차(22.10.03)|[같은 숫자는 싫어](https://school.programmers.co.kr/learn/courses/30/lessons/12906)|[올바른 괄호](https://school.programmers.co.kr/learn/courses/30/lessons/12909)|[기능개발](https://school.programmers.co.kr/learn/courses/30/lessons/42586)|X|X|
|2주차(22.10.10)|[프린터](https://school.programmers.co.kr/learn/courses/30/lessons/42587)|[다리를 지나는 트럭](https://school.programmers.co.kr/learn/courses/30/lessons/42583)|[주식가격](https://school.programmers.co.kr/learn/courses/30/lessons/42584)|[두 큐 합 같게 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/118667)|[괄호 변환](https://school.programmers.co.kr/learn/courses/30/lessons/60058)|
|3주차(22.10.17)|[더 맵게](https://school.programmers.co.kr/learn/courses/30/lessons/42626)|[디스크 컨트롤러](https://school.programmers.co.kr/learn/courses/30/lessons/42627)|[이중우선순위큐](https://school.programmers.co.kr/learn/courses/30/lessons/42628)|X|X|
|4주차(22.10.24)|[소수 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/42839)|[피로도](https://school.programmers.co.kr/learn/courses/30/lessons/87946)|[전력망을 둘로 나누기](https://school.programmers.co.kr/learn/courses/30/lessons/86971)|[모음사전](https://school.programmers.co.kr/learn/courses/30/lessons/84512)|X|
|5주차(22.10.31)|[체육복](https://school.programmers.co.kr/learn/courses/30/lessons/42862)|[조이스틱](https://school.programmers.co.kr/learn/courses/30/lessons/42860)|[큰 수 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/42883)|[구명보트](https://school.programmers.co.kr/learn/courses/30/lessons/42885)|[섬 연결하기](https://school.programmers.co.kr/learn/courses/30/lessons/42861)|
|6주차(22.11.07)|1~5주차 풀지 못한 문제 풀이 + 자율 문제 풀이|||||

## PR 양식

### PR 제목
[날짜(yymmdd)]주차_문제명
 ```
 [220929]1주차_폰켓몬
 ```

#### PR 본문(예시)
```
- 문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/1845
- 문제 해결에 대한 아이디어: 본인이 구현에 사용한 아이디어
```

#### PR 정보
- Assignees: 본인
- Reviewers : 리뷰 대상자(해당 문제를 풀었거나, 같은 언어 사용자 등)
  - 1명 이상의 Reviewer를 반드시 포함해야 함
- Labels: Problem 과 Language를 본인의 현황에 맞게 입력 

#### Merge 기준
 - 다음 문제를 풀기 전(본인 판단)
 - 권장사항) 1개 이상의 Review를 받은 이후
