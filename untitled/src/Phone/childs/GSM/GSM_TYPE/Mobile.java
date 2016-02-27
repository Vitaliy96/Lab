package Phone.childs.GSM.GSM_TYPE;

import Phone.childs.GSM.GSM;
import Phone.childs.GSM.CNS;

public class Mobile extends GSM {

    public Mobile(String _Name, String _OS, String _Version, int _Range, int _price, String _color, int num, Boolean _isWorking, CNS _CNS) {
        super(_Name, _OS, _Version,_price,  _Range, _color, num,_isWorking, _CNS );
    }

    @Override
    public void supportedStandarts()
    {
        System.out.print('\n'+"CDMA, PDC");
    }
}
