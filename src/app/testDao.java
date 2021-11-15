package app;

import java.awt.Image;
import java.sql.Date;

import javax.swing.ImageIcon;

import connectDB.Database;
import dao.CTHoaDonDao;
import dao.CTPhieuDatTruocDao;
import dao.HoaDonDao;
import dao.KhachHangDao;
import dao.LoaiDao;
import dao.NhanVienDao;
import dao.PhieuDatTruocDao;
import dao.SanPhamDao;
import dao.TaiKhoanDao;
import entity.CTHoaDon;
import entity.CTPhieuDatTruoc;
import entity.HoaDon;
import entity.KhachHang;
import entity.Loai;
import entity.NhanVien;
import entity.PhieuDatTruoc;
import entity.SanPham;
import entity.TaiKhoan;

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
		
		
		HoaDonDao hddao = new  HoaDonDao();
		HoaDon hd = new HoaDon("HD1", new Date(2021-1900,10,11), 10000, nv,kh);
		
		SanPhamDao spdao = new SanPhamDao();
		SanPham sp = new SanPham("SP2", "San pham Van Phong Pham", 10, 100000,9000, "C:\\Users\\Trong\\Pictures\\Screenshots\\Screenshot (1).png","Trung quoc","go",10,"nam cao","nha xuat ban kim dong","cong ty test",new Loai("2"));
		
		
								
		PhieuDatTruocDao pdtdao = new PhieuDatTruocDao();
		PhieuDatTruoc pdt= new PhieuDatTruoc("PDT6",new Date(2021-1900,2,2),new Date(2021-1900,2,3),0, nv,kh,"Chưa nhận hàng");
		
		CTHoaDonDao cthddao= new CTHoaDonDao();
		CTHoaDon cthd = new CTHoaDon(10000,new HoaDon("HD2"),spdao.timSanPham("SP1"));
		
		
		CTPhieuDatTruocDao ctpdtdao= new CTPhieuDatTruocDao();
		CTPhieuDatTruoc ctpdt = new CTPhieuDatTruoc(20,spdao.timSanPham("SP1"),new PhieuDatTruoc("PDT6"));
		
		
		TaiKhoanDao tkdao =new TaiKhoanDao();
		TaiKhoan tk = new TaiKhoan("admin","12341234",new NhanVien("QL1"));
		
		
		// Test KhachHangDAO
			//Them khach hang
//		System.out.println(nvdao.timNhanVien("QL1"));
	
			
			
			//Xoa Khach Hang 	
//		System.out.println(tkdao.xoaTaiKhoan("admin"));
			
			
			//Sua khach hang
//			System.out.println(tkdao.suaMatKhau(tk));
		
		
			//Lay ds khach hang
		tkdao.layDsTaiKhoan().forEach(n->{
			System.out.println(n.toString());
		});
		
			
	}
}
