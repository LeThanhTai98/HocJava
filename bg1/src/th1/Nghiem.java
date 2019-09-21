package th1;

public class Nghiem {

	private double x1;
	private double x2;

	public Nghiem(double i, double j) {
        this.x1 = i ;
        this.x2 = j ;
	}
	
	
    @Override
    public String toString() {
    	return String.format(" %s , %s",this.x1,this.x2);
    }
}
