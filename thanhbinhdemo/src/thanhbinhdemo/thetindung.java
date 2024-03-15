package thetindung;

import java.util.Scanner;

public class THETINDUNG extends QUANLYTINDUNG  {
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