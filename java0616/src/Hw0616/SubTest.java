package Hw0616;

	class SuperTest {
	int a; //10을 대입하라
	
	SuperTest(int a) {
		this.a =a;
		System.out.println(this.a);
	}

}
	
	//-------------------------------

	class SubTest extends SuperTest{
		
		public SubTest(int a) {
			super(a);
		}

		public SubTest() {
			super(10);
			//this(10);
		
		}
		
		//SubTest ob = new SubTest();
	
	public static void main(String[] args) {
		SubTest ob = new SubTest();
	}}