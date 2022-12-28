package StudyGG;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SinhVien {
	
	
		String HoTen ; 
	    Date NamSinh ;
	    String Lop;
	    
	    
	    
	    SimpleDateFormat sp = new SimpleDateFormat("dd-MM-yyyy");
	    SimpleDateFormat sp1 = new SimpleDateFormat("yyyy");
	    
	    public void inPut() 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhap ho ten sv: ");
	        HoTen = sc.nextLine();
	        System.out.println("Nhap nam sinh cua sv: ");
	        
	            try {
					NamSinh = sp.parse(sc.nextLine());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	         
	        System.out.println("Nhap lop: ");
	        Lop = sc.nextLine();
	    }
	    
	    
	    
	    public void  outPut()
	    {
	        System.out.println("Ho ten cua sv la: "+HoTen);
	        System.out.println("Nam sinh cua sv la: "+sp.format(NamSinh));
	        System.out.println("Lop: "+Lop);
	    }
	    
	    
	    
	    
	    
	    public SinhVien() {
	    }

	    
	    public SinhVien(String HoTen, Date NamSinh, String Lop) {
	        this.HoTen = HoTen;
	        this.NamSinh = NamSinh;
	        this.Lop = Lop;
	    }

	    public String getHoTen() {
	        return HoTen;
	    }

	    public void setHoTen(String HoTen) {
	        this.HoTen = HoTen;
	    }

	    public Date getNamSinh() {
	        return NamSinh;
	    }

	    public void setNamSinh(Date NamSinh) {
	        this.NamSinh = NamSinh;
	    }

	    public String getLop() {
	        return Lop;
	    }

	    public void setLop(String Lop) {
	        this.Lop = Lop;
	    }
}
