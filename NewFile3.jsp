<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB","root","12345678");
	Statement statement  = connection.createStatement();// query execute

	
	ResultSet set = statement.executeQuery("select * from abc");
	while(set.next()){
		System.out.println(set.getInt(1)+" "+set.getInt(2));
	}
	
}

catch (Exception e) {
 	System.out.println(e);
}

%>
</body>
</html>