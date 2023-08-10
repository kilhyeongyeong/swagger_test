# Swagger

## 설정
### build.gradle
`implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.1.0'`

><b>⚠️주의</b><br>
[사진](사진)<br>
더이상 해당 의존성 주입을 지원하지 않음<br>
`implementation 'org.springdoc:springdoc-openapi-ui:1.7.0'`


### 접속
1. swagger 접속<br>
<b>http://server:port/swagger-ui/index.html<b><br>
ex) `http://localhost:8001/swagger-ui/index.html`
2. json 형식으로 출력<br>
<b>http://server:port/v3/api-docs<b><br>
ex) `http://localhost:8001/v3/api-docs`
3. yaml 파일 다운<br>
<b>http://server:port/v3/api-docs.yaml</b><br>
ex) `http://localhost:8001/v3/api-docs.yaml`