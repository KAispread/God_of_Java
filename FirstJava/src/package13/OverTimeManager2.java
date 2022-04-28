package package13;

public class OverTimeManager2 {

	public static void main(String[] args) {
		OvertimeValue2 over = OvertimeValue2.FIVE_HOURS;
		System.out.println(over.ordinal());
		System.out.println(over.getAmount());
		
		OvertimeValue2 over2 = OvertimeValue2.THREE_HOURS;
		System.out.println(over2.compareTo(over));
		
		OvertimeValue2[] over3 = OvertimeValue2.values();
		for(OvertimeValue2 list : over3) {
			System.out.println(list);
		}
	}

}
