

public class Teste2
{
    public static void main(){
        Database database = new Database("construtora.db");
        ConstrutoraRepository conRepository = new ConstrutoraRepository(database);
        Construtora Construtora_1 = conRepository.loadFromId(1);
        Construtora Construtora_2 = conRepository.loadFromId(2);
        
        Construtora_1.setNome("catatau edificações");
        Construtora_1.set_preçoTijolo(1.50);
        conRepository.update(Construtora_1);
        
        conRepository.delete(Construtora_2);
    }
}
