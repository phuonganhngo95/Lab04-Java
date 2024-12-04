import java.util.Scanner;

public class HoaDonBanhMy {
    int ma, ngay, slg;
    String ten, diaChi;
    double gia, tongHang, tongTien;

    double tienKhuyenMai() {
        if (slg >= 10) {
            return gia * 0.1;
        } else if (slg >= 100) {
            return tongHang * 0.2;
        } else {
            return gia * slg;
        }
    }

    double getTongHang() {
        return gia * slg;
    }
}

class QuanLyHoaDon {
    HoaDonBanhMy nhap(HoaDonBanhMy hd) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã: ");
        hd.ma = sc.nextInt();
        System.out.println("Nhập ngày: ");
        hd.ngay = sc.nextInt();
        sc.nextLine(); // Clear the newline character
        System.out.println("Nhập tên: ");
        hd.ten = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        hd.diaChi = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        hd.slg = sc.nextInt();
        System.out.println("Nhập giá 1 chiếc: ");
        hd.gia = sc.nextDouble();
        return hd;
    }

    void xuat(HoaDonBanhMy hd) {
        System.out.println("MÃ: " + hd.ma);
        System.out.println("NGÀY: " + hd.ngay);
        System.out.println("TÊN: " + hd.ten);
        System.out.println("ĐỊA CHỈ: " + hd.diaChi);
        System.out.println("SỐ LƯỢNG: " + hd.slg);
        System.out.println("GIÁ 1 CHIẾC: " + hd.gia);
        System.out.println("TỔNG TIỀN HÀNG: " + hd.getTongHang());
        System.out.println("TIỀN KHUYẾN MẠI: " + hd.tienKhuyenMai());
        double sum = hd.getTongHang() + hd.tienKhuyenMai();
        System.out.println("TỔNG TIỀN: " + sum);
    }

    public static void main(String[] args) {
        QuanLyHoaDon qlhd = new QuanLyHoaDon();
        HoaDonBanhMy hd = new HoaDonBanhMy();
        qlhd.nhap(hd);
        qlhd.xuat(hd);
    }
}