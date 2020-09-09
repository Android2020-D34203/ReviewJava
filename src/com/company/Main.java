package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Review review = new Review();
        AnakReview anakReview = new AnakReview();
        anakReview.MethodAnak();
        anakReview.Kuliah();
        anakReview.Kuliah("3 tahun");
    }
}

class AnakReview extends Review{
    public void MethodAnak(){
        System.out.println("Method anak");
    }

    // Polymorphism Overridding
    public void Kuliah(){
        System.out.println("Review Android");
    }

    // Polymorphim Overloading
    public void Kuliah(String lamakuliah){
        System.out.println("Lama kuliahnya " + lamakuliah);
    }


}

class Review{
    private String nama;
    private int umur;
    protected String warnakulit;

    public void Kuliah(){
        System.out.println("Review java");
    }

    public Review(){
        System.out.println("Inisialisasi kelas review");
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void DurasiKuliah(int jam, String kode){
        System.out.println("Lama kuliahya adalah " + jam);
        System.out.println("Kode mata kuliahya adalah " + kode);
    }



    public void Belajar(){
        System.out.println("Belajar Android");
    }
}

