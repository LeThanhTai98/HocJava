package th1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class DemoCollection {
  public static void main(String[] args) {
		 KhoSanPhan kho = new KhoSanPhan();
		 
   	  for(int i=0;i<10;i++){
     Sanpham a = new Sanpham(i,"quan K",i+1);
     kho.them(a);
	  }
	 List<Sanpham> tam = kho.LayDanhSach();
	 for(Sanpham temp : tam){
	    System.out.println(temp.toString());
	 
	 }
	}
}
