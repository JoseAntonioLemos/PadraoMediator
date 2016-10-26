/*  Como o Mediator concreto seria implementado */

package mediator;

import java.util.ArrayList;

public class MensagemMediator implements Mediator {

	protected ArrayList<Colleague> contatos;

	public MensagemMediator() {
		contatos = new ArrayList<Colleague>();
	}

	public void adicionarColleague(Colleague colleague) {
		contatos.add(colleague);
	}
        /* O Mediator possui uma lista de objetos Colleague que realizarão a comunicação
           e um método para adicionar um novo Colleague */

        
        /* O método “enviar()” percorre toda a lista de contatos e envia mensagens.
           Dentro deste métodos foi feita uma comparação para evitar a mensagem seja enviada
           para a pessoa que enviou.
           Para enviar a mensagem primeiro deve ser definido qual protocolo utilizar e 
           em seguida enviar a mensagem. */
	@Override
	public void enviar(String mensagem, Colleague colleague) {
		for (Colleague contato : contatos) {
			if (contato != colleague) {
				definirProtocolo(contato);
				contato.receberMensagem(mensagem);
			}
		}
	}

        /* o método “definirProtocolo()” apenas imprime na tela o tipo do Colleague que enviou
           a mensagem, utilizar para isso a verificação instanceof. */
        
	private void definirProtocolo(Colleague contato) {
		if (contato instanceof IOSColleague) {
			System.out.println("Protocolo iOS");
		} else if (contato instanceof AndroidColleague) {
			System.out.println("Protocolo Android");
		} else if (contato instanceof SymbianColleague) {
			System.out.println("Protocolo Symbian");
		}
	}

}

/* O Mediator possui uma lista de objetos Colleague que realizarão a comunicação e um método 
   para adicionar um novo Colleague */
