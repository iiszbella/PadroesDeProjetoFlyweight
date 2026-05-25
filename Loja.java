import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(String nomeProduto, String nomeCategoria) {
        Categoria categoria = CategoriaFactory.getCategoria(nomeCategoria);
        Produto produto = new Produto(nomeProduto, categoria);
        produtos.add(produto);
    }

    public List<String> obterProdutos() {
        List<String> saida = new ArrayList<>();
        for (Produto produto : produtos) {
            saida.add(produto.obterProduto());
        }
        return saida;
    }
}