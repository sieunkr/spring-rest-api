# REST API 디자인

심플하고, 간결한 REST API 디자인을 위한 가이드를 정리한다. 


----------


### URL 끝점(End Point) 이름 정하기
- 명사를 사용하자. 동사는 좋지 않다. ( OK: /users/kim,  NO:/getUser/kim)
- URL에 파라미터를 넣지 마라 (NO: /users/param1/param2/param3)

### 행위에 맞는 메서드를 사용해라

- GET: 조회
- PUT: 생성, 업데이트
- POST: 생성, 업데이트(부분 업데이트)
- DELETE: 삭제

### PUT/POST 요청에 대한 응답을 반환해야 한다.
- 201 OK
- 조회할 수 있는 링크

### API 버전 관리하기
많은 기능 변경이 필요한 경우, 이전 기능에 문제가 발생하지 않도록 API 버전을 새로 만들어서, 사이드이펙트 없도록 개발

- URL: www.springboot.co.kr/v1
