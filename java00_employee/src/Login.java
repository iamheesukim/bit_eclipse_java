
public class Login {
	
	private final String USERID  = "admin";
	private final String USERPWD = "1234";

	public Login() {
	}
	
	//로그인 체크 구현 (true : 로그인 성공)
	public boolean loginCheck (String userid, String userpwd) {
		if(userid.equals(USERID) && userpwd.equals(USERPWD)) {
			//로그인성공
			return true;
		}
		else return false; //로그인 실패
	}

}
