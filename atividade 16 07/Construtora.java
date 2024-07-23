import java.util.Date;
import java.text.SimpleDateFormat;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "construtoras")
public class Construtora
{   
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String nome;
    
    @DatabaseField
    public int registro;
    
    @DatabaseField
    private double preçoTijolo;
    
    @DatabaseField
    private double preçoCimento;
  
//Start GetterSetterExtension Source Code
     /**GET Method Propertie preçoTijolo*/
    public double get_preçoTijolo(){
        return this.preçoTijolo;
    }
    
    /**SET Method Propertie preçoTijolo*/
    public void set_preçoTijolo(double preçoTijolo){
        this.preçoTijolo = preçoTijolo;
    }
     
    /**GET Method Propertie preçoCimento*/
     public double get_preçoCimento(){
        return this.preçoCimento;
    }
    
    /**SET Method Propertie preçoCimento*/
    public void set_preçoCimento(double preçoCimento){
        this.preçoCimento = preçoCimento;
    }
    
    /**GET Method Propertie id*/
    public int getId(){
        return this.id;
    }//end method getId

    /**SET Method Propertie id*/
    public void setId(int id){
        this.id = id;
    }//end method setId

    /**GET Method Propertie nome*/
    public String getNome(){
        return this.nome;
    }//end method getnome

    /**SET Method Propertie nome*/
    public void setNome(String nome){
        this.nome = nome;
    }//end method setnome

    /**GET Method Propertie registro*/
    public int getRegistro(){
        return this.registro;
    }//end method getregistro

    /**SET Method Propertie registro*/
    public void setRegistro(int registro){
        this.registro = registro;
    }//end method setregistro


//End GetterSetterExtension Source Code


}//End class