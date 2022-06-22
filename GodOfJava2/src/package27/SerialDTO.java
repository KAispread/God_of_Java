package package27;

import java.io.Serializable;

public class SerialDTO implements Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String bookType = "IT";
	
	private String bookName;
	private int bookOrder;
	transient private boolean bestSeller;
	private long soldPerDay; 
	public SerialDTO(String bookName, int bookOrder, boolean bestSeller, long soldPerDay) {
		super();
		this.bookName = bookName;
		this.bookOrder = bookOrder;
		this.bestSeller = bestSeller;
		this.soldPerDay = soldPerDay;
	}
	
	public String toString() {
		return "SerialDTO [bookName= "+ bookName +", bookOrder = "+bookOrder+" "
				+ ", bestSeller = "+bestSeller+", soldPerDay = "+soldPerDay+" "
				+ ", bookType = "+bookType+"]";
	}
}
