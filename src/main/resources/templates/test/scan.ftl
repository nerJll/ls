<#assign ctx=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>title</title>
<meta name="renderer" content="webkit">   
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script type="text/javascript" src='${ctx}/js/jquery/jquery-3.2.1.min.js'></script>
<script type="text/javascript" src='${ctx}/js/scan/sha1.js'></script>
<script type="text/javascript">
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
		        	var data = res.resultStr.substring(9,19)
		        	alert(data)
		        }
		      })
		  }
		  
	</script>
</head>
<body>
<div>
	<div style="padding-top: 20px;">
		<div class="row">
			 <div class="col-xs-4 col-sm-4"></div>
			 <div class="col-xs-4 col-sm-34">
				<img alt="二维码" src="http://weixin.aikosolar.com:888/ak_wx/images/front/aikoewm.png"  class="img-rounded" style="height: 100px; width: 100px; display: block;">
			</div>
			<div class="col-xs-4 col-sm-4"></div>
		</div>
		<div class="row">
			<div class="col-xs-12 col-sm-12"><center><span style="color: blue;font-size: 20px;">广东爱旭科技企业号</span></center></div>
		</div>
		<div class="row" style="padding-top: 30px">
			 <div class="col-xs-4 col-sm-4"></div>
			 <div class="col-xs-4 col-sm-4">
			 	<input id='scanQRCode' class="btn btn-warning" type="button" onclick="doScan()" value="点击进行扫描"/>
			 </div>
			 <div class="col-xs-4 col-sm-4"></div>
		</div>
	</div>
</div>
	
			
			
	
	<div id="loading2" class="modal" style="top:40%;">
				<div class="cssload-loader-div"  style="left:45%;">
				<div class="cssload-inner cssload-one"></div>
				<div class="cssload-inner cssload-two"></div>
				<div class="cssload-inner cssload-three"></div>
				</div>
			
		</div>
</body>
</html>