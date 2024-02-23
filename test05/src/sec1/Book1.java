package sec1;
/*
Q.교재(Book) 클래스를 작성하되 교재코드(bon),교재명(bname),가격(price),저자(aouthor),출판사(pub)
등을 요소로 하며, 직접 접근이 되지 않도록 정보은닉을 하고, getter/setter 등을 작성하며 
출력 메소드print()를 추가 작성하되 매개변수의 개수에 따라 출력 될수 있도록 하시오.
*/
public class Book1 {
	private int bon;
    private String bname;
    private int price;
    private String aouthor;
    private String put;
    public void print() {
    	System.out.println("제품정보");
    }
    public void print() {
    	System.out.println();
    	
    }
    
	@Override
	public String toString() {
		return "Book1 [bon=" + bon + ", bname=" + bname + ", price=" + price + ", aouthor=" + aouthor + ", put=" + put
				+ "]";
	}
	public int getBon() {
		return bon;
	}
	public void setBon(int bon) {
		this.bon = bon;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAouthor() {
		return aouthor;
	}
	public void setAouthor(String aouthor) {
		this.aouthor = aouthor;
	}
	public String getPut() {
		return put;
	}
	public void setPut(String put) {
		this.put = put;
	}

}
