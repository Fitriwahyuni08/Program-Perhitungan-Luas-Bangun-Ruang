import java.util.Scanner;
public class ujianUAS
{
	public static void main (String args[])
	{
		int f, i, t ;

		int jumlah,j,swap,masukkan,lagi;

		Scanner masuk=new Scanner(System.in);

		System.out.println("");
		System.out.println("		==========|| Project Java ||==========");
		System.out.println("");
		System.out.println("			=========================");
		System.out.println("		=====|| Aplikasi Perhitungan Luas ||=====");
		System.out.println("");
		System.out.println("			|| 1. Luas JajarGenjang ");
		System.out.println("			|| 2. Luas Persegi ");
		System.out.println("			|| 3. Luas Persegi Panjang ");
		System.out.println("			|| 4. Luas Segitiga ");
		System.out.println("			|| 5. Luas Lingkaran ");
		System.out.println("");

		int a[]={3,2,4,5,1};
		String list[]={"Luas JajarGenjang","Luas Persegi","Luas Persegi Panjang","Luas Segitiga","Luas Lingkaran"};

		for(i=0; i<(a.length-1); i++)
		{
			for(j=0; j<a.length-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap; {}
				}
			}
		}

		for(i=0; i<a.length; i++){
			System.out.println(a[i]+"."+list[i]);
		}
		pil:
		for(;;){

		System.out.print("		Masukkan Pilihan Luas  : ");
		int pilihan=masuk.nextInt();
		System.out.println("			=========================");

		System.out.print("	Pilihan Masuk Anda Nomor : "+ pilihan);
		System.out.println("");

		System.out.println("");
		switch (pilihan) {
			case 1:
				System.out.println("	Perhitungan Luas JajarGenjang");
				System.out.println("");
				System.out.print("		Masukkan Alas : ");
				double alas = masuk.nextInt();
				System.out.print("		Masukkan Tinggi : ");
				double tinggi = masuk.nextInt();
				double hitung1 = alas * tinggi / 2;
				System.out.println("");
				System.out.println("==========================");
				System.out.println("	Luas JajarGenjang = " + hitung1);
				break;

			case 2:
				System.out.println("	Perhitungan Luas Persegi");
				System.out.println("");
				System.out.print("		Masukkan Sisi1 : ");
				int sisi1 = masuk.nextInt();
				System.out.print("		Masukkan Sisi2 : ");
				int sisi2 = masuk.nextInt();
				int hitung2 = sisi1 * sisi2;
				System.out.println("	==========================");
				System.out.println("");
				System.out.println("	Luas Persegi = " + hitung2);
				break;

			case 3:
				System.out.println("	Perhitungan Luas Persegi Panjang");
				System.out.println("");
				System.out.print("		Masukkan Panjang : ");
				int panjang = masuk.nextInt();
				System.out.print("Masukan Lebar : ");
				int lebar = masuk.nextInt();
				int hitung3 = panjang * lebar;
				System.out.println("	==========================");
				System.out.println("");
				System.out.println("	Luas Persegi panjang = " + hitung3);
				break;

			case 4:
				System.out.println("	Perhitungan Luas Segitiga");
				System.out.println("");
				System.out.print("Masukan Alas : ");
				double alas1 = masuk.nextInt();
				System.out.print("Masukan Tinggi : ");
				double tinggi2 = masuk.nextInt();
				double hitung4 = (alas1 * tinggi2) / 2;
				System.out.println("	==========================");
				System.out.println("");
				System.out.println("	Luas Segitiga = " + hitung4);
				break;

			case 5:
				System.out.println("	Perhitungan Luas Lingkaran");
				System.out.println("");
				System.out.print("		Masukan jari-jari : ");
				double jari= masuk.nextInt();
				double phi=3.14;
				double hitung5 = jari*phi;
				System.out.println("	==========================");
				System.out.println("");
				System.out.println("	Luas Lingkaran = " + hitung5);
				break;

				default:
					System.out.println("	Perhitungan Luas Tidak Ada Tersedia");
				}

				System.out.println("");
				System.out.print("	Ingin Memasukkan Perhitungan Luas Lagi ? (1:0) : ");
				int lagi1=masuk.nextInt();
				System.out.println("");
				if(lagi1==1){
					continue;

				}else{
					System.exit(0);
				}

		}

	}
}