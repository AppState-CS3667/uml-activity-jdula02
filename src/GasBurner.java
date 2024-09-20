package src;

public class GasBurner extends Burner {
    private String gasType;

    public GasBurner()
    {
        super(100,0,10);
        this.gasType = gasType;
    }

    public boolean spark()
    {
        return true;
    }

    public String getGasType()
    {
        return gasType;
    }

    private void increaseGasFlow()
    {

    }

    private void decreaseGasFlow()
    {
        
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
