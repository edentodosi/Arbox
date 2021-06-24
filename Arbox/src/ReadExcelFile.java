import java.io.File;  
import java.io.FileInputStream;  
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadExcelFile implements IReader{
	String path;
	IConverter converter;

	public ReadExcelFile(String path,IConverter converter)
	{
		this.path=path;
		this.converter=converter;
	}

	@Override
	public ArrayList<IDbRecord> readAll() {
		ArrayList <IDbRecord> newUsers=new ArrayList<IDbRecord>();
		FileInputStream fis;
		try {
			File file = new File(path);
			fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator < Row > rowIterator = sheet.iterator();
			for(int i=sheet.getFirstRowNum()+1;i<=sheet.getLastRowNum();i++){
				Row ro=sheet.getRow(i);
				newUsers.add(converter.convertRowToRecord(ro));
			}
			return newUsers;		

		} catch (Exception e) {
			return newUsers;
		}  
	}
}

