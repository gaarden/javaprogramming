package p;

class C {
	public void k()
	{
		B b = new B();
		b.n = 7;	// public class���� private�� ����� ���� ���� Ŭ���� �������� ���� �����ϴ�.
		b.g();		// public class���� private�� ����� ���� ���� Ŭ���� �������� ���� �����ϴ�.
	}
}
