# Java 객체지향 프로그래밍 학습

## 강의 정보

**강의명**: [김영한의 실전 자바 - 기본편](https://www.inflearn.com/course/%EA%B9%80%EC%98%81%ED%95%9C%EC%9D%98-%EC%8B%A4%EC%A0%84-%EC%9E%90%EB%B0%94-%EA%B8%B0%EB%B3%B8%ED%8E%B8)

**플랫폼**: Inflearn

**목표**: Java 객체지향 프로그래밍의 핵심 개념을 체계적으로 학습하여 실무 역량 강화

---

## 학습 진도

| 챕터 | 주제 | 상태 |
|:-----|:-----|:-----|
| Chapter 01 | 클래스와 데이터 | ✅ 완료 (2026.01.02.) |
| Chapter 02 | 기본형과 참조형 | 🔄 진행 중 |
| Chapter 03 | 객체 지향 프로그래밍 | 📋 예정 |
| Chapter 04 | 생성자 | 📋 예정 |
| Chapter 05 | 패키지 | 📋 예정 |
| Chapter 06 | 접근 제어자 | 📋 예정 |
| Chapter 07 | 자바 메모리 구조와 static | 📋 예정 |
| Chapter 08 | final | 📋 예정 |
| Chapter 09 | 상속 | 📋 예정 |
| Chapter 10 | 다형성1 | 📋 예정 |
| Chapter 11 | 다형성2 | 📋 예정 |
| Chapter 12 | 다형성과 설계 | 📋 예정 |

**현재 진도**: Chapter 02 - 기본형과 참조형

---

## 학습 기록

| 날짜 | 학습 내용 |
|:-----|:---------|
| 2026-01-02 | Chapter 01 완료 - 클래스와 데이터 |
| 2025-12-31 | 프로젝트 환경 설정 (CLAUDE.md, 설치 가이드 작성) |

---

## 프로젝트 구조

```
.
├── CLAUDE.md               # Claude Code 가이드
├── README.md               # 프로젝트 설명
├── autocommit_python/      # 자동 커밋 도구
├── docs/                   # 프로젝트 문서
│   └── core/               # 핵심 규칙 문서
└── material/               # 학습 자료
    ├── pdf/                # 강의 PDF 자료
    ├── environment/        # 개발 환경 설정 가이드
    └── chapters/           # 챕터별 학습 자료
        ├── chapter_01/     # 클래스와 데이터
        ├── chapter_02/     # 기본형과 참조형
        ├── chapter_03/     # 객체 지향 프로그래밍
        ├── chapter_04/     # 생성자
        ├── chapter_05/     # 패키지
        ├── chapter_06/     # 접근 제어자
        ├── chapter_07/     # 자바 메모리 구조와 static
        ├── chapter_08/     # final
        ├── chapter_09/     # 상속
        ├── chapter_10/     # 다형성1
        ├── chapter_11/     # 다형성2
        └── chapter_12/     # 다형성과 설계
```

각 챕터별 연습 문제를 직접 풀어보며 학습한다. 연습 문제는 TODO 주석 형태로 제공된다.

---

# 프로젝트 탬플릿 버전 관리 
- autocommit은 사용하려는 언어와 api, 모델을 가지고 하나만 사용하고 나머지는 삭제해도 무방합니다.
- 클로드 코드를 사용하는 경우, docs/core/constitution.md, docs/core/ci_cd.md, docs/core/style.md 를 기반으로 CLAUDE.md를 작성해주세요. 또한 아래 하위 문서는 참조로 걸어주세요. 
    - 또한 docs/core/tdd_constitution_java.md
    - docs/core/tdd_constitution_javascript.md
    - docs/core/tdd_constitution_python.md
    - docs/core/tdd_constitution_rust.md
    - docs/core/tdd_constitution_typescript.md
    - docs/core/review_before_merge.md
    - docs/core/review_before_push.md
    - docs/core/workflow_template_java.yaml
    - docs/core/workflow_template_javascript.yaml
    - docs/core/workflow_template_rust.yaml
    - docs/core/workflow_template_python.yaml
    - docs/core/workflow_template_typescript.yaml

## version/0.*

- initial_docs/*에서 작성된 것들을 ai 기반으로 합친 버전입니다.
- v0.1.0: 초기 버전 취합
- v0.2.0: docs/project/ 프로젝트 문서를 넣을 수 있는 디렉토리 설정
- v0.3.0: Rust/JavaScript 언어 지원 및 개발 철학 강화
  - Rust, JavaScript TDD 방법론 문서 추가 (`tdd_constitution_rust.md`, `tdd_constitution_javascript.md`)
  - Rust, JavaScript 코드 스타일 가이드 추가 (`constitution.md` Section 6, 7)
  - Rust, JavaScript CI 워크플로우 템플릿 추가 (`workflow_template_rust.yaml`, `workflow_template_javascript.yaml`)
  - AI 에이전트 Git 작업 금지 규칙 추가 (`constitution.md` Section 9.1)
  - TDD 필수 원칙 추가 (`constitution.md` Section 9)
  - 문서 호환성 개선 (`review_before_merge.md` 시점 표현 수정, `project/README.md` 보강)
  - MCP 연결 설정 가이드 추가 (`docs/README.md` Notion, Jira 연동)
  - docs_*/ 삭제
- v0.4.0: AutoCommit 기능 개선
  - Diff 크기 제한 확장 (3000자 → 6000자)
  - 브랜치 식별자 자동 추출 기능 추가 (예: `feature/auth/login-page` → `login-page`)
  - 커밋 메시지 템플릿에 브랜치 식별자 반영 (`{branch_id}` 플레이스홀더)
  - 에러 메시지 환경변수명 일치 (`COMMIT_OPENAI_API_KEY`)
  - Python/Node.js 버전 동일하게 적용
- v0.5.0: AutoCommit python에 uv 적용
- v0.6.0: 브랜치 네이밍 규칙 간소화 및 변경 이력 추적 개선
  - 브랜치 네이밍 변경: `feature/{YYYYMMDD}_{JIRA-ID}_{기능정의서-ID}_{작업자}` → `feature/{YYYYMMDD}_{작업자}`
  - version_change_log에 Jira ID, 기능정의서 ID 컬럼 추가 (변경사항 추적용)
  - CI/CD 워크플로우에 [6] 변경 이력 작성 단계 추가 (Push 전)
  - 당번 개발자 문서 취합 작업 상세화 (version_change_log, api_spec, error_spec)
  - `docs/version_change_log.md` 파일 생성
  - SDD 문서 유형에 `api_spec.md`, `error_spec.md`, `version_change_log.md` 추가
  - 관련 문서 일관성 업데이트 (`constitution.md`, `ci_cd.md`, `sdd/README.md`, `docs/README.md`, `review_before_push.md`)

## initial_docs/{이니셜}

- 최초 프로젝트 탬플릿을 작성하기 전까지의 기초 세팅 설정
- 초기 문서들에 대해선 모두 initial_docs/{이니셜} 브랜치로 따서 작성
