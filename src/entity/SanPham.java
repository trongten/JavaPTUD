package entity;

import java.util.Objects;

public class SanPham {

	private String masanpham;
	private String tensanpham;
	private double giadonvi;
	private double gianhap;
	private String chatlieu;
	private String nhaxuatban;
	private int sotrang;
	private String tentacgia;
	private String xuatxu;
	private String anhsanpham;
	private String nhacungcap;
	private int soluong;
	private Loai loai;

	public SanPham() {
		// TODO Auto-generated constructor stub
	}

	public SanPham(String masanpham) {
		this.masanpham = masanpham;
	}

	public SanPham(String masanpham, String tensanpham, double gianhap, String chatlieu, String nhaxuatban, int sotrang,
			String tentacgia, String xuatxu, String anhsanpham, String nhacungcap, int soluong, Loai loai) {
		this.masanpham = masanpham;
		this.tensanpham = tensanpham;
		this.giadonvi = gianhap * 0.1 + gianhap;
		this.gianhap = gianhap;
		this.chatlieu = chatlieu;
		this.nhaxuatban = nhaxuatban;
		this.sotrang = sotrang;
		this.tentacgia = tentacgia;
		this.xuatxu = xuatxu;
		this.anhsanpham = anhsanpham;
		this.nhacungcap = nhacungcap;
		this.soluong = soluong;
		this.loai = loai;
	}

	public String getMasanpham() {
		return masanpham;
	}

	public void setMasanpham(String masanpham) {
		this.masanpham = masanpham;
	}

	public String getTensanpham() {
		return tensanpham;
	}

	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}

	public double getGiadonvi() {
		return gianhap * 0.1 + gianhap;
	}

	public double getGianhap() {
		return gianhap;
	}

	public void setGianhap(double gianhap) {
		this.gianhap = gianhap;
	}

	public String getChatlieu() {
		return chatlieu;
	}

	public void setChatlieu(String chatlieu) {
		this.chatlieu = chatlieu;
	}

	public String getNhaxuatban() {
		return nhaxuatban;
	}

	public void setNhaxuatban(String nhaxuatban) {
		this.nhaxuatban = nhaxuatban;
	}

	public int getSotrang() {
		return sotrang;
	}

	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}

	public String getTentacgia() {
		return tentacgia;
	}

	public void setTentacgia(String tentacgia) {
		this.tentacgia = tentacgia;
	}

	public String getXuatxu() {
		return xuatxu;
	}

	public void setXuatxu(String xuatxu) {
		this.xuatxu = xuatxu;
	}

	public String getAnhsanpham() {
		return anhsanpham;
	}

	public void setAnhsanpham(String anhsanpham) {
		this.anhsanpham = anhsanpham;
	}

	public String getNhacungcap() {
		return nhacungcap;
	}

	public void setNhacungcap(String nhacungcap) {
		this.nhacungcap = nhacungcap;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	@Override
	public int hashCode() {
		return Objects.hash(masanpham);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham other = (SanPham) obj;
		return Objects.equals(masanpham, other.masanpham);
	}

	@Override
	public String toString() {
		return "SanPham [masanpham=" + masanpham + ", tensanpham=" + tensanpham + ", giadonvi=" + giadonvi
				+ ", gianhap=" + gianhap + ", chatlieu=" + chatlieu + ", nhaxuatban=" + nhaxuatban + ", sotrang="
				+ sotrang + ", tentacgia=" + tentacgia + ", xuatxu=" + xuatxu + ", anhsanpham=" + anhsanpham
				+ ", nhacungcap=" + nhacungcap + ", soluong=" + soluong + "]";
	}

}
