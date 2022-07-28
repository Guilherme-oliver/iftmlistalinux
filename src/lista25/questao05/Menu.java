package lista25.questao05;

import java.util.LinkedList;

//Composição: Multiplicidade 1
public class Menu {
    private LinkedList<String> itens;

    public Menu(LinkedList<String> itens) {
        if (itens == null){
            System.out.println("Vazio");
        }else {
            this.itens = itens;
        }
    }
    public void addItem(String item){
        if (item.length() == 0){
            System.out.println("Item invalido!");
        }else {
            this.itens.add(item);
        }
    }
    public void removeItemMenu(){
        this.itens.removeFirst();
    }
    public String toString(){
        for (int i = 0; i < itens.size(); i++){
            System.out.println(itens.size());
        }
        return itens.toString();
    }
}
