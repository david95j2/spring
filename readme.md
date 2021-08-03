# The SpringBoot Study
---
---
## clean code 와 test를 생활화 해보자~!!
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