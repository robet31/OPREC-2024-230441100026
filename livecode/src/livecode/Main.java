package livecode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        
        System.out.println("===============================================");
        System.out.println("                 Sewa Kamar                    ");
        System.out.println("===============================================");
        System.out.println("Pilih Tipe Kamar Yang Anda Ingginkan!");
        System.out.println("1. Reguler (Kapasitas : 1 orang)\nHarga : Rp. 100.000\n");
        System.out.println("2. Double (Kapasitas : 2 orang)\nHarga : Rp. 200.000\n");
        System.out.println("3. Premium (Kapasitas : 2 orang)\nHarga : Rp. 250.000\n");
        System.out.println("4. Deluxe (Kapasitas : 2 orang)\nHarga : Rp. 350.000\n");
        System.out.println("1. Super Premium (Kapasitas : 2 orang)\nHarga : Rp. 500.000\n");
        System.out.println("Masukkan Pilihan Anda : ");   
//        inputan user = inputan.nextLine();
        boolean running = false;
        
        Switch(running){
            case 0: {
                break;
            }
            case 1 : {
                System.out.println("=========================================");
                System.out.println("Masukkan Nama Anda : ");
                System.out.println("Masukkan Umur Anda : ");
                
                if (umur < 19){
                    System.out.println("Maaf Anda belum cukup Umur Untuk Memesan Kamar");
                    continue;
                }
                System.out.println("Sewa Kamar Berapa lama (Hari) : ");
                System.out.println("=========================================");
            }
            case 2 : {
                System.out.println("=========================================");
                System.out.println("Masukkan Nama Anda : ");
                System.out.println("Masukkan Umur Anda : ");
                System.out.println("Sewa Kamar Berapa lama (Hari) : ");
                System.out.println("=========================================");
            }
    
    }
//        else {
//            System.out.println("Apakah Anda ingin memesan lagi? (Y/N) ");
//            inputan user = inputan.nextLine();
//        }
    }
}
