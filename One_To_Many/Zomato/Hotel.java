package Zomato;

import java.util.ArrayList;

public class Hotel {
	private String hotelname;
	private int rating;
	private int gstno;
	
	ArrayList<Dish> menulist;

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

	public Hotel(String hotelname, int rating, int gstno, ArrayList<Dish> menu) {
		super();
		this.hotelname = hotelname;
		this.rating = rating;
		this.gstno = gstno;
		this.menulist = menu;
	}

	public int getGstno() {
		return gstno;
	}

	public void setGstno(int gstno) {
		this.gstno = gstno;
	}
	
	
	
}
