# The SpringBoot Study
---
---
## clean code 와 test를 생활화 해보자~!!
- 단축키
    - ctrl + alt + s : 설정 창 열기 
---
---
## 가장 먼저 maven 에서 gradle 로 변환하기 필요!
- Ant 와 Maven 의 장점을 모아놓은 Gradle
- 의존성관리를 위한 다양한 방법을 제공!
- 빌드 스크립트를 XML 언어가 아닌 JVM 에서 동작하는 스크립트 언어 'Groovy' 기반의 DSL(Domain Specific Language)를 사용!


#### pom.xml 파일에서 Terminal 를 열어서 다음 명령어를 수행하였다.
```
gradle init
```


## complie vs implementation
A <- B <- C와 같이 B, C가 A라는 모듈을 의존하고 있다고 가정하자,

- 'Complie' 사용 시
  - A라는 모듈을 수정하게 되면, 이 모듈을 직접 혹은 간접적으로 의존하고 있는 B와 C 모듈은 모두 재빌드 되어야 한다.
    
- 'Implementation' 사용 시
  - A라는 모듈을 수정하게 되면, 이 모듈을 직접 의존하고 있는 B만 재빋드한다.
  


## swagger 란
1. 스웨거(Swagger)란?

- OpenAPI Spec 에 맞게 디자인하고 문서화하고 빌드하기 위한 도구들의 모음으로 다음과 같은 구성요소로 이루어져 있다.

- Swagger Editor
  - 브라우저 기반의 편집기로 OpenAPI spec을 쉽게 작성할 수 있도록 도움
- Swagger Ui
  - OpenAPI spec 문서를 deploy하고 브라우저에서 표시될 수 있도록 한다. 
- Swagger Codegen
  - Client의 stub code 를 생성, 개발자는 생성된 코드에 비즈니스 로직에 집중햇 구현.
  

## entity 란

음식이란 entity 가 있다고 하면, 피자, 햄버거, 파스타 같은 인스턴스가 음식이라는 entity 안에 포함된다.

entity 의 특징으로

- 반드시 엔터티가 사용되는 곳의 업무에서 필요하며 관리하고자 하는 정보

- 엔터티가 포함하는 인스턴스에 대해 유일한 식별자로 식별이 가능해야 함

- 엔터티는 지속적으로 존재하는 두개 이상의 인스턴스들의 조합이어야 함

- 엔터티는 반드시 속성을 지녀야 함

- 엔터티는 업무 프로세스에 의해서 이용되어야 함

- 엔터티는 다른 엔터티와 최소 한 개 이상의 관계가 있어야 함


## Executor

작업(Task)은 논리적인 업무의 단위이며, 스레드는 특정 작업을 비동기적으로 동작시킬 수 있는 방법을 제공합니다. 순차적인 방법은 응답 속도와 전체적인 성능이 크게 떨어지는 문제점이 있고, 작업별로 스레드를 만들어내는 방법은 자원관리 측면에서 허점이 있습니다.
자바 클래스 라이브러리에서 작업을 실행하고자 할 때는 Thread보다 Executor가 훨씬 추상화가 잘되어 있으며 사용하기 좋습니다.

```
public interface Executor {
void execute(Runnable command);
}
```

Executor는 굉장히 단순한 인터페이스로 보이지만, 아주 다양한 여러 가지 종류의 작업 실행 정책을 지원하는 유연하면서도 강력한 비동기적 작업 실행 프레임워크의 근간을 이루는 인터페이스입니다. Executor는 작업 등록과 작업 실행을 분리하는 표준적인 방법이며, 각 작업은 Runnable의 형태로 정의합니다. Executor 인터페이스를 구현한 클래스는 작업의 라이프 사이클을 관리하는 기능도 갖고 있고, 몇 가지 통계 값을 뽑아내거나 또는 애플리케이션에서 작업 실행 과정을 관리하고 모니터링하기 위한 기능도 갖고 있습니다.
Executor의 구조는 프로듀서-컨슈머 패턴에 기반하고 있으며, 작업을 생성해 등록하는 클래스가 프로듀서(처리해야 할 작업을 생성하는 주체)가 되고 작업을 실제로 실행하는 스레드가 컨슈머(생성된 작업을 처리하는 주체)가 되는 모양을 갖추고 있습니다. 일반적으로 프로듀서-컨슈머 패턴을 애플리케이션에 적용해 구현할 수 있는 가장 쉬운 방법이 바로 Executor 프레임워크를 사용하는 방법입니다.

- 주요 특징!
  - 쓰레드 풀을 사용
  - 무거운 쓰레드는 미리 할당 가능
  - 태스크와 쓰레드를 생성하고 관리하는 것을 분리
  - 쓰레드 풀안의 쓰레드는 한번해 하나씩 여러 태스크를 실행
  - 태스크 큐를 이용해 태스크를 관리
  - Executor Service를 더이상 필요 없으면 중지
  - Executor Service가 멈추면 모든 쓰레드도 중지
  

## MapStruct

- Entity와 Dto간의 매핑을 지원하는 라이브러리다.
- Entity와 Dto간의 매핑을 위해 getter/setter를 남발하며 직접 구현하는 것을 지원하는 라이브러리는 크게 ModelMapper와 MpaStruct가 있다.
- 주로 쓰이는 ModelMapper와 비교했을때, MapStruct는 컴파일시 미리 생성된 구현체를 통해 Mapping하기 때문에 속도적인 측면에서 이점으로 사용했다.

컴파일 시 오류를 확인할 수 있다.
리플렉션(Reflction)을 사용하지 않기 때문에 매핑 속도가 빠르다.
디버깅이 쉽다.
생성된 매핑 코드를 눈으로 직접 확인할 수 있다.

## Commons lang

Apache Commons Lang 3 라이브러리 는 Java API의 기능 확장을 목표로하는 인기 있고 모든 기능을 갖춘 유틸리티 클래스 패키지이다 .

라이브러리의 레퍼토리는 문자열, 배열 및 숫자 조작, 반영 및 동시성에서 쌍 및 트리플 (일반적으로 튜플 이라고 함)과 같은 여러 순서가 지정된 데이터 구조의 구현에 이르기까지 매우 풍부.

StringUtils , ArrayUtils , NumberUtils , SystemUtils 등의 클래스들이 모여있다.