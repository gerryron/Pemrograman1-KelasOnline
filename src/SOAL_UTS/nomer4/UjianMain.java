package SOAL_UTS.nomer4;

import SOAL_UTS.nomer3.Ujian;

public class UjianMain {

  public static void main(String[] args) {
    // 4.A Buatlah perintah untuk membuat 4 objek type class Ujian dengan nama objek : uts, uas, utsSusulan, uasSusulan
    Ujian uts = new Ujian();
    Ujian uas = new Ujian();
    Ujian utsSusulan = new Ujian();
    Ujian uasSusulan = new Ujian();

    // 4.B Berilah perintah untuk mendapatkan isi data mataKuliah dari objek uts
    String mataKuliahUTS = uts.getMataKuliah();

    // 4.C Berilah perintah untuk mendapatkan isi data jumlahSiswa dari objek uas
    int jumlahSiswaUAS = uas.getJumlahSiswa();

    // 4.D Berilah perintah untuk menetapkan isi data mataKuliah untuk objek utsSusulan
    utsSusulan.setMataKuliah("PEMROGRAMAN 1");

    // 4.E Berilah perintah untuk menetapkan isi data mataKuliah untuk objek uasSusulan
    uasSusulan.setJumlahSiswa(35);

  }


}
