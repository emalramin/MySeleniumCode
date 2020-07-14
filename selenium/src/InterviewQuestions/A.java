package InterviewQuestions;

public class A {
	
	private int a;
	private int b;
	private int c;
	

	public void Sum() {
		a = 0;
		b = 0;
		c = 0;
	}
	
	public A(int newa, int newb, int newc) {
		
		this.a = newa;
		this.b = newb;
		this.c = newc;
	}
	public int geta() {
		return a;
	}
	public int getb() {
		return b;
	}
	public int getc() {
		return c;
	}
	
	public void seta(int newa) {
		this.a = newa;
	}
	public void setb(int newb) {
		this.a = newb;
	}
	public void setc(int newc) {
		this.a = newc;
	}
	
}