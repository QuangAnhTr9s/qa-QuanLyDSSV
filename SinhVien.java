package BT_DanhSachSV;

import java.util.Objects;

public class SinhVien{
    private String ID;
    private String name;
    private int dateOfBirth;
    private float diemTB;

    public SinhVien(String ID) {
        this.ID = ID;
    }

    public SinhVien(String ID, String name, int dateOfBirth, float diemTB) {
        this.ID = ID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.diemTB = diemTB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien " + name + ": " +
                "ID= " + ID + '\'' +
                ", ngay sinh = " + dateOfBirth +
                ", diem trung binh = " + diemTB
                ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(ID, sinhVien.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, dateOfBirth, diemTB);
    }
}
