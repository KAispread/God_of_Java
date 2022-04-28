package package13;

public class OverTimeManager {

	public static void main(String[] args) {
		OverTimeManager over = new OverTimeManager();
		int overAmount = over.getOverTimeAmount(OvertimeValue.WEEKEND_EIGHT_HOURS);
		System.out.println(overAmount);
	}
	
	public int getOverTimeAmount(OvertimeValue value) {
		int amount = 0;
		switch(value) {
			case THREE_HOURS:
				amount = 18000;
				break;
			case FIVE_HOURS:
				amount = 30000;
				break;
			case WEEKEND_FOUR_HOURS:
				amount = 40000;
				break;
			case WEEKEND_EIGHT_HOURS:
				amount = 60000;
				break;
			default:
				break;
		} 
		
		return amount;
	}

}
