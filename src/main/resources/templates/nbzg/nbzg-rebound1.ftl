<#assign ctx=request.contextPath />
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>OA回写1</title>
		<#include "../base/common-css.ftl" />
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
			<form action="" method="post">
				<#include "../base/common-html.ftl" />
				<!--id 隐藏域-->
				<input type="hidden" name="baseId" value="${aixuBaseLawsuit.id}" />
				<div id='btn1' class='row'>
					<label>内部风险品处理&nbsp;&nbsp;</label>
				</div>
				<div class="row">
					<table class="table table-bordered">
						<tr>
							<td></td>
							<td>产品型号</td>
							<td>数量</td>
							<td>库位</td>
							<td>处理意见</td>
							<td>意见认定部门</td>
							<td>处理结果</td>
							<td>风险处理部门</td>
							<td>状态</td>
						</tr>
						<#list dangrous as dg>
						<tr>
							<td>${dg.nbfxpclPl}</td>
							<td>${dg.nbfxpclXh}</td>
							<td>${dg.nbfxpclSl}</td>
							<td>${dg.nbfxpclKw}</td>
							<td>${dg.nbfxpclClyj}</td>
							<td>${dg.nbfxpclRdbm}</td>
							<td>${dg.nbfxpclCljg}</td>
							<td>${dg.nbfxpclClbm}</td>
							<td>
								<select name="nbfxpclZt" class="form-control zt" value="${dg.nbfxpclZt!''}" >
								    <option value="未隔离" <#if (((${dg.nbfxpclZt})!'') == '未隔离')>selected="selected"</#if> > 未隔离 </option>
								    <option value="未评估" <#if (((${dg.nbfxpclZt})!'') == '未评估')>selected="selected"</#if> > 未评估 </option>
								    <option value="未处理" <#if (((${dg.nbfxpclZt})!'') == '未处理')>selected="selected"</#if> > 未处理 </option>
								    <option value="已处理" <#if (((${dg.nbfxpclZt})!'') == '已处理')>selected="selected"</#if> > 已处理 </option>
								</select>
							</td>
						</tr>
						</#list>
					</table>
				</div>
				<hr />
				<!--整改对策-->
				<div id='btn1' class='row'>
					<label>整改对策&nbsp;&nbsp;</label>
				</div>
				<div class="row">
					<table class="table table-bordered">
						<tr>
							<td>序号</td>
							<td>类型</td>
							<td>方案</td>
							<td>责任部门</td>
							<td>责任人</td>
							<td>完成时间</td>
							<td>状态</td>
						</tr>
						<#list dcs as dc>
						<tr>
							<td>${dc.nbzgdcXh}</td>
							<td>${dc.nbzgdcLx}</td>
							<td>${dc.nbzgdcFa}</td>
							<td>${dc.nbzgdcZrbm}</td>
							<td>${dc.nbzgdcZrr}</td>
							<td>${dc.nbzgdcWcsj}</td>
							<td>${dc.nbzgdcZt}</td>
						</tr>	
						</#list> 
					</table>
				</div>
				<!--效果验证-->
				<div id='btn1' class='row'>
					<label>效果验证&nbsp;&nbsp;</label>
				</div>
				<div class="row">
					<table class="table table-bordered">
						<tr>
							<td>类型</td>
							<td>验证结果</td>
							<td>责任部门</td>
							<td>责任人</td>
							<td>完成时间</td>
							<td>状态</td>
						</tr>
						<#list xgyzs as xgyz>
						<tr>
							<td>${xgyz.nbzgxgyzLx}</td>
							<td>${xgyz.nbzgxgyzYzjg}</td>
							<td>${xgyz.nbzgxgyzZrbm}</td>
							<td>${xgyz.nbzgxgyzZrr}</td>
							<td>${xgyz.nbzgxgyzWcsj}</td>
							<td>${xgyz.nbzgxgyzZt}</td>
						</tr>	
						</#list> 
					</table>
				</div>
			</form>
		</div>
		
		<#include "../base/common-js.ftl" />
	</body>

</html>