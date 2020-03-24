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
<button id="add">添加</button>
<button id="ps">批量删除</button>
<table>
  <tr>
   <th>选择</th>
    <th>编号</th>
    <th>名称</th>
    <th>英文名称</th>
    <th>商品品牌</th>
    <th>商品种类</th>
    <th>尺寸</th>
    <th>单价</th>
    <th>数量</th>
    <th>标签</th>
    <th>图片</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${pageInfo.list }" var="g">
    <tr>
    <th><input type="checkbox" value="${g.gid }"></th>
    <th>${g.gid }</th>
    <th>${g.gname }</th>
    <th>${g.ename }</th>
    <th>${g.brand.bname }</th>
    <th>${g.goodskind.kname }</th>
    <th>${g.size }</th>
    <th>${g.price }</th>
    <th>${g.num }</th>
    <th>${g.label}</th>
    <th><img alt="xxx" src="lookImg?path=${g.picture }" width="70px" height="55px"></th>
    <th><a href="findOne?gid=${g.gid }">修改</a>
    <button class="del" value="${g.gid }">删除</button>
    </th>
  </tr>
  
  </c:forEach>
  <tr>
  <td colspan="11">
  <a href="?pageNum=${pageInfo.prePage}">上一页</a>
  <a href="?pageNum=${pageInfo.nextPage}">下一页</a>
  </td>
  </tr>

</table>

</body>
<script type="text/javascript">
$("#add").click(function(){
	location.href="findbk";
});

</script>
<script type="text/javascript">
$(".del").click(function(){
	var ids=$(this).val();
	alert(ids);
	if(confirm("是否要删除？")){
		$.post("deleteGoods",{"ids":ids},function(data){
			if(data){
				alert("删除成功");
				location.href="findAll";
			}
		});
	}
});


$("#ps").click(function(){
	var ids=[];
	$(":checkbox:checked").each(function(){
		ids.push($(this).val());
	});
	if(confirm("是否要删除？")){
		$.post("deleteGoods",{"ids":ids.toString()},function(data){
			if(data){
				alert("删除成功");
				location.href="findAll";
			}
		});
	}
});
</script>
</html>