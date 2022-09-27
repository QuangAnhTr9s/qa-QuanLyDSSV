package BT_DanhSachSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DSachSV {
    private ArrayList<SinhVien> danhSach;

    public DSachSV() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public DSachSV(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void addSVien(SinhVien sinhVien) {
        this.danhSach.add(sinhVien);
    }

    public void inSVien() {
        for (SinhVien sinhVien :
                danhSach) {
            System.out.println(sinhVien.toString());
        }
    }

    public boolean kTraDSachRong() {
        return this.danhSach.isEmpty();
    }

    public int soLuongSinhVien(){
        return this.danhSach.size();
    }
    public void lamRongDSach(){
        this.danhSach.removeAll(danhSach);
    }
    public boolean kTraSV(SinhVien sinhVien){
        return this.danhSach.equals(sinhVien);
    }
    public void xoaSV(SinhVien sinhVien){
        this.danhSach.remove(sinhVien);
    }

    public void timSV(String ten){
        for(SinhVien sinhVienCheck : danhSach){
            if(sinhVienCheck.getName().indexOf(ten)>=0){
                System.out.println(sinhVienCheck.toString());
            }
        }
    }
    public void sapXepDS(){
        Collections.sort(danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiemTB() > o2.getDiemTB()){
                    return -1;
                } else if (o1.getDiemTB() < o2.getDiemTB()){
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }


}
