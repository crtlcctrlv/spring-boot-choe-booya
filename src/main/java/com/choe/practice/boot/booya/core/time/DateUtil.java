package com.choe.practice.boot.booya.core.time;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class DateUtil {

  /**
   * 获得年的部分
   *
   * @param date 日期
   * @return 年的部分
   */
  public static int year(Date date) {
    return DateUtils.toCalendar(date).get(Calendar.YEAR);
  }

  /**
   * 获得月份，从0开始计数
   *
   * @param date 日期
   * @return 月份，从0开始计数
   */
  public static int month(Date date) {
    return DateUtils.toCalendar(date).get(Calendar.MONTH);
  }

  /**
   * 获得指定日期是所在年份的第几周<br>
   *
   * @param date 日期
   * @return 周
   */
  public static int weekOfYear(Date date) {
    return DateUtils.toCalendar(date).get(Calendar.WEEK_OF_YEAR);
  }

  /**
   * 获得指定日期是所在月份的第几周<br>
   *
   * @param date 日期
   * @return 周
   */
  public static int weekOfMonth(Date date) {
    return DateUtils.toCalendar(date).get(Calendar.WEEK_OF_MONTH);
  }

  /**
   * 获得指定日期是这个日期所在月份的第几天<br>
   *
   * @param date 日期
   * @return 天
   */
  public static int dayOfMonth(Date date) {
    return DateUtils.toCalendar(date).get(Calendar.DAY_OF_MONTH);
  }

  /**
   * 获得指定日期是星期几
   *
   * @param date 日期
   * @return 天
   */
  public static int dayOfWeek(Date date) {
    return DateUtils.toCalendar(date).get(Calendar.DAY_OF_WEEK);
  }

  /**
   * 获得指定日期的小时数部分<br>
   *
   * @param date 日期
   * @param is24HourClock 是否24小时制
   * @return 小时数
   */
  public static int hour(Date date, boolean is24HourClock) {
    return DateUtils.toCalendar(date).get(is24HourClock ? Calendar.HOUR_OF_DAY : Calendar.HOUR);
  }

  /**
   * 获得指定日期的分钟数部分<br>
   * 例如：10:04:15.250 =》 4
   *
   * @param date 日期
   * @return 分钟数
   */
  public static int minute(Date date) {
    return DateUtils.toCalendar(date).get(Calendar.MINUTE);
  }

  /**
   * 获得指定日期的秒数部分<br>
   *
   * @param date 日期
   * @return 秒数
   */
  public static int second(Date date) {
    return DateUtils.toCalendar(date).get(Calendar.SECOND);
  }

  /**
   * 获得指定日期的毫秒数部分<br>
   *
   * @param date 日期
   * @return 毫秒数
   */
  public static int millisecond(Date date) {
    return DateUtils.toCalendar(date).get(Calendar.MILLISECOND);
  }

  /**
   * 是否为上午
   *
   * @param date 日期
   * @return 是否为上午
   */
  public static boolean isAM(Date date) {
    return Calendar.AM == DateUtils.toCalendar(date).get(Calendar.AM_PM);
  }

  /**
   * 是否为下午
   *
   * @param date 日期
   * @return 是否为下午
   */
  public static boolean isPM(Date date) {
    return Calendar.PM == DateUtils.toCalendar(date).get(Calendar.AM_PM);
  }

}
