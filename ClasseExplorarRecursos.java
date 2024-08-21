package teste;

public abstract class ExplorarRecursos implements EstrategiaSobrevivencia{
	@Override
	public void enfrentarPerigo(grupoSobrevivente inimigo){
		System.out.println("\n Escalar parede ingrime \n Se aventurar pela mata fechada");
	}
	@Override
	public void finalizar(grupoSobrevivente inimigo){
		System.out.println("\n Retornar para o grupo com frutas e sem ferimentos");
	}
}
