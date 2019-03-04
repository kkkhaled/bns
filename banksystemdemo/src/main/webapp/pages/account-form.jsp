<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%> 
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Account Form</title>
<style>.error{color:red;}</style>
</head>
<body>
<h1>please complete this form</h1>
<form:form method="POST"  action="NewAccount" modelAttribute="account"> 
        account id:<form:input path="id"/>
        <br><br>
        customername:<form:input path="customername"/>
        <form:errors path="customername" cssClass="error"/>
        <br><br>
         Account Balance:<form:input path="Balance"/>
        <form:errors path="Balancee" cssClass="error"/>
        <br><br>
        Account Type:<form:input path="AccountType"/>
        <form:errors path="AccountType" cssClass="error"/>
        <br><br>
        Date of Birth:<form:input path="dateofBirth"/>
        <form:errors path="dateofBirth" cssClass="error"/>
        <br><br>
        Security code:<form:input path="SecurityCode"/>
        <form:errors path="SecurityCode" cssClass="error"/>
        <br><br>
        <input type="submit" value="Create Account"/>
</form:form>
</body>
</html>