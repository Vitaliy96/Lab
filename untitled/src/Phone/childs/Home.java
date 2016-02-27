package Phone.childs;
import Phone.Phone;


public class  Home extends Phone {
    public Home(String _Name, String _OS, String _Version, int _Range, int _price, String _color, Boolean _isWorking) {
        super(_Name, _OS, _Version,_Range, _price, _color, _isWorking);
    }

    @Override
    public void supportedStandarts() {
        System.out.print('\n'+"UMTS, NMT");
    }
}
