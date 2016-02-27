package Phone.childs.GSM;
import Phone.Phone;


public abstract class GSM extends Phone {
    protected int num_sim;
    protected CNS CNS;
    protected GSM(String _Name, String _OS, String _Version, int _Range, int _price, String _color, int num, Boolean _isWorking, CNS _CNS) {
        super(_Name, _OS, _Version,_Range,_price, _color, _isWorking);
        num_sim = num;
        CNS = _CNS;
    }
    @Override
    public void print(){
        super.print();
        System.out.print(" | Num of sim-card : "+num_sim+" | Network Standart : "+CNS);
    }
}
