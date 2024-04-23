package Formativas.TratamentoExcecao;

public class EX3 {
    public static void main(String[] args) {
        int[] array_num = new int[3];

        try{
            int num = array_num[4];
            System.out.println(num);
        }catch (ArrayIndexOutOfBoundsException ArrOutB){
            System.out.println("Index inexistente");
        }
    }
}
