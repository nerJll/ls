<#assign ctx=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客诉基本信息</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/bootstrap-select.min.css">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/fileinput.min.css">
<link rel="stylesheet" href="${ctx}/css/ccbi/c1.css" media="all">
</head>
<body>
	<!-- 标题头 -->
	<div id='header' class="container-fluid">
		<div class="layui-row">
			<div class="layui-col-md3">
				<a href='${ctx}/ccbaseinfo/toAddBaseInfo'>
					<img src="${ctx}/images/lawsuit.png" width=30px height=30px>
					基本信息</a>
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
					<select name='dutyFactory' class="selectpicker show-tick form-control"
				 	required data-live-search="true">
						<option></option>
						<option value='广东爱旭'>广东爱旭</option>
						<option value='浙江爱旭'>浙江爱旭</option>
					</select>
			</div>
			<div class='col-md-4 col-xm-4'>
				<label>客户名称：</label>
				<select name='customName' class="selectpicker show-tick form-control"
				 required data-live-search="true">
					<option></option>
				</select>
			</div>
			<div class='col-md-4 col-xm-4'>
				<label>客户编号：</label>
				<input name='customNo' type="text" class="form-control" 
				readonly placeholder="客户编号">
			</div>
		</div>
		<br>
		<!-- 二排 -->
		<div class='row'>
			<div class='col-md-4 col-xm-4'>
				<label>客诉单编码：</label> 
				<input type="text" class="form-control"
				name='lawsuitNo' placeholder="客诉单编码" >
			</div>
			<div class='col-md-4 col-xm-4'>
					<label>投诉产品：</label>
					<select name='productType' class="selectpicker show-tick form-control"
					required data-live-search="true">
						<option></option>
					</select>
			</div>
			<div class='col-md-4 col-xm-4'>
					<label>产品编码：</label>
					<input name='productNo' type="text" class="form-control" 
					readonly placeholder="产品编码">
			</div>
		</div>
		<br>
		<!-- 三排 -->
		<div class='row'>
			<div class='col-md-4 col-xm-4'>
				<label>投诉日期：</label> 
        		  <input name='complainDate' type="text" class="form-control form_datetime" 
        			 readonly placeholder="投诉日期">
        		  <!-- 日历控件js控制 -->
			</div>	
			<div class='col-md-4 col-xm-4'>
					<label>销售订单号：</label>
					<input name='salesNo' type="text" class="form-control">
			</div>
			<div class='col-md-4 col-xm-4'>
					<label>产品批次：</label> 
					<input name='deliverSeq' type="text" class="form-control"
					placeholder="产品批次">
			</div>
		</div>
		<br>
		<!-- 四排 -->
		<div class='row'>
			<div class='col-md-4 col-xm-4'>
					<label>客户是否需要报告：</label>
					<select name='isNeedRep' class="selectpicker show-tick form-control"
					required data-live-search="true">
						<option></option>
						<option value='是'>是</option>
						<option value='否'>否</option>
					</select>
			</div>
			<div class='col-md-4 col-xm-4'>
					<label>申请人：</label> 
					<input name='applyName' type="text" class="form-control" 
						 readonly>
					<!-- 申请人编号 -->
					<input name='applyNo' type='hidden'>
					<input name='OAId' type='hidden'>
					<input name='company' type='hidden'>
			</div>
		</div>
		<hr>
		
		<!-- 客诉详情 -->
		<div id='btn1' class='row'>
			<label>客诉清单&nbsp;&nbsp;</label>
			<button onclick='addTr1()' type="button" class="btn btn-success">+</button>
			<button onclick='deleteTr1()' type="button" class="btn btn-danger">-</button>
		</div>
		<!-- 客诉详情表 -->
		<table id='tb1' class='table table-bordered'>
			<tr>
				<th style='width:5%'>
					 <input id='check-1' onclick='javascript:check1()' class='checkbox' type="checkbox">
				</th>
				<th style='width:12%'>客诉类型</th>
				<th style='width:14%'>客诉类型（具体）</th>
				<th style='width:13%'>投诉数量</th>
				<th>客诉内容描述</th>
			</tr>
			<#list 1..2 as i>
			<tr>
				<td><input class="checkbox" type="checkbox"></td>
				<td> <select name="lawsuitTpye" class="selectpicker form-control">
				<option></option>
				<option value='EL'>EL</option>
				<option value='电性能'>电性能</option>
				<option value='外观不良'>外观不良</option>
				<option value='可靠性'>可靠性</option>
				<option value='其他'>其他</option>
				</select></td>
				<td><select name="lawsuitTpyeDetail" class="form-control">
				</select></td>
				<td><input name='complainMount' type=number class=form-control onkeyup='this.value=this.value.replace(/\D/g,"")'></td>
				<!-- <td><input name='complainMount' type=number class=form-control onkeyup='this.value=this.value.replace(/\D/g,"")'></td> -->
				<td><textarea name='productDesc' class="form-control" rows=1></textarea></td>
			</tr>
			</#list>
		</table>
	
		<hr>
		<!-- 客户处理 -->
		<div id='khcl' class='row'>
			<label>客户处理&nbsp;&nbsp;</label>
			<button onclick='addTr2()' type="button" class="btn btn-success">+</button>
			<button onclick='deleteTr2()' type="button" class="btn btn-danger">-</button>
		</div>
		<table id='tb2' class='table table-bordered'>
			<tr>
				<th style='width:5%'></th>
				<th style='width:10%'></th>
				<th colspan="2">客户要求</th>
				<th colspan="2">判定结果</th>
				<th style='width:15%'></th>
			</tr>
			<tr>
				<th><input id='check-2' onclick='javascript:check2();' class='checkbox' type="checkbox"></th>
				<th>方式</th>
				<th>降档</th>
				<th>数量</th>
				<th>降档</th>
				<th>数量</th>
				<th>计划完成时间</th>
			</tr>
			<#list 1..2 as i>
			<tr>
				<td><input class="checkbox" type="checkbox"></td>
				<td> <select name="type" class="selectpicker form-control">
				<option></option>
				<option value='退货'>退货</option>
				<option value='换货'>换货</option>
				<option value='降档'>降档</option>
				<option value='补片'>补片</option>
				<option value='其他'>其他</option>
				</select></td>
				<td><input name='customReduce' type='text' readonly class='form-control'></td>
				<td><input name='customMount' type='number' class='form-control' onkeyup='this.value=this.value.replace(/\D/g,"")'></td>
				<td><input name='judgeReduce' type='text' readonly class='form-control'></td>
				<td><input name='judgeMount' type='number' class='form-control' onkeyup='this.value=this.value.replace(/\D/g,"")'></td>
				<td><input name='planDate' type="text" class="form-control form_datetime" 
        			  style='border-radius:5px'
        			  readonly placeholder="计划完成日期"></td>
			</tr>
			</#list>
		</table>
		
		<!-- 文件地址 -->
		<input name='fileSrc' type='hidden'>
		
		</form>
		
		<hr>
		<!-- 上传附件 -->
		<div id='shuangc'>
			<label>附件上传</label>
			<div class='row'>
				<input name='file' id="f_upload" type="file" class="file" multiple />
			</div>
		</div>
		
		<hr>
		<div id='footer' class='row'>
			<div class='col-md-3 col-md-offset-5'>
				<button onclick='sendOA()' type="button" class="btn btn-primary">立案判定 	- 提交</button>
				&nbsp;&nbsp;
				<button onclick='print1()' type="button" class="btn btn-warning">打印</button>
			</div>
		</div>
				
		
	<!-- body end -->
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
	<script type="text/javascript" src='${ctx}/js/ccbi/c1.js'></script>
	<script type="text/javascript" src='${ctx}/js/ccbi/file.js'></script>
	<script>
		$(function(){
			//获取登陆人申请id和公司
				$.ajax({
					url:'http://portal.aikosolar.com/aiko-oa/oaInerface/getHrmResource?loginid='+${userId},
					type:'get',
					success:function(data){
						//console.log(data.data.id+'\n'+data.data.subcompanyname)
						$('input[name=applyNo]').val(data.data.loginid)
						$('input[name=OAId]').val(data.data.id)
						$('input[name=applyName]').val(data.data.lastname)
						$('input[name=company]').val(data.data.subcompanyname.substring(0,4))
					}
				})
		})	
	</script>
</body>
</html>