package logicaNegocio;

public class Perro extends Animal implements Domestico{
    
    public Perro (){
    this.habitat = TipoHabitat.TERRESTRE;
}

    @Override
    public String emitirSonido() {
        return "Ladrido";
    }

    @Override
    public String obtenerDieta() {
        return "ovnivoro";
    }

    @Override
    public String interactuarConHumano() {
        
        return "El perro mueve la cola y ladra de felicidad";
    }
    
    public TipoHabitat getHabitat() {
        return habitat;
    }
}
