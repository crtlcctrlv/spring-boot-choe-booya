package com.choe.practice.boot.booya.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.stereotype.Service;

import com.choe.practice.boot.booya.entity.vo.HotguyVO;

@Service
public class ExcelService {

  public void generateExcel(String fileName, List<HotguyVO> hotguys) throws IOException {
    // HttpServletResponse response,
    // response.setContentType("application/vnd.ms-excel");
    // response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xls");

    HSSFWorkbook wb = new HSSFWorkbook();

    Sheet sheet = wb.createSheet();

    for (int i = 0; i < hotguys.size(); i++) {
      HotguyVO hotguy = hotguys.get(i);

      Row row = sheet.createRow(i);

      Cell cellName = row.createCell(0);
      cellName.setCellValue(hotguy.getUserName());

      Cell cellCampus = row.createCell(1);
      cellCampus.setCellValue(hotguy.getCampusName());

      Cell cellHot = row.createCell(2, CellType.NUMERIC);
      Integer num = hotguy.getHotNum();
      cellHot.setCellValue(num == null ? Double.valueOf("0") : num.doubleValue());

    }

    OutputStream outputStream =
        new FileOutputStream("/root/cpdaily/cpdaily-hotguy-tool/" + fileName + ".xls");
    wb.write(outputStream);
    wb.close();
    outputStream.flush();
    outputStream.close();
  }

}
