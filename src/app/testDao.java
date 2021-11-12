package app;

import java.sql.Date;

import connectDB.Database;
import dao.KhachHangDao;
import dao.LoaiDao;
import dao.NhanVienDao;
import entity.KhachHang;
import entity.Loai;
import entity.NhanVien;

public class testDao {
	public static void main(String[] args) {
		
		final NhanVien QL = new NhanVien("QL1");
		
		Database.getInstance().connect();
		KhachHangDao khdao= new KhachHangDao();
		KhachHang kh= new KhachHang("KH1","Phan Vo Trong", "0123345567");
		
		LoaiDao loaidao= new LoaiDao();
		Loai loai = new Loai("Loai 1" , "2");
		
		
		NhanVienDao nvdao =new NhanVienDao();
		NhanVien nv = new NhanVien("NV1", "Nguyen", new Date(2001,03,05), "Con Lon", "45645456456", false, false, 1, QL, "0333339392");
		
		
		// Test KhachHangDAO
			//Them khach hang
//			System.out.println(nvdao.themNhanVien(nv));
	
			
			
			//Xoa Khach Hang 	
//			System.out.println(nvdao.xoaNhanVien("NV3"));
			
			
			//Sua khach hang
		//	System.out.println(nvdao.suaNhanVien(nv));
		
		
			//Lay ds khach hang
//		nvdao.layDsNhanVien().forEach(n->{
//			System.out.println(n.toString());
//		});
//		
		
		
		
			
	}
}
