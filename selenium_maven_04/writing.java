package selenium_maven_04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream file =new FileOutputStream(System.getProperty("user.dir")+ "\\TestData\\file.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook();
XSSFSheet  sheet=workbook.createSheet("Sheet1");

//XSSFRow row1=sheet.createRow(0);
//row1.createCell(0).setCellValue("welcome");
//row1.createCell(1).setCellValue("1234");
//row1.createCell(2).setCellValue("Automation");

///XSSFRow row2=sheet.createRow(1);
///row2.createCell(0).setCellValue("janvi");
//row2.createCell(1).setCellValue("1345");
//row2.createCell(2).setCellValue("java");
//workbook.write(file);
//file.close();
Scanner sc = new Scanner(System.in);
for (int r=0;r<3;r++)
{
	XSSFRow currentRow = sheet.createRow(r); 
	for (int c=0;c<2;c++)
	{
		System.out.println("Enter the value of cell: ");
		String data = sc.next();
		currentRow.createCell(c).setCellValue(data);
	}
}
// Printing Values 
for (int a=0;a<3;a++)
{
	XSSFRow currentRow = sheet.getRow(a);
for (int b=0;b<2;b++)
{
	String cellValue = currentRow.getCell(b).toString();
	System.out.println(cellValue + "      ");
}
	System.out.println();
}
workbook.write(file);
workbook.close();
file.close();

	}

}
