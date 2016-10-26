# PadraoMediator  
Os padrões de projeto são soluções prontas e testadas que podem ser aplicadas a situações específicas em um projeto de software.

Por que perder tempo tentando escrever códigos para um problema que você pensa que seja somente seu, quando na verdade ele é um problema genérico que outros programadores já enfrentaram e já resolveram?

Para isso serve os Padrões de Projeto.

Imagina um Website com quatro páginas onde o usuário pode fazer consultas entre elas, quando começar a navegar de uma para outra, o código em cada página precisa saber quando ir para uma nova página e como ativar essa nova página.

Mesmo com apenas quatro páginas, existem muitas possibilidades de conexões e de navegação entre as páginas, esse cenário costuma gerar uma grande quantidade de código duplicado em cada página.

E relacionamentos muitos para muitos. 

Ou se você que trocar informações ou mensagens entre diversas plataformas de software, como Androide, IOS, Symbian, WindowsPhone, cada uma tem maneira diferente de trocar mensagens. 

Ai teríamos um problema de criar vários métodos para cada plataforma e se fosse necessário incluir uma nova plataforma tipo a BlackBerry, precisaria criar todos os métodos de comunicação desse novo OS em todas as plataformas existentes, e incluir também na nova plataforma os métodos das outras para poderem se comunicar com ela.

Com o padrão chamado de Mediator, você pode resolver o problema de comunicação entre páginas e sistemas diferentes para poderem se comunicar entre eles, sem haver duplicação de códigos e relacionamentos de muitos para muitos.

Um objeto Mediador deve encapsular toda a comunicação entre um grupo de objetos, desacoplamento entre os diversos participantes da rede de comunicação os participantes não se conhecem. 

Elimina o relacionamento de muitos para muitos

A política de comunicações está centralizada no mediador e pode ser alterada sem mexer nos colaboradores.

Desvantagem os mediadores tendem a se tornar mais complexos e às vezes de difícil manutenção.
        
