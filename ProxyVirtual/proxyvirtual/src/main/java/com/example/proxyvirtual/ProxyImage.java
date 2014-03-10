package com.example.proxyvirtual;

/**
 * Created by BForte on 3/10/14.
 */
public class ProxyImage implements Image {
    private RealImage img= null;
    private String fileName = null;

    public ProxyImage(String strFileName) {
        this.fileName = strFileName;
    }
    /*
     * (non-Javadoc)
     * @see com.proxy.virtualproxy.Image#showImage()
     */
    @Override
    public void showImage() {
        if(img == null){
            img = new RealImage(fileName);
        }
        img.showImage();
    }
}