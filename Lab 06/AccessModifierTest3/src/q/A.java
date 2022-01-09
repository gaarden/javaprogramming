package q;

import p.B;

class A {
	void f()
	{
		B b = new B();
		b.n = 3;	// public class에서 default로 선언된 것은 다른 package에서 접근할 수 없다.
		b.g();		// public class에서 default로 선언된 것은 다른 package에서 접근할 수 없다.
	}
}
