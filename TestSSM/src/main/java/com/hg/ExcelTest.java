package com.hg;
import com.hg.controller.common;
import com.hg.entity.ELE_OBSERVATION;
import com.hg.service.ITestService;
import com.hg.service.imp.TestService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelTest {

    public static void main(String[] args) {
        TestService testService=new TestService();
        //读取并判断文件格式
        Workbook wb = common.getExcel("D:\\1.xls");
        if(wb==null)
            System.out.println("文件读入出错");
        else {
            testService.analyzeExcel3(wb,9);
        }
    }


}