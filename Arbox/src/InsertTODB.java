import java.util.ArrayList;
import java.util.Random;

public class InsertTODB implements IInsert{
	private String userTableName;
	private String membershipTableName;

	public InsertTODB(String userTableName,String membershipTableName) {
		this.userTableName = userTableName;
		this.membershipTableName=membershipTableName;
	}


	@Override
	public void insertAll(ArrayList<IDbRecord> records) {
		for(IDbRecord record:records) {
			System.out.println(String.format("INSERT INTO '%s' %s VALUES(%s)",
					userTableName,record.getUserTableColumns(), record.toUserValues()));
			//After insert we should get the user id - (user_id)
			int user_id=Math.abs(new Random().nextInt());
			System.out.println(String.format("INSERT INTO '%s' %s VALUES (%d,%s)",
					membershipTableName,record.getMembershipTableColumns(),user_id, record.toMembershipValues()));
		}
	}
}
