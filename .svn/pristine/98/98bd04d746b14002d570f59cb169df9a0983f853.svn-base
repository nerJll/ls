<#assign ctx=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>内部整改</title>
<#include "../base/common-css.ftl"/>
</head>
<body>
	
	<!-- 标题头 -->
	<div id='header' class="container-fluid">
		<div class="layui-row">
			<div class="col-md-3 col-xm-3">
				<img src="${ctx}/images/lawsuit.png" width=30px height=30px>
				内部整改单
			</div>
			<div class='col-md-1 col-xm-1 col-md-offset-8 col-xm-offset-8'>
			<button onclick='sendOA()' type="button" class="btn btn-default">提交OA</button>
			</div>
		</div>
	</div>
	
	<div class="container" id="body">
		<form id="my-form" method="post" action="${ctx}/reform/save">
		<#include "../base/common-html.ftl">
		<!--id 隐藏域-->
		<input type="hidden" name="baseId" value="${aixuBaseLawsuit.id}" />
		<div id='btn1' class='row'>
			<label>内部风险品处理&nbsp;&nbsp;</label>
		</div>
		<div id="row">
			<table class="table table-bordered">
				<tr>
					<td></td>
					<td>产品型号</td>
					<td>数量</td>
					<td>库位</td>
					<!-- <td>处理意见</td>
					<td>意见认定部门</td>
					<td>处理结果</td>
					<td>风险处理部门</td>
					<td>状态</td>	 -->
				</tr>
				<tr>
					<td>
						库存品<input name='nbfxpclPl' type='hidden' class='form-control' value="库存品">
					</td>
					<td>
						<input name='nbfxpclXh' type='text' class='form-control'>
					</td>
					<td>
						<input name='nbfxpclSl' type='number' class='form-control'>
					</td>
					<td>
						<input name='nbfxpclKw' type='text' class='form-control'>
					</td>
				</tr>
				<tr>
					<td>
						在途品<input name='nbfxpclPl' type='hidden' class='form-control' value="在途品">
					</td>
					<td>
						<input name='nbfxpclXh' type='text' class='form-control'>
					</td>
					<td>
						<input name='nbfxpclSl' type='number' class='form-control'>
					</td>
					<td>
						<input name='nbfxpclKw' type='text' class='form-control'>
					</td>
				</tr>
				<tr>
					<td>
						在制品<input name='nbfxpclPl' type='hidden' class='form-control' value="在制品">
					</td>
					<td>
						<input name='nbfxpclXh' type='text' class='form-control'>
					</td>
					<td>
						<input name='nbfxpclSl' type='number' class='form-control'>
					</td>
					<td>
						<input name='nbfxpclKw' type='text' class='form-control'>
					</td>
				</tr>
				<tr>
					<td>
						客户端库存<input name='nbfxpclPl' type='hidden' class='form-control' value="客户端库存">
					</td>
					<td>
						<input name='nbfxpclXh' type='text' class='form-control'>
					</td>
					<td>
						<input name='nbfxpclSl' type='number' class='form-control'>
					</td>
					<td>
						<input name='nbfxpclKw' type='text' class='form-control'>
					</td>
				</tr>
			</table>
		</div>
		</form>
	</div>
	<#include "../base/common-js.ftl">
	<script type="text/javascript">
		function sendOA () {
			$('#my-form').submit()
		}
	</script>
</body>
</html>