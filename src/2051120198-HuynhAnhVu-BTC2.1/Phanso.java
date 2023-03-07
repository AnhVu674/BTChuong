package baiTapChuong1;

public class Phanso {
	private int tu;
	private int mau;

	public void rutGonPhanSo() {
		int a = this.tu;
		int b = this.mau;
		int ucln;
		if (a < 0) {
			a = a * (-1);
		}
		if (b < 0) {
			b = b * (-1);
		}
		if (a == 0) {
			ucln = a + b;
		}
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		ucln = a;
		this.tu /= ucln;
		this.mau /= ucln;

	}

	public Phanso(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;

	}

	public Phanso congPS(Phanso s2) {

		int tu = this.tu * s2.mau + s2.tu * this.mau;
		int mau = this.mau * s2.mau;
		Phanso phanSoTong = new Phanso(tu, mau);
		phanSoTong.rutGonPhanSo();
		return phanSoTong;

	}

	public String hienThi() {
		this.rutGonPhanSo();

		return this.tu + "/" + this.mau;
	}

	public Phanso truPS(Phanso s2) {

		int tu = this.tu * s2.mau - s2.tu * this.mau;
		int mau = this.mau * s2.mau;
		Phanso phanSoHieu = new Phanso(tu, mau);
		phanSoHieu.rutGonPhanSo();
		return phanSoHieu;
	}

	public Phanso nhanPS(Phanso s2) {

		int tu = this.tu * s2.tu;
		int mau = this.mau * s2.mau;

		Phanso phanSoTich = new Phanso(tu, mau);
		phanSoTich.rutGonPhanSo();
		return phanSoTich;
	}

	public Phanso chiaPS(Phanso s2) {
		int tu = this.tu * s2.mau;
		int mau = this.mau * s2.tu;

		Phanso phanSoThuong = new Phanso(tu, mau);
		phanSoThuong.rutGonPhanSo();
		return phanSoThuong;
	}

	public static void main(String[] args) {
		Phanso s1 = new Phanso(1,5);
		Phanso s2 = new Phanso(2,4);
		System.out.println(s2.hienThi());
		Phanso tong = s1.congPS(s2);
		System.out.println("tong= " + tong.hienThi());
		Phanso hieu = s1.truPS(s2);
		System.out.println("hieu= " + hieu.hienThi());
		Phanso tich = s1.nhanPS(s2);
		System.out.println("nhan= " + tich.hienThi());
		Phanso thuong = s1.chiaPS(s2);
		System.out.println("thuong= " + thuong.hienThi());
	}
	
}
