package q;

import p.B;

class A {
	void f()
	{
		B b = new B();
		b.n = 3;	// public class���� private�� ����� ���� ���� Ŭ���� �������� ���� �����ϴ�.
		b.g();		// public class���� private�� ����� ���� ���� Ŭ���� �������� ���� �����ϴ�.
	}
}
