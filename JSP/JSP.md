JSP 내장 객체(Implicit Objects)
request, response, pageContext, session, application, config, out, page, exception 객체들은 이 메서드가 호출될 때 반드시 준비되는 객체들이기 때문에,
이 객체들을 가리켜 JSP 내장 객체(Implicit Objects)라 부릅니다. 이 객체들은 별도의 선언 없이 JSP 페이지에서 마음껏 사용할 수 있습니다.

JSP 전용 태그 - 지시자
<%@ 지시자 속셩="값" 속성="값" ... %>

JSP 전용 태그 - 스크립트릿
<% 자바 코드 %>

JSP 전용 태그 - 선언문
<%! 멤버 변수 및 메서드 선언 %>

JSP 전용 태그 - 표현식
<%= 결과를 반환하는 자바 표현식 %>
