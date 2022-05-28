import java.util.Scanner;

class Persegi {
	public int panjang;
	public int lebar;
	
	public int luas(){
		return this.panjang * this.lebar;
	}
}

class Kotak extends Persegi {
	public int tinggi;
	
	public int volume() {
		return this.luas() * tinggi;
	}
}


class ContohTurunan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Kotak kotak = new Kotak();
		System.out.print("Masukkan panjang:");
		kotak.panjang = scanner.nextInt();
		System.out.print("Masukkan lebar:");
		kotak.lebar = scanner.nextInt();
		System.out.print("Masukkan tinggi");
		kotak.tinggi = scanner.nextInt();
		System.out.println("Volume kotak adalah " + kotak.volume());
	}
}
