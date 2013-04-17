package com.example.proxy.kyh;

public class RealImage implements Image {
	private String fileName;
	private RealImage image;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadImageFromDisk();
	}

	private void loadImageFromDisk() {
		System.out.println("Loading : " + fileName);
	}

	@Override
	public void displayImage() {
		System.out.println("Displaying : " + fileName);
	}
}
