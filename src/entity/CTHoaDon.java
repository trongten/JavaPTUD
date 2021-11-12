package entity;

public class CTHoaDon {
	private double thanhtien;
	private int soluongsanpham;
	private SanPham sp;
	
	public CTHoaDon() {
		// TODO Auto-generated constructor stub
	}
	

	public CTHoaDon(int soluongsanpham, SanPham sp) {
		this.thanhtien = soluongsanpham*sp.getGiadonvi();
		this.soluongsanpham = soluongsanpham;
		this.sp = sp;
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
