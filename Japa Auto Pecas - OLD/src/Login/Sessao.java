/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Login;
/*
 * @author Nunweiler
 */
public class Sessao{  
    private String nome;
  
   private Sessao(){  
   }  
  
   private static class UsuarioLogadoHolder { 
		private final static UsuarioLogado instance = new UsuarioLogado();
	}
	
	public static UsuarioLogado getInstance() {
		return UsuarioLogadoHolder.instance;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}  
