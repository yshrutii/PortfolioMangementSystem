<<<<<<< HEAD

package com.portfolio.app.model;

public abstract class Asset {
    private String assetId;
    private String assetName;
    private double purchasePrice;

    public Asset(String assetId, String assetName, double purchasePrice) {
        this.assetId = assetId;
        this.assetName = assetName;
        this.purchasePrice = purchasePrice;
    }

    public String getAssetId() { return assetId; }
    public String getAssetName() { return assetName; }
    public double getPurchasePrice() { return purchasePrice; }

    public abstract double calculateCurrentValue();
=======

package com.portfolio.app.model;

public class Asset {
    private String bookId;
    private String title;
    private double price;

    public Asset(String bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
>>>>>>> branch 'main' of https://github.com/yshrutii/PortfolioMangementSystem.git
}