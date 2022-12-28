package StudyGG;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.annotation.processing.Messager;
import Date.dateValibale;
import ViduKethua.ThiSinh.thisinh;

//tao class ngoai le
class LoiNgay extends Exception{
	
	public LoiNgay() {
		super("Loi han tra nho hon ngay muon ");
	}

}
public class TheMuon extends SinhVien{//The muon ke thua lop sinh vien
	private int  Sophieuthue ;
	private String sohieusach;
	private Date ngaythue;
	private Date hantra;
	
	//SIMPLEFORMAT
		SimpleDateFormat sp = new SimpleDateFormat("dd-mm-yyyy");
	
	
		
		//ghi de phuong thuc
		
		public void inPut() {
			Scanner sc = new Scanner(System.in);
			super.inPut();
			System.out.print("Nhap so phieu thue: ");
			this.Sophieuthue= sc.nextInt();
			sc.nextLine();//fix
			System.out.println("So hieu sach: ");
			this.sohieusach= sc.nextLine();
			
			//ngaythue
			System.out.println("Ngay thue: ");
			try {
				
				this.ngaythue = sp.parse(sc.nextLine());
				
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//ngaytra
			System.out.println("Ngay tra: ");
			try {
				this.hantra = sp.parse(sc.nextLine());
				if(this.hantra.compareTo(ngaythue) < 0) {
					this.hantra = sp.parse(sc.nextLine());
				}throw new LoiNgay() ; 
			} catch (ParseException | LoiNgay e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
		
		public void outPut() {
			super.outPut();
			System.out.println("So phieu thue: " + this.Sophieuthue);
			System.out.println("So hieu sach: " + this.sohieusach);
			System.out.println("Ngay thue : " + sp.format(this.ngaythue));
			System.out.println("Han tra: " + sp.format(this.hantra));
			
			
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
			//nhap so luong phan tu cua mang
			System.out.println("Nhap so luong the muon! ");
			int n = sc.nextInt();
			
			//tao danh sach
			TheMuon[] arr = new TheMuon[n];
			
			//nhap danh sach
			for (int i = 0; i < n; i++) {
				
				//tao hop rong
				arr[i] = new TheMuon();
				
				
				System.out.println("Nhap phan tu thu :" + (i + 1));
				//bo du lieu vao hop
				arr[i].inPut();
			}
			
			//in danh sach
			for (int i = 0; i < n; i++) {
				arr[i].outPut();
			}
			
		}
		
		
	public int getSophieuthue() {
		return Sophieuthue;
	}
	public void setSophieuthue(int sophieuthue) {
		Sophieuthue = sophieuthue;
	}
	public String getSohieusach() {
		return sohieusach;
	}
	public void setSohieusachString(String sohieusachString) {
		this.sohieusach= sohieusachString;
	}
	public Date getNgaythue() {
		return ngaythue;
	}
	public void setNgaythue(Date ngaythue) {
		this.ngaythue = ngaythue;
	}
	public Date getHantraDate() {
		return hantra;
	}
	public void setHantraDate(Date hantraDate) {
		this.hantra = hantraDate;
	}
	public TheMuon() {
		super();
	}
	public TheMuon(int sophieuthue, String sohieusachString, Date ngaythue, Date hantraDate) {
		super();
		Sophieuthue = sophieuthue;
		this.sohieusach = sohieusachString;
		this.ngaythue = ngaythue;
		this.hantra = hantraDate;
	}
	
	
}
	
