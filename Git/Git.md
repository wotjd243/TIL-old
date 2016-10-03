# 버전 관리  
버전 관리(version control, revision control), 소스 관리(source control), 소스 코드 관리(source code management, SCM)란 동일한 정보에 대한 여러 버전을 관리하는 것을 말한다. 공학과 소프트웨어 개발에서 팀 단위로 개발 중인 소스 코드나, 청사진 같은 설계도 등의 디지털 문서를 관리하는 데 사용된다.

# Git의 특징
Git은 크게 보아 master 저장소 서버와 master 저상소의 완전한 사본을 가지는 클라이언트 저장소로 구성되어 있습니다.
그리고 다음의 기능을 지원합니다.

- 로컬 및 원격 저장소 생성
- 로컬 저장소에 파일 생성 및 추가
- 수정 내역을 로컬 저장소에 제출
- 파일 수정 내역 추적
- 원격 저장소에 제출된 수정 내역을 로컬 저장소에 적용
- master에 영향을 끼치지 않는 브랜치 생성
- 브랜치 사이의 병합(Merge)
- 브랜치를 병ㅇ합하는 도중의 충돌 감지

# 명령어
사용자 이름과 이메일 설정
git config --global user.name "사용자이름"
git config --global user.email "이메일"

저장소 사용에 필요한 Git 기본 명령어
저장소 생성 - 실행한 위치를 Git 저장소로 초기화합니다.
git init
저장소에 파일 추가 - 해당 파일을 Git이 추적할 수 있게 저장소에 추가합니다.
git add 파일이름
저장소에 수정 내역 제출 - 번경된 파일을 저장소에 제출합니다.
git commit
저장소 상태 확인 - 현재 저장소의 상태를 출력합니다.
git status

저장소 사용을 위한 branch 명령어
저장소에 브랜치 추가 - '이름'의 브랜치를 만듭니다.
git branch 이름
작업 중인 브랜치 변경 - 현재 작업 중인 '브랜치이름'을 변경합니다.
git checkout 브랜치이름
브랜치 병합하기 - 현재 작업 중인 브랜치에 '브랜치이름'의 브랜치를 끌어와 병합합니다.
git merge 브랜치이름

git branch 명령과 git checkout 명령을 한 번에 실행
git checkout -b 브랜치이름
git commit 명령에 변경된 저장소 파일 모두를 커밋하는 옵션 -a (= **git add 파일이름** 명령을 실행한 후 **git commit** 명령)
git commit -a
커밋 메시지 넣기
git commit -m "커밋메시지"

# .gitignore: 불필요한 파일 및 폴더 무시
gitignore.io(http://www.gitignore.io/)


