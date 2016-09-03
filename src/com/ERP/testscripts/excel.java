package com.ERP.testscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ERP.master.library;

public class excel {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		library li=new library();
		String Res=li.appopen("http://webapp.qedgetech.com");
		System.out.println(Res);
		Res=li.login("admin","master");
		System.out.println(Res);
		
		FileInputStream fis=new FileInputStream("H:\\Anitha\\ERP\\src\\com\\ERP\\testdata\\UOM.xlsx");
		
	XSSFWorkbook WB=new XSSFWorkbook(fis);
	
	XSSFSheet WS=WB.getSheet("uomdata");
	XSSFSheet WS1=WB.getSheet("Stocksheet");
	XSSFSheet WS2=WB.getSheet("Supplier");
	/*int RC=WS.getLastRowNum();
	System.out.println(RC);
	int RC1=WS1.getLastRowNum();
	System.out.println(RC1);*/
	int RC2=WS2.getLastRowNum();
	System.out.println(RC2);
	
	/*for(int i=1;i<=RC;i++){
		
		XSSFRow WR=WS.getRow(i);
		XSSFCell WC=WR.getCell(0);
		XSSFCell WC1=WR.getCell(1);
		XSSFCell WC2=WR.createCell(2);
		
		String Uid= WC.getStringCellValue();
		String UDesc=WC1.getStringCellValue();
		
		System.out.println(Uid+UDesc);
		Res=li.uom(Uid, UDesc);
		System.out.println(Res);
		WC2.setCellValue(Res);
		
		
	}
	
for(int j=1;j<=RC1;j++){
		
		XSSFRow W=WS1.getRow(j);
		XSSFCell c=W.getCell(0);
		//XSSFCell c1=W.getCell(1);
		XSSFCell C2=W.createCell(1);
		
		String Sname= c.getStringCellValue();
		String Sser= c.getStringCellValue();
		//String UDesc=WC1.getStringCellValue();
		
		System.out.println(Sname);
		System.out.println(Sser);
		Res=li.stockitem(Sname, Sser);
		System.out.println(Res);
		C2.setCellValue(Res);
		
		
	}*/
for (int k=1 ;k < RC2;k++){
	
XSSFRow W1=WS2.getRow(k);
XSSFCell c1=W1.getCell(0);
XSSFCell c3=W1.getCell(1);
XSSFCell c4=W1.getCell(2);
XSSFCell c5=W1.getCell(3);
XSSFCell c6=W1.getCell(4);
XSSFCell c7=W1.getCell(5);
XSSFCell c8=W1.getCell(6);
XSSFCell c9=W1.getCell(7);
XSSFCell c10=W1.getCell(8);
XSSFCell c11=W1.createCell(9);


String supname= c1.getStringCellValue();
String supaddress= c3.getStringCellValue();
String supcity=c4.getStringCellValue();
String supcountry=c5.getStringCellValue();
String supconper=c6.getStringCellValue();
String suppno=c7.getStringCellValue();
String supemail=c8.getStringCellValue();
String supmno=c9.getStringCellValue();
String supnotes=c10.getStringCellValue();
	
System.out.println(supname+supaddress+supcity+supcountry+supconper+suppno+supemail+supmno+supnotes);

Res=li.supplier(supname, supaddress, supcity, supcountry, supconper, suppno, supemail, supmno, supnotes);
System.out.println(Res);
c11.setCellValue(Res);
	
	
}
	//FileOutputStream FOS= new FileOutputStream("H:\\Anitha\\ERP\\src\\com\\ERP\\results\\Uomresults.xlsx");
	//FileOutputStream FOS1= new FileOutputStream("H:\\Anitha\\ERP\\src\\com\\ERP\\results\\Stockresults.xlsx");
	FileOutputStream FOS2= new FileOutputStream("H:\\Anitha\\ERP\\src\\com\\ERP\\results\\Supplierresults.xlsx");
	
	//WB.write(FOS);
	//WB.write(FOS1);
	WB.write(FOS2);
	WB.close();
		
	
   
		
	}

}
