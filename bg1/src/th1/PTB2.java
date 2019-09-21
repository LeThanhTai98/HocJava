package th1;

public class PTB2 {

	private double heSoB;
	private double heSoA;
	private double heSoC;

	public PTB2(double i, double j, double k) {
       this.heSoA = i;
       this.heSoB = j;
       this.heSoC = k;
	
	}

	public Nghiem giai() {
		
		double d = this.delta();
		if(d >= 0){
		   double n1 = -(this.heSoB-Math.sqrt(d))/(2*this.heSoA);
		   double n2 = -(this.heSoB+Math.sqrt(d))/(2*this.heSoA);;
		   return new Nghiem(n1,n2) ;
		}
		return null ;
		
	}

	private double delta() {
		return Math.pow(this.heSoB, 2)-4*this.heSoA*this.heSoC ;
	}

}
