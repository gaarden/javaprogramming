package q;

import p.B;			// default class는 다른 패키지로 import 할 수 없다.

class D extends B {	// p.B를 import하지 못해서, class B를 인식하지 못한다.
	void f()
	{
		n = 3;		// p.B를 import하지 못해서, class D에는 n이 정의되어있지 않다.
		g();		// p.B를 import하지 못해서, class D에는 g()가 정의되어있지 않다.
	}
}
