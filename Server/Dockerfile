# syntax=docker/dockerfile:1

FROM openjdk:17-jdk-slim AS build

WORKDIR /app

# dos2unix 설치
RUN apt-get update && apt-get install -y dos2unix

# Maven Wrapper와 프로젝트 파일 복사
COPY .mvn/ .mvn
COPY mvnw ./
COPY pom.xml ./

# mvnw 파일을 Unix 형식으로 변환
RUN dos2unix ./mvnw

# Maven Wrapper 실행 권한 부여
RUN chmod +x ./mvnw

# Maven 종속성 캐싱을 위한 단계
RUN ./mvnw dependency:go-offline

# 소스 코드 복사
COPY src ./src

# 프로젝트 빌드
RUN ./mvnw clean package

# 빌드 결과 확인
RUN ls -al target/


# 포트 노출 (Spring Boot의 기본 포트 8080)
EXPOSE 8080

# 빌드된 JAR 파일 실행
ENTRYPOINT ["java", "-jar", "./target/SpringBoot_HELPER-0.0.1-SNAPSHOT.jar"]
