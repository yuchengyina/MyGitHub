package com.hg.entity;

import java.util.Date;

public class ELE_OBSERVATION {
    String id;
    String year;
    String month;
    String day;
    String hour;
    String minute;
    String wind_d;//风向
    String wind_s;//风速
    String wind_v;//风向变化
    double visibility;//主导能见度
    double rvr;//跑道视程
    double mor;//光学能见度
    String pw;//天气现象列表
    Date tw_begin;//天气现象开始时间
    Date tw_end;//天气现象终止时间
    int rain;//降水量mm
    double snow;//积雪深度cm
    double cld_sum;//总云量
    double cld_l_sum;//低云量
    double cld_m_sum;//中云量
    double cld_h_sum;//高云量
    String cld_l1;//低云族
    String cld_l2;//
    String cld_l3;//
    String cld_m1;//中云族
    String cld_m2;//
    String cld_m3;//
    String cld_h1;//高云族
    String cld_h2;//
    String cld_h3;//
    double temp;//温度
    double temp_max;//最高温度
    double temp_min;//最低温度
    double rh;//湿度
    double dp;//露点温度
    double qnh;//修正海平面气压
    double qfe;//场压
    String remark1;//备注1
    String remark2;//备注2
    String ismodified;//是否被修改1是
    String operator;//操作者
    Date inserttime;//插入时间
    double gust_s;//阵风风速
    String byyyy;//北京时间yyyy
    String bmm;//北京时间mm
    String bdd;//北京时间dd
    String bhh;//北京时间hh
    String cccc;//
    String rvrs;//多条跑道的跑道视程,不同跑道使用空格隔开.格式如:04:P2000V350D 21:P2000V400D, (两条跑道)

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getWind_d() {
        return wind_d;
    }

    public void setWind_d(String wind_d) {
        this.wind_d = wind_d;
    }

    public String getWind_s() {
        return wind_s;
    }

    public void setWind_s(String wind_s) {
        this.wind_s = wind_s;
    }

    public String getWind_v() {
        return wind_v;
    }

    public void setWind_v(String wind_v) {
        this.wind_v = wind_v;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public double getRvr() {
        return rvr;
    }

    public void setRvr(double rvr) {
        this.rvr = rvr;
    }

    public double getMor() {
        return mor;
    }

    public void setMor(double mor) {
        this.mor = mor;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Date getTw_begin() {
        return tw_begin;
    }

    public void setTw_begin(Date tw_begin) {
        this.tw_begin = tw_begin;
    }

    public Date getTw_end() {
        return tw_end;
    }

    public void setTw_end(Date tw_end) {
        this.tw_end = tw_end;
    }

    public int getRain() {
        return rain;
    }

    public void setRain(int rain) {
        this.rain = rain;
    }

    public double getSnow() {
        return snow;
    }

    public void setSnow(double snow) {
        this.snow = snow;
    }

    public double getCld_sum() {
        return cld_sum;
    }

    public void setCld_sum(double cld_sum) {
        this.cld_sum = cld_sum;
    }

    public double getCld_l_sum() {
        return cld_l_sum;
    }

    public void setCld_l_sum(double cld_l_sum) {
        this.cld_l_sum = cld_l_sum;
    }

    public double getCld_m_sum() {
        return cld_m_sum;
    }

    public void setCld_m_sum(double cld_m_sum) {
        this.cld_m_sum = cld_m_sum;
    }

    public double getCld_h_sum() {
        return cld_h_sum;
    }

    public void setCld_h_sum(double cld_h_sum) {
        this.cld_h_sum = cld_h_sum;
    }

    public String getCld_l1() {
        return cld_l1;
    }

    public void setCld_l1(String cld_l1) {
        this.cld_l1 = cld_l1;
    }

    public String getCld_l2() {
        return cld_l2;
    }

    public void setCld_l2(String cld_l2) {
        this.cld_l2 = cld_l2;
    }

    public String getCld_l3() {
        return cld_l3;
    }

    public void setCld_l3(String cld_l3) {
        this.cld_l3 = cld_l3;
    }

    public String getCld_m1() {
        return cld_m1;
    }

    public void setCld_m1(String cld_m1) {
        this.cld_m1 = cld_m1;
    }

    public String getCld_m2() {
        return cld_m2;
    }

    public void setCld_m2(String cld_m2) {
        this.cld_m2 = cld_m2;
    }

    public String getCld_m3() {
        return cld_m3;
    }

    public void setCld_m3(String cld_m3) {
        this.cld_m3 = cld_m3;
    }

    public String getCld_h1() {
        return cld_h1;
    }

    public void setCld_h1(String cld_h1) {
        this.cld_h1 = cld_h1;
    }

    public String getCld_h2() {
        return cld_h2;
    }

    public void setCld_h2(String cld_h2) {
        this.cld_h2 = cld_h2;
    }

    public String getCld_h3() {
        return cld_h3;
    }

    public void setCld_h3(String cld_h3) {
        this.cld_h3 = cld_h3;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getRh() {
        return rh;
    }

    public void setRh(double rh) {
        this.rh = rh;
    }

    public double getDp() {
        return dp;
    }

    public void setDp(double dp) {
        this.dp = dp;
    }

    public double getQnh() {
        return qnh;
    }

    public void setQnh(double qnh) {
        this.qnh = qnh;
    }

    public double getQfe() {
        return qfe;
    }

    public void setQfe(double qfe) {
        this.qfe = qfe;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public String getIsmodified() {
        return ismodified;
    }

    public void setIsmodified(String ismodified) {
        this.ismodified = ismodified;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    public double getGust_s() {
        return gust_s;
    }

    public void setGust_s(double gust_s) {
        this.gust_s = gust_s;
    }

    public String getByyyy() {
        return byyyy;
    }

    public void setByyyy(String byyyy) {
        this.byyyy = byyyy;
    }

    public String getBmm() {
        return bmm;
    }

    public void setBmm(String bmm) {
        this.bmm = bmm;
    }

    public String getBdd() {
        return bdd;
    }

    public void setBdd(String bdd) {
        this.bdd = bdd;
    }

    public String getBhh() {
        return bhh;
    }

    public void setBhh(String bhh) {
        this.bhh = bhh;
    }

    public String getCccc() {
        return cccc;
    }

    public void setCccc(String cccc) {
        this.cccc = cccc;
    }

    public String getRvrs() {
        return rvrs;
    }

    public void setRvrs(String rvrs) {
        this.rvrs = rvrs;
    }
    public ELE_OBSERVATION(){};
    public ELE_OBSERVATION(String id, String year, String month, String day, String hour, String minute, String wind_d, String wind_s, String wind_v, double visibility, double rvr, double mor, String pw, Date tw_begin, Date tw_end, int rain, double snow, double cld_sum, double cld_l_sum, double cld_m_sum, double cld_h_sum, String cld_l1, String cld_l2, String cld_l3, String cld_m1, String cld_m2, String cld_m3, String cld_h1, String cld_h2, String cld_h3, double temp, double temp_max, double temp_min, double rh, double dp, double qnh, double qfe, String remark1, String remark2, String ismodified, String operator, Date inserttime, double gust_s, String byyyy, String bmm, String bdd, String bhh, String cccc, String rvrs) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.wind_d = wind_d;
        this.wind_s = wind_s;
        this.wind_v = wind_v;
        this.visibility = visibility;
        this.rvr = rvr;
        this.mor = mor;
        this.pw = pw;
        this.tw_begin = tw_begin;
        this.tw_end = tw_end;
        this.rain = rain;
        this.snow = snow;
        this.cld_sum = cld_sum;
        this.cld_l_sum = cld_l_sum;
        this.cld_m_sum = cld_m_sum;
        this.cld_h_sum = cld_h_sum;
        this.cld_l1 = cld_l1;
        this.cld_l2 = cld_l2;
        this.cld_l3 = cld_l3;
        this.cld_m1 = cld_m1;
        this.cld_m2 = cld_m2;
        this.cld_m3 = cld_m3;
        this.cld_h1 = cld_h1;
        this.cld_h2 = cld_h2;
        this.cld_h3 = cld_h3;
        this.temp = temp;
        this.temp_max = temp_max;
        this.temp_min = temp_min;
        this.rh = rh;
        this.dp = dp;
        this.qnh = qnh;
        this.qfe = qfe;
        this.remark1 = remark1;
        this.remark2 = remark2;
        this.ismodified = ismodified;
        this.operator = operator;
        this.inserttime = inserttime;
        this.gust_s = gust_s;
        this.byyyy = byyyy;
        this.bmm = bmm;
        this.bdd = bdd;
        this.bhh = bhh;
        this.cccc = cccc;
        this.rvrs = rvrs;
    }

}
