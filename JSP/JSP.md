JSP 내장 객체(Implicit Objects)
request, response, pageContext, session, application, config, out, page, exception 객체들은 이 메서드가 호출될 때 반드시 준비되는 객체들이기 때문에,
이 객체들을 가리켜 JSP 내장 객체(Implicit Objects)라 부릅니다. 이 객체들은 별도의 선언 없이 JSP 페이지에서 마음껏 사용할 수 있습니다.

JSP 전용 태그 - 지시자
<%@ 지시자 속성="값" 속성="값" ... %>

JSP 전용 태그 - 스크립트릿
<% 자바 코드 %>

JSP 전용 태그 - 선언문
<%! 멤버 변수 및 메서드 선언 %>

JSP 전용 태그 - 표현식
<%= 결과를 반환하는 자바 표현식 %>

값 객체(VO, Value Object)
데이터 수송 객체(DTO, Data Transfer Object)
도메인 객체(DO, Domain Object)
데이터베이스에서 가져온 정보를 JSP 페이지에 전달하려면 그 정보를 담을 객체가 필요합니다.

RequestDispatcher를 이용한 forward, include
다른 서블릿이나 JSP로 작업을 위임할 때 사용하는 객체가 RequestDispatcher입니다.
RequestDispatcher rd = request.getRequestDispatcher("/member/MemberList.jsp");

ServletRequest는 클라이언트의 요청을 다루는 기능 외에 어떤 값을 보관하는 보관소 기능도 있습니다.
setAttribute()를 호출하여 값을 보관할 수 있고, getAttribute()를 호출하여 보관된 값을 꺼낼 수 있습니다.

# 데이터 보관소  
ServletContext 보관소는 웹 애플리케이션이 시작될 때 생성되어 웹 애플리케이션이 종료될 때까지 유지됩니다. 이 보관소에 데이터를 보관하면 웹 애플리케이션이 실행되는 동안에는 모든 서블릿이 사용할 수 있습니다. JSP에서는 application 변수를 통해 이 보관소를 참조할 수 있습니다.  

HttpSession 보관소는 클라이언트의 최초 요청 시 생성되어 브라우저를 닫을 때까지 유지됩니다. 보통 로그인할 때 이 보관소를 초기화하고, 로그아웃하면 이 보관소에 저장된 값들을 비웁니다. 따라서 이 보관소에 값을 보관하면 서블릿이나 JSP 페이지에 상관없이 로그아웃하기 전까지 계속 값을 유지할 수 있습니다. JSP에서는 session 변수를 통해 이 보관소를 참조할 수 있습니다.  

ServletRequest 보관소는 클라이언트의 요청이 들어올 때 생성되어, 클라이언트에게 응답할 때까지 유지됩니다. 이 보관소는 포워딩이나 인클루딩하는 서블릿들 사이에서 값을 공유할 때 유용합니다. JSP에서는 request 변수를 통해 이 보관소를 참조할 수 있습니다.  

JspContext 보관소는 JSP 페이지를 실행하는 동안만 유지됩니다. JSP에서는 pageContext 변수를 통해 이 보관소를 참조할 수 있습니다.
