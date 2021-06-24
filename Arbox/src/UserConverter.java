import org.apache.poi.ss.usermodel.Row;

public class UserConverter implements IConverter {
	int club_id;
	public UserConverter(int club_id) {
		this.club_id=club_id;
	}
	public IDbRecord convertRowToRecord(Row row) {
		User user=new User(row.getCell(0).getStringCellValue(),row.getCell(1).getStringCellValue(),row.getCell(3).getStringCellValue(),row.getCell(2).getStringCellValue(),row.getCell(4).getDateCellValue(),club_id,row.getCell(4).getDateCellValue(),row.getCell(5).getDateCellValue(),row.getCell(6).getStringCellValue());
		return user;
	}
}
