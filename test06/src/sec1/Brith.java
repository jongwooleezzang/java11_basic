package sec1;

public class Brith {

   private String name;
   private int year;
   private int month;
   private int day;
	//getter,setter
   	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
    void birth() {
		  System.out.println(year+"-"+month+"-"+day);
    }
	  public void Birthaddr() {
		   System.out.println(this);
	}
}
