import java.util.Scanner;

import javax.swing.plaf.synth.SynthToolTipUI;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Jumlah;
        int Panjang;
        int Lebar;
        int Urutan;

        System.out.println("Jumlah Tanah: ");
        Jumlah = input.nextInt();

        Tanah [] Tanah = new Tanah[Jumlah];
        
        for (int i = 0; i < Tanah.length; i++) {
            Tanah[i] = new Tanah();
            Urutan = i + 1; 
            System.out.println("Tanah " + Urutan);

            System.out.println("Panjang Tanah: ");
            Panjang = input.nextInt();
            Tanah[i].setPanjang(Panjang);

            System.out.println("Lebar Tanah: ");
            Lebar = input.nextInt();
            Tanah[i].setLebar(Lebar);

            System.out.println("==================================");
        }

        System.out.println("Jumlah Tanah: " + Jumlah);

        for (int i = 0; i < Tanah.length; i++) {
            Urutan = i + 1;

            System.out.println("Tanah " + Urutan);
            System.out.println("Panjang: " + Tanah[i].getPanjang());
            System.out.println("Panjang: " + Tanah[i].getLebar());

        }

        for (int i = 0; i < Tanah.length; i++) {
            Urutan = i + 1;
            
            System.out.println("Luas Tanah " + Urutan + ":" + Tanah[i].getLuas());
        }
    }
}