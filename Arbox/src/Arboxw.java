import java.util.ArrayList;

public class Arboxw{
	public static void main(String[] args) {

		IConverter converter=new UserConverter(2400);
		InsertTODB inserter  = new InsertTODB("users","memberships");
		IReader reader = new ReadExcelFile("jimalaya.xlsx",converter);
		ArrayList<IDbRecord> records = reader.readAll();
		inserter.insertAll(records);
	}
}