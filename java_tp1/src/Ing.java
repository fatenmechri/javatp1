public class Ing extends Etudiant {
    private String stage1, satage2;
    public Ing(int id,String nom ,float moy,String stage1,String satage2){
        super(id,nom,moy);
        this.stage1=stage1;
        this.satage2=satage2;
    }
    public String to_string(){
        return ("ing:"+super.to_string()+"stage1"+this.stage1+"satage2"+this.satage2);
    }

}
