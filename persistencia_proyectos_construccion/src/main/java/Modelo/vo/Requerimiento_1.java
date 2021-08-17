package Modelo.vo;

public class Requerimiento_1 {

    private Integer ID_Proyecto;
    private String Ciudad;
    private String Banco;
    private String Constructora;

    public Integer getID_Proyecto() {
    return ID_Proyecto;
    }
    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    public String getBanco() {
        return Banco;
    }
    public void setBanco(String banco) {
        Banco = banco;
    }
    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String constructora) {
        Constructora = constructora;
    }
    public Requerimiento_1(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }
    public Requerimiento_1() {
    }    

    
}

