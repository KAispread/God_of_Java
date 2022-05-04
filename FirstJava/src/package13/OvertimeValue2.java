package package13;

public enum OvertimeValue2 {
	THREE_HOURS(18000, "Y"),
	FIVE_HOURS(30000, "Y"),
	WEEKEND_FOUR_HOURS(40000, "Y"),
	WEEKEND_EIGHT_HOURS(60000, "N");
	private final int amount;
	private final String answer;
	OvertimeValue2(int i, String answer) {
		this.amount = i;
		this.answer = answer;
	}
	public int getAmount() {
		return amount;
	}
	public String getStatus() {
		return answer;
	}
}
