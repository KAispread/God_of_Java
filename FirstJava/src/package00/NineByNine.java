package package00;

public class NineByNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NineByNine calc = new NineByNine();
		calc.CreateNBN();
	}
	
	public void CreateNBN() {
		startlabel:
		for(short fir = 1; fir < 10 ; fir++) {
			
			for(short sec = 1; sec < 10; sec++) {
				if (sec == 4) continue startlabel;
				String Multiple = sec + "*" + fir + "=" + (fir * sec) + "\t";
				System.out.print(Multiple);
			}
			System.out.println();
		}
	}
}
