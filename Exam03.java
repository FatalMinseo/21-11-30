
public class Exam03 {

	public static void main(String[] args) {
		// ����. �����԰� ���� ���̸� �ٲ㺾�ô�
		int teacher = 20;
		int my = 32;
		// �Ʒ��� �ڵ带 �ۼ��Ͽ� ���� ���� ���� �������� ���� ���� ���� �ٲ��ּ���
		
		int a = teacher;
		System.out.print(a);
		System.out.print(teacher);
		teacher = my;
		System.out.print(a);
		System.out.print(teacher);
		my = a;
		System.out.println(a); 
		
		System.out.println("�������� ���� : " + teacher);
		System.out.println("���� ���� : " + my);

	
	}

}
