package q;

import p.B;			// default class�� �ٸ� ��Ű���� import �� �� ����.

class D extends B {	// p.B�� import���� ���ؼ�, class B�� �ν����� ���Ѵ�.
	void f()
	{
		n = 3;		// p.B�� import���� ���ؼ�, class D���� n�� ���ǵǾ����� �ʴ�.
		g();		// p.B�� import���� ���ؼ�, class D���� g()�� ���ǵǾ����� �ʴ�.
	}
}
