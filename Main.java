package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            /*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.


Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.


Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.


Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir sıcaklık değeri giriniz");
        int heat;
        heat=input.nextInt();
        if (heat<5){
            System.out.println("Bugün kayak yapabilirsiniz");
        }else if (heat>=5 && heat<=25){
            if (heat<=15){
                System.out.println("sinemaya gidebilirsin");
            }
            if (heat>=10){
                System.out.println("pikniğe gidibilirsin");
            }

        }else {
            System.out.println("Yüzmeye gidebilirsin");
        }





    }
}
