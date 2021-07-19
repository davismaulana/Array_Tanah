

public class Tanah {
    private int Panjang;
    private int Lebar;

    public void setPanjang (int Ptanah){
        Panjang = Ptanah;
    }

    public void setLebar (int Ltanah){
        Lebar = Ltanah;
    }

    public int getPanjang (){
        return Panjang;
    }

    public int getLebar (){
        return Lebar;
    }

    public int getLuas(){
        return Panjang * Lebar;
    }
     
}
