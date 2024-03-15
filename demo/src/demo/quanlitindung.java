package Doancanhan1;

import java.util.Scanner;

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