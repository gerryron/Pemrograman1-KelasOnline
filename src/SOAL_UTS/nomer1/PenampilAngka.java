package SOAL_UTS.nomer1;

public class PenampilAngka {
  public static void main(String[] args) {
    int j=1000;
    int count =0;
    int sum=0;
    int genap = 5;
    for(int i=100; i<=j; i++){
      if(i%4==0 && i%6!=0){
        if(count%genap==0){
          System.out.println();
        }
        System.out.print("\t"+i);
        count++;
        sum+=i;
      }
    }
    System.out.println("\nJumlah Angka= "+ count);
    System.out.println("Hasil Pemjumlahan= " + sum);
  }
}
