<#assign ctx=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>审核1-提交品质部等其他部</title>
<meta name="renderer" content="webkit">   
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/bootstrap-select.min.css">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/fileinput.min.css">
<link rel="stylesheet" href="${ctx}/css/ccbi/c2.css" media="all">
</head>
<body>
	
	<!-- 标题头 -->
	<div id='header' class="container-fluid">
		<div class="layui-row">
			<div class="col-md-3 col-xm-3">
				<img src="${ctx}/images/lawsuit.png" width=30px height=30px>
				客户处理单 - 提交OA审批
			</div>
			<div class='col-md-1 col-xm-1 col-md-offset-7 col-xm-offset-7'>
			<button onclick='sendOA()' type="button" class="btn btn-default">各部门处理 - 提交</button>
			</div>
		</div>
	</div>
	
	<!-- 体 -->
	<div id='body' class='container'>
		<form>
		<!-- 一排 -->
		<div class='row'>
			<div class='col-md-4 col-xm-4'>
					<label>责任工厂：</label>
					<input name='dutyFactory' type='text' class='form-control' 
						value='${aixuBaseLawsuit.dutyFactory!""}' readonly>
			</div>
			<div class='col-md-4 col-xm-4'>
				<label>客户名称：</label>
				<input name='customName' type='text' class='form-control' 
						value='${aixuBaseLawsuit.customName!""}' readonly>
			</div>
			<div class='col-md-4 col-xm-4'>
				<label>客户编号：</label>
				<input name='customNo' type='text' class='form-control' 
						value='${aixuBaseLawsuit.customNo!""}' readonly>
			</div>
		</div>
		<br>
		<!-- 二排 -->
		<div class='row'>
			<div class='col-md-4 col-xm-4'>
				<label>客诉单编码：</label> 
				<input name='lawsuitNo' type='text' class='form-control' 
						value='${aixuBaseLawsuit.lawsuitNo!""}' readonly>
			</div>
			<div class='col-md-4 col-xm-4'>
					<label>投诉产品：</label>
					<input name='productType' type='text' class='form-control' 
						value='${aixuBaseLawsuit.productType!""}' readonly>
			</div>
			<div class='col-md-4 col-xm-4'>
					<label>产品编码：</label>
					<input name='productNo' type='text' class='form-control' 
						value='${aixuBaseLawsuit.productNo!""}' readonly>
			</div>
		</div>
		<br>
		<!-- 三排 -->
		<div class='row'>
			<div class='col-md-4 col-xm-4'>
				<label>投诉日期：</label> 
				<input name='complainDate' type='text' class='form-control' 
						value='${(aixuBaseLawsuit.complainDate?string("yyyy-MM-dd"))!""}' readonly>
			</div>	
			<div class='col-md-4 col-xm-4'>
					<label>销售订单号：</label>
					<input name='salesNo' type='text' class='form-control' 
						value='${aixuBaseLawsuit.salesNo!""}' readonly>
			</div>
			<div class='col-md-4 col-xm-4'>
					<label>产品批次：</label> 
					<input name='deliverSeq' type='text' class='form-control' 
						value='${aixuBaseLawsuit.deliverSeq!""}' readonly>
			</div>
		</div>
		<br>
		<!-- 四排 -->
		<div class='row'>
			<div class='col-md-4 col-xm-4'>
					<label>客户是否需要报告：</label>
					<input name='isNeedRep' type='text' class='form-control' 
						value='${aixuBaseLawsuit.isNeedRep!""}' readonly>
			</div>
			<div class='col-md-4 col-xm-4'>
					<label>申请人：</label> 
					<input name='applyName' type='text' class='form-control' 
						value='${aixuBaseLawsuit.applyName!""}' readonly>
					<!-- 申请人编号 -->
					<input name='applyNo' value='${aixuBaseLawsuit.applyNo!""}' type='hidden'>
					<input name='OAId' type='hidden'>
					<input name='company' type='hidden'>
			</div>
			<div class='col-md-4 col-xm-4'>
					<label>客诉状态：</label> 
					<input name='lawsuitDanState' type='text' class='form-control' 
						value='${aixuBaseLawsuit.lawsuitDanState!""}' readonly>
			</div>
		</div>
		<hr>

		<!-- 客诉详情 -->
		<div id='btn1' class='row'>
			<label>客诉清单&nbsp;&nbsp;</label>
		</div>
		<!-- 客诉详情表 -->
		<table id='tb1' class='table table-bordered'>
			<tr>
				<th style='width:12%'>客诉类型</th>
				<th style='width:14%'>客诉类型（具体）</th>
				<th style='width:13%'>投诉数量</th>
				<th>客诉内容描述</th>
				<th style='width:18%'>不良原因</th>
				<th style='width:15%'>内部临时对策</th>
			</tr>
			<#list aixuLawsuiDetails as aixuLawsuiDetail>
			<tr>
				<td> 
				<input name='lawsuitTpye' type='text' class='form-control' 
						value='${aixuLawsuiDetail.lawsuitTpye!""}' readonly>
				</td>
				<td>
				<input name='lawsuitTpyeDetail' type='text' class='form-control' 
						value='${aixuLawsuiDetail.lawsuitTpyeDetail!""}' readonly>
				</td>
				<td>
				<input name='complainMount' type='text' class='form-control' 
						value='${aixuLawsuiDetail.complainMount!""}' readonly>
				</td>
				<td>
				<textarea rows="5" cols="10"
						name='productDesc' class='form-control' 
						readonly>${aixuLawsuiDetail.productDesc!""}</textarea>
				</td>
				<td>
				<textarea rows="5" cols="10"
						name='badReason' class='form-control' 
						readonly>${aixuLawsuiDetail.badReason!""}</textarea>
				</td>
				<td>
				<textarea rows="5" cols="10"
						name='innerStrategy' class='form-control' 
						readonly>${aixuLawsuiDetail.innerStrategy!""}</textarea>
				</td>
			</tr>
			</#list>
		</table>
		
		<hr>
		<div id='fujian'>
			<div class='row'>
				<label>附件</label>
			</div>
			<#list fileSrcs as fileSrc>
				<img src="${ctx}/files/${fileSrc}" width=300px height=200px>
			</#list>
			<!-- <input type='text' class='form-control' value='${aixuBaseLawsuit.fileSrc}' readonly/> -->
		</div>
		
		<hr>
		<!-- 客户处理 -->
		<div id='khcl' class='row'>
			<label>客户处理&nbsp;&nbsp;</label>
		</div>
		<table id='tb2' class='table table-bordered'>
			<tr>
				<th style='width:10%'></th>
				<th colspan="2">客户要求</th>
				<th colspan="2">判定结果</th>
				<th style='width:15%'></th>
			</tr>
			<tr>
				<th>方式</th>
				<th>降档</th>
				<th>数量</th>
				<th>降档</th>
				<th>数量</th>
				<th>计划完成时间</th>
			</tr>
			<#list aixuCustomDos as aixuCustomDo>
			<tr>
				<td>
				<input name='type' type='text' class='form-control' 
						value='${aixuCustomDo.type!""}' readonly>
				</td>
				<td>
				<input name='customReduce' type='text' class='form-control' 
						value='${aixuCustomDo.customReduce!""}' readonly></td>
				<td>
				<input name='customMount' type='text' class='form-control' 
						value='${aixuCustomDo.customMount!""}' readonly></td>
				<td>
				<input name='judgeReduce' type='text' class='form-control' 
						value='${aixuCustomDo.judgeReduce!""}' readonly></td>
				<td>
				<input name='judgeMount' type='text' class='form-control' 
						value='${aixuCustomDo.judgeMount!""}' readonly></td>
				<td>
				<input name='planDate' type='text' class='form-control' 
						value='${(aixuCustomDo.planDate?string("yyyy-MM-dd"))!""}' readonly>
				</td>
			</tr>
			</#list>
		</table>
		</form>
	</div>
	

	<script type="text/javascript" src='${ctx}/js/jquery/jquery-3.2.1.min.js'></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/bootstrap-select.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/bootstrap-datetimepicker.min.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/fileinput.min.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/locales/zh.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/locales/defaults-zh_CN.js"></script>
	<script type="text/javascript" src='${ctx}/js/ccbi/PerfectLoad.js'></script>
	<script type="text/javascript" src='${ctx}/js/ccbi/c2.js'></script>
	<script type="text/javascript" src='${ctx}/js/ccbi/file.js'></script>
	<script>
		var hasSend = true
	
		var lawsuitId = ''
		var OAId = ''
		var company = ''
		$(function(){
			lawsuitId = '${aixuBaseLawsuit.id}'
			$.ajax({
				url:'http://portal.aikosolar.com/aiko-oa/oaInerface/getHrmResource?loginid='+${userId},
				type:'get',
				success:function(data){
					OAId = data.data.id
					company = data.data.subcompanyname.substring(0,4)
				}
			})
		})
		function sendOA(){
			if(hasSend){
				$.ajax({
					url: '${ctx}/exam1/sendOA1',
					type: 'post',
					data: {
						'infoId': lawsuitId,
						'OAId': OAId,
						'company': company
					},
					beforeSend: function () {
				    	$.bootstrapLoading.start({ loadingTips: "" })
				        // 禁用按钮防止重复提交
				        //$("#submit").attr({ disabled: "disabled" });
				    },
					success: function(data){
						alert(data.message)
						if(data.status == '1'){
							hasSend = false
							var url = '${ctx}/exam1/checkAndMaintKHCL'
					       	var form = $("<form></form>").attr("action", url).attr("method", "post")
					       	form.append($("<input></input>").attr("type", "hidden").attr("name", "lawsuitId").attr("value", data.data))
					       	form.appendTo('body').submit().remove()
						}
					},
					complete: function () {
				    	 $.bootstrapLoading.end()
				        //$("#submit").removeAttr("disabled");
				    },
				    error: function(data){
				    	alert('数据提交失败')
				    }
				    
				})
			}else{
				alert('请不要重复提交')
			}
			
		}
	</script>
</body>
</html>