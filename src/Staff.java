public class Staff {
	private String name;
	private String surname;
	private String mail;
	private String role;

	public Staff() {
		setName("NULL");
		setSurname("NULL");
		setMail("NULL");
		setRole("NULL");
	}

	public Staff(String name, String surname, String mail, String role) {
		setName(name);
		setSurname(surname);
		setMail(mail);
		setRole(role);
	}

	public Staff(Staff employee) {
		setName(employee.name);
		setSurname(employee.surname);
		setMail(employee.mail);
		setRole(employee.role);
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
