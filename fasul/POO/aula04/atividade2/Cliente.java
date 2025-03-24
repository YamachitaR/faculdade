public class Cliente{

    static int ultimoID = 1;

    int id;

    Cliente(){
        this.id = ultimoID;
        ultimoID ++;
    }
    
    public void imprimir(){
        System.out.println(this.id);
    }
}