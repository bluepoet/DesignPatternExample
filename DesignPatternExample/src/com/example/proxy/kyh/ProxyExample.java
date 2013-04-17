package com.example.proxy.kyh;

public class ProxyExample {
	public static void main(String[] args) {
		Image image1 = new ProxyImage("photo1");
		Image image2 = new ProxyImage("photo2");
		
		image1.displayImage();
		image1.displayImage();
		image2.displayImage();
		image2.displayImage();
		image1.displayImage();
	}
}
