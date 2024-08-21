package teste;

public class CacarAnimais implements EstrategiaSobrevivencia{
	 @Override
	 public void enfrentarPerigo(grupoSobrevivente inimigo){
		 System.out.println("\n Atacar familia de jacarés \n Atacar grupo de galinhas");
	 }
	 
	 @Override
	 public void finalizar(grupoSobrevivente inimigo){
		 System.out.println("\n Levar a caça para o grupo");
	 }
}
