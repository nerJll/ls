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
				<th>产品内容描述</th>
				<th style='width:18%'>不良原因</th>
				<th style='width:15%'>内部临时对策</th>
			</tr>
			<#list aixuBaseLawsuit.zd1s as aixuLawsuiDetail>
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
			<!--<input type='text' class='form-control' value='${aixuBaseLawsuit.fileSrc}' readonly/>-->
			<#list fileSrcs as fileSrc>
				<img src="${ctx}/files/${fileSrc}" width=300px height=200px>
			</#list>
		</div>
		
		<hr>