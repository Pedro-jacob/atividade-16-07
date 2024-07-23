

public class Teste1
{
    public static void main (){
        Database database = new Database("construtora.db");
        ConstrutoraRepository conRepository = new ConstrutoraRepository(database);
        Construtora Construtora_1 = new Construtora();
        Construtora Construtora_2 = new Construtora();
        
        Construtora_1.setNome("construtora1");
        Construtora_1.setRegistro(111111);
        Construtora_1.set_preçoTijolo(3.50);
        Construtora_1.set_preçoCimento(5.00);
        
        Construtora_2.setNome("construtora2");
        Construtora_2.setRegistro(222222);
        Construtora_2.set_preçoTijolo(2.25);
        Construtora_2.set_preçoCimento(3.99);
        
        conRepository.create(Construtora_1);
        conRepository.create(Construtora_2);
    }
}
