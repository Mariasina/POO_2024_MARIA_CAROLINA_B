package Formativas.Heranca2.EX2;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Livro", 2);
        System.out.printf("\n\nItem: %s\nQuantidade: %d", item1.getName(), item1.getQuantity());

        Armadura item2 = new Armadura("Peitoral", 1, 3);
        System.out.printf("\n\nItem: %s\nQuantidade: %d\nDefesa: %d", item2.getName(), item2.getQuantity(), item2.getDefense());

        Pocao item3 = new Pocao("Poção de Força", 2, 2);
        System.out.printf("\n\nItem: %s\nQuantidade: %d\nCura: %d", item3.getName(), item3.getQuantity(), item3.getCure());
    }
}
