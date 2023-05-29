package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchdata 
{
	public static void main(String[] args) throws EncryptedDocumentException,IOException 
	{
		//step1
		FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
		//step2
		Workbook book=WorkbookFactory.create(fis);
		//step3
		Sheet sh=book.getSheet("sheet1");
		//step4
		Row r=sh.getRow(0);
		//step5
		Cell c=r.getCell(0);
		//step6
		String value=c.toString();
		System.out.println(value);
	}

}
