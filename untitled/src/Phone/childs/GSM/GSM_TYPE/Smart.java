package Phone.childs.GSM.GSM_TYPE;

import Phone.childs.GSM.GSM;
import Phone.childs.GSM.CNS;

public class Smart extends GSM {
    public Smart(String _Name, String _OS, String _Version, int _Range,  int _price, String _color, int num, Boolean _isWorking, CNS _CNS) {
        super(_Name, _OS, _Version,_Range, _price, _color, num, _isWorking, _CNS);
    }

    @Override
    public void supportedStandarts()
    {
        System.out.print('\n'+"LTE, LTE_A, CDMA, PDC");
    }
}
