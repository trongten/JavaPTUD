package entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class PhieuDatTruoc {


	private String maphieudat;
	private LocalDate ngaylap;
	private LocalDate ngaynhanhang;
	private List<CTPhieuDatTruoc> ctpdt;
	private double tongtienhoadon;
	private KhachHang kh;
	
	public PhieuDatTruoc() {
	}

	public PhieuDatTruoc(LocalDate ngaylap, LocalDate ngaynhanhang, List<CTPhieuDatTruoc> ctpdt) {
		this.ngaylap = ngaylap;
		this.ngaynhanhang = ngaynhanhang;
		this.ctpdt = ctpdt;
	}
	
	
	public PhieuDatTruoc(String maphieudat, LocalDate ngaylap, LocalDate ngaynhanhang, List<CTPhieuDatTruoc> ctpdt,
			KhachHang kh) {
		super();
		this.maphieudat = maphieudat;
		this.ngaylap = ngaylap;
		this.ngaynhanhang = ngaynhanhang;
		this.ctpdt = ctpdt;
		this.kh = kh;
	}

	public PhieuDatTruoc(String maphieudat, LocalDate ngaylap, LocalDate ngaynhanhang) {
		super();
		this.maphieudat = maphieudat;
		this.ngaylap = ngaylap;
		this.ngaynhanhang = ngaynhanhang;
	}

	public List<CTPhieuDatTruoc> getCtpdt() {
		return ctpdt;
	}

	public void setCtpdt(List<CTPhieuDatTruoc> ctpdt) {
		this.ctpdt = ctpdt;
	}

	public double getTongtienhoadon() {
		return ctpdt
				.stream()
				.mapToDouble(ctpdt -> ctpdt.getThanhtien())
				.sum();
	}

	public void setTongtienhoadon(double tongtienhoadon) {
		this.tongtienhoadon = tongtienhoadon;
	}

	public String getMaphieudat() {
		return maphieudat;
	}

	public void setMaphieudat(String maphieudat) {
		this.maphieudat = maphieudat;
	}

	public LocalDate getNgaylap() {
		return ngaylap;
	}

	public void setNgaylap(LocalDate ngaylap) {
		this.ngaylap = ngaylap;
	}

	public LocalDate getNgaynhanhang() {
		return ngaynhanhang;
	}

	public void setNgaynhanhang(LocalDate ngaynhanhang) {
		this.ngaynhanhang = ngaynhanhang;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maphieudat);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhieuDatTruoc other = (PhieuDatTruoc) obj;
		return Objects.equals(maphieudat, other.maphieudat);
	}
	
}
