/* Como funciona o Mediator. Vamos primeiro definir a interface comum de qualquer Mediator */

package mediator;

public interface Mediator {

	void enviar(String mensagem, Colleague colleague);

}
/* Ou seja, todo Mediator deverá definir uma maneira de enviar mensagens. */