//启动函数
$(function() {
	//判断IE
	isIE()
	//日历控件
	canlader()
	//监听客诉类型下拉框改变事件
	bindKslxChange1()
	//监听客户处理方式下拉框改变事件
	bindKslxChange2()
	//监听客户要求数量改变
	khyqslgb()
	//监听客户名称改变
	khmcgb()
	//监听投诉产品改变
	tscpgb()
	//监听责任工厂的改变
	zrgcgb()
	//监听判定结果数量改变
	pdjgslgb()
	//客户编号赋初值
	khbhfcz()
	//投诉产品赋初值
	tscpfcz()
})

//判断IE
function isIE(){
	//不支持IE Edge
	 var UA =  userAgent || navigator.userAgent;
     if(/msie/i.test(UA)){
    	 alert('当前浏览器不支持访问本站，请更换其他浏览器（谷歌，360，火狐..）')
     }else if(~UA.toLowerCase().indexOf('trident') && ~UA.indexOf('rv')){
    	 alert('当前浏览器不支持访问本站，请更换其他浏览器（谷歌，360，火狐..）')
     }
     var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串
     var isIE1 = userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1 && !isOpera; //判断是否IE浏览器
     var isEdge = userAgent.indexOf("Edge") > -1 //判断是否IE的Edge浏览器
     if(isIE1 || isEdge){
		alert('当前浏览器不支持访问本站，请更换其他浏览器（谷歌，360，火狐..）')
     }
     if (window.navigator.userAgent.indexOf("MSIE")>=1) {
    	 alert('当前浏览器不支持访问本站，请更换其他浏览器（谷歌，360，火狐..）')
     }
	
     if (!!window.ActiveXObject || "ActiveXObject" in window){
    	 alert('当前浏览器不支持访问本站，请更换其他浏览器（谷歌，360，火狐..）')
     }
}

//添加一行客诉详情
function addTr1(){
	var html = '<tr>'	//行内容
				+ '<td>'+ '<input class="checkbox" type="checkbox">' + '</td>'
				+ '<td> <select name="lawsuitTpye" class="form-control">'
				+'<option></option>'
				+'<option value="EL">EL</option>'
				+'<option value="电性能">电性能</option>'
				+'<option value="外观不良">外观不良</option>'
				+'<option value="可靠性">可靠性</option>'
				+'<option value="其他">其他</option>'
				+'</select></td>'
				+ '<td><select name="lawsuitTpyeDetail" class="form-control">'+
				+'</select></td>'
				+ '<td><input name="complainMount" type=number class=form-control onkeyup=this.value=this.value.replace(/\D/g,"")></td>'
				+ '<td><textarea name="productDesc" class="form-control" rows=1></textarea></td>'
				+ '</tr>'
	$('#tb1').append(html)	//添加行
	//监听客诉类型下拉框改变事件
	bindKslxChange1()
	//$.parser.parse(html)
}

//删除选中的客诉详情
function deleteTr1(){
	 $("input[class='checkbox']:checked").each(function() { // 遍历选中的checkbox
         n = $(this).parents("tr").index()  // 获取checkbox所在行的顺序
         if(n>0){
        	 $("#tb1").find("tr:eq("+n+")").remove() 
         }
         $('#check-1').prop('checked',false) 	//不选
     })
}

//全选全不选，客诉详情
function check1(){
	if($('#check-1').is(':checked')) {
		$('#tb1 :checkbox').prop('checked',true) //全选
	}else{
		$('#tb1 :checkbox').prop('checked',false) 	//全不选
	}
}

//全选全不选，客户处理
function check2(){
	if($('#check-2').is(':checked')) {
		$('#tb2 :checkbox').prop('checked',true) //全选
	}else{
		$('#tb2 :checkbox').prop('checked',false) 	//全不选
	}
}

//监听客诉类型下拉框改变事件
function bindKslxChange1(){
	$('select[name=lawsuitTpye]').bind("change", function(){
		var kslx = $(this).parents('tr').find('select[name=lawsuitTpye]').val()
		if(kslx=='EL'){
			$(this).parents('tr').find('select[name="lawsuitTpyeDetail"]').empty().append(
				'<option value="EL断栅">EL断栅</option>'	   
				+'<option value="EL裂痕">EL裂痕</option>'	   
				+'<option value="EL划伤">EL划伤</option>'	   
				+'<option value="EL明暗片">EL明暗片</option>'	   
				+'<option value="EL黑斑">EL黑斑</option>'	   
				+'<option value="EL黑边">EL黑边</option>'	   
				+'<option value="EL黑片">EL黑片</option>'	   
				+'<option value="石墨框印">石墨框印</option>'	   
				+'<option value="EL气流片">EL气流片</option>'	   
				+'<option value="EL四角发黑">EL四角发黑</option>'	   
			)
		}else if(kslx=='电性能'){
			$(this).parents('tr').find('select[name="lawsuitTpyeDetail"]').empty().append(
					'<option value="效率不良">效率不良</option>'	   
					+'<option value="RS不良">RS不良</option>'	   
					+'<option value="漏电流不良">漏电流不良</option>'	   
				)
		}else if(kslx=='外观不良'){
			$(this).parents('tr').find('select[name="lawsuitTpyeDetail"]').empty().append(
					'<option value="色差">色差</option>'	   
					+'<option value="脏污">脏污</option>'	   
					+'<option value="崩边 缺角">崩边 缺角</option>'	   
					+'<option value="电池方向错误">电池方向错误</option>'	   
					+'<option value="厚度">厚度</option>'	   
					+'<option value="花片">花片</option>'	   
					+'<option value="色斑">色斑</option>'	   
					+'<option value="漏浆">漏浆</option>'	   
					+'<option value="铝膜发黄">铝膜发黄</option>'	   
					+'<option value="绕度发黄">绕度发黄</option>'	   
					+'<option value="外观晶格">外观晶格</option>'	   
					+'<option value="虚印">虚印</option>'	   
					+'<option value="氧化">氧化</option>'	   
					+'<option value="印刷不良">印刷不良</option>'	   
					+'<option value="针孔不良">针孔不良</option>'	   
					+'<option value="主栅偏移">主栅偏移</option>'	   
					+'<option value="包装破碎">包装破碎</option>'	   
					+'<option value="开包碎">开包碎</option>'	   
					+'<option value="制程碎">制程碎</option>'	   
				)
		}else if(kslx=='可靠性'){
			$(this).parents('tr').find('select[name="lawsuitTpyeDetail"]').empty().append(
					'<option value="LID不良">LID不良</option>'	   
					+'<option value="ML不良">ML不良</option>'	   
					+'<option value="PID不良">PID不良</option>'	   
					+'<option value="拉力不良">拉力不良</option>'	   
				)
		}else if(kslx=='其他'){
			$(this).parents('tr').find('select[name="lawsuitTpyeDetail"]').empty().append(
					'<option value="COA错误">COA错误</option>'	   
					+'<option value="标签错误">标签错误</option>'	   
					+'<option value="少片">少片</option>'	   
					+'<option value="发货错误">发货错误</option>'	   
					+'<option value="交期异常">交期异常</option>'	   
					+'<option value="包装运输不良">包装运输不良</option>'	   
					+'<option value="混料/混档">混料/混档</option>'	   
				)
		}else if(kslx==''){
			$(this).parents('tr').find('select[name="lawsuitTpyeDetail"]').empty()
		}
	})
}

//添加一行客户处理
function addTr2(){
	var html = '<tr>'	//行内容
		+ '<td><input class="checkbox" type="checkbox"></td>'
		+ '<td> <select name="type" class="form-control">'
		+ '<option></option>'
		+ '<option value="退货">退货</option>'
		+ '<option value="换货">换货</option>'
		+ '<option value="降档">降档</option>'
		+ '<option value="补片">补片</option>'
		+ '<option value="其他">其他</option>'
		+ '</select></td>'
		+ '<td><input type="text" name="customReduce" readonly class="form-control"></td>'
		+ '<td><input type="number" name="customMount" class=form-control onkeyup=this.value=this.value.replace(/\D/g,"")></td>'
		+ '<td><input type="text" name="judgeReduce" readonly class="form-control"></td>'
		+ '<td><input type="number" name="judgeMount" class=form-control onkeyup=this.value=this.value.replace(/\D/g,"")></td>'
		+ '<td><input type="text" name="planDate" class="form-control form_datetime" id="addtime" style="border-radius:5px" readonly placeholder="计划完成日期"></td>'
		+ '</tr>'
	$('#tb2').append(html)	//添加行
	canlader()	//日历
	//监听客诉类型下拉框改变事件
	bindKslxChange2()
	//监听客户要求改变
	khyqslgb()
	//监听判定结果数量的改变
	pdjgslgb()
}

//删除选中的客户处理
function deleteTr2(){
	 $("input[class='checkbox']:checked").each(function() { // 遍历选中的checkbox
         n = $(this).parents("tr").index()  // 获取checkbox所在行的顺序
         if(n>1){
        	 $("#tb2").find("tr:eq("+n+")").remove() 
         }
         $('#check-2').prop('checked',false) 	//不选
     })
}

//监听客户处理方式改变
function bindKslxChange2(){
	$('select[name=type]').bind("change", function(){
		var clfs = $(this).parents('tr').find('select[name=type]').val()
		if(clfs=='降档'){
			$(this).parents('tr').find('input[name="customReduce"]').removeAttr("readonly")
			$(this).parents('tr').find('input[name="judgeReduce"]').removeAttr("readonly")
		}else{
			$(this).parents('tr').find('input[name="customReduce"]').attr("readonly",true).val('')
			$(this).parents('tr').find('input[name="judgeReduce"]').attr("readonly",true).val('')
		}
		//console.log(clfs)
	})
}

//打印页面
function print1(){
	window.print()
} 

//监听客户处理中，客户要求数量的改变
function khyqslgb(){
	$('input[name=customMount]').bind("change", function(){
		var sl = $(this).parents('tr').find('input[name=customMount]').val()
		var clfs = $(this).parents('tr').find('select[name=type]').val()
		if(sl>200){
			$(this).parents('tr').find('input[name="judgeReduce"]').attr("readonly",true).val('')
			$(this).parents('tr').find('input[name="judgeMount"]').attr("readonly",true).val('')
		}else{
			if(clfs=='降档'){
				$(this).parents('tr').find('input[name="judgeReduce"]').removeAttr("readonly")
				$(this).parents('tr').find('input[name="judgeMount"]').removeAttr("readonly")
			}else{
				$(this).parents('tr').find('input[name="judgeMount"]').removeAttr("readonly")
			}
		}
		//console.log(sl)
	})
}

//日历控件
function canlader(){
	$('.form_datetime').datetimepicker({
		minView : "month", // 选择日期后，不会再跳转去选择时分秒
		language : 'zh-CN',
		format : 'yyyy-mm-dd',
		todayBtn : true,
		autoclose : true,
	})
}

//监听客户名称改变
function khmcgb(){
	$('select[name=customName]').bind("change", function(){
		//var name = $('select[name=customName][selected]').text()
		var name = $(this).find("option:selected").text();
		$.ajax({
			url: propath() + '/json/customer.json',  //本地json文件  源地址：http://portal.aikosolar.com/aiko-crm/sapconfig/execute?functionCode=ZSDCRM005
			type: 'get',
			success: function(data){
				for(var i=0; i<data.data.result.length; i++){
					if(name == data.data.result[i].name){
						$('input[name=customNo]').val(data.data.result[i].code)
						//console.log(1)
					}
				}
			}
		})
		//console.log(name)
	})
}

//监听投诉产品改变
function tscpgb(){
	$('select[name=productType]').bind("change", function(){
		var name = $('select[name=productType]').val()
		$.ajax({
			url: propath() + '/json/product.json',  //本地json文件  源地址：http://portal.aikosolar.com/aiko-crm/sapconfig/execute?functionCode=ZSDCRM005
			type: 'get',
			success: function(data){
				for(var i=0; i<data.data.result.length; i++){
					if(name == data.data.result[i].name){
						$('input[name=productNo]').val(data.data.result[i].code)
					}
				}
			}
		})
		//console.log(name)
	})
}

//获取项目路径
function propath() {
	var curWwwPath = window.document.location.href
	var pathName = window.document.location.pathname
	var pos = curWwwPath.indexOf(pathName)
	var localhostPath = curWwwPath.substring(0, pos)
	var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1)
	return localhostPath + projectName
}

//是否已经提交过
var isNotSend = true
//提交OA审批
function sendOA(){
	if(isNotSend){
		send()
		//isNotSend = false
	}else{
		alert('请不要重复提交')
	}
	//console.log($("form").serialize())
}

//提交Ajax
function send(){
	$.ajax({
	    type: 'post',
	    url: propath()+'/ccbaseinfo/saveAndSendOA',
	    data: $("form").serialize(),
	    //async: false,
	    beforeSend: function () {
	    	$.bootstrapLoading.start({ loadingTips: "" })
	        // 禁用按钮防止重复提交
	        //$("#submit").attr({ disabled: "disabled" });
	    },
	    success: function(data) {
	        alert(data.message)
	        if(data.status=='1'){
	        	isNotSend = false
	        	var url = propath() + '/exam1/index'
		       	var form = $("<form></form>").attr("action", url).attr("method", "post")
		       	form.append($("<input></input>").attr("type", "hidden").attr("name", "lawsuitId").attr("value", data.data))
		       	form.appendTo('body').submit().remove()
	        }
	        //window.open('http://www.baidu.com')
	    },
	    complete: function () {
	    	 $.bootstrapLoading.end()
	        //$("#submit").removeAttr("disabled");
	    },
	    error: function(data){
	    	alert('数据提交失败')
	    }
	})
}

//监听责任工厂改变
function zrgcgb1(){
	$('select[name=dutyFactory]').bind("change", function(){
		var name = $('select[name=dutyFactory]').val()
		if(name=='广东爱旭'){
			$('input[name=lawsuitNo]').val('G20171217001A')
		}else{
			$('input[name=lawsuitNo]').val('Z20171217001A')
		}
		
		//console.log(name)
	})
}

//监听判定结果数量的改变
function pdjgslgb(){
	$('input[name=judgeMount]').bind("change", function(){
		var val1 = $(this).parents('tr').find('input[name=judgeMount]').val()
		var val2 = $(this).parents('tr').find('input[name=customMount]').val()
		if(parseInt(val1) > parseInt(val2)){
			$(this).parents('tr').find('input[name=judgeMount]').val(val2)
			alert('判定结果数量不能超过客户要求数量')
		}
		//console.log(name)
	})
}

//监听责任工厂改变事件
function zrgcgb(){
	$('select[name=dutyFactory]').bind('change',function(){
		var gc = $('select[name=dutyFactory]').val()
		$.ajax({
			url: propath() + '/ccbaseinfo/getLawsuitNo?zrgc='+gc,
			trpe: 'get',
			success: function(data){
				$('input[name=lawsuitNo]').val(data.data)
			}
		})
	})
}

//客户名称赋初值
function khbhfcz(){
	$.ajax({
		url: propath() + '/json/customer.json',	//本地json文件  源地址：http://portal.aikosolar.com/aiko-crm/sapconfig/execute?functionCode=ZSDCRM005
		type: 'get',
		async: false,
		success: function(data){
			for(var i=0; i<data.data.result.length; i++){
				$('select[name=customName]').append(
						'<option value='+data.data.result[i].name+'>'+data.data.result[i].name+'</option>'
				)
			}
		}
	})
}

//投诉产品赋初值
function tscpfcz(){
	$.ajax({
		url: propath() + '/json/product.json',	//本地json文件  源地址：http://portal.aikosolar.com/aiko-crm/sapconfig/execute?functionCode=ZSDCRM004
		type: 'get',
		async: false,
		success: function(data){
			for(var i=0; i<data.data.result.length; i++){
				$('select[name=productType]').append(
						'<option value='+data.data.result[i].name+'>'+data.data.result[i].name+'</option>'
				)
			}
		}
	})
}