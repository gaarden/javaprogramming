package q;

import p.B;				// default class는 다른 패키지로 import 할 수 없다.

class A {
	void f()
	{
		B b = new B();	// p.B를 import하지 못해서, class B를 인식하지 못한다.
		b.n = 3;
		b.g();
	}
}
