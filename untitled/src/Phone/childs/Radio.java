package Phone.childs;
import Phone.Phone;

public class Radio extends Phone
{
    public TRS TRS;
    public Radio(String _Name, String _OS, String _Version, int _Range, int _price, String _color, Boolean _isWorking, TRS _TRS)
    {
        super(_Name, _OS, _Version, _Range, _price, _color, _isWorking);
        TRS=_TRS;
    }
    @Override
    public void print() {
        super.print();
        System.out.print(" | Radio Standart : "+TRS);
    }
    @Override
    public void supportedStandarts()
    {
        System.out.print('\n'+"TRS, TETRA, LTR");
    }


}
