package test.main;

import test.mypac.Pen;

public class MainClass06 {
	public static void main(String[] args) {
		//Pen 객체를 생성해서 write() 메소드를 호출해 보세요 
		Pen a = new Pen("blue");
		a.write().write().write().draw();
		
		Pen b=new Pen("red");
		b.write();
	}
}
