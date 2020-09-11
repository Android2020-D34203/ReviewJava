package com.company;

public class Main {

    public static String nama;
    public static int umur;

    public static void main(String[] args) {
	    // write your code here
        String nim = "6701180007";
        nama = "Android";
        umur = 23;
//        System.out.println("Nama adalah : " + nama);
//        System.out.println("Umur adalah : " +umur);
//        System.out.println("Nim adalah : " +nim);

        ReviewJava reviewJava = new ReviewJava();
        reviewJava.BelajarJava();
        System.out.println("Lama kuliah adalah : " + reviewJava.getLamaKuliah());

        ReviewJavaChild reviewJavaChild = new ReviewJavaChild();
        reviewJavaChild.BelajarJava();
        reviewJavaChild.BelajarJava("2020");
        reviewJavaChild.BelajarJava(5);

    }
}

class ReviewJavaChild extends ReviewJava{
    public void MethodAnak(){
        System.out.println("Method di dalam class anak");
    }

    public void BelajarJava(){
        System.out.println("Belajar Bahasa Android");
    }

    public void BelajarJava(String tahun){
        System.out.println("Belajar Bahasa Android pada tahun " + tahun);
    }

    public void BelajarJava(int semester){
        System.out.println("Belajar Bahasa Android pada semester " + semester);
    }
}

class ReviewJava{
    private String LamaKuliah;
    public ReviewJava(){
        this.LamaKuliah = "3 Tahun";
    }
    public String getLamaKuliah() {
        return LamaKuliah;
    }

    public void BelajarJava(){
        System.out.println("Belajar java basic");
    }
}




