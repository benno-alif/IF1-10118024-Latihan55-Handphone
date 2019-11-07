package com.benno;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Handphone
     */

public class Main {

    public static void main(String[] args) {
        Handphone android, bb, wp;

        android = new Android("Samsung", "Android", "Grand", 3000000);
        bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);

        ((Android) android).setKeyStore("234ibfd3840fo");
        ((BlackBerry) bb).setPinBB("BHS249");
        ((WindowsPhone) wp).setWpKeyStore("UUUQIJWORJ");

        android.displayProduct();
        System.out.println("Android Key Store : " + ((Android) android).getKeyStore());
        System.out.println();

        bb.displayProduct();
        System.out.println("PIN : " + ((BlackBerry) bb).getPinBB());
        System.out.println();

        wp.displayProduct();
        System.out.println("Android Key Store : " + ((WindowsPhone) wp).getWpKeyStore());
        System.out.println();
    }
}
