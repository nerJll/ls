<#assign ctx=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>send</title>
<meta name="renderer" content="webkit">   
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

<script type="text/javascript" src='${ctx}/js/jquery/jquery-3.2.1.min.js'></script>
<script>
$(function(){
	var url = '${ctx}/exam1/index'
   	var form = $("<form></form>").attr("action", url).attr("method", "post");
   	form.append($("<input></input>").attr("type", "hidden").attr("name", "lawsuitId").attr("value", 'c14db66383c84237b8531ca2bb8f9804'));
   	form.appendTo('body').submit().remove();
})
</script>
</body>
</html>