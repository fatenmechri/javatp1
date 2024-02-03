public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Etudiant[] tab=new Etudiant[5];
        tab[0]= new Ing(11,"slma ben slma", 15.5F,"stageA"," stadeB");
        tab[1]= new Lmd(100,"soilin ben hsen ", 5.6F,"pfe1");
        tab[2]= new Ing(200,"echrak ahmed",1.9F,"stage1 ","stage2");
        tab[3]= new Lmd(300,"lmia  mohmed",11.2F ,"pfe1 ");
        tab[4]= new Lmd(400,"housem hlwi ",15.7F,"pfe2 ");
        for (int i=0;i<5;i++){
            System.out.println(tab[i].to_string());
    }
        float moy_ginerale;
        float tot=0;
        for (int i=0;i<5;i++){
            tot+=tab[i].get_moy();
        }
        moy_ginerale=tot/5;
        System.out.println("moy generale des 5 etudiants:"+moy_ginerale);


    }

}