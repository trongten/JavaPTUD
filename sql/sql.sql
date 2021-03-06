USE [master]
GO
/****** Object:  Database [NhaSachTNL]    Script Date: 16/11/2021 12:53:06 CH ******/
CREATE DATABASE [NhaSachTNL]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'NhaSachTNL', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\NhaSachTNL.mdf' , SIZE = 4288KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'NhaSachTNL_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\NhaSachTNL_log.ldf' , SIZE = 1072KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [NhaSachTNL] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [NhaSachTNL].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [NhaSachTNL] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [NhaSachTNL] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [NhaSachTNL] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [NhaSachTNL] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [NhaSachTNL] SET ARITHABORT OFF 
GO
ALTER DATABASE [NhaSachTNL] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [NhaSachTNL] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [NhaSachTNL] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [NhaSachTNL] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [NhaSachTNL] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [NhaSachTNL] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [NhaSachTNL] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [NhaSachTNL] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [NhaSachTNL] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [NhaSachTNL] SET  DISABLE_BROKER 
GO
ALTER DATABASE [NhaSachTNL] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [NhaSachTNL] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [NhaSachTNL] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [NhaSachTNL] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [NhaSachTNL] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [NhaSachTNL] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [NhaSachTNL] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [NhaSachTNL] SET RECOVERY FULL 
GO
ALTER DATABASE [NhaSachTNL] SET  MULTI_USER 
GO
ALTER DATABASE [NhaSachTNL] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [NhaSachTNL] SET DB_CHAINING OFF 
GO
ALTER DATABASE [NhaSachTNL] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [NhaSachTNL] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [NhaSachTNL] SET DELAYED_DURABILITY = DISABLED 
GO
USE [NhaSachTNL]
GO
/****** Object:  Table [dbo].[CTHoaDon]    Script Date: 16/11/2021 12:53:06 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTHoaDon](
	[thanhtien] [money] NULL,
	[soluongsanpham] [int] NULL,
	[mahoadon] [nvarchar](10) NOT NULL,
	[masanpham] [nchar](5) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[mahoadon] ASC,
	[masanpham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[CTPhieuDatTruoc]    Script Date: 16/11/2021 12:53:06 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTPhieuDatTruoc](
	[maphieudat] [nchar](5) NOT NULL,
	[thanhtien] [money] NULL,
	[masanpham] [nchar](5) NOT NULL,
	[soluongsanpham] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[maphieudat] ASC,
	[masanpham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 16/11/2021 12:53:06 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[mahoadon] [nvarchar](10) NOT NULL,
	[tongtienhoadon] [money] NULL,
	[ngaylaphoadon] [date] NOT NULL,
	[manhanvien] [nchar](5) NOT NULL,
	[makhachhang] [nchar](5) NOT NULL,
 CONSTRAINT [PK_HoaDon1] PRIMARY KEY CLUSTERED 
(
	[mahoadon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 16/11/2021 12:53:06 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[makhachhang] [nchar](5) NOT NULL,
	[tenkhachhang] [nvarchar](50) NOT NULL,
	[sodienthoai] [nvarchar](11) NOT NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[makhachhang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiSanPham]    Script Date: 16/11/2021 12:53:06 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSanPham](
	[tenloai] [nvarchar](50) NULL,
	[maloai] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_LoaiSanPham] PRIMARY KEY CLUSTERED 
(
	[maloai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 16/11/2021 12:53:06 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[manhanvien] [nchar](5) NOT NULL,
	[hoten] [nvarchar](100) NOT NULL,
	[ngaysinh] [date] NULL,
	[diachi] [nvarchar](100) NULL,
	[sochungminh] [nvarchar](50) NULL,
	[chucvu] [bit] NOT NULL,
	[gioitinh] [bit] NULL,
	[ca] [smallint] NOT NULL,
	[maquanly] [nchar](5) NULL,
	[sodienthoai] [nvarchar](15) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[manhanvien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PhieuDatTruoc]    Script Date: 16/11/2021 12:53:06 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuDatTruoc](
	[maphieudat] [nchar](5) NOT NULL,
	[ngaylap] [date] NULL,
	[ngaynhanhang] [date] NULL,
	[tongtienphieudat] [money] NULL,
	[manhanvien] [nchar](5) NULL,
	[makhachhang] [nchar](5) NULL,
	[trangthai] [nvarchar](50) NULL,
 CONSTRAINT [PK_PhieuDatTruoc1] PRIMARY KEY CLUSTERED 
(
	[maphieudat] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 16/11/2021 12:53:06 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[masanpham] [nchar](5) NOT NULL,
	[tensanpham] [nvarchar](100) NOT NULL,
	[soluong] [int] NOT NULL,
	[giadonvi] [money] NOT NULL,
	[gianhap] [money] NULL,
	[anhsanpham] [nvarchar](100) NOT NULL,
	[xuatxu] [nvarchar](100) NULL,
	[chatlieu] [nvarchar](100) NULL,
	[sotrang] [tinyint] NOT NULL,
	[tentacgia] [nvarchar](100) NULL,
	[nhaxuatban] [nvarchar](100) NULL,
	[nhacungcap] [nvarchar](100) NULL,
	[maloai] [nvarchar](10) NULL,
 CONSTRAINT [PK_SanPham1] PRIMARY KEY CLUSTERED 
(
	[masanpham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 16/11/2021 12:53:06 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[tentaikhoan] [nchar](16) NOT NULL,
	[matkhau] [nchar](16) NOT NULL,
	[manhanvien] [nchar](5) NOT NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[tentaikhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
ALTER TABLE [dbo].[CTHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_CTHoaDon_HoaDon1] FOREIGN KEY([mahoadon])
REFERENCES [dbo].[HoaDon] ([mahoadon])
GO
ALTER TABLE [dbo].[CTHoaDon] CHECK CONSTRAINT [FK_CTHoaDon_HoaDon1]
GO
ALTER TABLE [dbo].[CTHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_CTHoaDon_SanPham1] FOREIGN KEY([masanpham])
REFERENCES [dbo].[SanPham] ([masanpham])
GO
ALTER TABLE [dbo].[CTHoaDon] CHECK CONSTRAINT [FK_CTHoaDon_SanPham1]
GO
ALTER TABLE [dbo].[CTPhieuDatTruoc]  WITH CHECK ADD  CONSTRAINT [FK_CTPhieuDatTruoc_PhieuDatTruoc1] FOREIGN KEY([maphieudat])
REFERENCES [dbo].[PhieuDatTruoc] ([maphieudat])
GO
ALTER TABLE [dbo].[CTPhieuDatTruoc] CHECK CONSTRAINT [FK_CTPhieuDatTruoc_PhieuDatTruoc1]
GO
ALTER TABLE [dbo].[CTPhieuDatTruoc]  WITH CHECK ADD  CONSTRAINT [FK_CTPhieuDatTruoc_SanPham1] FOREIGN KEY([masanpham])
REFERENCES [dbo].[SanPham] ([masanpham])
GO
ALTER TABLE [dbo].[CTPhieuDatTruoc] CHECK CONSTRAINT [FK_CTPhieuDatTruoc_SanPham1]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon1_KhachHang] FOREIGN KEY([makhachhang])
REFERENCES [dbo].[KhachHang] ([makhachhang])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon1_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon1_NhanVien] FOREIGN KEY([manhanvien])
REFERENCES [dbo].[NhanVien] ([manhanvien])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon1_NhanVien]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_NguoiQuanLy] FOREIGN KEY([maquanly])
REFERENCES [dbo].[NhanVien] ([manhanvien])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_NguoiQuanLy]
GO
ALTER TABLE [dbo].[PhieuDatTruoc]  WITH CHECK ADD  CONSTRAINT [FK_PhieuDatTruoc_KhachHang] FOREIGN KEY([makhachhang])
REFERENCES [dbo].[KhachHang] ([makhachhang])
GO
ALTER TABLE [dbo].[PhieuDatTruoc] CHECK CONSTRAINT [FK_PhieuDatTruoc_KhachHang]
GO
ALTER TABLE [dbo].[PhieuDatTruoc]  WITH CHECK ADD  CONSTRAINT [FK_PhieuDatTruoc1_NhanVien] FOREIGN KEY([manhanvien])
REFERENCES [dbo].[NhanVien] ([manhanvien])
GO
ALTER TABLE [dbo].[PhieuDatTruoc] CHECK CONSTRAINT [FK_PhieuDatTruoc1_NhanVien]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham1_LoaiSanPham] FOREIGN KEY([maloai])
REFERENCES [dbo].[LoaiSanPham] ([maloai])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham1_LoaiSanPham]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_NhanVien] FOREIGN KEY([manhanvien])
REFERENCES [dbo].[NhanVien] ([manhanvien])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_NhanVien]
GO
USE [master]
GO
ALTER DATABASE [NhaSachTNL] SET  READ_WRITE 
GO
