Atividade da disciplina de Padrões de Projeto – Flyweight

O projeto desenvolvido aplica o padrão Flyweight em um cenário empresarial, simulando o cadastro de produtos em uma loja. 
A ideia central é demonstrar como o Flyweight otimiza o uso de memória ao compartilhar objetos comuns neste caso, as categorias dos produtos evitando duplicação desnecessária e tornando o sistema mais eficiente.

No modelo proposto, a classe CategoriaFactory atua como o núcleo do padrão, responsável por criar e gerenciar instâncias únicas de categorias.
As classes Produto, Categoria e Loja representam os componentes do sistema: cada produto possui uma categoria, mas categorias iguais são reutilizadas por meio da fábrica. 
Assim, mesmo que a loja cadastre centenas de produtos da mesma categoria, apenas uma instância de Categoria é mantida na memória.

Escolhi o cenário de loja e produtos porque ele reflete bem a lógica do Flyweight: diversos objetos compartilham informações comuns, como o nome da categoria, enquanto mantêm seus próprios dados específicos.
O uso do Flyweight torna o código mais leve, reduz o consumo de recursos e facilita a manutenção, garantindo que o sistema seja escalável e organizado.

Diagrama UML - https://drive.google.com/file/d/12ykp0TvhpyOZRVHphr0JYAOXzjzoC7uS/view?usp=sharing
