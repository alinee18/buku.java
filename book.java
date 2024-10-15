public class book {
    
        protected String title;
        protected int year;
        protected double price;

    public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
  
    
    

    public double DiscountPrice() {
        if (year>= 2021 && year <= 2020) {
            return price;
        }else if (year >=2011 && year <= 2020){
            return price * 0.8;
        }else {
            return price * 0.5;
        }
    }    
        
        

     public void print() {
            System.out.println("title : " + title);
            System.out.println("year : " + year);
            System.out.println("price : " + price);
            System.out.println("DiscountPrice: " + DiscountPrice());
    
    
    }

}
    
    