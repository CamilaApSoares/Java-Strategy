package teste;

public class Simulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grupoSobrevivente gruposobrevivente1 = new grupoSobrevivente("Zumami", 90, true);
		grupoSobrevivente gruposobrevivente2 = new grupoSobrevivente("Bardurs", 30, false);

		if(gruposobrevivente1.getQtdMembros() < gruposobrevivente2.getQtdMembros()){
			System.out.println("grupo um ganhou");
		}else{
			System.out.println("Gurpo 2 ganhou");
		}
	}

}

