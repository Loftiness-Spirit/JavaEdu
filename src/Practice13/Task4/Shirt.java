package Practice13.Task4;

public class Shirt {
    private final String[] shirts;
    public Shirt(String string){
        this.shirts = string.split(",");
    }

    @Override
    public String toString() {
        return "Номер: " + shirts[0] + "; Тип: "+shirts[1] + "; Цвет: " + shirts[2] + "; Размер: " + shirts[3]+".";
    }


}
