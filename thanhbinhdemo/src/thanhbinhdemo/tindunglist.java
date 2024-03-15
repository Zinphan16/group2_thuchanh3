package tindunglist;

import java.util.Scanner;

public class TINDUNGLIST{

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