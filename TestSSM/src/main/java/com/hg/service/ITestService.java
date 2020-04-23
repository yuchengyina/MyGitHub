package com.hg.service;

import org.apache.poi.ss.usermodel.Workbook;

import java.util.Map;

public interface ITestService {
    public void analyzeExcel(Workbook wb,int num);
    public void analyzeExcel1(Workbook wb,int num);
    public void analyzeExcel2(Workbook wb,int num);
    public void analyzeExcel3(Workbook wb,int num);
}
