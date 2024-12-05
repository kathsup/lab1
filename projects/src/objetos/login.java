
package objetos;

public class login {
   
  String nombre, contra; 
  String Partidas[]; 
  int partidasjugadas; 

    public login(String nombre, String contra) {
        this.nombre = nombre;
        this.contra = contra;
        Partidas = new String[100];
        partidasjugadas =0; 
    }
  
    void registrarPartidas(String partidasactual){
    
    Partidas[partidasjugadas]=partidasactual; 
    partidasjugadas++;
    
    }
  
    String verpartidas(){
    String todaslaspartidas=""; 
        for (int i = 0; i < partidasjugadas; i++) {
            todaslaspartidas +=Partidas[i]+"\n"; 
        }
    return todaslaspartidas;
    }
    
    
    
    
}
