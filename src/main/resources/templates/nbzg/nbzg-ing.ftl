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
			<!--<div class='col-md-1 col-xm-1 col-md-offset-8 col-xm-offset-8'>
			<button onclick='sendOA()' type="button" class="btn btn-default">提交OA</button>
			</div>-->
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
				</tr>
				<#list aixuBaseLawsuit.zd3 as AixuNbfxpcl>
				<tr>
					<td>
						${AixuNbfxpcl.nbfxpclPl}
					</td>
					<td>
						${AixuNbfxpcl.nbfxpclXh}
					</td>
					<td>
						${AixuNbfxpcl.nbfxpclSl}
					</td>
					<td>
						${AixuNbfxpcl.nbfxpclKw}
					</td>
				</tr>
				</#list>
			</table>
		</div>
		</form>
	</div>
	<#include "../base/common-js.ftl">
</body>
</html>