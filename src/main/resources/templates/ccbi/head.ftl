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
