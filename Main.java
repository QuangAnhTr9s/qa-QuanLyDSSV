package BT_DanhSachSV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DSachSV dSachSV = new DSachSV();
        boolean check = true;
        do {
            System.out.println("MENU --------------");
            System.out.println("Vui long chon cac chuc nang: ");
            System.out.println("1.	Them sinh vien vao danh sach.\n"
                    + "2.	In danh sach sinh vien ra man hinh.\n"
                    + "3.	Kiem tra danh sach co rong hay khong.\n"
                    + "4.	Lay ra so luong sinh vien trong danh sach.\n"
                    + "5.	Lam rong danh sach sinh vien.\n"
                    + "6.	Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien.\n"
                    + "7.	Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien.\n"
                    + "8.	Tim kiem TAT CA sinh vien dua tren TEN duoc nhap tu ban phim.\n"
                    + "9.	Xuat ra danh sach sinh vien co diem tu cao den thap.\n"
                    + "0.   Thoat khoi chuong trinh");
            int luaChon = scanner.nextInt();
            //them scanner.nextInt() vao day de doc dau Enter
            scanner.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhap ma sinh vien: ");
                    String ID = scanner.nextLine();
                    System.out.println("Nhap ho va ten sinh vien: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhap ngay sinh cua sinh vien: ");
                    int dateOfBirth = scanner.nextInt();
                    System.out.println("Nhap diem trung binh cua sinh vien: ");
                    float diemTB = scanner.nextFloat();
                    SinhVien sinhVien = new SinhVien(ID, name, dateOfBirth, diemTB);
                    dSachSV.addSVien(sinhVien);
                    break;
                case 2:
                    dSachSV.inSVien();
                    break;
                case 3:
                    boolean c = dSachSV.kTraDSachRong();
                    if (c) {
                        System.out.println("Danh sach rong!");
                    } else {
                        System.out.println("Danh sach khong rong!");
                    }
                    break;
                case 4:
                    System.out.println("So luong sinh vien: " + dSachSV.soLuongSinhVien());
                    break;
                case 5:
                    dSachSV.lamRongDSach();
                    System.out.println("Da lam rong danh sach!");
                    break;
                case 6:
                    System.out.println("Nhap ma sinh vien can kiem tra: "); String maSVCheck = scanner.nextLine();
                    // ham equal so sanh voi mot doi tuong
                    // => can tao mot sinh vien moi co ma SVien minh can check
                    SinhVien sinhVienCheck = new SinhVien(maSVCheck);
                    Boolean checkMaSV = dSachSV.kTraSV(sinhVienCheck);
                    if (checkMaSV){
                        System.out.println("Sinh vien da co trong danh sach!");
                    } else {
                        System.out.println("Sinh vien khong co trong danh sach!");
                    }
                    break;
                case 7:
                    System.out.println("Nhap ma sinh vien can kiem tra: "); String maSVCheck2 = scanner.nextLine();
                    SinhVien sinhVienCheck2 = new SinhVien(maSVCheck2);
                    Boolean checkMaSV2 = dSachSV.kTraSV(sinhVienCheck2);
                    if (checkMaSV2){
                        System.out.println("Sinh vien da co trong danh sach!");
                    } else {
                        dSachSV.xoaSV(sinhVienCheck2);
                        System.out.println("Sinh vien da bi xoa khoi danh sach!");
                    }
                    break;
                case 8:
                    System.out.println("Nhap TEN sinh vien can kiem tra: "); String tenSVCheck = scanner.nextLine();
                    dSachSV.timSV(tenSVCheck);
                    break;
                case 9:
                    dSachSV.sapXepDS();
                    dSachSV.inSVien();
                    break;
                case 0:
                    check = false;
                    break;
            }

        } while (check);


    }
}
