import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import com.j256.ormlite.table.TableUtils;
import java.util.List;
import java.util.ArrayList;

public class ConstrutoraRepository
{
    private static Database database;
    private static Dao<Construtora, Integer> dao;
    private List<Construtora> loadedConstrutoras;
    private Construtora loadedConstrutora; 
    
    public ConstrutoraRepository(Database database) {
        ConstrutoraRepository.setDatabase(database);
        loadedConstrutoras = new ArrayList<Construtora>();
    }
    
    public static void setDatabase(Database database) {
        ConstrutoraRepository.database = database;
        try {
            dao = DaoManager.createDao(database.getConnection(), Construtora.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Construtora.class);
        }
        catch(SQLException e) {
            System.out.println(e);
        }            
    }
    
    public Construtora create(Construtora construtora) {
        int nrows = 0;
        try {
            nrows = dao.create(construtora);
            if ( nrows == 0 )
                throw new SQLException("Error: object not saved");
            this.loadedConstrutora = construtora;
            loadedConstrutoras.add(construtora);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return construtora;
    }    

    public void update(Construtora construtora) {
        try{
            dao.update(construtora);
        }catch(SQLException e){
            System.out.println(e);
        }

    }

    public void delete(Construtora construtora) {
        try{
            dao.delete(construtora);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public Construtora loadFromId(int id) {
        try {
            this.loadedConstrutora = dao.queryForId(id);
            if (this.loadedConstrutora != null)
                this.loadedConstrutoras.add(this.loadedConstrutora);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedConstrutora;
    }    
    
    public List<Construtora> loadAll() {
        try {
            this.loadedConstrutoras =  dao.queryForAll();
            if (this.loadedConstrutoras.size() != 0)
                this.loadedConstrutora = this.loadedConstrutoras.get(0);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedConstrutoras;
    }

    // getters and setters ommited...        
}