
package th1;

public class main {

	public static void main(String[] args) {
             PTB2 pt = new PTB2(1,2,3);
             Nghiem kq = pt.giai();
             if (kq != null)
	         System.out.println(kq.toString());
             else 
             System.out.println("vo nghiem");
             
	}

}
