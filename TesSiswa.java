//Driver Class
import java.util.Scanner;

public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();

        siswa dicky =  new siswa(id, nama, ipk);
        //nilai diatas 75 lulus
        if (dicky.getIpk() >= 75) {
            System.out.println(dicky.getNama() + "Lulus");
         } else{
            System.out.println(dicky.getNama() + "Tidak lulus");
         }

         //nilai huruf
         if (dicky.getIpk() <60){
            System.out.println("E");
         } else if (dicky.getIpk() > 61 && dicky.getIpk() <= 70 ) {

         } else if (dicky.getIpk() > 71 && dicky.getIpk() <= 80 ) {
            System.out.println("D"); 
        }  else if (dicky.getIpk() > 81 && dicky.getIpk() <= 90 ) {
            System.out.println("C"); 
        }  else if (dicky.getIpk() > 91 && dicky.getIpk() <= 99 ) {
            System.out.println("B"); 
        } else if (dicky.getIpk() > 99 && dicky.getIpk() <= 100 ) {
            System.out.println("A"); 
        } 
         in.close();
    } 
    }
