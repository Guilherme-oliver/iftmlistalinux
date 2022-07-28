package lista25.questao05;

import java.util.LinkedList;

//Composição: Multiplicidade 1
public class Janela {
    private String titulo;
    private Menu menu;


    public Janela(String titulo) {
        if (titulo.length() == 0){
            System.out.println("Nome invalido!");
        }else {
            this.titulo = titulo;
            this.menu = new Menu(new LinkedList<>());
        }

    }

    public Janela(String titulo, LinkedList<String> itens){
        this.titulo = titulo;
        this.menu = new Menu(itens);

    }

    public void addItemMenu(String item){
        menu.addItem(item);
    }
    public void removeItemMenu(){
       menu.removeItemMenu();
    }
    public String toString(){
        return "Titulo: "
                + titulo
                + "\n"
                + "Menu: "
                + menu;

    }
}
