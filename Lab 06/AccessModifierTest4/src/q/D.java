package q;

import p.B;

class D extends B {
	void f()
	{
		n = 3;	// public class���� private�� ����� ���� ���� Ŭ���� �������� ���� �����ϴ�.
		g();	// public class���� private�� ����� ���� ���� Ŭ���� �������� ���� �����ϴ�.
	}
}
