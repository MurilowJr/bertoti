package CODE;

public class ComputadorFachada {
    private CPU cpu;
    private Memoria memoria;
    private Disco disco;

    public ComputadorFachada(){
        cpu = new CPU();
        memoria = new Memoria();
        disco = new Disco();
    }

    public void ligarComputador(){
        cpu.freeze();
        memoria.load(0, disco.read(0, 1024));
        cpu.jump(0);
        cpu.execute();
    }
}
