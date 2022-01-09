package q;

import p.B;

class D extends B {
	void f()
	{
		n = 3;	// public class에서 default로 선언된 것은 다른 package에서 접근할 수 없다.
		g();	// public class에서 default로 선언된 것은 다른 package에서 접근할 수 없다.
	}
}
