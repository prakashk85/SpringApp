<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
</head>
<body>

	<form:form method="POST" action="hello">
		<table>
			<tr>
				<td><input type="text" name="count" value="1" /></td>
			</tr>
			<tr>
				<td><input type="text" name="name" value="" /></td>
			</tr>
			<tr>
               <td>
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
		</table>
	</form:form>
</body>
</html>