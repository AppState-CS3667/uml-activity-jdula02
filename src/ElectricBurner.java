package src;

public class ElectricBurner extends Burner {
    private double voltReq;
    private double ampReq;

    /**
     * @param voltReq
     */
    public ElectricBurner(double voltReq)
    {
        super(100,0,10);
        this.voltReq = voltReq; 
    }

    public void increaseCurrent()
    {

    }

    public void decreaseCurrent()
    {

    }

    public double getVoltReq()
    {
        return voltReq;
    }

    @Override
    public void decreaseTemp() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void increaseTemp() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean turnOff() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean turnOn() {
        // TODO Auto-generated method stub
        return false;
    }

}
