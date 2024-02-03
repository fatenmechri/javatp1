public class Lmd extends Etudiant{
    private String pfe;
    public Lmd(int id,String nom ,float moy,String pfe){
        super (id,nom ,moy);
        this.pfe=pfe;
    }
    public String to_string(){
        return ("lmd:"+super.to_string()+"pfe"+this.pfe);
    }

}
