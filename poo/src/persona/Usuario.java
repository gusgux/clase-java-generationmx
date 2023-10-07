package persona;

public class Usuario {
	//1 atributos
	
	private String rol;
	private String username;
	private String password;
	
	//Crear un nuevo usuario(constructor)
	public Usuario(String rol,String username,String password) {
		this.rol=rol;
		this.username=username;
		this.password=password;
	}
	//Recuperar contraseña(getter)
	public String getPassword() {
		//si el usuario registrado coincide con el usuario que paso como parametro entonces obtengo la contraseña
		return password;
	}//getter
	
	//Cambiar contraseña(setter)
	
	//Cambiar contrasenia (setter)
		public void setPassword(String nuevoPassword) {
			//si la nueva contrasenia es diferente a una cadena vacia y es diferente a la contrasenia anterior...
			if (nuevoPassword != "" && nuevoPassword != password) {
				//... entonces reemplazo la contrasenia anterior
				password = nuevoPassword;
			}else {
				System.out.println("Lo siento, no puedo cambiar la contrasenia");
			}
		}//setter

		
		
		
		//Cambiar la contraseña de un objeto del tipo usuario
		
		//Felipe.setPassword (una donde la contrasenia no este vacia)
		//Felipe.setPassword (una donde la contrasenia no este vacia pero sea igual a la anterior)
		//Felipe.setPassword (se cumplan las dos condiciones)
		
		
}
