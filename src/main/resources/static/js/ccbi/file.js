//获取文件名并发送
$("#f_upload").on("filebatchselected", function(event, files) {
	var file = $("#f_upload").val().split('\\')
	var fileName1 = file[file.length-1]
	$.ajax({
		url: propath() + '/ccbaseinfo/postFileName',
		type: 'put',
		data: {
			'filename': fileName1
		},
		success: function(data){
			console.log(data.massage)
		}
	})
})
// 文件上传
$("#f_upload").fileinput({
	uploadUrl : propath() + "/ccbaseinfo/uploadFile", // 上传的地址
	// deleteUrl : propath() + "/ccbaseinfo/deleteFile", // 删除文件的地址
	type : 'post',
	uploadAsync : true, // 默认异步上传
	showUpload : true, // 是否显示上传按钮,跟随文本框的那个
	showRemove : false, // 显示移除按钮,跟随文本框的那个
	showCaption : true,// 是否显示标题,就是那个文本框
	showPreview : true, // 是否显示预览,不写默认为true
	dropZoneEnabled : false,// 是否显示拖拽区域，默认不写为true，但是会占用很大区域
	maxFileSize : 98 * 1024,// 单位为kb，如果为0表示不限制文件大小
	maxFileCount : 1, // 表示允许同时上传的最大文件个数
	removeLabel : true,
	language : 'zh',
	textEncoding : 'utf-8',
	enctype : 'multipart/form-data', // 文件类型
	fileActionSettings : { // 缩略图上面的按钮
		showUpload : false,
		showRemove : false,	//删除
		showZoom : true		//放大
	}
/*
 * minImageWidth: 50, //图片的最小宽度 minImageHeight: 50,//图片的最小高度
 * maxImageWidth:1000,//图片的最大宽度 maxImageHeight: 1000,//图片的最大高度 minFileCount: 0,
 * validateInitialCount : true, previewFileIcon : "<i class='glyphicon
 * glyphicon-king'></i>", msgFilesTooMany : "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
 * allowedFileTypes : [ 'image' ],//配置允许文件上传的类型 allowedPreviewTypes : [
 * 'image'],//配置所有的被预览文件类型 allowedPreviewMimeTypes : [ 'jpg', 'png',
 * 'gif'],//控制被预览的所有mime类型
 */
})

// 异步上传返回结果处理
$("#f_upload").on("fileuploaded", function(event, data, previewId, index) {
	// console.log('获取文件：'+$('#f_upload').val())
	console.log("上传成功")
	var src = $('input[name=fileSrc]').val()						//获取之前的文件路径
	$('input[name=fileSrc]').val(src + data.response.data + ',')	//存储现在的文件路径
	// var res = data.response.data.split(',')
	// console.log(res[0] + '\n' + res[1])
	// console.log('总的文件：'+$("#f_upload").val())
})

//删除文件
$("#f_upload").on("filesuccessremove", function(event, data, previewId, index) {
	console.log(event)
	console.log(data)
	console.log(previewId)
	console.log(index)
})

//获取项目路径
function propath() {
	var curWwwPath = window.document.location.href
	var pathName = window.document.location.pathname
	var pos = curWwwPath.indexOf(pathName)
	var localhostPath = curWwwPath.substring(0, pos)
	var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1)
	return localhostPath + projectName
}