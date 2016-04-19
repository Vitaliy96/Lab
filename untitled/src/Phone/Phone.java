package Phone;


import java.util.Random;

public abstract class Phone {
    protected int range;
    protected int price;
    protected String color;
    protected String operatingSystem;
    protected String version;
    protected String name;
    protected Boolean isWorking;
    protected Phone(String _Name, String _OS, String _Version, int _Range, int _price, String _color, Boolean _isWorking)
    {
        name = _Name;
        operatingSystem = _OS;
        color = _color;
        price = _price;
        isWorking = _isWorking;
        version = _Version;
        range = _Range;
    }

    public void print(){
        System.out.print( '\n'+"name : "+ name +" | operatingSystem : "+ operatingSystem + " | version : "+ version +" | Color : " +color +" | Price : "+price);
    }

    public void checkVersion(){
        System.out.print('\n'+"operatingSystem : "+ operatingSystem + " | version : "+ version);
    }

    public void isWork()
    {
        Random Random = new Random();
        if (Random.nextInt(100000)>90000 || !isWorking)
        {
            isWorking=false;
            System.out.print('\n'+"This device is not working! Update your Firmware.");
        }
        else
        {
            System.out.print('\n'+"The device is functioning properly.");
        }
    }

    public void updateFirmware()
    {
        System.out.print('\n'+"Firmware updated succesfuly. Device is ready to work.");
        isWorking=true;
    }

    abstract public void supportedStandarts ();
}
