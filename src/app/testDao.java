package app;

import java.awt.Image;
import java.sql.Date;

import javax.swing.ImageIcon;

import connectDB.Database;
import dao.HoaDonDao;
import dao.KhachHangDao;
import dao.LoaiDao;
import dao.NhanVienDao;
import dao.PhieuDatTruocDao;
import dao.SanPhamDao;
import entity.HoaDon;
import entity.KhachHang;
import entity.Loai;
import entity.NhanVien;
import entity.PhieuDatTruoc;
import entity.SanPham;

public class testDao {
	

	public static void main(String[] args) {
		
		final NhanVien QL = new NhanVien("QL1");
		
		Database.getInstance().connect();
		KhachHangDao khdao= new KhachHangDao();
		KhachHang kh= new KhachHang("KH1","Phan Vo Trong", "0123345567");
		
		LoaiDao loaidao= new LoaiDao();
		Loai loai = new Loai("Loai 1" , "2");
		
		
		NhanVienDao nvdao =new NhanVienDao();
		NhanVien nv = new NhanVien("NV1", "Nguyen", new Date(2001-1900,03,05), "Con Lon", "45645456456", false, false, 1, QL, "0333339392");
		
		
		HoaDonDao hddao = new HoaDonDao();
		HoaDon hd = new HoaDon("HD1", new Date(2021-1900,10,11), 10000, nv,kh);
		
		SanPhamDao spdao = new SanPhamDao();
		SanPham sp = new SanPham("SP1", "San pham test", 10, 100000,90000, "C:\\Users\\Trong\\Pictures\\Screenshots\\Screenshot (1).png",new Loai("2"));
		
		
		
		PhieuDatTruocDao pdtdao = new PhieuDatTruocDao();
		PhieuDatTruoc pdt= new PhieuDatTruoc("PDT2",new Date(2021-1900,2,2),new Date(2021-1900,2,3),0, nv,kh);
		
		// Test KhachHangDAO
			//Them khach hang
//		System.out.println(pdtdao.themPhieuDatTruoc(pdt));
	
			
			
			//Xoa Khach Hang 	
//		System.out.println(pdtdao.xoaPhieuDatTruoc("PDT3"));
			
			
			//Sua khach hang
//			System.out.println(pdtdao.suaPhieuDatTruoc(pdt));
		
		
			//Lay ds khach hang
		pdtdao.layDsPhieuDatTruoc().forEach(n->{
			System.out.println(n.toString());
		});
		
		
		
		
			
	}
}
