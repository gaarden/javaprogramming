package p;

class C {
	public void k()
	{
		B b = new B();
		b.n = 7;	// default class���� private�� ����� ���� ���� Ŭ���� �������� ���� �����ϴ�.
		b.g();		// default class���� private�� ����� ���� ���� Ŭ���� �������� ���� �����ϴ�.
	}
}
