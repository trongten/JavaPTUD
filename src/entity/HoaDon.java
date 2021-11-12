package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HoaDon {
	private String mahoadon;
	private LocalDate ngaylaphoadon;
	private double tongtienhoadon;
	private List<CTHoaDon> cthd;


	public HoaDon() {
		// TODO Auto-generated constructor stub
	}
	
	public HoaDon(String mahoadon, LocalDate ngaylaphoadon, double tongtienhoadon) {
		this.mahoadon = mahoadon;
		this.ngaylaphoadon = ngaylaphoadon;
		this.tongtienhoadon = tongtienhoadon;
		this.cthd = new ArrayList<CTHoaDon>();
	}
	
	public HoaDon(String mahoadon, LocalDate ngaylaphoadon, double tongtienhoadon, List<CTHoaDon> cthd) {
		this.mahoadon = mahoadon;
		this.ngaylaphoadon = ngaylaphoadon;
		this.tongtienhoadon = tongtienhoadon;
		this.cthd = cthd;
	}
	
	

	public String getMahoadon() {
		return mahoadon;
	}

	public void setMahoadon(String mahoadon) {
		this.mahoadon = mahoadon;
	}

	public LocalDate getNgaylaphoadon() {
		return ngaylaphoadon;
	}

	public void setNgaylaphoadon(LocalDate ngaylaphoadon) {
		this.ngaylaphoadon = ngaylaphoadon;
	}

	public double getTongtienhoadon() {
		return tongtienhoadon;
	}

	public void setTongtienhoadon(double tongtienhoadon) {
		this.tongtienhoadon = tongtienhoadon;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mahoadon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(mahoadon, other.mahoadon);
	}
	
}
