/* A classe a seguir, representa a plataforma Android  */

package mediator;

public class AndroidColleague extends Colleague {

	public AndroidColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Android recebeu: " + mensagem);
	}

}
/* As classes Colleague concretas também são bem simples, apenas definem como a mensagem será recebida. */