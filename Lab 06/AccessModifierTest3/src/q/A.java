package q;

import p.B;

class A {
	void f()
	{
		B b = new B();
		b.n = 3;	// public class���� default�� ����� ���� �ٸ� package���� ������ �� ����.
		b.g();		// public class���� default�� ����� ���� �ٸ� package���� ������ �� ����.
	}
}
