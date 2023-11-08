package CODE;

public class DemoThreadUnica {
    public static void main (String[] args) {
        System.out.println("Se estiver vendo o mesmo valor, então o Singleton foi reutilizado"
                           + "\n"
                           + "Se estiver vendo valores diferentes, então dois singletons foram cirados."
                           + "\n\n"
                           + "Resultado: " + "\n");
        Singleton singleton = Singleton.getInstance("Teste");
        Singleton singleton2 = Singleton.getInstance("Teste2");
        System.out.println(singleton.value);
        System.out.println(singleton2.value);
    }
    
}
