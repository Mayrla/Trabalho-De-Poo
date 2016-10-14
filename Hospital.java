
 public class Hospital{
        private ArrayList<Paciente> paciente;
	private Scanner sc = new Scanner(System.in);
	 private Scanner scl = new Scanner(System.in);
	 
	 public void entrada(){
		 System.out.println("Digite o nome:");
		 String nome = scl.nextLine();
		 System.out.println("Digite sua idade:");
		 int idade = sc.nextInt();
		 System.out.println("Digite o sexo:");
		 String sexo = sc.next();
		 System.out.println("Digite Doencas cronicas ou alergias:");
		 
		String DoencasCronicasouAlergias = scl.nextLine();
		 Paciente p= new Paciente(nome,sexo,idade,DoencasCronicasouAlergias);
		 paciente.add(p);
		 System.out.println(p+"/npaciente adicionado com sucesso!!");
		 
	 }
	 
	 public void saida(){
		 System.out.println("Digite o numero:");
		 int num = sc.nextInt();
		Paciente p= new Paciente(num);
		 Paciente p2=paciente.remove(p);
		 System.out.println(p2+"/npaciente removido com sucesso!!");
	 }
	 
	  public void situacaoDoPaciente(){
		 System.out.println("Digite o numero:");
		 int num = sc.nextInt();
		Paciente p= new Paciente(num);
		 Paciente p2=paciente.get(paciente.indexOf(p));
		  menu(p2);
		/* System.out.println("Digite a situacao do paciente:");
		 String situacao=scl.nextLine();
		  p2.adicionarDiagnostico(situacao);
		  System.out.println(p2+"/n"+situacao);*/
	 }
	 
	 public void menu(Paciente p){
		 System.out.println(
			 "1: Adicionar diagnostico /n"+
			 "2: Ver todos os diagnostico /n"+
			 "3: Voltar ao menu principal /n"
		 	);
		 acao(p);
	 }
	 
	 public void acao(Paciente p){
		 Scanner sc = new Scanner(System.in);
		 swicth( sc.nextInt()){
			 case 1:
			 System.out.println("Digite a situacao do paciente:");
			 String situacao=scl.nextLine();
		  	 p.adicionarDiagnostico(situacao);
		 	 System.out.println(p+"/n"+situacao);
			 break;
			case 2:p.verTodosOsDiagnosticos();break;
			case 3: return;break;
			
			default:System.out.println("Opcao invalida");
		}
	 }
 }
		 
	 
