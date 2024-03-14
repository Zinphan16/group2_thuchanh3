import java.util.Scanner;

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
