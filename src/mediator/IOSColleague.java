/* A classe a seguir, representa a plataforma iOS: */

package mediator;

public class IOSColleague extends Colleague {

	public IOSColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("iOs recebeu: " + mensagem);
	}

}
/* As classes Colleague concretas também são bem simples, apenas definem como a mensagem será recebida. */