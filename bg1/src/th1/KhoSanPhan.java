package th1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class KhoSanPhan {

	private List<Sanpham> khoChua = new ArrayList<Sanpham>();

	public void them(Sanpham x) {
		this.khoChua.add(x);
	}

	public List<Sanpham> LayDanhSach() {
		// TODO Auto-generated method stub
		return this.khoChua;
	}
    
	
}
