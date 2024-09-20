package src;

public abstract class Burner 
{
    private double diameter;
    private double maxTemp;
    private double minTemp;
    private boolean isHot;

    public Burner(double maxTemp, double minTemp, double diameter)
    {
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.diameter = diameter;
        this.isHot = false;  // Initially, the burner is off
    }

    public abstract boolean turnOn();
    public abstract boolean turnOff();
    public abstract void increaseTemp();
    public abstract void decreaseTemp();
    

    public double getDiameter()
    {
        return diameter;
    }

    public double getMaxTemp()
    {
        return maxTemp;
    }

    public double getMinTemp()
    {
        return minTemp;
    }

    public boolean isHot()
    {
        return true;
    }

}
