package lista28.questao04;

import java.util.Locale;

public class Teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Produto produto = new Produto("Tablet", 120);
        Produto produto1 = new Produto("IPhone", 1000);
        Produto produto2 = new Produto("Cadeira", 80);

        ClienteOnline clienteOnline = new ClienteOnline("joao@gmail.com", 1500);

        clienteOnline.pegaProduto(produto);
        clienteOnline.pegaProduto(produto1);
        clienteOnline.pegaProduto(produto2);
        System.out.println(clienteOnline);

        clienteOnline.paga();
        System.out.println(clienteOnline);

        clienteOnline.pegaProduto(produto);
        System.out.println(clienteOnline);

        clienteOnline.tiraProduto("IPhone");
        System.out.println(clienteOnline);

        clienteOnline.tiraProduto("Tablet");
        System.out.println(clienteOnline);

        clienteOnline.pegaProduto(produto1);
        System.out.println(clienteOnline);

        clienteOnline.esvaziaCarrinho();
        System.out.println(clienteOnline);

    }
}
