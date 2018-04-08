package com.choe.practice.boot.booya.core.excel;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.poifs.filesystem.DocumentFactoryHelper;

import com.choe.practice.boot.booya.core.io.IORuntimeException;


public class ExcelUtil {

  /**
   * 是否为XLSX格式的Excel文件（XSSF）<br>
   * XLSX文件主要用于Excel 2007+创建
   *
   * @param in excel输入流
   * @return 是否为XLSX格式的Excel文件（XSSF）
   */
  public static boolean isXlsx(InputStream in) {
    if (false == in.markSupported()) {
      in = new BufferedInputStream(in);
    }
    try {
      return DocumentFactoryHelper.hasOOXMLHeader(in);
    } catch (IOException e) {
      throw new IORuntimeException(e);
    }
  }
}
