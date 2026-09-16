package com.portfolio.app.model;
import java.util.Scanner;
public class Stock {
	private String stockid;
	private String stockname;
	private double price;
	public Stock(String stockid,String stockname,double price)
	{
		this.stockid=stockid;
		this.stockname=stockname;
		this.price=price;
	}
	public String getstockid() { return stockid;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public double getprice() {
		return price;
	}
	public void setPrice(double price) {          
		this.price = price;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2600520054");
		String stockid = sc.nextLine();
		System.out.println("Y.Shruti ");
		String stockname = sc.nextLine();
		System.out.println("2007");
		double price = sc.nextDouble();
		Stock s = new Stock(stockid,stockname,price);
		System.out.println("Stock ID:"+ s.getstockid());
		System.out.println("Stock Name:"+ stockname);
		System.out.println("Price:"+ s.getprice());
		sc.close();
	}


	}