package CODE;

public class Disco {
    public byte[] read(long lba, int tamanho){
        System.out.println("O Disco rígido está lendo " + tamanho + " bytes da posição " + lba);
        return new byte[tamanho];
    }
}
