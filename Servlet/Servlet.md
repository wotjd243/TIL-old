PreparedStatement는 반복적인 질의를 하거나, 입력 매개변수가 많은 경우에 유용합니다.
특히 이미지와 같은 바이너리 데이터를 저장하거나 변경할 때는 PreparedStatement만이 가능합니다.


DD 파일
Deployment Descriptor
배포 서술자

서블릿 초기화 매개변수를 설정하는 엘리먼트
<init-param>
<param-name>매개변수 이름</param-name>
<param-value>매개변수 값</param-valule>
</init-param>

컨텍스트 초기화 매개변수
서블릿 초기화 매개변수는 말 그대로 그 매개변수가 선언된 서블릿에서만 사용될 수 있습니다.
다른 서블릿은 참조할 수 없습니다.
같은 웹 애플리케이션에 소속된 서블릿들이 공유하는 매개변수입니다.

```Java
import javax.servlet.ServletContext
ServletContext sc = this.getServletContext();
```
