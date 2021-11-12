package entity;

public class CTHoaDon {
	private double thanhtien;
	private int soluongsanpham;
	private SanPham sp;
	private HoaDon hd;
	
	
	public SanPham getSp() {
		return sp;
	}


	public void setSp(SanPham sp) {
		this.sp = sp;
	}


	public HoaDon getHd() {
		return hd;
	}


	public void setHd(HoaDon hd) {
		this.hd = hd;
	}


	


	public CTHoaDon() {
		// TODO Auto-generated constructor stub
	}
	

	public CTHoaDon(int soluongsanpham, SanPham sp,HoaDon hd) {
		this.thanhtien = soluongsanpham*sp.getGiadonvi();
		this.soluongsanpham = soluongsanpham;
		this.sp = sp;
		this.hd=hd;
	}


	public double getThanhtien() {
		return soluongsanpham*sp.getGiadonvi();
	}

	public int getSoluongsanpham() {
		return soluongsanpham;
	}

	public void setSoluongsanpham(int soluongsanpham) {
		this.soluongsanpham = soluongsanpham;
	}
	
	
}
