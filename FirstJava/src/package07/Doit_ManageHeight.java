package package07;

public class Doit_ManageHeight {
	int [][] gradeHeights = new int [5][];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doit_ManageHeight manage = new Doit_ManageHeight();
		
		manage.setData();
		for(int data=1; data <= manage.gradeHeights.length; data++) {
			manage.printHeight(data);
			manage.printAverage(data - 1);
		}
		
	}
	
	public void setData() {
		int [] classNo1 = {170, 180, 173, 175, 177};
		int [] classNo2 = {160, 165, 167, 186};
		int [] classNo3 = {158, 177, 187, 176};
		int [] classNo4 = {173, 182, 181};
		int [] classNo5 = {170, 180, 165, 177, 172};
		
		gradeHeights[0] = classNo1;
		gradeHeights[1] = classNo2;
		gradeHeights[2] = classNo3;
		gradeHeights[3] = classNo4;
		gradeHeights[4] = classNo5;
	}
	
	public void printHeight(int classNo) {
		System.out.println("Class No.:"+classNo+"");
		for(int data :gradeHeights[classNo - 1]) {
			System.out.println(data);
		}
	}
	
	public void printAverage(int classNo) {
		double averageClassHeight = 0;
		short sumHeights = 0;
		short count = 0;
		
		for(int data: gradeHeights[classNo]) {
			sumHeights += data;
			count ++;
			averageClassHeight = (double)sumHeights / (double)count; 
		}
		System.out.println("Class No.:"+(classNo + 1)+"");
		System.out.println("Height Average:"+averageClassHeight+"");
		System.out.println();
	}
}
