/**
/* File : MPoligon.java
/* Nama : Zenit Laena Fathonah
/* Tanggal : 08-03-2023
/* Deskripsi : driver class untuk poligon, persegi panjang, dan segitiga 
*/

package org.main;

import org.bangundatar.*; /*semua file yg ada di org.bangundatar*/

public class MPoligon{
	public static void main(String[] args){
		/*Persegi panjang*/
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas persegi panjang :" +persegi.hitungLuas());
		
		/*Segitiga*/
		Segitiga segitiga = new Segitiga(12,8,3);
		segitiga.printInfo();
		System.out.println("Luas segitiga :" +segitiga.hitungLuas());
}
}