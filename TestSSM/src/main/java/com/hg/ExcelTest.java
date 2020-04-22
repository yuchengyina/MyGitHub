package com.hg;
import com.hg.controller.common;
import com.hg.entity.ELE_OBSERVATION;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelTest {

    public static void main(String[] args) {
        ExcelTest excelTest=new ExcelTest();
        //读取文件路径
//        Workbook wb = excelTest.getExcel("D:\\a.xlsx");
        //判断文件格式
        Workbook wb = common.getExcel("D:\\1.xls");
        if(wb==null)
            System.out.println("文件读入出错");
        else {
            //进入读取方法
            excelTest.analyzeExcel(wb);
        }
    }


    public void analyzeExcel(Workbook wb){
        List list=new ArrayList<ELE_OBSERVATION>();
        //System.out.println(wb.getNumberOfSheets());
        Sheet sheet=wb.getSheetAt(4);//读取sheet(从0计数)
        int rowNum=sheet.getLastRowNum();//读取行数(从0计数)
        for(int i=0;i<=rowNum;i++){
            Row row=sheet.getRow(i);//获得行
            int colNum=row.getLastCellNum();//获得当前行的列数
            for(int j=0;j<colNum;j++){
                ELE_OBSERVATION e=new ELE_OBSERVATION();
                Cell cell=row.getCell(j);//获取单元格
                if(cell==null || cell.equals("") || cell.equals(null) || cell.toString()=="" || cell.toString()=="null"||cell.toString().length()==0){
                    System.out.print("-");
                }else{
                    if(i==0&&j==26){
                        e.setYear(cell.toString());
                    }
                    if(i==0&&j==28){
                        e.setMonth(cell.toString());

                    }
                    if(i>=3){//内容在第四行开始
                        if(j==0){
                            e.setDay(cell.toString());
                        }
                    }
                    System.out.print(cell.toString()+" ");
                }
            }
            System.out.println();
        }

    }

}