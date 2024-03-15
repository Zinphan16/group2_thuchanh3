package theatm;

import java.util.ArrayList;
import java.util.Scanner;

public class Doancanhan {
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
