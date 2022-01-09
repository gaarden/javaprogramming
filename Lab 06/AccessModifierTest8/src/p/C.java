package p;

class C {
	public void k()
	{
		B b = new B();
		b.n = 7;	// default class에서 private로 선언된 것은 같은 클래스 내에서만 접근 가능하다.
		b.g();		// default class에서 private로 선언된 것은 같은 클래스 내에서만 접근 가능하다.
	}
}
