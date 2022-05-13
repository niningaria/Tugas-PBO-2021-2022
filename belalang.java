class belalang {
	private static String jenis_unggas = "belalang" ;
	private static int jumlah_kaki= 2;
	
	public static String getJenisUnggas(){
		return jenis_unggas;
	}
	public static int getJumlahKaki(){
		return jumlah_kaki;
	}
	private static void bersuara(){
		System.out.println("aku bersuara");
	}
		private static void terbang(){
			System.out.println("terbang");
	}
		public static void main (String [] args){
			System.out.println(String.format ("Jenis unggas :%s",getJenisUnggas()));
			System.out.println(String.format ("Jumlah kaki :%s",getJumlahKaki()));

bersuara();
terbang ();
}
}
