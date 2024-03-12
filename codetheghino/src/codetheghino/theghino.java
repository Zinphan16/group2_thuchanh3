package theghino;

import java.util.Scanner;

public class THEGHINO extends QUANLYTINDUNG {

    private String tenNganHang;
    private String loaiThe;
    private float hanMucToiThieu;
    private float hanMucToiDa;
    private String ngayHetHan;
    private int maBaoMat;

    public String getTenNganHang() {
		return tenNganHang;
	}

	public void setTenNganHang(String tenNganHang) {
		this.tenNganHang = tenNganHang;
	}

	public String getLoaiThe() {
		return loaiThe;
	}

	public void setLoaiThe(String loaiThe) {
		this.loaiThe = loaiThe;
	}

	public float getHanMucToiThieu() {
		return hanMucToiThieu;
	}

	public void setHanMucToiThieu(float hanMucToiThieu) {
		this.hanMucToiThieu = hanMucToiThieu;
	}

	public float getHanMucToiDa() {
		return hanMucToiDa;
	}

	public void setHanMucToiDa(float hanMucToiDa) {
		this.hanMucToiDa = hanMucToiDa;
	}

	public String getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(String ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public int getMaBaoMat() {
		return maBaoMat;
	}

	public void setMaBaoMat(int maBaoMat) {
		this.maBaoMat = maBaoMat;
	}
public void input(){
	super.input();
	  Scanner scanner = new Scanner(System.in);
	 System.out.print("Nhập tên ngân hàng: ");
     this.setTenNganHang(scanner.nextLine());

     System.out.print("Nhập loại thẻ: ");
     this.setLoaiThe(scanner.nextLine());

     System.out.print("Nhập hạn mức tối thiểu: ");
     this.setHanMucToiThieu(scanner.nextFloat());

     System.out.print("Nhập hạn mức tối đa: ");
     this.setHanMucToiDa(scanner.nextFloat());

     scanner.nextLine(); 

     System.out.print("Nhập ngày hết hạn: ");
     this.setNgayHetHan(scanner.nextLine());

     System.out.print("Nhập mã bảo mật: ");
     this.setMaBaoMat(scanner.nextInt());
 }

    public void thayDoiMaBaoMat(String nguoi) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mật khẩu hiện tại: ");
        int matKhauHienTai = scanner.nextInt();

        if (matKhauHienTai == maBaoMat) {
            System.out.print("Nhập mật khẩu mới: ");
            int matKhauMoi = scanner.nextInt();

            
            maBaoMat = matKhauMoi;
            System.out.println("Mật khẩu đã được thay đổi.");
        } else {
            System.out.println("Mật khẩu hiện tại không đúng. Không thể thay đổi.");
        }
    }

   
    public boolean hienThiHanMucToiDaVaToiThieu() {
        System.out.println("Hạn mức tối thiểu: " + hanMucToiThieu);
        System.out.println("Hạn mức tối đa: " + hanMucToiDa);
        return true;
    }

  
    public void hienThiNgayHetHan() {
        System.out.println("Ngày hết hạn: " + ngayHetHan);
    }

 
    public void napTienVaoThe() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền bạn muốn nạp: ");
        float soTienNap = scanner.nextFloat();

   
        System.out.println("Đã nạp " + soTienNap + " vào thẻ.");
    }
    public void inThongTin() {
    	 super.inThongTin();
        System.out.println("Thông tin thẻ ghi nợ:");
        System.out.println("Tên ngân hàng: " + tenNganHang);
        System.out.println("Loại thẻ: " + loaiThe);
        System.out.println("Hạn mức tối thiểu: " + hanMucToiThieu);
        System.out.println("Hạn mức tối đa: " + hanMucToiDa);
        System.out.println("Ngày hết hạn: " + ngayHetHan);
        System.out.println("Mã bảo mật: " + maBaoMat);

       
       
    }
   

    public void hienThiMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-------------------------------------");
            System.out.println("Chọn một trong các chức năng sau:");
            System.out.println("1. Hiển thị hạn mức tối đa và tối thiểu");
            System.out.println("2. Hiển thị ngày hết hạn");
            System.out.println("3. Nạp tiền vào thẻ");
            System.out.println("4. Thay đổi mật khẩu bảo mật");
            System.out.println("5. In thông tin");
            System.out.print("Nhập số tương ứng với chức năng hoặc 0 để dừng: ");
            System.out.println("\n --------------------------------------");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hienThiHanMucToiDaVaToiThieu();
                    break;
                case 2:
                    hienThiNgayHetHan();
                    break;
                case 3:
                    napTienVaoThe();
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Nhập tên người thay đổi mật khẩu: ");
                    String nguoiThayDoi = scanner.nextLine();
                    thayDoiMaBaoMat(nguoiThayDoi);
                    break;
                case 5:
                    inThongTin();
                    break;
                case 0:
                    System.out.println("Dừng chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        } while (choice != 0);
    }
}