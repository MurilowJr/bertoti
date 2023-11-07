package CODE;

public class CPU{
    public void freeze(){
        System.out.println("A CPU está refrigerando...");
    }

    public void jump(long posicao){
        System.out.println("CPU está pulando para a posição " + posicao);
    }

    public void execute(){
        System.out.println("A CPU está executando...");
    }
}