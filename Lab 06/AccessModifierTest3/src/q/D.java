package q;

import p.B;

class D extends B {
	void f()
	{
		n = 3;	// public class���� default�� ����� ���� �ٸ� package���� ������ �� ����.
		g();	// public class���� default�� ����� ���� �ٸ� package���� ������ �� ����.
	}
}
