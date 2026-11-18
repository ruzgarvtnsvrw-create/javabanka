
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevir
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ruzgar = new Scanner(System.in);

        double bakiye = 10000;
        
double miktar;
        double yatirilan = 0;
        
double cekilen = 0;

        int secim = 0;
        int islem = 0;

        while (secim != 4) {

            System.out.println("");
            	System.out.println("----- ATM MENU -----");
            		System.out.println("1 - Bakiye goruntule");
           			 System.out.println("2 - Para yatir");
           				 System.out.println("3 - Para cek");
           					 System.out.println("4 - Cikis");
            						System.out.print("Seciminiz: ");

            secim = ruzgar.nextInt();



            switch (secim) {

                case 1:
                    
System.out.println("Bakiyeniz: " + bakiye + " TL");
                    islem++;

                    break;

                case 2:
                    System.out.print("Yatirmak istediginiz miktar: ");
                    	miktar = ruzgar.nextDouble();

                    if (miktar > 0) {
                        bakiye = bakiye + miktar;
                      	  yatirilan = yatirilan + miktar;
                       		 System.out.println("Para yatirildi.");
                       			 islem++;
                    } else {
                        System.out.println("Gecersiz miktar.");
                    }



                    break;

                case 3:
                    System.out.print("Cekmek istediginiz miktar: ");

                    miktar = ruzgar.nextDouble();

                    if (miktar > 0) {
                        if (miktar <= bakiye) {
                           	 bakiye = bakiye - miktar;
                           	 cekilen = cekilen + miktar;
                            		System.out.println("Para cekildi.");
                           
 islem++;
                        } else {
                            System.out.println("Yetersiz bakiye.");
                        }
                    } else {
                        System.out.println("Gecersiz miktar.");
                    }
                    break;

                case 4:
                    System.out.println("ATM kapatiliyor.");
                    	System.out.println("Son bakiye: " + bakiye + " TL");
                    		System.out.println("Toplam islem sayisi: " + islem);
                   			 System.out.println("Toplam yatirilan: " + yatirilan + " TL");
                   				 System.out.println("Toplam cekilen: " + cekilen + " TL");
                    break;

                default:
                    System.out.println("Yanlis secim yaptiniz.");
                    break;
            }
        }

        	System.out.println("Iyi gunler.");
        return;
    }
} //abi https://huggingface.co/brun12/RuzgarTokenizer incelermisiniz en kısa sürede düşük bi 256k yapay zeka eğitip test etcem. he bide ayrıca 8 farklı senaryo yazması cok uzun zaten rapor var onu yazmadım o yüzden.
