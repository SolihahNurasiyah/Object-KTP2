class ProgramKTP1
{
	public static void main(String[]args)
	{
		Biodata1 biodata = new Biodata1 ("3210026810000002","Solihah Nurasiyah","Majalengka, 28 Oktober 2000","Perempuan","Blok Minggu RT/RW. 004/002 Desa Sindanghurip, Kecamatan bantarujeg","Islam","Belum Kawin","Pelajar/Mahasiswa","WNI", "O","Seumur Hidup" );
		biodata.Provinsi();
		biodata.Kabupaten();
		biodata.DC("SINDANGHURIP","BANTARUJEG");
		biodata.bio();
	}
}