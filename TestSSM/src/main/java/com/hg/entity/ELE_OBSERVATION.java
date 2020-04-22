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
    float visibility;//主导能见度
    float rvr;//跑道视程
    float mor;//光学能见度
    String pw;//天气现象列表
    Date tw_begin;//天气现象开始时间
    Date tw_end;//天气现象终止时间
    int rain;//降水量mm
    float snow;//积雪深度cm
    float cld_sum;//总云量
    float cld_l_sum;//低云量
    float cld_m_sum;//中云量
    float cld_h_sum;//高云量
    String cld_l1;//低云族
    String cld_l2;//
    String cld_l3;//
    String cld_m1;//中云族
    String cld_m2;//
    String cld_m3;//
    String cld_h1;//高云族
    String cld_h2;//
    String cld_h3;//
    float temp;//温度
    float temp_max;//最高温度
    float temp_min;//最低温度
    float rh;//湿度
    float dp;//露点温度
    float qnh;//修正海平面气压
    float qfe;//场压
    String remark1;//备注1
    String remark2;//备注2
    String ismodified;//是否被修改1是
    String operator;//操作者
    Date inserttime;//插入时间
    float gust_s;//阵风风速
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

    public float getVisibility() {
        return visibility;
    }

    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    public float getRvr() {
        return rvr;
    }

    public void setRvr(float rvr) {
        this.rvr = rvr;
    }

    public float getMor() {
        return mor;
    }

    public void setMor(float mor) {
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

    public float getSnow() {
        return snow;
    }

    public void setSnow(float snow) {
        this.snow = snow;
    }

    public float getCld_sum() {
        return cld_sum;
    }

    public void setCld_sum(float cld_sum) {
        this.cld_sum = cld_sum;
    }

    public float getCld_l_sum() {
        return cld_l_sum;
    }

    public void setCld_l_sum(float cld_l_sum) {
        this.cld_l_sum = cld_l_sum;
    }

    public float getCld_m_sum() {
        return cld_m_sum;
    }

    public void setCld_m_sum(float cld_m_sum) {
        this.cld_m_sum = cld_m_sum;
    }

    public float getCld_h_sum() {
        return cld_h_sum;
    }

    public void setCld_h_sum(float cld_h_sum) {
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

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }

    public float getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }

    public float getRh() {
        return rh;
    }

    public void setRh(float rh) {
        this.rh = rh;
    }

    public float getDp() {
        return dp;
    }

    public void setDp(float dp) {
        this.dp = dp;
    }

    public float getQnh() {
        return qnh;
    }

    public void setQnh(float qnh) {
        this.qnh = qnh;
    }

    public float getQfe() {
        return qfe;
    }

    public void setQfe(float qfe) {
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

    public float getGust_s() {
        return gust_s;
    }

    public void setGust_s(float gust_s) {
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
    public ELE_OBSERVATION(String id, String year, String month, String day, String hour, String minute, String wind_d, String wind_s, String wind_v, float visibility, float rvr, float mor, String pw, Date tw_begin, Date tw_end, int rain, float snow, float cld_sum, float cld_l_sum, float cld_m_sum, float cld_h_sum, String cld_l1, String cld_l2, String cld_l3, String cld_m1, String cld_m2, String cld_m3, String cld_h1, String cld_h2, String cld_h3, float temp, float temp_max, float temp_min, float rh, float dp, float qnh, float qfe, String remark1, String remark2, String ismodified, String operator, Date inserttime, float gust_s, String byyyy, String bmm, String bdd, String bhh, String cccc, String rvrs) {
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
