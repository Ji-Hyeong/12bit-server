# 12BIT Server

Kotlin과 Spring Boot로 시작한 서버 프로토타입입니다.

현재 저장소에는 Spring Web, Security, JPA, PostgreSQL과 QueryDSL 기본 설정, 공통 엔티티와 사용자 모델만 구현돼 있습니다. 기능 개발이 이어지지 않은 초기 단계이므로 완성된 서비스가 아닙니다.

## 기술

- Kotlin 1.9, Java 17
- Spring Boot 3.4, Spring Data JPA, Spring Security
- PostgreSQL, Redis, QueryDSL

## 실행 전 설정

로컬 PostgreSQL의 접속 정보를 환경 변수로 전달합니다.

```bash
export DB_URL=jdbc:postgresql://localhost:5432/12bit
export DB_USERNAME=admin
export DB_PASSWORD=local-password
./gradlew bootRun
```

테스트는 다음 명령으로 실행합니다.

```bash
./gradlew test
```
