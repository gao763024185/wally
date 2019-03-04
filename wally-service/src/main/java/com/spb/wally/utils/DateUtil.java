package com.spb.wally.utils;


import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @description: 日志帮忙类
 * @author: Courser
 * @date: 2017/4/6
 * @version: V1.0
 */
public class DateUtil {
    public static final long TEN_MINUTES = 10 * 60 * 1000;
    public static final long ONE_DAY = 24 * 60 * 60 * 1000;

    public static final long MILLISECOND_OF_SECOND = 1000;
    public static final long MILLISECOND_OF_MINUTE = MILLISECOND_OF_SECOND * 60;
    public static final long MILLISECOND_OF_HOUR = MILLISECOND_OF_MINUTE * 60;
    public static final long MILLISECOND_OF_DAY = MILLISECOND_OF_HOUR * 24;
    public static final long MILLISECOND_OF_WEEK = MILLISECOND_OF_DAY * 7;

    /** 日期格式：yyyy-MM-dd */
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    /** 日期格式：yyyyMMdd */
    public static final String DATE_FORMAT_NO_SPLIT = "yyyyMMdd";
    /** 日期格式：yyyyMMddHHmmss */
    public static final String DATE_TIME_FORMAT_NO_SPLIT = "yyyyMMddHHmmss";
    /** 日期格式：yyyy-MM-dd HH:mm:ss */
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    /** 日期格式：yyyy-MM-dd HH:mm:ss.SSS */
    public static final String DATE_TIME_MS_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    public static final String FORMAT_TIME = "HH:mm:ss";

    public static final String FORMAT_TIME_HH_MM = "HH:mm";

    /**
     * 日期格式MM月dd日 HH:mm
     */
    public static final String FORMAT_MM_DD_HH_MM_ONE = "MM月dd日 HH:mm";

    public static final String FORMAT_MM_DD_HH_MM_TWO = "MM.dd HH:mm";

    /**
     * Adds or subtracts the specified amount of time to the given calendar field, based on the calendar's rules. For
     * example, to subtract 5 days from the current time of the calendar, you can achieve it by calling:
     * <p>
     * <code>add(Calendar.DAY_OF_MONTH, -5)</code>.
     *
     * @param date
     *            the date of before the changed.
     * @param field
     *            the calendar field.
     * @param amount
     *            the amount of date or time to be added to the field.
     * @return
     */
    public static Date add(final Date date, Integer field, Integer amount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.add(field, amount);

        return calendar.getTime();
    }

    /**
     * 添加天数
     * @param date
     *           要操作的日期
     * @param days
     *            天数
     * @return
     */
    public static Date addDate(final Date date, Integer days) {
        return add(date, Calendar.DATE, days);
    }

    /**
     * 按指定的格式，将日期转换成为字符
     * @param date 日期
     * @param format 格式
     * @return 按指定的格式，将日期转换成为字符
     */
    public static String format(Date date, String format) {
        if (date == null) {
            return "";
        }

        if (isEmpty(format)) {
            format = DATE_FORMAT;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 判断字符串是否为空
     * @param str 要判断的字符串
     * @return boolean
     */
    private static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    /**
     * 将日期转换成为字符（yyyy-MM-dd）
     * @param date
     * @return
     */
    public static String formatDate(Date date) {
        return format(date, DATE_FORMAT);
    }

    /**
     *  今天日期的字符（yyyy-MM-dd）
     * @return  今天日期的字符（yyyy-MM-dd）
     */
    public static String today() {
        return formatDate(new Date());
    }

    /**
     * 将日期转换成为字符（yyyy-MM-dd HH:mm:ss）
     * @param date
     * @return
     */
    public static String formatDateTime(Date date) {
        return format(date, DATE_TIME_FORMAT);
    }

    /**
     * 当前时间的字符（yyyy-MM-dd HH:mm:ss）
     * @return 当前时间的字符（yyyy-MM-dd HH:mm:ss）
     */
    public static String nowString() {
        return formatDateTime(now());
    }

    /**
     * 当前时间
     * @return 当前时间
     */
    public static Date now() {
        return new Date();
    }

    /**
     * 将日期转换成为字符（yyyy-MM-dd HH:mm:ss.SSS）
     *
     * @param date 要格式化的数据
     * @return 将日期转换成为字符（yyyy-MM-dd HH:mm:ss.SSS）
     */
    public static String formatDateTimeMs(Date date) {
        return format(date, DATE_TIME_MS_FORMAT);
    }

    /**
     * 生成日期
     * @param object 要转换的数据
     * @return 生成日期
     */
    public static Date getDateValue(Object object) {
        return null == object ? null : (Date) object;
    }

    /**
     * 按指定的格式，将字符转换为日期
     * @param dateString 日期
     * @param format 格式
     * @return 按指定的格式，将字符转换为日期
     */
    public static Date parseDate(String dateString, String format) {
        if (isEmpty(format)) {
            return null;
        }

        try {
            Date date = new SimpleDateFormat(format).parse(dateString);
            return date;
        } catch (Exception e) {
            System.out.println("传入字符串时间【"+dateString+"]转换为时间格式【"+format+"】错误："+e.getMessage());
            return null;
        }
    }



    /**
     * 获取昨天的日期格式化字符串 yyyy-MM-dd
     * @return
     */
    public static String yesterdayFormate(){
        Date  date = new Date();
        Date dBefore = new Date();
        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(date);//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH, -1);  //设置为前一天
        dBefore = calendar.getTime();   //得到前一天的时间
        return formatDate(dBefore);
    }

    /**
     * 获取昨天
     * @return
     */
    public static Date yesterdayTime(){
        Date  date = new Date();
        Date dBefore = new Date();
        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(date);//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH, -1);  //设置为前一天
        dBefore = calendar.getTime();   //得到前一天的时间
        return dBefore ;
    }



    /**
     * 将字符（yyyy-MM-dd）转换为日期
     * @param dateString
     * @return 将字符（yyyy-MM-dd）转换为日期
     */
    public static Date parseDate(String dateString) {
        return parseDate(dateString, DATE_FORMAT);
    }

    /**
     * 将字符（yyyy-MM-dd HH:mm:ss）转换为日期
     * @param dateString
     * @return 将字符（yyyy-MM-dd HH:mm:ss）转换为日期
     */
    public static Date parseDateTime(String dateString) {
        return parseDate(dateString, DATE_TIME_FORMAT);
    }

    /**
     * milliseconds 转化为日期
     *
     * @param date
     * @return  milliseconds 转化为日期
     */
    public static Date toDate(Long date) {
        if (date == null) {
            return null;
        }
        return new Date(date);
    }

    /**
     * 获取当前时间 milliseconds
     *
     * @return 获取当前时间 milliseconds
     */
    public static long getCurrentTime() {
        return new Date().getTime();
    }

    /**
     * 获取当前时间字符串 默认格式：yyyy-MM-dd HH:mm:ss
     *
     * @param dateFormatPattern
     *            日期转换格式
     * @return 获取当前时间字符串 默认格式：yyyy-MM-dd HH:mm:ss
     */
    public static String getCurrentDateStr(String dateFormatPattern) {
        if (isEmpty(dateFormatPattern)) {
            dateFormatPattern = DATE_TIME_FORMAT;
        }
        return format(new Date(), dateFormatPattern);
    }

    public static Date getServerTime(String operateTimeStr) {
        Date serverTime = new Date();
        if (isEmpty(operateTimeStr)) {
            return serverTime;
        }

        Date operateTime = parseDate(operateTimeStr, DATE_TIME_FORMAT);

        if (operateTime == null) {
            operateTime = parseDate(operateTimeStr, DATE_TIME_MS_FORMAT);
        }

        Long interval = operateTime.getTime() - serverTime.getTime();
        if (operateTime.after(serverTime) && TEN_MINUTES < interval) {
            return serverTime;
        } else if (operateTime.before(serverTime) && ONE_DAY < Math.abs(interval)) {
            return serverTime;
        } else {
            return operateTime;
        }
    }


    /**
     * 添加或减少周
     * @param date 要操作的日期
     * @param weeks 周
     * @return操作过的日期
     */
    public static Date addWeek(Date date, int weeks) {
        if (date != null) {
            return new Date(date.getTime() + weeks * MILLISECOND_OF_WEEK);
        }
        return date;
    }

    /**
     * 添加或减少天数
     * @param date 日期
     * @param days 天数
     * @return 操作过的日期
     */
    public static Date addDay(Date date, int days) {
        if (date != null) {
            return new Date(date.getTime() + days * MILLISECOND_OF_DAY);
        }
        return date;
    }

    /**
     * 添加或减少小时
     * @param date 要操作的日期
     * @param hours 小时
     * @return 操作过的日期
     */
    public static Date addHour(Date date, int hours) {
        if (date != null) {
            return new Date(date.getTime() + hours * MILLISECOND_OF_HOUR);
        }
        return date;
    }

    /**
     *  添加或减少分钟
     * @param date 要操作的日期
     * @param minutes 分钟
     * @return 操作过的日期
     */
    public static Date addMinutes(Date date, int minutes) {
        if (date != null) {
            return new Date(date.getTime() + minutes * MILLISECOND_OF_MINUTE);
        }
        return date;
    }

    /**
     * 获得某个月的第一天0时0分0秒的时间
     *
     * @param year 年
     * @param month 月
     * @return java.util.Date
     */
    public static Date getFirstDateOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        return cal.getTime();
    }

    /**
     * 获取某一天的0时0分0秒的时间
     *
     * @param year 年
     * @param month 月
     * @param day 日
     * @return 返回加上0点的时间
     */
    public static Date getFirstTimeOfDay(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        return cal.getTime();
    }

    /**
     * 获取某一天的0时0分0秒的时间
     *
     * @param date 输入日期
     * @return 返回加上0点的时间
     */
    public static Date getFirstTimeOfDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }

    /**
     * 获取某一天的23时59分59秒的时间
     *
     * @param date 日期
     * @return 某一天的23时59分59秒的时间
     */
    public static Date getLastTimeOfDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        return cal.getTime();
    }

    /**
     * 获得Date型对象，根据时间点
     *
     * @param year  年
     * @param month 月
     * @param day 日
     * @return 时间点
     */
    public static Date getDateFromTime(int year, int month, int day, int hour, int minute, int second) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, second);

        return cal.getTime();
    }


    /**
     * 将时间字符串进行相加后操作后格式化输出
     * @param timeStr 格式<HH:mm:ss>
     * @param hour 小时
     * @param minute 分钟
     * @param second 秒
     * @return 格式<HH:mm>
     */
    public static String timeOperate(String timeStr, int hour, int minute, int second){
        SimpleDateFormat df = new SimpleDateFormat(FORMAT_TIME);
        String[] times = timeStr.trim().split(":");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,Integer.valueOf(times[0]));
        calendar.set(Calendar.MINUTE,Integer.valueOf(times[1]));
        if(times.length==3){
            calendar.set(Calendar.SECOND,Integer.valueOf(times[2]));
        }
        calendar.add(Calendar.HOUR_OF_DAY, hour);
        calendar.add(Calendar.MINUTE, minute);
        calendar.add(Calendar.SECOND, second);
        return df.format(calendar.getTime());

    }

    /**
     * 根据指定string生成当天时间
     * @param timeStr 格式<HH:mm> or <HH:mm:ss>
     * @return 当天时间
     */
    public static Date getCurrentDayTimeByStr(String timeStr) {
        String[] times = timeStr.trim().split(":");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, Integer.valueOf(times[0]));
        calendar.set(Calendar.MINUTE, Integer.valueOf(times[1]));
        if(times.length==3){
            calendar.set(Calendar.SECOND,Integer.valueOf(times[2]));
        }else {
            calendar.set(Calendar.SECOND,0);
        }
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 根据指定string生成指定日期时间
     *
     * @param timeStr 格式<HH:mm> or <HH:mm:ss>
     * @param date 日期
     * @return 日期时间
     */
    public static Date getSpecialDayTimeByStr(Date date, String timeStr) {
        String[] times = timeStr.trim().split(":");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, Integer.valueOf(times[0]));
        calendar.set(Calendar.MINUTE, Integer.valueOf(times[1]));
        if (times.length == 3) {
            calendar.set(Calendar.SECOND, Integer.valueOf(times[2]));
        }else {
            calendar.set(Calendar.SECOND, 0);
        }
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取两个日期间所跨0点次数
     * @param d1 开始日期
     * @param d2 结束日期
     * @return 得到两个日期相差的天数
     */
    public static  Integer getDaysBetweenTwoDate(Date d1,Date d2) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        try {
            Date d11 = sdf.parse(sdf.format(d1));
            Date d21 = sdf.parse(sdf.format(d2));
            Calendar cal = Calendar.getInstance();
            cal.setTime(d11);
            long time1 = cal.getTimeInMillis();
            cal.setTime(d21);
            long time2 = cal.getTimeInMillis();
            long between_days = Math.abs((time2 - time1) / (1000 * 3600 * 24));

            return Integer.parseInt(String.valueOf(between_days));
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 把时间类型转化为规定格式的字符串
     * "yyyy-MM-dd hh:MM:ss"
     *
     * @param date 时间
     * @return 格式化以后的时间字符串
     */
    public static String convertDateToYMDHMS(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return f.format(date);
    }

    /**
     * 得到年
     * @param calendar 传入的日期
     * @return
     */
    public static Integer getYear(Calendar calendar){
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 获取年份的后两位
     * @param calendar 传入的日期
     * @return
     */
    public static String getLastTwoYear(Calendar calendar){
        String yearLast = new SimpleDateFormat("yy", Locale.CHINESE).format(calendar.getTime());
        return yearLast;
    }

    /**
     * 得到月
     * @param calendar 传入的日期
     * @return
     */
    public static Integer getMonth(Calendar calendar){
        return calendar.get(Calendar.MONTH)+ 1;
    }

    /**
     * 得到日
     * @param calendar 传入的日期
     * @return
     */
    public static Integer getDay(Calendar calendar){
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 获取当前时间byte数组
     * <pre>
     *  2017年5月12日13点47分55秒
     *  System.currentTimeMillis() = 1494568062655l;
     *  DateUtil.getTimeBytes() = {0x17,0x05,0x12,0x13,0x47,0x55}
     * </pre>
     * @return
     */
    public static byte[] getTimeBytes() {
        ByteBuffer buf = ByteBuffer.allocate(6);
        Calendar value = Calendar.getInstance();
        byte b1 = (byte) (value.get(Calendar.YEAR) - 2000);
        byte b2 = (byte) (value.get(Calendar.MONTH) + 1);
        byte b3 = (byte) value.get(Calendar.DATE);
        byte b4 = (byte) value.get(Calendar.HOUR_OF_DAY);
        byte b5 = (byte) value.get(Calendar.MINUTE);
        byte b6 = (byte) value.get(Calendar.SECOND);

        buf.put(Byte.parseByte(String.valueOf(b1),16));
        buf.put(Byte.parseByte(String.valueOf(b2),16));
        buf.put(Byte.parseByte(String.valueOf(b3),16));
        buf.put(Byte.parseByte(String.valueOf(b4),16));
        buf.put(Byte.parseByte(String.valueOf(b5),16));
        buf.put(Byte.parseByte(String.valueOf(b6),16));
        return buf.array();
    }
}
