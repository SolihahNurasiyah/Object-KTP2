public class Biodata1 extends KTP1
{
	
	public Biodata1(String nik, String nama, String ttl, String jk, String alamat, String agama, String status, String pekerjaan, String kewarganegaraan, String goldar, String berlaku)
	{
		super (nik, nama, ttl, jk, alamat, agama, status, pekerjaan, kewarganegaraan, goldar, berlaku);
	}	
	
	//Override
	public void Kabupaten()
	{
		System.out.println("KABUPATEN MAJALENGKA");
	}
}
