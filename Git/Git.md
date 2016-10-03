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

git clone - 원격 저장소의 모든 내용을 로컬 저장소로 복사합니다.
git remote - 로컬 저장소를 특정 원격 저장소와 연결합니다.
git push - 로컬 저장소의 내용을 보내거나 로컬 저장소의 변경 사항을 원격 저장소로 보냅니다.
git fetch - 로컬 저장소와 원격 저장소의 변경 사항이 다를 때 이를 비교 대조하고 git merge 명령어와 함께 최신 데이터를 반영하거나 충돌 문제 등을 해결합니다.
git pull - git remote 명령을 통해 서로 연결된 원격 저장소의 최신 내용을 로컬 저장소로 가져오면서 병합합니다. git push와 반대 성격의 명령어입니다.

git remote: 로컬 저장소와 원격 저장소를 연결하기
git remote add 원격저장소별칭 https://github.com/사용자이름/원격저장소이름.git
git push 원격저장소별칭 --all
git push 원격저장소별칭 로컬브랜치이름

# .gitignore: 불필요한 파일 및 폴더 무시
gitignore.io(http://www.gitignore.io/)

# GitHub

- 포크(Fork): 다른 사람의 저장소를 복사하는 기능
- 풀 리퀘스트(Pull Request): 포크한 저장소를 수정해 다시 원본 저장소에 병합해달라는 요청을 보내 사용자 사이의 상호작용을 일으키게 하는 기능
- 이슈(Issues): 저장소 안에서 사용자들 사이의 문제를 논의하는 기능
- 위키(Wiki): 저장소와 관련된 체계적인 기록을 남기는 기능

클론과 포크의 차이
GitHub 안에서 원격 저장소를 복사하는 작업을 포크라고 한다면, GitHub에서 로컬 환경으로 복사하는 작업은 클론입니다.
