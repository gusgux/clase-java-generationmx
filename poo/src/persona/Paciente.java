package persona;

public class Paciente {
	//Sobrecarga de métodos (Overloading)

	
	//1-Atributos
	String	numeroSeguroSocial;
	String tipoSangre;
	boolean expediente;
	private boolean	SeguroGastoMedicos;
	String	cita;
	String doctorAsignado;
	boolean alergias;

	
	
	
	//2 Constructor
	Paciente(String numeroSeguroSocial, String tipoSangre, boolean expediente, boolean seguroGastoMedicos,
			String cita, String doctorAsignado, boolean alergias) {
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.tipoSangre = tipoSangre;
		this.expediente = expediente;
		this.SeguroGastoMedicos = seguroGastoMedicos;
		this.cita = cita;
		this.doctorAsignado = doctorAsignado;
		this.alergias = alergias;
	}//constructor con todos los campos





	
	//2.1 Constructor que recopile solo los datos requeridos u obligatorios
	public Paciente(String numeroSeguroSocial, boolean expediente, boolean seguroGastoMedicos) {
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.expediente = expediente;
		this.SeguroGastoMedicos = seguroGastoMedicos;
	}
	//constructor con todos los campos




	//3 Metodos
	@Override
	//Metodo llamado toString que utiliza datos del tipo String
	public String toString() {
		return "Paciente [numeroSeguroSocial=" + numeroSeguroSocial + ", tipoSangre=" + tipoSangre + ", expediente="
				+ expediente + ", SeguroGastoMedicos=" + SeguroGastoMedicos + ", cita=" + cita + ", doctorAsignado="
				+ doctorAsignado + ", alergias=" + alergias + "]";
	}//to string






	public boolean getSeguroGastoMedicos() {
		return SeguroGastoMedicos;
	}






	public void setSeguroGastoMedicos(boolean seguroGastoMedicos) {
		SeguroGastoMedicos = seguroGastoMedicos;
	}
	
	
	
}
