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