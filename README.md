# 🧠 Token flow - Whisper 모델 기반 음성 데이터 활용 인지능력 검사 및 훈련 제공 서비스

# Whisper

![Java](https://img.shields.io/badge/Java-21-007396?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-Frontend-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![Python](https://img.shields.io/badge/Python-Data_Analysis-3776AB?style=for-the-badge&logo=python&logoColor=white)
![MariaDB](https://img.shields.io/badge/MariaDB-Database-003545?style=for-the-badge&logo=mariadb&logoColor=white)
![REST API](https://img.shields.io/badge/REST_API-Service-FF6F00?style=for-the-badge)
![Whisper STT](https://img.shields.io/badge/Whisper-STT-412991?style=for-the-badge)
![HuggingFace](https://img.shields.io/badge/HuggingFace-AI-FFD21E?style=for-the-badge&logo=huggingface&logoColor=black)
![PyTorch](https://img.shields.io/badge/PyTorch-Deep_Learning-EE4C2C?style=for-the-badge&logo=pytorch&logoColor=white)

### 모델 기반 음성 데이터 활용 인지능력 검사 및 훈련 제공 서비스

방문 요양 현장에서 스마트폰만으로 사용할 수 있는 **말하기 기반 인지 검사 및 훈련 지원 서비스**입니다.  
사용자의 음성 응답을 STT로 변환하고, 발화 특성을 분석해 **인지 상태 확인, 훈련 결과 기록, 변화 추이 리포트**를 제공하는 것을 목표로 합니다.

---

## 📌 목차

- [📋 프로젝트 소개](#-프로젝트-소개)
- [🎯 프로젝트 목표](#-프로젝트-목표)
- [✨ 주요 기능](#-주요-기능)
- [🧩 서비스 차별점](#-서비스-차별점)
- [👥 주요 사용자](#-주요-사용자)
- [🚀 기대 효과](#-기대-효과)
- [🛠️ 기술 스택](#️-기술-스택)
- [🧠 분석 로직](#-분석-로직)
- [📁 데이터 구성](#-데이터-구성)
- [🗂️ 개발 방법 및 전략](#️-개발-방법-및-전략)
- [🧪 데이터 확보 방안](#-데이터-확보-방안)
- [📌 메뉴 / 기능 구성](#-메뉴--기능-구성)
- [🤝 협업 도구](#-협업-도구)
- [👥 팀원 역할](#-팀원-역할)
- [📈 활용 방안](#-활용-방안)
- [🔗 프로젝트 저장소](#-프로젝트-저장소)
- [🚧 향후 개선 방향](#-향후-개선-방향)
- [📄 라이선스](#-라이선스)

---

## 📋 프로젝트 소개

**Whisper**는 고령층 대상 인지 건강 관리 수요 증가에 맞춰 기획된 **음성 기반 인지능력 검사 및 훈련 웹서비스**입니다.

기존의 종이 활동지나 시설 중심 프로그램과 달리, 방문 요양보호사가 현장에서 스마트폰만으로 손쉽게 활용할 수 있도록 설계했습니다.  
사용자는 날짜 말하기, 그림 설명하기, 상황 질문 답하기, 규칙 기반 언어추론, 추억 말하기 등 **말하기형 과제**를 수행하고, 시스템은 이를 분석해 **응답 시간, 단어 수, 반복 표현, 문장 길이, 정답 여부** 등을 기반으로 인지 상태를 확인할 수 있도록 지원합니다.

---

## 🎯 프로젝트 목표

- 음성 기반 인지능력 검사 기능 구현
- STT 기반 발화 분석을 통한 주요 언어 지표 측정
- 훈련 결과 기록 및 기간별 변화 추이 리포트 제공
- 방문 요양보호사가 활용할 수 있는 보조 문진형 서비스 구축
- 한국어 STT 변환 정확도 80~90% 수준 목표

---

## ✨ 주요 기능

### 1. 회원관리 및 인증
- 일반 회원가입 / 로그인
- 세션 기반 인증
- 소셜 로그인 지원
- 프로필 관리
- 닉네임, 비밀번호, 전화번호 변경

### 2. 말하기 기반 인지능력 검사
- 기억력, 주의력, 언어능력 등 카테고리별 검사
- 날짜 말하기
- 그림 설명하기
- 상황 질문 답하기
- 규칙 기반 언어추론
- 추억 말하기

### 3. 훈련 모드
- 검사 이후 낮게 측정된 영역 중심 훈련
- 특정 카테고리 선택형 훈련 제공
- 기억력 / 주의력 / 언어능력 중심 반복 훈련

### 4. 음성 및 발화 분석
- STT 기반 음성 텍스트 변환
- 반응 시간 분석
- 반복어 비율 분석
- 평균 문장 길이 분석
- 발화 적절성 점수 분석

### 5. 리포트 및 이력 관리
- 검사 결과 기반 인지 상태 분석 리포트 제공
- 주간 / 월간 변화 추이 비교
- 이전 기록 대비 변화율 시각화
- 사용자별 수행 이력 저장

### 6. PDF 보고서 생성
- 수행 결과 요약
- STT 변환 텍스트
- 영역별 점수
- 추천 훈련 콘텐츠
- 가족 / 사회복지사 / 기관 공유용 보고서 생성

---

## 🧩 서비스 차별점

- **음성 기반 인지 상태 분석**: 사용자의 발화 패턴과 응답 내용을 함께 분석
- **훈련 서비스 연계**: 검사에서 끝나지 않고 부족한 영역 중심 훈련 제공
- **방문 요양 현장 특화**: 별도 장비 없이 스마트폰만으로 사용 가능
- **기간별 변화 추적**: 사용자별 데이터 누적을 통한 변화 추이 확인
- **보조 문진 서비스**: 의료 진단이 아닌 현장 활용형 인지 상태 확인 도구

---

## 👥 주요 사용자

- 방문 요양보호사
- 방문 사회복지사
- 장기요양기관 실무자
- 고령층 인지 건강 관리가 필요한 돌봄 현장

---

## 🚀 기대 효과

### 고령층 사용자 관점
- 화면 조작 부담 없이 음성으로 인지훈련 참여 가능
- 기억력, 언어능력, 주의집중, 상황이해 관련 훈련 수행 가능

### 방문 요양보호사 관점
- 스마트폰만으로 훈련 콘텐츠 제공 가능
- 훈련 결과 자동 기록 및 관리 가능
- 활동 준비 부담 감소

### 장기요양기관 관점
- 사용자별 수행 결과와 변화 추이 데이터 관리 가능
- 서비스 품질 개선과 맞춤형 돌봄 지원 가능

### 확장성 관점
- 방문요양기관, 재가복지센터, 주야간보호센터 등 다양한 현장으로 확장 가능

---

## 🛠️ 기술 스택

- **Backend**: Java, Spring Boot, REST API
- **Frontend**: Thymeleaf, HTML, CSS, JavaScript
- **Database**: MariaDB
- **AI / STT**: Whisper STT, Hugging Face Transformers, PyTorch
- **Data Processing**: Python, pandas, KoNLPy, Kiwi, 정규표현식
- **Audio Handling**: Web Audio API, WAV/MP3 파일 처리

---

## 🧠 분석 로직

- 정답 키워드 매칭
- 카테고리 단어 사전 비교
- 중복 단어 탐지
- 문장 길이 분석
- 응답 시간 측정
- 영역별 점수 기반 추천 로직

---

## 📁 데이터 구성

- 사용자 정보
- 인지능력 검사 문항
- 훈련 문항
- 음성 응답 데이터
- STT 변환 텍스트
- 발화 분석 결과
- 인지능력 리포트 데이터
- 추천 콘텐츠 데이터

---

## 🗂️ 개발 방법 및 전략

### 개발 방식
- 기능 단위 분업 후 통합 테스트 진행
- 회원관리 → 인지검사 → STT → 리포트 기능 순차 구현

### 설계 방식
- Figma 기반 UI/UX 설계
- DB 설계
- API 구조 설계 진행

### 검증 방식
- 사용자 음성 데이터 기반 STT 정확도 검증
- 발화 분석 결과 검증
- 기능별 테스트 진행

---

## 🧪 데이터 확보 방안

- **데이터 출처**: AIHub 자유대화 음성(노인남여) 데이터
- **수집 방법**
- AIHub 데이터 활용
- 사용자(수급자) 직접 발화 데이터 활용

---

## 📌 메뉴 / 기능 구성

- 회원가입
- 로그인
- 소셜 로그인
- 프로필 관리
- 인지능력 검사
- 훈련 모드
- 리포트 조회
- 음성 및 발화 분석
- PDF 보고서 생성

---

## 🤝 협업 도구

- **GitHub**: 코드 버전 관리 및 협업
- **Notion**: 일정 관리, 회의록, 기획 문서 아카이빙
- **Figma**: 와이어프레임 및 UX/UI 프로토타입 제작

---

## 👥 팀원 역할

### 배주형
- PM
- Front-end
- Back-end

### 양선호
- Back-end
- Data Modeling

### 문산정
- Front-end
- Back-end
- Data Modeling

### 문세희
- Front-end

### 박준형
- Back-end

---

## 📈 활용 방안

- 방문 요양보호사의 현장 보조 문진 도구
- 요양원 및 기관 단위 표준화된 인지 케어 관리
- 지역사회 인지 스크리닝 도구로 확장
- 가족 및 보호자 대상 PDF 보고서 공유

---

## 🔗 프로젝트 저장소

- **GitHub Repository**: [2026-SMHRD-KDT-LangIntelligence-8/GitFinalProjectJH](https://github.com/2026-SMHRD-KDT-LangIntelligence-8/GitFinalProjectJH)

---

## 🚧 향후 개선 방향

- STT 정확도 향상 및 모델 고도화
- 발화 분석 지표 정교화
- 사용자 맞춤형 추천 훈련 강화
- 개인정보 및 음성 데이터 보안 정책 강화
- 기관용 관리자 기능 확장

---

## 📄 라이선스

이 프로젝트는 교육 및 학습 목적으로 제작되었습니다.

---

## 📝 프로젝트 한 줄 소개

**Whisper는 음성 기반 인지 검사와 훈련을 통해 방문 요양 현장에서 고령층의 인지 상태를 보다 쉽고 체계적으로 확인할 수 있도록 돕는 서비스입니다.**
