<#assign ctx=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客退</title>
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
			<div class="col-md-6 col-xm-6 col-xs-6">
				<img src="${ctx}/images/lawsuit.png" width=30px height=30px>
				背景信息
				<button onclick='toAddLawsuit()' class='btn btn-primary'>新建客诉单</button>
			</div>
			<div class='col-md-1 col-xm-1 col-xs-1 col-md-offset-5 col-xm-offset-5 col-xs-offset-3'>
			<button onclick='doScan()' class="btn btn-default">扫描</button>
			</div>
		</div>
	</div>


	<!-- 体 -->
	<div id='body' class='container'>
		<form>
		<!-- 一排 -->
		<div class='row'>
			<div class='col-md-3 col-xm-3'>
					<label>发货批次号</label>
					<input name='fhpch' type='text' class='form-control' 
						 readonly>
			</div>
			<div class='col-md-3 col-xm-3'>
					<label>发货日期</label>
					<input name='fhrq' type='text' class='form-control' 
						 readonly>
			</div>
			<div class='col-md-3 col-xm-3'>
					<label>工厂</label>
					<input name='zrgc' type='text' class='form-control' 
						 readonly>
			</div>
			<div class='col-md-3 col-xm-3'>
					<label>车间</label>
					<input name='chejian' type='text' class='form-control' 
						 readonly>
			</div>
		</div>
		<br>
		<!-- 二排 -->
		<div class='row'>
			<div class='col-md-3 col-xm-3'>
					<label>线别</label>
					<input name='xianbie' type='text' class='form-control' 
						 readonly>
			</div>
			<div class='col-md-3 col-xm-3'>
					<label>班次</label>
					<input name='banci' type='text' class='form-control' 
						 readonly>
			</div>
			<div class='col-md-3 col-xm-3'>
					<label>库位</label>
					<input name='kuwei' type='text' class='form-control' 
						 readonly>
			</div>
		</div>
		<br>
		<!-- 三排 -->
		<div class='row'>
				<label>&nbsp;&nbsp;&nbsp;OQC检验报告</label>
				<textarea 
				name='oqcjybg'
				rows="8" class='form-control' readonly></textarea>
		</div>
		<br>
		<!-- 四排 -->
		<div class='row'>
				<label>&nbsp;&nbsp;&nbsp;产品生产阶段异常信息报告</label>
				<textarea 
				name='cpscjdycxxbg'
				rows="8" class='form-control' readonly></textarea>
		</div>
		<br>
		<!-- 五排 -->
		<div class='row'>
				<label>&nbsp;&nbsp;&nbsp;BOM</label>
				<textarea 
				name='bom'
				rows="8" class='form-control' readonly></textarea>
		</div>
		</form>
	</div>	
	
	<script type="text/javascript" src='${ctx}/js/jquery/jquery-3.2.1.min.js'></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
	<script type="text/javascript" src='${ctx}/js/scan/sha1.js'></script>
	<script type="text/javascript">
		$(function(){
			//$('textarea[name=bom]').val(888)
		})
		
		var appId = ''
			var nonceStr = ''
			var timestamp = ''
			var url = ''
			var signature = ''

			$(function(){
				$.ajax({
					url: 'http://portal.aikosolar.com/aiko-wxcp/getWxJsapiSignature?agentId=1000011&secret=dnKigZtda3jCfMtUKtl_ZpFTPE2w1YSXO8Y6EPQ77UM&url='+location.href.split('#')[0],
					type: 'get',
					success: function(data){
						appId = data.appId
						nonceStr = data.nonceStr
						timestamp = data.timestamp
						url = data.url
						signature = data.signature
						var signOrigin = 'jsapi_ticket='+signature+'&noncestr='+nonceStr+'&timestamp='+timestamp+'&url='+url.split('#')[0]
						wx.config({
						      debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
						      appId: appId, // 必填，公众号的唯一标识
						      timestamp: timestamp, // 必填，生成签名的时间戳
						      nonceStr: nonceStr, // 必填，生成签名的随机串
						      signature: signature,// 必填，签名，见附录1
						      jsApiList: ['scanQRCode'] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
						})
						wx.error(function(res){
							console.log(res)
						})
					}
				})
			})

			//点击扫描按钮，扫描二维码并返回结果
			  function doScan() {
			      wx.scanQRCode({
			        needResult: 1,
			        desc: 'scanQRCode desc',
			        scanType: ["qrCode","barCode"], // 可以指定扫二维码还是一维码，默认二者都有
			        success: function (res) {
			        	var data1 = res.resultStr.substring(9,19)	//批次号
			        	//alert(data)
			        	$.ajax({
			        		url: 'http://portal.aikosolar.com/aiko-sap91/proinfo/getInfo?pch='+data1,
			        		type: 'get',
			        		success: function(data){
			        			$('input[name=fhpch]').val(data1)		//批次号
					        	$('input[name=fhrq]').val(data.data[0].bldat)	//发货日期
					        	$('input[name=zrgc]').val(data.data[0].werks == '1000'?'广东爱旭':'浙江爱旭')
					        	//$('input[name=chejian]').val('98')		//车间
					        	//$('input[name=xianbie]').val('12')		//线别
					        	//$('input[name=banci]').val('A')			//班次
					        	$('input[name=kuwei]').val(data.data[0].lgort)		//库位
					        	//$('textarea[name=oqcjybg]').val('有我呢体是疯狂的世界\r的积分函数')	//OQC报告
					        	//$('textarea[name=cpscjdycxxbg]').val(data.data[0].boms)	//BOM
					        	$('textarea[name=bom]').val(data.data[0].boms)		//信息报告
			        		}
			        	})
			        }
			      })
			  }
			  
		//跳转新增客诉单
		function toAddLawsuit(){
			location.href = '${ctx}/ccbaseinfo/toAddBaseInfo'
		}
		//界面加载后自动刷新一次额
		/* this.onload = function(){
		    if(location.href.indexOf('#reloaded')==-1){
			    location.href=location.href+'#reloaded'
			    location.reload()
		 	}
		} */
	</script>
</body>
</html>