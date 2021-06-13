package tec3;

public class Person {
	/* Declaro los atributos del objeto */
	 private Integer id;
	 private String name;
	 private String lastname;
	 private String email;
	 private String password;
	 private String create_at;
	 private String update_at;
	 
	 /*Creo el constructor de la clase */

		public Person(Integer id, String name, String lastname, String email, String password, String create_at,
				String update_at) {
			super();
			this.id = id;
			this.name = name;
			this.lastname = lastname;
			this.email = email;
			this.password = password;
			this.create_at = create_at;
			this.update_at = update_at;
		}

	/* Propiedades gets and sets */

		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getLastname() {
			return lastname;
		}


		public void setLastname(String lastname) {
			this.lastname = lastname;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getCreate_at() {
			return create_at;
		}


		public void setCreate_at(String create_at) {
			this.create_at = create_at;
		}


		public String getUpdate_at() {
			return update_at;
		}


		public void setUpdate_at(String update_at) {
			this.update_at = update_at;
		}
		
		public String toString()
		{
			return "Nombre: "+ getName()+", Apellido: "+ getLastname()+", Email: "+getEmail();
		}
		


}
