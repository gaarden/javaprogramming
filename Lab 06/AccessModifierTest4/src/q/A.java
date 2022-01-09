package q;

import p.B;

class A {
	void f()
	{
		B b = new B();
		b.n = 3;	// public class에서 private로 선언된 것은 같은 클래스 내에서만 접근 가능하다.
		b.g();		// public class에서 private로 선언된 것은 같은 클래스 내에서만 접근 가능하다.
	}
}
