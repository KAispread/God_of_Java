package package22.ArrayList;

import java.util.ArrayList;

public class ManageHeight {
	ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();
	public static void main(String[] args) {
		ManageHeight sample = new ManageHeight();
		sample.setData();
		for(int i = 1; i < 6; i++) {
			sample.printHeight(i);
		}
		sample.printAverage();
	}
	public void setData() {
		ArrayList<Integer> grade1 = new ArrayList<>(5);
		ArrayList<Integer> grade2 = new ArrayList<>(4);
		ArrayList<Integer> grade3 = new ArrayList<>(4);
		ArrayList<Integer> grade4 = new ArrayList<>(3);
		ArrayList<Integer> grade5 = new ArrayList<>(5);
		
		grade1.add(170);
		grade1.add(180);
		grade1.add(173);
		grade1.add(175);
		grade1.add(177);
		
		grade2.add(160);
		grade2.add(165);
		grade2.add(167);
		grade2.add(186);
		
		grade3.add(158);
		grade3.add(177);
		grade3.add(187);
		grade3.add(176);
		
		grade4.add(173);
		grade4.add(182);
		grade4.add(181);
		
		grade5.add(170);
		grade5.add(180);
		grade5.add(165);
		grade5.add(177);
		grade5.add(172);
		
		gradeHeights.add(grade1);
		gradeHeights.add(grade2);
		gradeHeights.add(grade3);
		gradeHeights.add(grade4);
		gradeHeights.add(grade5);
	}
	public void printHeight(int classNo) {
		System.out.println("Class No.:"+classNo+"");
		for(int height: gradeHeights.get(classNo -1)) {
			System.out.println(height);
		}
	}
	
	public void printAverage() {
		double []sum = new double[gradeHeights.size()];
		double []avg = new double[gradeHeights.size()];
		int count = 0;
		for(ArrayList<Integer> grade: gradeHeights) {
			for(int height:grade) {
				sum[count] += height;
			}
			avg[count] = sum[count] / grade.size();
			count++;
		}
		for(int i =0; i< gradeHeights.size(); i++) {
			System.out.println("Clas No."+(i+1)+"");
			System.out.println("Height average:" + avg[i]);
		}
	}
}
