/* A classe a seguir, representa a plataforma Symbian */
package mediator;

public class SymbianColleague extends Colleague {

	public SymbianColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Symbian recebeu: " + mensagem);
	}

}
/* As classes Colleague concretas também são bem simples, apenas definem como a mensagem será recebida. */