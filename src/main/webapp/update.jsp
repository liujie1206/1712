<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form action="updateGoods" method="post" enctype="multipart/form-data">
<input type="hidden" name="gid" value="${goods.gid}">
名称<input type="text" name="gname" value="${goods.gname}"><br>
英文名称<input type="text" name="ename" value="${goods.ename}"><br>
品牌<select name="brand.bid">
<option>请选择</option>
<c:forEach items="${brand}" var="b">
<option value="${b.bid }" <c:if test="${goods.brand.bid==b.bid}">selected="selected"</c:if>>${b.bname}</option>

</c:forEach>
</select><br>

种类<select name="goodskind.kid">
<option>请选择</option>
<c:forEach items="${goodskind}" var="k">
<option value="${k.kid }" <c:if test="${goods.goodskind.kid==k.kid}">selected="selected"</c:if>>${k.kname}</option>

</c:forEach>
</select><br>

尺寸<input type="text" name="size" value="${goods.size }"><br>
价格<input type="text" name="price" value="${goods.price }"><br>
数量<input type="text" name="num" value="${goods.num }"><br>
标签<input type="text" name="label" value="${goods.label}"><br>
上传图片<input type="file" name="file"><img alt="xxx" src="lookImg?path=${goods.picture }" width="70px" height="55px"><br>
<input type="submit" value="修改">
</form>
</body>
</html>