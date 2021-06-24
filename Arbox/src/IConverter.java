import org.apache.poi.ss.usermodel.Row;

public interface IConverter {

	IDbRecord convertRowToRecord(Row row);
}
