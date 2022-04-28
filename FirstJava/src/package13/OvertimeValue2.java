package package13;

public enum OvertimeValue2 {
	THREE_HOURS(18000),
	FIVE_HOURS(30000),
	WEEKEND_FOUR_HOURS(40000),
	WEEKEND_EIGHT_HOURS(60000);
	private final int amount;
	OvertimeValue2(int i) {
		this.amount = i;
	}
	public int getAmount() {
		return amount;
	}
}
