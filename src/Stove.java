package src;

public class Stove {
    private Burner[] burners;

    public boolean hookUp()
    {
        return false;
    }

    public void setBurnerTemp(int burner, double temp)
    {
    
    }

    public boolean isHot()
    {
        return true;
    }

    public boolean isHot(int burner)
    {
        return true;
    }

    public double getBurnerTemp(int burner)
    {
        return burner;
    }

    public Burner getBurner(int burner)
    {
       return burners[burner];
    }
}
