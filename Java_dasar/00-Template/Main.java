package com.tutorial;

// Deklarasi class
    class Penyewa{
        int order;
        String nama;

        // Deklarasi Constructor Penyewa
        Penyewa( int inputOrder, String inputNama){
            order = inputOrder;
            nama = inputNama;
        }
    }

public class Main {
   
    public static void main(String[] args) {
        Penyewa Penyewa1 = new Penyewa(2, "Hasudungan ");
        System.out.println("Jumlah Pesanan :" + Penyewa1.order + "\n"+"Atas Nama : " + Penyewa1.nama);
    } 
}