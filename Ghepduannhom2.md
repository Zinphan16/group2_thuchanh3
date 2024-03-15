package Baitap;
import java.util.*;
interface QUANLYINTERFACE{
	void napTien(float amount);

    boolean kiemTraHanMuc();

    void LaiSuat();

    void inThongTin();

    void hienThiMenu();
}
abstract class QUANLYTINDUNG implements QUANLYINTERFACE{
    private int id;
    private String tenKhachHang;
    private float soDu;
    private String cccd;
    private String gioiTinh;
    private int soGiaoDich;
    private int diemTinDungThang;
    private String loaiThe;
    private String thongTinKhac;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public float getSoDu() {
		return soDu;
	}

	public void setSoDu(float soDu) {
		this.soDu = soDu;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getSoGiaoDich() {
		return soGiaoDich;
	}

	public void setSoGiaoDich(int soGiaoDich) {
		this.soGiaoDich = soGiaoDich;
	}

	public int getDiemTinDungThang() {
		return diemTinDungThang;
	}

	public void setDiemTinDungThang(int diemTinDungThang) {
		this.diemTinDungThang = diemTinDungThang;
	}

	public String getLoaiThe() {
		return loaiThe;
	}

	public void setLoaiThe(String loaiThe) {
		this.loaiThe = loaiThe;
	}

	public String getThongTinKhac() {
		return thongTinKhac;
	}

	public void setThongTinKhac(String thongTinKhac) {
		this.thongTinKhac = thongTinKhac;
	}

	
    public void input() {
  
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Nhập tên khách hàng: ");
        this.tenKhachHang = scanner.nextLine();

        System.out.print("Nhập số dư: ");
        this.soDu = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Nhập CC: ");
        this.cccd = scanner.nextLine();

        System.out.print("Nhập giới tính: ");
        this.gioiTinh = scanner.nextLine();

        System.out.print("Nhập số giao dịch: ");
        this.soGiaoDich = scanner.nextInt();

        System.out.print("Nhập điểm tín dụng tháng: ");
        this.diemTinDungThang = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập loại thẻ: ");
        this.loaiThe = scanner.nextLine();

        System.out.print("Nhập thông tin khác: ");
        this.thongTinKhac = scanner.nextLine();
    }

 
    public void napTien(float amount) {
        if (amount > 0) {
            this.soDu += amount;
            System.out.println("Số dư sau nạp tiền: " + this.soDu);
        } else {
            System.out.println("Số tiền nạp không hợp lệ.");
        }
    }

   
    public boolean kiemTraHanMuc() {
        return this.soDu >= 2000000;
    }

 
    public void LaiSuat() {
        float laiSuat1Nam = this.soDu * 0.07f;
        System.out.println("Lãi suất 7% trong 1 năm là: " + laiSuat1Nam);
    }

  
    public void inThongTin() {
    	
        System.out.println("Thông tin khách hàng:");
        System.out.println("ID: " + this.id);
        System.out.println("Tên khách hàng: " + this.tenKhachHang);
        System.out.println("Số dư: " + this.soDu);
        System.out.println("CC: " + this.cccd);
        System.out.println("Giới tính: " + this.gioiTinh);
        System.out.println("Số giao dịch: " + this.soGiaoDich);
        System.out.println("Điểm tín dụng tháng: " + this.diemTinDungThang);
        System.out.println("Loại thẻ: " + this.loaiThe);
        System.out.println("Thông tin khác: " + this.thongTinKhac);
    }

  
    public void kiemTraDiemTinDung() {
        if (this.diemTinDungThang == 100) {
            System.out.println("Điểm tín dụng 100 - Khách hàng đáng tin cậy.");
        } else {
            System.out.println("Điểm tín dụng không đạt 100.");
        }
    }

    
    public void hienThiMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn một trong các chức năng sau:");
        System.out.println("1. Nạp tiền");
        System.out.println("2. Kiểm tra hạn mức");
        System.out.println("3. Hiển thị lãi suất");
        System.out.println("4. In thông tin");
        System.out.println("5. Kiểm tra điểm tín dụng");
        System.out.print("Nhập số tương ứng với chức năng: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Nhập số tiền bạn muốn nạp vào tài khoản: ");
                float amount = scanner.nextFloat();
                napTien(amount);
                break;
            case 2:
                boolean hanMucStatus = kiemTraHanMuc();
                System.out.println("Hạn mức: " + (hanMucStatus ? "Đủ" : "Không đủ"));
                break;
            case 3:
                LaiSuat();
                break;
            case 4:
                inThongTin();
                break;
            case 5:
                kiemTraDiemTinDung();
                break;
            default:
                System.out.println("Chức năng không hợp lệ.");
        }
    }
}
 class THETINDUNG extends QUANLYTINDUNG  {
    private String loaiThe;
    private String soTheMongMuon;
    private float hanMucThe;
    private String ngheNghiep;
    private String mucLuongHienTai;
    private int sdt;
    private String nguoiTraNo;
    private String mauUuDai;
    private String kyHan;
    private String hanMucMongMuon;
    private String ngayDaoHanCuoi;

    public String getLoaiThe() {
		return loaiThe;
	}

	public void setLoaiThe(String loaiThe) {
		this.loaiThe = loaiThe;
	}

	public String getSoTheMongMuon() {
		return soTheMongMuon;
	}

	public void setSoTheMongMuon(String soTheMongMuon) {
		this.soTheMongMuon = soTheMongMuon;
	}

	public float getHanMucThe() {
		return hanMucThe;
	}

	public void setHanMucThe(float hanMucThe) {
		this.hanMucThe = hanMucThe;
	}

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}

	public String getMucLuongHienTai() {
		return mucLuongHienTai;
	}

	public void setMucLuongHienTai(String mucLuongHienTai) {
		this.mucLuongHienTai = mucLuongHienTai;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	public String getNguoiTraNo() {
		return nguoiTraNo;
	}

	public void setNguoiTraNo(String nguoiTraNo) {
		this.nguoiTraNo = nguoiTraNo;
	}

	public String getMauUuDai() {
		return mauUuDai;
	}

	public void setMauUuDai(String mauUuDai) {
		this.mauUuDai = mauUuDai;
	}

	public String getKyHan() {
		return kyHan;
	}

	public void setKyHan(String kyHan) {
		this.kyHan = kyHan;
	}

	public String getHanMucMongMuon() {
		return hanMucMongMuon;
	}

	public void setHanMucMongMuon(String hanMucMongMuon) {
		this.hanMucMongMuon = hanMucMongMuon;
	}

	public String getNgayDaoHanCuoi() {
		return ngayDaoHanCuoi;
	}

	public void setNgayDaoHanCuoi(String ngayDaoHanCuoi) {
		this.ngayDaoHanCuoi = ngayDaoHanCuoi;
	}
public void input() {
	super.input();
  Scanner scanner = new Scanner(System.in);

  System.out.print("nhập loai Thẻ: ");
  this.setLoaiThe(scanner.nextLine());

  System.out.print("Nhập số thẻ mong muốn: ");
  this.setSoTheMongMuon(scanner.nextLine());

  System.out.print("nhâp han Muc The: ");
  this.setHanMucThe(scanner.nextFloat());
  scanner.nextLine();
  System.out.print("Nhập nghề Nghiệp: ");
  this.setNgheNghiep(scanner.nextLine());

  System.out.print("Nhập mức Luong Hiện Taị: ");
  this.setMucLuongHienTai(scanner.nextLine());

  System.out.print("Nhập số điện thoại: ");
  this.setSdt(scanner.nextInt());
  
  System.out.print("Nhập người  Trả Nợ: ");
  scanner.nextLine();
  this.setNguoiTraNo(scanner.nextLine());

  System.out.print("Nhập mã ưu Đãi: ");
  this.setMauUuDai(scanner.nextLine());

  System.out.print("Nhập Ky han:");
  this.setKyHan(scanner.nextLine());
  
  System.out.print("Nhập hạn Mức Mong Muốn:");
  this.setHanMucMongMuon(scanner.nextLine());
  
  System.out.print("Nhập Ngay đáo hạn cuối:");
  this.setNgayDaoHanCuoi(scanner.nextLine());
}


    public void inThongTin() {
super.inThongTin();
        System.out.println("Thông tin thẻ tín dụng:");
        System.out.println("Loại thẻ: " + loaiThe);
        System.out.println("Số thẻ mong muốn: " + soTheMongMuon);
        System.out.println("Hạn mức thẻ: " + hanMucThe);
        System.out.println("Nghề nghiệp: " + ngheNghiep);
        System.out.println("Mức lương hiện tại: " + mucLuongHienTai);
        System.out.println("Số điện thoại: " + sdt);
        System.out.println("Người trả nợ: " + nguoiTraNo);
        System.out.println("Màu ưu đãi: " + mauUuDai);
        System.out.println("Kỳ hạn: " + kyHan);
        System.out.println("Hạn mức mong muốn: " + hanMucMongMuon);
        System.out.println("Ngày đáo hạn cuối: " + ngayDaoHanCuoi);
    }

    
    public boolean kiemTraKyHan() {
      
        return kyHan.equals("5 năm");
    }

 
    public void kiemTraPhiPhatHanh() {
        System.out.println("Phí phát hành: 50,000 VND");
    }

 
    public void kiemTraNguoiTraNo(String nguoi) {
        if (nguoi.equals(nguoiTraNo)) {
            System.out.println("Người trả nợ trùng khớp.");
        } else {
            System.out.println("Người trả nợ không đúng.");
        }
    }

    
    public boolean kiemTraHanMucDuocCap() {
        
        return hanMucThe == 10000000;
    }

  
    public void hienThiMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Chọn một trong các chức năng sau:");
            System.out.println("......................................");
            System.out.println(". 1. In thông tin                     .");
            System.out.println(". 2. Kiểm tra kỳ hạn                  .");
            System.out.println(". 3. Kiểm tra phí phát hành           .");
            System.out.println(". 4. Kiểm tra người trả nợ            .");
            System.out.println(". 5. Kiểm tra hạn mức được cấp        .");
            System.out.println(". 0. Dừng chương trình                .");
            System.out.println(".......................................");
            
            System.out.print("Nhập số tương ứng với chức năng hoặc 0 để dừng: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inThongTin();
                    break;
                case 2:
                    boolean kyHanResult = kiemTraKyHan();
                    System.out.println("Kỳ hạn: " + (kyHanResult ? "Mãi mãi" : "Không phải mãi mãi"));
                    break;
                case 3:
                    kiemTraPhiPhatHanh();
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Nhập tên người trả nợ: ");
                    String nguoiTraNoInput = scanner.nextLine();
                    kiemTraNguoiTraNo(nguoiTraNoInput);
                    break;
                case 5:
                    boolean hanMucResult = kiemTraHanMucDuocCap();
                    System.out.println("Hạn mức được cấp: " + (hanMucResult ? "Đủ" : "Không đủ"));
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
 class THEGHINO extends QUANLYTINDUNG {

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
} class TINDUNGLIST{

	private float soDu;
	private int diemTinDungThang;

 public void napTien(float amount) {
     if (amount > 0) {
         this.soDu += amount;
         System.out.println("Số dư sau nạp tiền: " + this.soDu);
     } else {
         System.out.println("Số tiền nạp không hợp lệ.");
     }
 }

 public boolean kiemTraHanMuc() {
     return this.soDu >= 2000000;
 }

 public void LaiSuat() {
     float laiSuat1Nam = this.soDu * 0.07f;
     System.out.println("Lãi suất 7% trong 1 năm là: " + laiSuat1Nam);
 }

 public void inThongTin() {
     System.out.println("Thông tin khách hàng:");
     System.out.println("Trạng thái KHÁCH HÀNG TÌM NĂNG:");
     System.out.println(" Số dư TK:"+this.soDu);
     System.out.println(" Quy khách chưa mở thẻ nào bên ngân hang:");
     
     
     
 }

 public void kiemTraDiemTinDung() {
     if (this.diemTinDungThang == 100) {
         System.out.println("Điểm tín dụng 100 - Khách hàng đáng tin cậy.");
     } else {
         System.out.println("Điểm tín dụng không đạt 100.");
     }}
     public void hienThiMenu() {
     Scanner scanner = new Scanner(System.in);
     boolean continueMenu = true;


 do {
     System.out.println("XIN CHÀO QUY KHÁCH ĐẾN VỚI ỨNG DỤNG QUẢN LÝ TÀI CHÍNH:");
     System.out.println("**************************************");
     System.out.println("* 1. Nạp tiền:                       *");
     System.out.println("* 2. Kiểm tra hạn mức:               *");
     System.out.println("* 3. Hiển thị lãi suất:              *");
     System.out.println("* 4. In thông tin:                   *");
     System.out.println("* 5. Kiểm tra điểm tín dụng:         *");
     System.out.println("* 6. Mở thẻ:                         *");
     System.out.println("**************************************");
     System.out.print("Nhập số tương ứng với chức năng: ");

   
	int choice = scanner.nextInt();

     switch (choice) {
         case 1:
             System.out.print("Nhập số tiền bạn muốn nạp vào tài khoản: ");
             float amount = scanner.nextFloat();
             napTien(amount);
             break;
         case 2:
             boolean hanMucStatus = kiemTraHanMuc();
             System.out.println("Hạn mức: " + (hanMucStatus ? "Đủ" : "Không đủ"));
             break;
         case 3:
             LaiSuat();
             break;
         case 4:
             inThongTin();
             break;
         case 5:
             kiemTraDiemTinDung();
             break;
         case 6:
             continueMenu = false;
             System.out.println("Dừng chương trình.");
             break;
         default:
             System.out.println("Chức năng không hợp lệ.");
     }

 } while (continueMenu);
}}
public class Doancanhan  {
	 static Scanner scanner = new Scanner(System.in);
	 private static ArrayList<QUANLYTINDUNG> list = new ArrayList<>();
	public static void main(String[] args) {
		  TINDUNGLIST tindunglist = new TINDUNGLIST();
	        tindunglist.hienThiMenu();
	    Doancanhan khachHang = new Doancanhan();
	    khachHang.TINDUNGLIST();

       do {
           System.out.println("Chọn loại thẻ cần mở:");
           System.out.println("...........................");
           System.out.println(". 1. Thẻ Tín Dụng         .");
           System.out.println(". 2. Thẻ Ghi Nợ           .");
           System.out.println(". 3. Đóng chương trình    .");
           System.out.println("...........................");
           System.out.print("Nhập lựa chọn của bạn: ");

           int choice = scanner.nextInt();

           switch (choice) {
               case 1:
                   THETINDUNG theTinDung = new THETINDUNG();
                   theTinDung.input();
                   list.add(theTinDung);
                   theTinDung.hienThiMenu();
                   break;
               case 2:
                   THEGHINO theGhiNo = new THEGHINO();
                   theGhiNo.input();
                   list.add(theGhiNo);
                   theGhiNo.hienThiMenu();
                   break;
               case 3:
                   System.out.println("Chương trình đã đóng.");
                   return;
               default:
                   System.out.println("Lựa chọn không hợp lệ.");
           }

           System.out.print("BẠN CÓ MUỐN TIẾP TỤC MỞ THẺ:? (1: Có, 0: Không): ");
       } while (scanner.nextInt() == 1);
   }
	private void TINDUNGLIST() {
		// TODO Auto-generated method stub
		
	}
}



