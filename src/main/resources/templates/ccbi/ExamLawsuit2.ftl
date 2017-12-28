<#assign ctx=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>审核2-提交品质部等其他部</title>
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
			<div class="col-md-6 col-xm-6">
				<img src="${ctx}/images/lawsuit.png" width=30px height=30px>
				客户处理单 — 状态维护
				<button onclick='nbcl()' type="button" class="btn btn-primary">内部处理</button>
				<button onclick='zrrd()' type="button" class="btn btn-info">责任认定</button>
			</div>
			<div class='col-md-1 col-xm-1 col-md-offset-5 col-xm-offset-5'>
			<button id='sendWMS' onclick='sendWMS()' type="button" class="btn btn-default">提交WMS</button>
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
		<div class="progress progress-striped active">
         <div id='jdt' class="progress-bar progress-bar-success" 
         	role="progressbar" aria-valuenow="" aria-valuemin="0" aria-valuemax="100"></div>
		 </div>
		<table id='tb2' class='table table-bordered'>
			<tr>
				<th style='width:8%'></th>
				<th style='width:20%' colspan="2">客户要求</th>
				<th style='width:20%' colspan="2">判定结果</th>
				<th style='width:13%'></th>
				<th colspan="2">OQC</th>
				<th style='width:10%'></th>
			</tr>
			<tr>
				<th>方式</th>
				<th style='width:8%'>降档</th>
				<th>数量</th>
				<th style='width:8%'>降档</th>
				<th>数量</th>
				<th>计划完成时间</th>
				<th>OQC检验判定</th>
				<th>处理结果</th>
				<th>处理状态</th>
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
				<td>
				<textarea rows="5" cols="20"
						name='oqcJudge' class='form-control' 
						readonly>${aixuCustomDo.oqcJudge!""}</textarea>
				</td>
				<td>
				<textarea rows="5" cols="20"
						name='oqcResult' class='form-control' 
						readonly>${aixuCustomDo.oqcResult!""}</textarea>
				</td>
				<td>
				<select name="handleState" class="selectpicker form-control">
				<option></option>
				<option value='未完成'>未完成</option>
				<option value='审批中'>审批中</option>
				<option value='已完成'>已完成</option>
				</select>
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
		var hasSend = true	//是否提交过
	
		var lawsuitId = ''	//客诉id
		var OAId = ''		//OAID
		var company = ''	//公司
		
		$(function(){
			
			if('${aixuBaseLawsuit.lawsuitDanState}' == 'WMS处理中'){	//若已提交WMS则不能再次提交
				$('#sendWMS').attr('disabled',true)
			}
			
			jtjdgb()	//监听进度改变
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
		
		//监听进度
		function jtjdgb(){
			var trgs = $("#tb2 tr").length-2
			var ywc = 0
			//console.log(trgs)
			$('select[name=handleState]').bind("change", function(){
				$('select[name=handleState]').each(function(i){
					var state = $(this).val()
					if(state == '已完成'){
						ywc++
					}
				})
				
				var bfb = (parseInt(ywc)/parseInt(trgs)).toFixed(2)*100
				
				if(bfb == 100){
					$('#jdt').css('color','blue')
				}
				
				$('#jdt').css('width',bfb+'%')		//设置进度
				$('#jdt').html(bfb+'%')
				ywc=0
				/* var state = $(this).parents('tr').find('select[name=handleState]').val()
				if(state=='已完成'){
					$('#jdt').css('width','100%')
					$('#jdt').html('100')
				}else{
					$('#jdt').css('width','0%')
					$('#jdt').html('0%')
				} */
				
				//console.log(name)
			})
		}
		
		//提交WMS
		function sendWMS(){
			//取到将要发送的信息，等待发送
			console.log('个人信息：'+lawsuitId+'\n'+OAId+'\n'+company)
			console.log('客诉基本信息：'+'${aixuBaseLawsuit}')
			console.log('客诉详情信息：'+'${aixuLawsuiDetails?size}')
			console.log('客户处理信息：'+'${aixuCustomDos?size}')
			if(hasSend){
				$('#sendWMS').attr('disabled',true)
				hasSend = false
				alert('提交成功！')
			}
			
			/* if(hasSend){
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
							var url = propath() + '/exam1/checkAndMaintKHCL'
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
			}*/
			
		} 
		
		//跳转责任认定
		function zrrd(){
			$.ajax({
				url: '${ctx}/common/getSfla',
				type: 'post',
				data: {
					'lawsuitId': '${aixuBaseLawsuit.id}'
				},
				beforeSend: function () {
			    	$.bootstrapLoading.start({ loadingTips: "" })
			        // 禁用按钮防止重复提交
			        //$("#submit").attr({ disabled: "disabled" });
			    },
				success: function(data){	
					if(data.data == '' || data.data == null){
						alert('立案审批中，请等待')
					}else if(data.data == '否'){
						alert('立案审批不通过，无法创建责任认定')
					}else if(data.data == '是'){
						var url = '${ctx}/zrrd/index'
						var form = $("<form></form>").attr("action", url).attr("method", "post").attr("target", "_blank")
						form.append($("<input></input>").attr("type", "hidden").attr("name", "lawsuitId").attr("value", '${aixuBaseLawsuit.id}'))
						form.appendTo('body').submit().remove()
					}
				},
				complete: function () {
			    	 $.bootstrapLoading.end()
			        //$("#submit").removeAttr("disabled");
			    }
			})
		}
		//跳转内部处理
		function nbcl(){
			var url = '${ctx}/reform/to-nbzg'
			var form = $("<form></form>").attr("action", url).attr("method", "post").attr("target", "_blank")
			form.append($("<input></input>").attr("type", "hidden").attr("name", "baseId").attr("value", '${aixuBaseLawsuit.id}'))
			form.appendTo('body').submit().remove()
		}
	</script>
</body>
</html>