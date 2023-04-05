# toyme


1. Spring Initailizer 프로젝트 생성

2. IDE(IntelliJ 프로젝트 불러오기)
  > springboot 3.0.5 / java 17

3. application 실행 후 localhost:8080에서 whiteLabel Error Page 확인

** Gradle dependency 추가
(https://velog.io/@juyeon/inteliJ-Spring-boot-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%EC%97%90%EC%84%9C-dependency-%EC%B6%94%EA%B0%80%ED%95%98%EA%B8%B0)

## react 설치
(https://velog.io/@u-nij/Spring-Boot-React.js-%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD-%EC%84%B8%ED%8C%85) 참고
4. node JS 설치 (https://nodejs.org/ko)
  > intelliJ 터미널로 사용 시 powershell이 아닌 cmd 사용
  > 설치 후 cmd 에서 node -v 로 확인
  > IntelliJ 터미널에서 확인이 안된다면 재부팅 추천

5. src\main 디렉토리에서 npx create-react-app view 로 view 생성   {view: 프로젝트명} 

==== 아래 절차 안해도 될듯 ====
5. src\main\resources\static 폴더 이동 후 npm init
  > 디렉토리에 package.json 파일 생성됨
6. npm install bootstrap 으로 bootstrap 생성
  > 디렉토리에 node_modules 폴더 생성됨
================================

6. 생성된 view 폴더로 이동하여 npm start 로 실행 확인
  > 자동으로 실행되며 react 로고가 보이는 localhost로 이동되면 완료

## springboot + react 연동
7. view 디렉토리에서 npm install http-proxy-middleware --save 명령어로 필요한 모듈 설치

8. view\src 디렉토리에 setProxy.js 파일 추가
====== 소스코드 전문 =======
const { createProxyMiddleware } = require('http-proxy-middleware');
module.exports = function(app) {
    app.use(
        '/api',
        createProxyMiddleware({
            target: 'http://localhost:3000',	// 서버 URL or localhost:설정한포트번호
            changeOrigin: true,
        })
    );
};
============================
  > 위와 같이 추가하면 '/api' 요청 시 target의 주소로 전달됨

## axios 설치
9. view 디렉토리에 axios 설치  (npm install axios --save)

10. react 빌드 (src\main\view\src 디렉토리 npm run build )
