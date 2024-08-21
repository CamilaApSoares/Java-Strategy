package teste;

public class grupoSobrevivente {
		private String nomeGrupo;
		private int qtdMembros;
		private boolean possuiFerramentas;
		public EstrategiaSobrevivencia estrategia;
		
		public grupoSobrevivente(String nomeGrupo, int qtdMembros, boolean possuiFerramentas){
			this.nomeGrupo = nomeGrupo;
			this.qtdMembros = qtdMembros;
			this.possuiFerramentas = possuiFerramentas;
		}
		
		public void setNomeGrupo(String nomeGrupo) {
			this.nomeGrupo = nomeGrupo;
		}

		public String getNomeGrupo() {
			return nomeGrupo;
		}
		
		public void setQtdMembros(int qtdMembros) {
			this.qtdMembros = qtdMembros;
		}

		public int getQtdMembros() {
			return qtdMembros;
		}

		public boolean isPossuiFerramentas() {
			return possuiFerramentas;
		}

		public void setPossuiFerramentas(boolean possuiFerramentas) {
			this.possuiFerramentas = possuiFerramentas;
		}

		public void setEstrategia(EstrategiaSobrevivencia estrategia) {
			this.estrategia = estrategia;
		}
			
		public EstrategiaSobrevivencia getEstrategia() {
			return estrategia;
		}
		
		public void sobreviver(grupoSobrevivente inimigo){
			this.estrategia.enfrentarPerigo(inimigo);
			this.estrategia.finalizar(inimigo);
		}
}
