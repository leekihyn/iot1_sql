<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="kendo" uri="http://www.kendoui.com/jsp/tags"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/common/header.jsp"%>
<title>Insert title here</title> 
</head>
<body>
	<script>
	function callback(results) {
		var str = "";
		for(var i=0;max=results.lentth,i<max;i++){ 
			var vendor = results[i];
			
			str += "," + vendor.viNum+ vendor.viName+ vendor.viDesc+ vendor.viAddress+ vendor.viPhone+ vendor.viCredat+ vendor.viCretim
		}
		$("#r_div").html(str);
	}
	$(document).ready(function() {
		$("input[type='button']").click(function() {
			var au = new AjaxUtil("vendor/vendor_list"); 
			au.setCallbackSuccess(callback);
			au.send();
		})
	})  
</script> 
<br><p /><br><p /><br><p />
<form action="${rootPath}/vendor/vendor_list" method="post"> 
	<input type="button" value="전송" />

</form>
<div id = "r_div">
</div>

</body>
</html>