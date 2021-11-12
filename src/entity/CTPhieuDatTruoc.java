package entity;

public class CTPhieuDatTruoc {
	private int soluongsanpham;
	private double thanhtien;
	private SanPham sp;
	public CTPhieuDatTruoc() {
		// TODO Auto-generated constructor stub
	}
	
	public CTPhieuDatTruoc(int soluongsanpham, SanPham sp) {
		this.soluongsanpham = soluongsanpham;
		this.thanhtien = sp.getGiadonvi()*soluongsanpham;
		this.sp = sp;
	}

	public int getSoluongsanpham() {
		return soluongsanpham;
	}

	public void setSoluongsanpham(int soluongsanpham) {
		this.soluongsanpham = soluongsanpham;
	}

	public double getThanhtien() {
		return soluongsanpham*sp.getGiadonvi();
	}

	public SanPham getSp() {
		return sp;
	}

	public void setSp(SanPham sp) {
		this.sp = sp;
	}
}
