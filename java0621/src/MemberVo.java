
public class MemberVo { //0621-2 �÷���
	//1���� ���ڵ带 ������ ������ �����ϴ� Ŭ����
	//��������� ĸ��ȭ(private)�Ѵ�
	
	private String name;
	private String depart;
	private String hire;
	private int sal;

	public MemberVo() {
	}
	
	public MemberVo(String name, String depart, String hire, int sal) {
		this.name = name;
		this.depart = depart;
		this.hire = hire;
		this.sal = sal;
	}
	
	//ĸ��ȭ�� ����� ������ �޼ҵ�
	// set ��� ������
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getDepart() {
		return depart;
	}
	public void setHire(String hire) {
		this.hire = hire;
	}
	public String getHire() {
		return hire;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getsal() {
		return sal;
	}
	
	//��� �޼ҵ�
	public void memberPrint() {
		System.out.println("�̸� = "+name);
		System.out.println("�μ��� = "+depart);
		System.out.println("�Ի��� = "+hire);
		System.out.println("�޿� = "+sal);
	}
}
