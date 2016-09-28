
public class Paciente{
	private static numDeEntradas;
	private String nome;
	private String sexo;
	private int idade;
	private int numDoPaciente;
	private String doencasEAlergia;
	// importar ArrayList
	private ArrayList<String> historicoHospitalar;
	
	public Paciente(String nome,String sexo,int idade,String doencasEAlergia){
		Paciente.numDeEntradas++;
		numDoPaciente= numDeEntradas;
		this.nome=nome;
		this.sexo=sexo;
		this.idade=idade;
		this.doencasEAlergia=doencasEAlergia;
	}
}
