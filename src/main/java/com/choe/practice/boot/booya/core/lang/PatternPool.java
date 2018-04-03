package com.choe.practice.boot.booya.core.lang;

import java.util.regex.Pattern;

/**
 * 常用正则表达式集合
 *
 * @author choe
 *
 */
public class PatternPool {

  /** 英文字母 、数字和下划线 */
  public final static Pattern GENERAL = Pattern.compile("^\\w+$");

  /** 数字 */
  public final static Pattern NUMBERS = Pattern.compile("\\d+");

  /** 单个中文汉字 */
  public final static Pattern CHINESE = Pattern.compile("[\u4E00-\u9FFF]");

  /** 中文汉字 */
  public final static Pattern CHINESES = Pattern.compile("[\u4E00-\u9FFF]+");

  /** 分组 */
  public final static Pattern GROUP_VAR = Pattern.compile("\\$(\\d+)");

  /** 邮编 */
  public final static Pattern ZIP_CODE = Pattern.compile("\\d{6}");

  /** 中文字、英文字母、数字和下划线 */
  public final static Pattern GENERAL_WITH_CHINESE = Pattern.compile("^[\u4E00-\u9FFF\\w]+$");

  /** UUID */
  public final static Pattern UUID =
      Pattern.compile("^[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}$");

  /** 不带横线的UUID */
  public final static Pattern UUID_SIMPLE = Pattern.compile("^[0-9a-z]{32}$");

  // -------------------------------------------------------------------------------------------------------------------------------------------------------------------
  /** Pattern池 */
  private static final SimpleCache<RegexWithFlag, Pattern> POOL = new SimpleCache<>();

  /**
   * 先从Pattern池中查找正则对应的{@link Pattern}，找不到则编译正则表达式并入池。
   *
   * @param regex
   * @return {@link Pattern}
   */
  public static Pattern get(String regex) {
    return get(regex, 0);
  }

  public static Pattern get(String regex, int flags) {
    final RegexWithFlag regexWithFlag = new RegexWithFlag(regex, flags);

    Pattern pattern = POOL.get(regexWithFlag);
    if (null == pattern) {
      pattern = Pattern.compile(regex, flags);
      POOL.put(regexWithFlag, pattern);
    }
    return pattern;
  }

  /**
   * 移除缓存
   *
   * @param regex 正则
   * @param flags 标识
   * @return 移除的{@link Pattern}，可能为{@code null}
   */
  public static Pattern remove(String regex, int flags) {
    return POOL.remove(new RegexWithFlag(regex, flags));
  }

  /**
   * 清空缓存池
   */
  public static void clear() {
    POOL.clear();
  }

  // ---------------------------------------------------------------------------------------------------------------------------------
  /**
   * 正则表达式和正则标识位的包装
   *
   * @author choe
   *
   */
  private static class RegexWithFlag {
    private String regex;
    private int flag;

    /**
     * 构造
     *
     * @param regex 正则
     * @param flag 标识
     */
    public RegexWithFlag(String regex, int flag) {
      this.regex = regex;
      this.flag = flag;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + flag;
      result = prime * result + (regex == null ? 0 : regex.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null) {
        return false;
      }
      if (getClass() != obj.getClass()) {
        return false;
      }
      RegexWithFlag other = (RegexWithFlag) obj;
      if (flag != other.flag) {
        return false;
      }
      if (regex == null) {
        if (other.regex != null) {
          return false;
        }
      } else if (!regex.equals(other.regex)) {
        return false;
      }
      return true;
    }

  }
}
