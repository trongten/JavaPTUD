package entity;

import java.util.Objects;

public class NhanVien {
	private String manhanvien;
	private String hoten;
	private String diachi;
	private String sdt;
	private boolean gioitinh;
	private boolean chucvu;
	private byte ca;
	private String maql;

	public NhanVien() {
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String manv, String hoten, String diachi, String sdt, boolean gioitinh, boolean chucvu, byte ca,
			String maql) {
		this.manhanvien = manv;
		this.hoten = hoten;
		this.diachi = diachi;
		this.sdt = sdt;
		this.gioitinh = gioitinh;
		this.chucvu = chucvu;
		this.ca = ca;
		this.maql = maql;
	}

	public String getManv() {
		return manhanvien;
	}

	public void setManv(String manv) {
		this.manhanvien = manv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public boolean isGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public boolean isChucvu() {
		return chucvu;
	}

	public void setChucvu(boolean chucvu) {
		this.chucvu = chucvu;
	}

	public byte getCa() {
		return ca;
	}

	public void setCa(byte ca) {
		this.ca = ca;
	}

	public String getMaql() {
		return maql;
	}

	public void setMaql(String maql) {
		this.maql = maql;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(manhanvien);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(manhanvien, other.manhanvien);
	}

	@Override
	public String toString() {
		return "NhanVien [manhanvien=" + manhanvien + ", hoten=" + hoten + ", diachi=" + diachi + ", sdt=" + sdt + ", gioitinh="
				+ gioitinh + ", chucvu=" + chucvu + ", ca=" + ca + ", maql=" + maql + "]";
	}
}
