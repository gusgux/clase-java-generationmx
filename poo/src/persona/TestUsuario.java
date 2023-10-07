package persona;

public class TestUsuario {

	public static void main(String[] args) {
		// Instancia de usuario
		Usuario Felipe=new Usuario("Doctor", "Doctor Felipe", "paracetamol");
		
		//cambiar la contraseña
		System.out.println(Felipe.getPassword());
		Felipe.setPassword("biomedico");//se cambio la contraseña
		System.out.println(Felipe.getPassword());
	}
	public String todoLoCura(){
		return "paracetamol";
	}
}
