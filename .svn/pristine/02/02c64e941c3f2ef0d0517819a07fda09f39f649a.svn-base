<#assign ctx=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>客户换退货界面</title>
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/fileinput.min.css">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/bootstrap-select.min.css">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/js/vlidate/css/bootstrapValidator.min.css"/>
<link rel="stylesheet" type="text/css" href="${ctx}/ui/icheck/skins/flat/red.css">
<link rel="stylesheet" type="text/css" href="${ctx}/ui/bootstrap/css/fileinput.min.css">
<link rel="stylesheet" type="text/css" href="${ctx}/css/index/base.css">
</head>
<body>
	<div class="row my my-title" style="margin-bottom: 5px;">
		<div class="col-md-3" style="padding: 0 30px;">
			<h2>客户退/换货申请单</h2>
		</div>
		<div class="col-md-9" style="padding: 0 30px;">
			<button type="button" class="btn btn-warning" id="toWMS" style="color: #000000; float: right;">
				<span class="glyphicon glyphicon-send" aria-hidden="true"></span>
				提交WMS
			</button>
		</div>
	</div>
	<div class="container">
		<!--style="margin-bottom: 10px;"-->
		<form class="form-horizontal" id="my-form">
			<!--第一行-->
			<div class="row" style="margin-bottom: 5px;">
				<div class="col-md-4">
					<label for="lawsuitNo">客诉单编码：</label>
					<input type="text" class="form-control" id="lawsuitNo" name="lawsuitNo" placeholder="请输入客诉单编码">
				</div>
				<div class="col-md-4">
					<label for="customName">客户名称：</label>
					<input type="text" class="form-control" id="customName" name="customName" placeholder="请输入客户名称">
				</div>
				<div class="col-md-4">
					<label for="customNo">客户编码：</label>
					<input type="text" class="form-control" id="customNo" name="customNo" placeholder="请输入客户编码">
				</div>
			</div>
			<!--第二行-->
			<div class="row" style="margin-bottom: 5px;">
				<div class="col-md-4">
					<label for="saleNo">销售订单号：</label>
					<input type="text" class="form-control" id="saleNo" placeholder="请输入销售订单号">
				</div>
				<div class="col-md-4">
					<label for="deliverDate">发货日期：</label>
					<input type="text" class="form-control form_datetime" id="deliverDate" placeholder="请输入发货日期" readonly value="2017-12-20">
				</div>
				<div class="col-md-4">
					<label for="amount">发货数量：</label>
					<input type="number" class="form-control" id="amount" name="customNo" placeholder="请输入发货数量（片）" style="ime-mode:Disabled">
				</div>
			</div>
			<!--第三行-->
			<div class="row" style="margin-bottom: 5px;">
				<div class="col-md-4">
					<label for="complainDate">投诉日期：</label>
					<input type="text" class="form-control form_datetime" id="complainDate" readonly value="2017-12-25">
				</div>
				<div class="col-md-8 mycol" style="height: 59px;">
					<div class="row">
						<div class="col-md-3">
							<label for="aplPerson">申请类型：</label>
						</div>
						<div class="col-md-3">
							<input class="icheck" id="type2" type="radio" name="aplType" value="退货">&nbsp;&nbsp;退货
						</div>
						<div class="col-md-3">
							<input class="icheck" id="type2" type="radio" name="aplType" value="先退后换">&nbsp;&nbsp;先退后换
						</div>
						<div class="col-md-3">
							<input class="icheck" id="type2" type="radio" name="aplType" value="先换后退">&nbsp;&nbsp;先换后退
						</div>
					</div>
				</div>
			</div>
			<!--第四行-->
			<div class="row" style="margin-bottom: 5px;">
				<div class="col-md-4">
					<label for="aplPerson">申请人姓名：</label>
					<input type="text" class="form-control" id="aplPerson" placeholder="请输入申请人姓名">
				</div>
				<div class="col-md-4">
					<label for="aplType">产品编码：</label>
					<select class="form-control selectpicker" id="aplType" name="aplType" show-menu-arrow>
						<option value="">dasd</option>
						<option value="">dasd</option>
						<option value="">dasd</option>
					</select>
				</div>
				<div class="col-md-4">
					<label for="aplAmount">申请数量：</label>
					<input type="number" class="form-control" id="aplAmount" placeholder="请输入申请数量" style="ime-mode:Disabled">
				</div>
			</div>
		</form>
		<br /><!--glyphicon glyphicon-send-->
		<h4 style="color: darkgray;">申请原因/方案及明细</h4>
		<hr />
		<div id="row">
			<input id="f_upload" type="file" class="file" multiple />
		</div>
	</div>



	<script type="text/javascript" src='${ctx}/js/jquery/jquery-2.1.1.min.js'></script>
	<script type="text/javascript" src="${ctx}/js/common.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/bootstrap-datetimepicker.min.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/fileinput.min.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/bootstrap-select.min.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/locales/zh.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/vlidate/js/bootstrapValidator.min.js"></script>
	<script type="text/javascript" src="${ctx}/ui/icheck/icheck.min.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/fileinput.min.js"></script>
	<script type="text/javascript" src="${ctx}/ui/bootstrap/js/locales/zh.js"></script>
	<script src="https://cdn.bootcss.com/moment.js/2.19.4/moment.min.js"></script>
	<script type="text/javascript">
		// 日期初始化
		$(".form_datetime").datetimepicker({
			format: 'yyyy-mm-dd',
			minView: "month", //选择日期后，不会再跳转去选择时分秒 
		    language:  'zh-CN',
		    todayBtn:  1,
		    autoclose: 1,
		});
		
		// select初始化
		$('.selectpicker').selectpicker({
		    liveSearch: true,
		    liveSearchPlaceholder: '请输入产品编码',
		    showIcon: false,
		    title: '产品编码'
		});
		// radio初始化
		$('.icheck').iCheck({
   			radioClass: 'iradio_flat-red'
  		});
  		// 表单验证
  		/*$(function() {
  			$('#my-form').bootstrapValidator({
  			message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
             fields:{
             	lawsuitNo: {
             		selector: '#lawsuitNo',
             		notEmpty: {
                        message: '不能为空'
                    }
             	},
             	customName: {
             		notEmpty: {
                        message: '不能为空'
                    }
             	}
             }
  			})
  			//console.log(/^[1-9]\d*$/.test(1001.23))
  		})*/
        
       // onkeyup="value=value.replace(/[^\d]/g,'')" ng-pattern="/[^a-zA-Z]/" 
        $('#aplAmount,#amount').bind({
       		keydown: function () {
       			if (!(event.keyCode == 46) && !(event.keyCode == 8) && !(event.keyCode == 37) && !(event.keyCode == 39))
    			if (!((event.keyCode >= 48 && event.keyCode <= 57) || (event.keyCode >= 96 && event.keyCode <= 105)))
    			event.returnValue = false;
       		},
       		keyup: function () {
       			this.value = this.value.replace(/\D/g,'')
       		},
       		blur: function () {
       			this.value = this.value.replace(/\D/g,'')
       		}
        })
       
       // 日期校验$('#deliverDate').val()$('#complainDate').val()
        function judgeDate (dateOne, dateTwo) {
       	    return moment(dateOne).isBefore(dateTwo)
        }
        
        $("#f_upload").fileinput({
			language : "zh",
			uploadUrl : "${ctx}/file-upload-batch/2",
			// allowedFileExtensions: ["jpg", "png","gif",'mp4','3gp','avi','rmvb','mkv','mov']
			maxFileCount : 10,
			maxFileSize : 50 * 1024,
			/*initialPreview: [
		        '<img src='http://oybe8a57h.bkt.clouddn.com/Fg3YVF2lo2qHDDtzZYrMrCSdOTog' class='file-preview-image' alt='Desert' title='Desert'>',
		    ]*/
		});
	</script>
</body>
</html>