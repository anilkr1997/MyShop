package com.vivid.myshop.home;

public class homeItem {
    private String ProductName;
    private String PeoducetId;
    private String ProductColor;
    private String ProductSize;
    private int Imageurl;
    private String ProductDiscraption;
    public homeItem(String productName, String peoducetId, String productColor, String productSize, int imageurl, String productDiscraption) {
        ProductName = productName;
        PeoducetId = peoducetId;
        ProductColor = productColor;
        ProductSize = productSize;
        Imageurl = imageurl;
        ProductDiscraption = productDiscraption;
    }
    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getPeoducetId() {
        return PeoducetId;
    }

    public void setPeoducetId(String peoducetId) {
        PeoducetId = peoducetId;
    }

    public String getProductColor() {
        return ProductColor;
    }

    public void setProductColor(String productColor) {
        ProductColor = productColor;
    }

    public String getProductSize() {
        return ProductSize;
    }

    public void setProductSize(String productSize) {
        ProductSize = productSize;
    }

    public int getImageurl() {
        return Imageurl;
    }

    public void setImageurl(int imageurl) {
        Imageurl = imageurl;
    }

    public String getProductDiscraption() {
        return ProductDiscraption;
    }

    public void setProductDiscraption(String productDiscraption) {
        ProductDiscraption = productDiscraption;
    }





}
