package com.hg.service.imp;

import com.hg.entity.ELE_OBSERVATION;
import com.hg.service.ITestService;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestService implements ITestService {
    //表样2、3、4、5、7、8
    public void analyzeExcel(Workbook wb,int num){
        List list=new ArrayList<ELE_OBSERVATION>();
        Map map1=getYear(wb);
        Sheet sheet=wb.getSheetAt(num);//读取sheet(从0计数)
        int rowNum=sheet.getLastRowNum();//读取行数(从0计数)
        Map map=new HashMap<String,Object>();
        for(int i=0;i<=rowNum;i++){
            Row row=sheet.getRow(i);//获得行
            int colNum=row.getLastCellNum();//获得当前行的列
            for(int j=0;j<colNum;j++){
                if(i==13||i==14||i==25||i==26){continue;}
                ELE_OBSERVATION e=new ELE_OBSERVATION();//创建对象
                Cell cell=row.getCell(j);//获取单元格
                if(cell==null || cell.equals("") || cell.equals(null) || cell.toString()=="" || cell.toString()=="null"||cell.toString().length()==0){
                    System.out.print("-");
                }else{
                    if(i>=3&&i<=37){//内容在第三行开始,38结束
                        if(j==0){map.put("day",cell.toString());}//获取日期
                        else if(j<=24){//只要24列内的信息
                            if(j!=24){
                                String w=j+"";
                                e.setHour(w);
                            }else{
                                e.setHour("00");
                            }
                            if(num==2) {
                                e.setQfe(Double.valueOf(cell.toString()));
                            }
                            if(num==3){
                                e.setQnh(Double.valueOf(cell.toString()));
                            }
                            if(num==4){
                                e.setTemp(Double.valueOf(cell.toString()));
                            }
                            if(num==5){
                                e.setRh(Double.valueOf(cell.toString()));
                            }
                            if(num==7){
                                e.setCld_sum(Double.valueOf(cell.toString()));
                            }
                            if(num==8){
                                e.setCld_l_sum(Double.valueOf(cell.toString()));
                            }
                            e.setYear((String)map1.get("year"));
                            e.setMonth((String)map1.get("month"));
                            e.setDay((String)map.get("day"));
                            list.add(e);
                        }
                    }
                    System.out.print(cell.toString()+" ");
                }

            }
            System.out.println();
        }
        for (int f=0;f<list.size();f++){
            ELE_OBSERVATION u=(ELE_OBSERVATION)list.get(f);
            if(num==2) {
                System.out.println("年份:"+u.getYear()+",月份："+u.getMonth()+"日期"+u.getDay()+",小时："+u.getHour()+",场压："+u.getQfe()+"~~~~~~");
            }
            if(num==3) {
                System.out.println("年份:"+u.getYear()+",月份："+u.getMonth()+"日期"+u.getDay()+",小时："+u.getHour()+",海压："+u.getQnh()+"~~~~~~");
            }
            if(num==4){
                System.out.println("年份:"+u.getYear()+",月份："+u.getMonth()+"日期"+u.getDay()+",小时："+u.getHour()+",温度："+u.getTemp()+"~~~~~~");
            }
            if(num==5){
                System.out.println("年份:"+u.getYear()+",月份："+u.getMonth()+"日期"+u.getDay()+",小时："+u.getHour()+",湿度："+u.getRh()+"~~~~~~");
            }
            if(num==7){
                System.out.println("年份:"+u.getYear()+",月份："+u.getMonth()+"日期"+u.getDay()+",小时："+u.getHour()+",总云量："+u.getCld_sum()+"~~~~~~");
            }
            if(num==8){
                System.out.println("年份:"+u.getYear()+",月份："+u.getMonth()+"日期"+u.getDay()+",小时："+u.getHour()+",低云量："+u.getCld_l_sum()+"~~~~~~");
            }
        }

    }
    //表样6、12
    public void analyzeExcel1(Workbook wb,int num){
        List list=new ArrayList<ELE_OBSERVATION>();
        Map map1=getYear(wb);
        Sheet sheet=wb.getSheetAt(num);//读取sheet(从0计数)
        int rowNum=sheet.getLastRowNum();//读取行数(从0计数)
        Map map=new HashMap<String,Object>();
        for(int i=0;i<=33;i++){
            Row row=sheet.getRow(i);//获得行
            int colNum=row.getLastCellNum();//获得当前行的列
            for(int j=0;j<colNum;j++){
                ELE_OBSERVATION e=new ELE_OBSERVATION();//创建对象
                Cell cell=row.getCell(j);//获取单元格
                if(cell==null || cell.equals("") || cell.equals(null) || cell.toString()=="" || cell.toString()=="null"||cell.toString().length()==0){
                    System.out.print("-");
                }else{
                    if(i>=3&&i<=37){//内容在第三行开始,38结束
                        if(j==0){map.put("day",cell.toString());}//获取日期
                        else if(j<=24){//只要24行列的信息
                            if(j!=24){
                                String w=j+"";
                                e.setHour(w);
                            }else{
                                e.setHour("00");
                            }
                            if(num==6) {
                                e.setDp(Double.valueOf(cell.toString()));
                            }
                            if(num==12) {
                                e.setVisibility(Double.valueOf(cell.toString()));
                            }
                            e.setYear((String)map1.get("year"));
                            e.setMonth((String)map1.get("month"));
                            e.setDay((String)map.get("day"));
                            list.add(e);
                        }
                    }
                    System.out.print(cell.toString()+" ");
                }

            }
            System.out.println();
        }
        for (int f=0;f<list.size();f++){
            ELE_OBSERVATION u=(ELE_OBSERVATION)list.get(f);
            if(num==6) {
                System.out.println("年份:"+u.getYear()+",月份："+u.getMonth()+"日期"+u.getDay()+",小时："+u.getHour()+",露温："+u.getDp()+"~~~~~~");
            }
            if(num==12) {
                System.out.println("年份:"+u.getYear()+",月份："+u.getMonth()+"日期"+u.getDay()+",小时："+u.getHour()+",主导能见度："+u.getVisibility()+"~~~~~~");
            }
        }

    }

    //表16
    public void analyzeExcel2(Workbook wb,int num){
        List list=new ArrayList<ELE_OBSERVATION>();
        Map map1=getYear(wb);
        Sheet sheet=wb.getSheetAt(num);//读取sheet(从0计数)
        int rowNum=sheet.getLastRowNum();//读取行数(从0计数)
        Map map=new HashMap<String,Object>();
        for(int i=0;i<=rowNum;i++){
            Row row=sheet.getRow(i);//获得行
            int colNum=row.getLastCellNum();//获得当前行的列
            for(int j=0;j<colNum;j++){
                if(i==14||i==15||i==26||i==27){continue;}
                ELE_OBSERVATION e=new ELE_OBSERVATION();//创建对象
                Cell cell=row.getCell(j);//获取单元格
                if(cell==null || cell.equals("") || cell.equals(null) || cell.toString()=="" || cell.toString()=="null"||cell.toString().length()==0){
                    System.out.print("-");
                }else{
                    if(i>3&&i<=38){//内容在第四行开始,39结束
                        if(j==0){map.put("day",cell.toString());}//获取日期
                        else if(j<=47){//47列
                            if(j!=47){
                                int p=j/2+1;
                                String w=p+"";
                                e.setHour(w);
                            }else{
                                e.setHour("00");
                            }
                            if(j!=0 && j%2!=0) {
                                e.setWind_d(cell.toString());
                                j++;
                                Cell cell1=row.getCell(j);//获取单元格
                                e.setWind_s(cell1.toString());
                            }
                            e.setYear((String)map1.get("year"));
                            e.setMonth((String)map1.get("month"));
                            e.setDay((String)map.get("day"));
                            list.add(e);
                        }
                    }
                    System.out.print(cell.toString()+" ");
                }

            }
            System.out.println();
        }
        for (int f=0;f<list.size();f++){
            ELE_OBSERVATION u=(ELE_OBSERVATION)list.get(f);
                System.out.println("年份:"+u.getYear()+",月份："+u.getMonth()+"日期"+u.getDay()+",小时："+u.getHour()+",风向："+u.getWind_d()+"风速"+u.getWind_s()+"~~~~~~");
        }

    }


    //表样9、10、11
    public void analyzeExcel3(Workbook wb,int num){
        List list=new ArrayList<ELE_OBSERVATION>();
        Map map1=getYear(wb);
        Sheet sheet=wb.getSheetAt(num);//读取sheet(从0计数)
        int rowNum=sheet.getLastRowNum();//读取行数(从0计数)
        Map map=new HashMap<String,Object>();
        for(int i=0;i<=rowNum;i++){
            Row row=sheet.getRow(i);//获得行
            int colNum=row.getLastCellNum();//获得当前行的列
            for(int j=0;j<colNum;j++){
                ELE_OBSERVATION e=new ELE_OBSERVATION();//创建对象
                Cell cell=row.getCell(j);//获取单元格
                if(cell==null || cell.equals("") || cell.equals(null) || cell.toString()=="" || cell.toString()=="null"||cell.toString().length()==0){
                    System.out.print("-");
                }else{
                    if(i>=2 && i<=64){//内容在第三行开始,38结束
                        if(j==0){map.put("day",cell.toString());}//获取日期
                        else if(j<=24){//只要24列内的信息
                            if(j!=24){
                                String w=j+"";
                                e.setHour(w);
                            }else{
                                e.setHour("00");
                            }
                            if(i%6!=2){
                                continue;
                            }else{
                                String test=cell.toString();
                                Row row1=sheet.getRow(i+1);//获得行
                                Row row2=sheet.getRow(i+2);//获得行

                                Cell cell1=row1.getCell(j);//获取单元格
                                String test1=cell1.toString();

                                Cell cell2=row2.getCell(j);//获取单元格
                                String test2=cell2.toString();

                                String bl=test+"、"+test1+"、"+test2;
                                if(bl!=""){
                                    e.setCld_l1(bl);
                                }
                            }
                            e.setYear((String)map1.get("year"));
                            e.setMonth((String)map1.get("month"));
                            e.setDay((String)map.get("day"));
                            list.add(e);
                        }
                    }
                    System.out.print(cell.toString()+" ");
                }

            }
            System.out.println();
        }
        for (int f=0;f<list.size();f++){
            ELE_OBSERVATION u=(ELE_OBSERVATION)list.get(f);
                System.out.println("年份:"+u.getYear()+",月份："+u.getMonth()+"日期"+u.getDay()+",小时："+u.getHour()+",云况："+u.getCld_l1()+"~~~~~~");

        }

    }




    //获取年月方法
    public static Map getYear(Workbook wb){
        Sheet sheet=wb.getSheetAt(0);//读取sheet(从0计数)
        int rowNum=sheet.getLastRowNum();//读取行数(从0计数)
        Map map=new HashMap<String,Object>();
        for(int i=0;i<=15;i++){
            Row row=sheet.getRow(i);//获得行
            int colNum=row.getLastCellNum();//获得当前行的列
            for(int j=0;j<colNum;j++){
                ELE_OBSERVATION e=new ELE_OBSERVATION();//创建对象
                Cell cell=row.getCell(j);//获取单元格
                if(cell==null || cell.equals("") || cell.equals(null) || cell.toString()=="" || cell.toString()=="null"||cell.toString().length()==0){
                    //System.out.print("-");
                }else{
                    if(i==7&&j==8){
                        map.put("year",cell.toString()+" ");
                        continue;
                    }
                    if(i==7&&j==15){
                        map.put("month",cell.toString()+" ");
                        break;
                    }
                }
            }
        }
        return map;
    }
}
