public class TesteLoja {
    public static void main(String[] args) {
        Loja loja = new Loja();

        // Caso 1: Dois produtos da mesma categoria
        loja.cadastrarProduto("Notebook Dell", "Informática");
        loja.cadastrarProduto("Mouse Logitech", "Informática");

        // Caso 2: Produto de categoria diferente
        loja.cadastrarProduto("Camiseta Nike", "Vestuário");

        // Caso 3: Outro produto da mesma categoria já existente
        loja.cadastrarProduto("Teclado Mecânico", "Informática");

        // Caso 4: Produto de uma nova categoria
        loja.cadastrarProduto("Geladeira Brastemp", "Eletrodomésticos");

        // Exibir todos os produtos cadastrados
        System.out.println("=== Lista de Produtos ===");
        for (String produto : loja.obterProdutos()) {
            System.out.println(produto);
        }

        // Exibir total de categorias únicas criadas (Flyweight em ação)
        System.out.println("\nTotal de categorias únicas: " + CategoriaFactory.getTotalCategorias());
    }
}
