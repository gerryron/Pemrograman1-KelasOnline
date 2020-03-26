package SOAL_UTS.nomer2;

import javax.swing.*;

public class AplikasiPenentuNilai extends JFrame {

  public static void main(String[] args) {
    try {
      String m = JOptionPane.showInputDialog("Masukkan Nilai Anda");
      String keterangan;
      if (Integer.parseInt(m) >= 75) {
        JOptionPane.showMessageDialog(null, "Lulus");
      } else {
        JOptionPane.showMessageDialog(null, "Tidak Lulus");
      }
    } catch (NumberFormatException e){
      JOptionPane.showMessageDialog(null, "Masukkan Angka");
      System.out.println(e);
    }
  }
}
