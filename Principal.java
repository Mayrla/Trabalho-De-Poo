import java.util.Scanner;
public class Principal{
	public static Hospital h;
	public static void main(String args[]){
		h=new Hospital();
		menu();
	}
	public static void menu(){
		System.out.println(
			"[1]Entrada/n"+
			"[2]saida/n"+
			"[3]Situacao do paciente/n"+
			"[4]Sair"
		);
		acao();
	}
	public static void acao(){
		Scanner sc = new Scanner(System.in);
		swicth( sc.nextInt()){
			case 1:h.entrada();break;
			case 2:h.saida();break;
			case 3:h.situacaoDoPaciente();break;
			case 4:
			System.out.println("Obrigado por usar este programa");
			return;
			break;
			default:System.out.println("Opcao invalida");
		}
		
	}
}
