
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
	 }
 }
		 
	 
