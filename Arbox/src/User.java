import java.util.Date;

public class User implements IDbRecord{
	String firstName;
	String lastName;
	String phone;
	String userEmail;
	Date joined_at;
	int club_id;
	Date start_date;
	Date end_date;
	String membereship_name;

	public User(String firstName,String lastName, String phone,String userEmail,Date joined_at,int  club_id,Date start_date,Date end_date,String membereship_name) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.phone=phone;
		this.userEmail=userEmail;
		this.joined_at=joined_at;
		this.club_id=club_id;
		this.start_date=start_date;
		this.end_date=end_date;
		this.membereship_name=membereship_name;
	}

	public String toUserValues() {
		return String.format("%s,%s,%s,%s, %s, %d",
				firstName,lastName,phone,userEmail,joined_at,club_id);
	}

	public String getUserTableColumns() {
		return  "(first_name,last_name,phone,email,joined_at,club_id)";
	}

	public String toMembershipValues() {
		return String.format("%s,%s,%s",
				start_date,end_date,membereship_name);	
	}

	public String getMembershipTableColumns() {
		return  "(user_id,start_date,end_date,membereship_name)";
	}
}
