package SOAL_UTS.nomer3;

public class Ujian {
  private String mataKuliah = "Logika Informatika";
  private int jumlahSiswa = 40;

  public Ujian() {
  }

  public Ujian(String mataKuliah, int jumlahSiswa) {
    this.mataKuliah = mataKuliah;
    this.jumlahSiswa = jumlahSiswa;
  }

  public String getMataKuliah() {
    return mataKuliah;
  }

  public void setMataKuliah(String mataKuliah) {
    this.mataKuliah = mataKuliah;
  }

  public int getJumlahSiswa() {
    return jumlahSiswa;
  }

  public void setJumlahSiswa(int jumlahSiswa) {
    this.jumlahSiswa = jumlahSiswa;
  }

  @Override
  public String toString() {
    return "Ujian{" +
        "mataKuliah='" + mataKuliah + '\'' +
        ", jumlahSiswa=" + jumlahSiswa +
        '}';
  }
}
