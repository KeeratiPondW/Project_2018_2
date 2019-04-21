package Logic;

public class users {
		
	private String name;
	private String surname;
	private String username;
	private String password;
	
	private String question;
	private String answer;
	
	public users(String name, String surname, String username, String password, String question, String answer) {
		super();
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
		this.question = question;
		this.answer = answer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

}
