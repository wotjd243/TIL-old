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
