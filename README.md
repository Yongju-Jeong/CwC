# 프로그래밍 스터디

프로그래밍 실력 향상 및 알고리즘 공부를 위한 스터디 Repo

## 알고리즘 연습 사이트
- [Codility](https://app.codility.com/)
- [프로그래머스](https://programmers.co.kr/)
- [Baekjoon Online Judge](https://www.acmicpc.net/)

알고리즘 사이트에 상관 없이 포맷만 디렉토리 구조를 해치지 않는 형태에서 업로드합니다.
  
## 파일 및 폴더 구조
  - 기본 디렉토리 구조는 아래와 같습니다.
  - 추가되는 사이트에 따라 확장해 주시면 됩니다.
  ```
  Project
  │    README.md
  │
  └──── Codility
  │    │    Lesson
  │    └    Exercises
  │
  └──── Programmers
  │    │    모든_문제
  │    │    코딩테스트_고득점_kit
  │    └    스킬체크
  │
  └──── Baekjoon(백준의 경우 문제 > 알고리즘 분류 탭에서의 분류를 폴더명으로 가져갑니다.)
  │    │    수학
  │    │    구현
  │    │    다이나믹_프로그래밍 
  │    │    ...
  │
  └──── ...

  ```
  - 띄어쓰기는 underscore로 대체해주세요.
  - 파일 경로의 경우 `플랫폼/해당 문제로 접근하기 위한 탭 경로/Github ID` 형식으로 업로드해주세요.
    - ex 1) [Codility 예시](https://app.codility.com/programmers/lessons/1-iterations/binary_gap/) -> `/Codility/Lesson/Iterations/BinadyGap/NeuronA.py`
    - ex 2) [프로그래머스 예시](https://school.programmers.co.kr/learn/courses/30/lessons/1845) -> `/Programmers/코딩테스트_고득점_kit/해시/폰켓몬/NeuronA.py`
    - ex 3) [백준 예시](https://www.acmicpc.net/problem/1000) -> `/Backjoon/수학/1000/NeuronA.py`
  
## PR 양식

### PR 제목
[날짜(yymmdd)](문제 출처)문제명
 ```
 [220929](프로그래머스)폰켓몬
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
 - PR에 등록된 모든 Reviewer중 과반수 이상이 Review를 남겼을 떄