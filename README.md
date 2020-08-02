##배운것 정리

> JPA 영속성 컨텍스트(113p)

    "Entity를 영구 저장하는 환경" 이라는 뜻
    (실제로는 DB에 저장하는 것이 아니라 영속성 컨텍스트를 통해서 Entity를 영속화한다는 뜻)
- commit하기 전까지는 그냥 1차 캐시화 되어 있는 상태임.
- commit을 해야 영속성 컨텍스트에 저장되어 있는 정보들이 쿼리로 DB에 날아가 처리됨.   
 
* 출처 : https://gmlwjd9405.github.io/2019/08/06/persistence-context.html

> 더티체킹이란?(114p)

    Dirty란 상태의 변화가 생긴 정도
    즉, Dirty Checking이란 상태 변경 검사 (최초 조회 상태와 다를 경우)
* 출처 : https://jojoldu.tistory.com/415

> @MappedSuperclass

    부모 클래스를 상속받는 자식클래스에게 매핑 정보만 제공하고 싶을때 이 어노테이션을 사용
    
* 출처: https://feco.tistory.com/13

> @EntityListeners

    대상이 되는 클래스(entity)가 DB에 적용되기 이전 이후에 커스텀 콜백을 요청할 수 있는 어노테이션

- 대상 클래스 가 DB와 상호작용하는 도중에 AOP처럼 전 후로 개입할 수 있게 해준다.

* 출처: https://gs.saro.me/dev?tn=514

### 8/1 육아로 지쳐서 오늘 진도 못나감..
### 8/2 두통..