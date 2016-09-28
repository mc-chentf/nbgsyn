<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主数据-失败重新下发</title>
<script src="js/jquery-3.0.0.js" /></script>
<script src="js/datePicker/WdatePicker.js"></script>
<script type="text/javascript">
	$(function() {
		$("#reset").on("click", function() {
			var startDate = $("#startDate").val();
			var endDate = $("#endDate").val();
			console.log(startDate);
			console.log(endDate);
			$.ajax({
				type : "post",
				url : "services/MDMSENDSERVICE",
				data : {
					startDate : startDate,
					endDate : endDate
				},
				success : function(msg) {
					var code = msg.msgId;
					if(code == "000")
						$(".message").html("数量:"+msg.result.resend_count+"条，再次下发！");
					else
						$(".message").html(msg.msgDesc);
				}
			});
		});
		
		$("#find").on("click", function() {
			var startDate = $("#startDate").val();
			var endDate = $("#endDate").val();
			console.log(startDate);
			console.log(endDate);
			$.ajax({
				type : "post",
				url : "services/MDMSENDSERVICE/findSendDataCount",
				data : {
					startDate : startDate,
					endDate : endDate
				},
				success : function(msg) {
					var code = msg.msgId;
					if(code == "000")
						$(".message").html("查询到需要重新下发的数量:"+msg.result.resend_count+"条。");
					else
						$(".message").html(msg.msgDesc);
				}
			});
		});
	})
</script>
</head>
<body>
	<table>
		<tr>
			<td colspan="3">失败重发功能!!</td>
		</tr>
		<tr>
			<td width="30%">开始时间:<input type="text" id="startDate" name="startDate" class="serach-text"
					onClick="WdatePicker()" readonly="readonly" /></td>
			<td width="30%">结束时间:<input type="text" id="endDate" name="endDate" class="serach-text"
					onClick="WdatePicker()" readonly="readonly" /></td>
			<td width="30%"><input type="button" value="查询 " id="find"><input type="button" value="重发" id="reset" style="margin-left: 20px;"></td>
		</tr>
		<tr>
			<td colspan="3">信息</td>
		</tr>
		<tr>
			<td class="message" colspan="3"></td>
		</tr>
	</table>
</body>
</html>