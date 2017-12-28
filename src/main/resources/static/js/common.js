/**
 * 获取项目路径信息
 */
function propath () {
	var curWwwPath = window.document.location.href
	var pathName = window.document.location.pathname
	var pos = curWwwPath.indexOf(pathName)
	var localhostPath = curWwwPath.substring(0, pos)
	var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1)
	return localhostPath + projectName
}

/**
 * 判断是否为空
 */
function emptyFun(obj){
    var obj=obj;
    if(obj==""||obj==null||obj==undefined||obj=="null"||obj=="undefined"){
        return true;
    }else{
        return false;
    }
}

/**
 * 判断是否移动设备
 */
function isMobile() {
    if (typeof this._isMobile === 'boolean') {
        return this._isMobile;
    }
    var screenWidth = this.getScreenWidth();
    var fixViewPortsExperiment = rendererModel.runningExperiments.FixViewport
            || rendererModel.runningExperiments.fixviewport;
    var fixViewPortsExperimentRunning = fixViewPortsExperiment
            && (fixViewPortsExperiment.toLowerCase() === "new");
    if (!fixViewPortsExperiment) {
        if (!this.isAppleMobileDevice()) {
            screenWidth = screenWidth / window.devicePixelRatio;
        }
    }
    var isMobileScreenSize = screenWidth < 600;
    var isMobileUserAgent = false;
    this._isMobile = isMobileScreenSize && this.isTouchScreen();
    return this._isMobile;
}

/**
 * 判断是否移动设备访问
 */
function isMobileUserAgent() {
    return (/iphone|ipod|android.*mobile|windows.*phone|blackberry.*mobile/i.test(window.navigator.userAgent.toLowerCase()));
}

/**
 * 字符串2日期
 */
function str2Date (str) {
	var fullDate = str.split('-')
	return new Date(fullDate[0], fullDate[1] - 1, fullDate[2], 0, 0, 0)
}
