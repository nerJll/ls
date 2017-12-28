package com.aixu.service;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.aixu.bean.AixuBaseLawsuit;
import com.aixu.util.DateUtil;

@Service
public class TestPoiService {
	String[] excelHeader = {"客诉单编码", "客户名称", "客户编码", "产品型号", "是否需要报告", "投诉数量", "投诉日期", "客户处理状态", "风险品处理状态", "整改状态", "责任认定状态"};
	
	public XSSFWorkbook export(List<AixuBaseLawsuit> list) {
		 // 如果是 Offices 2007以前的Excel版本，new的对象是：**HSSFWorkbook** ，Offices 2007以后的Excel版本new的对象才是XSSFWorkbook
        XSSFWorkbook wb = new XSSFWorkbook();  
        // 生成一个工作表
        Sheet sheet = wb.createSheet("客诉状态表");
        // 生成第一行
        Row row = sheet.createRow((int) 0);    
        // 生成单元格的样式style
        XSSFCellStyle style = wb.createCellStyle();    
        style.setAlignment(CellStyle.ALIGN_CENTER);

        for (int i = 0; i < excelHeader.length; i++) {
            //获取每一个单元格
            Cell cell = row.createCell(i);    
            //给单元格赋值
            cell.setCellValue(excelHeader[i]);    
            //设置单元格的样式
            cell.setCellStyle(style);
        }    

        for (int i = 0; i < list.size(); i++) {    
            //得到当前行数的下一行（row.getRowNum()：得到当前行数）
            row = sheet.createRow(row.getRowNum() + 1);    
            AixuBaseLawsuit lawsuit = list.get(i);    
            //赋值
            //客诉单编码", "客户名称", 
            //"客户编码", "产品型号", "是否需要报告", "投诉数量", "投诉日期", "客户处理状态", 
            //"风险品处理状态", "整改状态", "责任认定状态"
            row.createCell(0).setCellValue(lawsuit.getLawsuitNo());    
            row.createCell(1).setCellValue(lawsuit.getCustomName());    
            row.createCell(2).setCellValue(lawsuit.getCustomNo());    
            row.createCell(3).setCellValue(lawsuit.getProductType());    
            row.createCell(4).setCellValue(lawsuit.getIsNeedRep());    
            row.createCell(5).setCellValue(lawsuit.getComplainMount());
            row.createCell(6).setCellValue(DateUtil.getDateFormat(lawsuit.getComplainDate()));
            row.createCell(7).setCellValue(lawsuit.getCustomState());
            row.createCell(8).setCellValue(lawsuit.getDangerousGoodsState());
            row.createCell(9).setCellValue(lawsuit.getReformState());
            row.createCell(10).setCellValue(lawsuit.getDutyState());
        }    
        return wb;    
    }    
}
			
