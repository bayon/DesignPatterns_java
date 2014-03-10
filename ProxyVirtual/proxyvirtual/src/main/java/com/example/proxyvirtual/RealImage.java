package com.example.proxyvirtual;

/**
 * Created by BForte on 3/10/14.
 */
public class RealImage implements Image {

    private String fileName = null;
    public RealImage(String strFileName){
        this.fileName = strFileName;
    }
    @Override
    public void showImage() {
        System.out.println("ProxyVirtual: Show Image:" +fileName);

    }
}