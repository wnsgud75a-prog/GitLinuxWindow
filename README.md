# 🧠 Token flow - Whisper 모델 기반 음성 데이터 활용 인지능력 검사 및 훈련 제공 서비스

[cite_start]고령사회 진입에 따른 인지건강 관리 수요에 맞춰, 방문 요양보호사가 현장에서 스마트폰만으로 편리하게 활용할 수 있는 말하기형 인지훈련 및 보조 문진 웹서비스 [cite: 4, 9, 29, 67, 72]

![Java](https://img.shields.io/badge/Java-21-007396?style=flat-square&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=flat-square&logo=springboot)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.x-005F0F?style=flat-square&logo=thymeleaf)
![MariaDB](https://img.shields.io/badge/MariaDB-10.11-003545?style=flat-square&logo=mariadb)
![Python](https://img.shields.io/badge/Python-3776AB?style=flat-square&logo=python)
![PyTorch](https://img.shields.io/badge/PyTorch-EE4C2C?style=flat-square&logo=pytorch)
![Hugging Face](https://img.shields.io/badge/Hugging_Face-FFD21E?style=flat-square&logo=huggingface)

## 📋 프로젝트 소개

[cite_start]**Token flow**는 재가돌봄 환경의 제약을 극복하고 고령층의 인지기능 저하를 지속적으로 점검하기 위한 음성 인터페이스 기반 인지케어 서비스입니다[cite: 12, 59, 68].  
[cite_start]어르신들이 화면 조작이나 필기 부담 없이 제시된 문항에 음성으로 답변하면 [cite: 82, 95][cite_start], 시스템이 Whisper STT 모델을 통해 답변을 텍스트로 변환한 뒤 [cite: 75, 84] [cite_start]정답 여부, 지연 반응 시간, 발화 지표(반복어, 문장 길이, 화행 적절성)를 자동 분석하여 체계적으로 기록합니다[cite: 75, 87].

### 주요 특징

- [cite_start]🧩 **말하기형 인지훈련 퀴즈**: 날짜 말하기, 그림 설명, 상황 질문 답하기 등 음성 응답 중심 문항 제공 [cite: 81, 82]
- [cite_start]📈 **STT 기반 음성 텍스트 변환**: Hugging Face 오픈소스 기반 Whisper 모델을 통한 고품질 한국어 변환 [cite: 84, 95, 138]
- [cite_start]🧠 **발화 분석 지표 산출**: 반응 시간, 반복어 비율, 평균 문장 길이, 화행 적절성 스코어 분석 [cite: 87, 138]
- [cite_start]👤 **개인화된 훈련 모드**: 검사 진행 이후 비교적 낮게 측정된 카테고리 영역을 선택 집중 훈련 
- [cite_start]🔐 **사용자 및 수급자 관리**: 요양보호사 회원관리(세션 및 소셜) 및 담당 수급자 이력 연동 [cite: 138, 147]
- [cite_start]📋 **시각화 리포트 및 PDF 발행**: 주간·월간 인지 변화 추이 그래프 및 자동 결과 보고서 다운로드 지원 [cite: 91, 92, 138]

## 🎯 서비스 목표

- [cite_start]방문요양 현장에서 별도 고정 장비나 교구 없이 스마트폰만으로 간편한 인지자극 프로그램 수행 [cite: 65, 67, 72]
- [cite_start]주관적 관찰 대신 음성 데이터 기반의 객관적 지표를 활용하여 스크리닝 정확도 및 보고의 일관성 향상 [cite: 173, 174]
- [cite_start]훈련 이력의 체계적 데이터 정제를 통해 치매 고위험군 조기 발견 및 돌봄 서비스 품질 개선 [cite: 175, 183, 184]

## 🚀 시작하기

### 사전 요구사항

- JDK 21 이상
- MariaDB 접속 가능 환경
- Gradle Wrapper 실행 가능 환경

### 실행 전 확인

`src/main/resources/application.properties`에서 아래 항목을 확인해야 합니다.

- 서버 포트
- MariaDB 접속 정보
- Hugging Face / Whisper STT 모델 연동 환경 변수
- 소셜 로그인 설정

### 실행 방법

```bash
./gradlew bootRun

Windows에서는 아래 명령으로 실행할 수 있습니다.

PowerShell
.\gradlew.bat bootRun

접속 주소Plaintexthttp://localhost:8081


📁 프로젝트 구조
PlaintextTokenflow-project/
├── src/
│   └── main/
│       ├── java/com/project/care/
│       │   ├── config/         # Security, JPA, OAuth 및 환경 설정
│       │   ├── controller/     # REST API 엔드포인트 및 라우팅
│       │   ├── domain/         # 핵심 엔티티 (User, Recipient, Question 등)
│       │   ├── dto/            # 요청/응답 데이터 전송 객체
│       │   ├── repository/     # Spring Data JPA Repository
│       │   └── service/        # 채점, 발화 지표 산출, 리포트 비즈니스 로직
│       └── resources/
│           ├── application.properties
│           ├── static/
│           │   ├── css/
│           │   └── js/         # Web Audio API 및 API 통신 스크립트
│           └── templates/      # Thymeleaf 뷰 템플릿
├── build.gradle.kts
└── README.md


🗺️ 주요 페이지

경로,페이지,설명
/,수급자 관리 메인,담당 수급자 목록 조회 및 인지케어 관리   PDF
/login,로그인,일반 세션 로그인 및 소셜 로그인 진행   PDF+ 3
/signup,회원가입,서비스 이용을 위한 요양보호사 계정 등록   PDF+ 2
/profile-edit,프로필 수정,"보호사 닉네임, 비밀번호 등 정보 변경   PDF+ 2"
/test,인지능력 검사,전 영역 카테고리별 말하기 기반 상태 측정   PDF+ 2
/training,인지능력 훈련,취약 영역 콘텐츠 선택 및 인지 자극 수행   PDF+ 2
/report,검사결과 조회,수급자별 누적 점수 및 STT 변환 텍스트 확인   PDF+ 2
/report/trend,기간별 변화 추이,주간·월간 단위 인지 변화율 시각화 통계 그래프   PDF+ 2


🎯 주요 구현 내용
1. 회원 및 인증
- 일반 회원가입 / 로그인
- 세션 기반 로그인 상태 유지
- 소셜 로그인 연동
- 회원 정보 수정 (닉네임, 비밀번호, 전화번호)

2. 인지능력 검사 및 문항
- 제어기억력, 주의력, 언어능력 등 카테고리별 말하기 기반 인지 검사 진행
- 날짜 말하기, 그림 설명, 상황 질문 답하기, 규칙 기반 언어추론, 추억 말하기 문항 제공
-  검사 및 훈련용 통합 문항 구축 후 검사용 3 : 훈련용 7 비율 분할 관리
- 검사 진행 이후 낮게 측정된 카테고리를 맞춤형으로 제공하는 훈련 모드 구현

3. 음성 및 발화 분석
- Web Audio API 기반 음성 데이터 수집 및 업로드 처리
- 한국어 STT 모델을 활용한 사용자 음성의 텍스트 변환
- 반응 시간(지연 시간), 반복어 비율, 평균 문장 길이, 화행 적절성 점수 지표 정산

4. 리포트 조회
- 검사 결과를 기반으로 한 사용자 인지 상태 분석 리포트 제공
- 1주, 1개월 단위 검사 결과 비교 및 이전 기록 대비 변화율 시각화
- 수행 결과, STT 변환 텍스트, 추천 콘텐츠를 포함한 보고서 관리


🐍 데이터 분석 및 Python 활용노인 발화 특성 분석과 자연어 처리 채점 신뢰도를 확보하기 위해 데이터 전처리 및 분석 과정을 진행했습니다.
1. 데이터 전처리 / 데이터 확보AIHub '자유대화 음성(노인남여)' 오픈 데이터셋을 연동하여 전처리 및 초기 학습 환경 보완   어르신 특유의 발음 흐림 및 사투리 발화 데이터에 최적화된 변환 정확도 확보 환경 구축
2. 자연어 처리 기반 지표 분석Python 기반 정규표현식 및 형태소 분석기를 활용해 명사/동사 키워드 분리 및 정답 사전 비교   사용자의 음성 응답 내 중복 단어 패턴 탐지를 통한 반복어 비율 분석   텍스트 구조 분석을 통한 문장 길이 분석 및 의미 맥락적 화행 적절성 스코어 연산
3. 영역별 규칙 기반 추천영역별 점수 데이터를 Pandas 등을 활용해 다각도로 집계   수급자의 누적 점수 추이 중 취약 영역을 선별하기 위한 규칙 기반 매칭 알고리즘 적용


🔌 주요 API
사용자POST /users/signupPOST /users/loginPOST /users/logoutPUT /users/profile
수급자 관리GET /api/recipientsPOST /api/recipients인지 검사 및 문항GET /api/questions?mode={mode}POST /api/performance-records
리포트 및 통계GET /api/reports/{recipientId}/summaryGET /api/reports/{recipientId}/trendGET /api/reports/{recordId}/pdf


🛠️ 기술 스택
Backend: Spring Boot, REST API   Template Engine: Thymeleaf
Database Access: Spring Data JPADatabase: MariaDB
Frontend: HTML, CSS, JavaScript (Web Audio API)
Build Tool: GradleLanguage: Java, Python, JavaScript
Data Analysis / AI: Hugging Face Transformers, Whisper STT, PyTorch, pandas, KoNLPy / Kiwi


👥 팀원 역할
배주형 (팀장)PM, Front-end, Back-end   프로젝트 총괄 기획 및 일정 관리, 기능 단위 풀스택 구현 및 통합 테스트 진행
양선호Back-end, Data Modeling   데이터베이스 아키텍처 설계, 백엔드 서비스 비즈니스 데이터 및 영속성 처리 로직 구현
문산정Front-end, Back-end, Data Modeling   UI/UX 설계 협업 및 구현, API 데이터 연동 인터페이스 및 백엔드 서비스 컴포넌트 개발
박준형Back-end   일반 회원 관리, 세션 인증 보안 처리 및 소셜 로그인 연동 로직 구현
문세희Front-end   Figma 기반 UI/UX 와이어프레임 및 디자인 프로토타입 설계, 화면 인터페이스 구현


🧱 데이터 접근 방식이 프로젝트는 데이터의 완전한 객체 지향적 관리와 정밀 정산 트랜잭션을 처리하기 위해 Spring Data JPA를 사용했습니다.
JPA수급자 정보 및 정적 문항 데이터의 생명주기 매핑 관리검사 마스터 테이블과 문항별 상세 분석 간의 영속성 전이(Cascade) 처리누적 통계 조회 최적화를 위한 패치 조인(Fetch Join) 및 지연 로딩 전략 수립


💡 아키텍처 포인트
페이지 렌더링은 Spring MVC + Thymeleaf
동적 데이터 및 오디오 스트리밍 처리는 REST API + JavaScript (fetch)
인증 상태는 HttpSession 기반 인 메모리 관리
무거운 STT 및 NLP 채점 로직 분리를 위해 Python 분석 서빙 파이프라인 분리 구축


🚧 개선 포인트
대용량 오디오 업로드 시 병목을 방지하기 위한 비동기 메시지 큐 도입
파이썬 모델 서버와의 통신 무결성을 위한 보안 토큰 레이어 추가
수급자 위험 징후 감지 시 보호자 자동 알림 웹훅 인프라 설계
분석 신뢰도 향상을 위한 형태소 사전 고도화보고서 파일 인코딩 및 공통 응답 포맷 예외 처리 세분화


🤝 프로젝트 저장소GitHub Repository: [https://github.com/tokenflow/KDT-Final-Project](https://github.com/2026-SMHRD-KDT-LangIntelligence-8/GitFinalProjectJH)


📄 라이선스
이 프로젝트는 교육 및 학습 목적으로 제작되었습니다.
Made for KDT Team Project (Token flow) 보호사의 주관적 관찰 대신 음성 기반 객관적 지표로 어르신 인지 상태를 기록하는 스마트 시니어 케어 플랫폼   
