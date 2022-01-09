package p;

class E extends B {
	void f()
	{
		n = 3;	// default class에서 private로 선언된 것은 같은 클래스 내에서만 접근 가능하다.
		g();	// default class에서 private로 선언된 것은 같은 클래스 내에서만 접근 가능하다.
	}
}
