package q;

import p.B;

class A {
	void f()
	{
		B b = new B();
		b.n = 3;	// public class���� protected�� ����� ���� �ٸ� package�� �ٸ� class���� ������ �� ����.
		b.g();		// public class���� protected�� ����� ���� �ٸ� package�� �ٸ� class���� ������ �� ����.
	}
}
