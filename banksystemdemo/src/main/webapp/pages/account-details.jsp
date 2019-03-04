<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256" isELIgnored="false"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Account Information</title>
</head>
<body>
<h1>Your Account Information</h1>
<p>Id:${account.id}</p>
<p>Account Name:${account.customername}</p>
<p>Account Balance:${account.Balance}
<p>Account Type:${account.AccountType}</p>
<p>Date of Birth:${account.dateofBirth}</p>
<p>Security code:${account.SecurityCode}</p>
</body>
</html>