package teste;

public abstract class ConstruirAbrigo implements EstrategiaSobrevivencia{
	@Override
	public void enfrentarPerigo(Grupo Inimigo){
		System.out.println("\n Cavar em uma terra fofa com perigo de desabamento");
	}

	@Override
	public void finalizar(Grupo Inimigo){
		System.out.println("\n Concluir com sucesso a construção do abrigo");
	}
	
}
