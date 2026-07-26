# Exercise-3 JWT

Spring Boot REST API secured using Spring Security and JWT.

## Default Credentials

- username: `user`
- password: `pwd`

## Run

```bash
mvn clean test
mvn spring-boot:run
```

## Verify Unauthorized

```bash
curl -i http://localhost:8090/countries
```

## Get JWT

```bash
curl -s -X POST http://localhost:8090/authenticate \
  -H "Content-Type: application/json" \
  -d '{"username":"user","password":"pwd"}'
```

## Access Protected API

```bash
curl -s http://localhost:8090/countries -H "Authorization: Bearer <token>"
```