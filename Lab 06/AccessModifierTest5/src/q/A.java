package q;

import p.B;				// default class�� �ٸ� ��Ű���� import �� �� ����.

class A {
	void f()
	{
		B b = new B();	// p.B�� import���� ���ؼ�, class B�� �ν����� ���Ѵ�.
		b.n = 3;
		b.g();
	}
}
