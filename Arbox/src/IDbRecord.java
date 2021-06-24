public interface IDbRecord {
	String toUserValues();
	String getUserTableColumns();
	String toMembershipValues();
	String getMembershipTableColumns();
}
