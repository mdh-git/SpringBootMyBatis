<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>详情</title>
</head>
<body>
<c:set var="count1" value="0" />
<c:forEach items="${list}" var="list" varStatus="num">
    <tr>
        <td>${num.index + 1}<c:set var="count1" value="${num.index+1}" /></td>
        <td>${list.userName}</td><br>
    </tr>
</c:forEach>
</body>
</html>