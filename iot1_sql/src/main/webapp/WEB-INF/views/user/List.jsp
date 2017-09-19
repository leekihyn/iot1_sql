<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp"%>

<title>유저 리스트</title>
</head>
<script>
$(document).ready(function(){
	$("input[type='button']").click(function(){
		var url = this.getAttribute("data-url");
		if(url){
			location.href=url;
		}
	}) 
}) 
</script>
<div class="container">
	<table id="table" data-height="460" style="padding-top:20px;"
		class="table table-bordered table-hover">
		<thead>
			<tr>
				<th class="text-center">아이디</th>
				<th class="text-center">이름</th>
				<th class="text-center">나이</th>
				<th class="text-center">성별</th>
				<th class="text-center">주소</th>
				<th class="text-center">전화번호</th>
				<th class="text-center">부서명</th>
				<th class="text-center">권한레벨</th>
			</tr>
		</thead>
		<tbody id="result_tbody">
		</tbody>
	</table>
	<div class="container" style="text-align: center;"> 
		<label>이름 : </label> <input type="text" id="userName" /> 
		<input type="button" id="searchUser" value="검색" />
	<button id="btnInsert" class="btn btn-primary"  type="button">회원등록</button>
	</div>
</div>
</body>
</html>  