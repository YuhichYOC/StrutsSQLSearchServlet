<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="s" 
           uri="/struts-tags" %>

<!DOCTYPE html>
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@ include file="commonreference.jsp" %>

<title>
Insert title here
</title>
</head>

<body>

<div class="centerContents">

<%@ include file="commonheader.jsp" %>

<s:form action="test">
  <s:textfield name="resultBean.searchFrom" label="Search from" />
  <s:textfield name="resultBean.searchTo" label="Search to" />
  <s:submit label="submit" />
</s:form>

<table class="resultTable">
<s:iterator value="resultBean.session.dataTable">
	<tr class="resultTable">
		<td class="resultTable"><s:property value="prefCode" /></td>
		<td class="resultTable"><s:property value="prefName" /></td>
	</tr>
</s:iterator>
</table>

</div>

</body>

</html>