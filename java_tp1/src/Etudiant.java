public class Etudiant {
    private   int id;
    private String nom ;
    private float moy;



    public Etudiant(int id, String nom, float moy) {
        this.moy=moy;
        this.nom=nom;
        this.id=id;
    }

    //public void set_moy(float b){this.moy=b;}
    public void set_id(int a){this.id=a;}
    public void set_non(String f){this.nom=f;}
    public float get_moy (){return (this.moy);}
    public String get_nom(){return(this.nom); }
    public int det_id(){ return(this.id);}
    public String to_string (){return ("id:"+String.valueOf(this.id)+" nom:"+this.nom+" moy:"+String.valueOf(this.moy));}
    public void bonus(){
        this.moy=this.moy+1;
    }




}
