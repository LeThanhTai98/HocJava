package th1;

public class Sanpham {
 
	
	public Sanpham(int ID, String Ten, int MaLoai) {
    this.ID = ID ;
    this.Ten = Ten ;
    this.MaLoai = MaLoai ;
	}
	private int ID;
	private String Ten;
	private int MaLoai;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID :" + this.ID + "Ten san pham :" + this.Ten + "Ma loai :" + this.MaLoai;
	}
}
