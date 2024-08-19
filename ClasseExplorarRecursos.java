package teste;

public abstract class ExplorarRecursos implements EstrategiaSobrevivencia{
	@Override
	public void enfrentarPerigo(Grupo inimigo){
		System.out.println("\n Escalar parede ingrime \n Se aventurar pela mata fechada");
	}
	
	public void finalizar(Grupo Inimigo){
		System.out.println("\n Retornar para o grupo com frutas e sem ferimentos");
	}
}
