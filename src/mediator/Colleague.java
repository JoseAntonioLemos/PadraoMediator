/* Implementa o Colleague que servirá como base para todos os outros */
package mediator;

public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator m) {
		mediator = m;
	}

	public void enviarMensagem(String mensagem) {
		mediator.enviar(mensagem, this);
	}

	public abstract void receberMensagem(String mensagem);
}
/* Define apenas a interface comum de qualquer Colleague.
   Todos possuem um Mediator, que deve ser compartilhado entre os objetos Colleague.
   Também define a maneira como todos os objetos Colleague enviam mensagens.
   O método “receberMensagem()” fica a cargo das subclasses. */