package teste;

public abstract class ConstruirAbrigo implements EstrategiaSobrevivencia{
	@Override
	public void enfrentarPerigo(grupoSobrevivente Inimigo){
		System.out.println("\n Cavar em uma terra fofa com perigo de desabamento");
	}

	@Override
	public void finalizar(grupoSobrevivente Inimigo){
		System.out.println("\n Concluir com sucesso a construção do abrigo");
	}
	
}
