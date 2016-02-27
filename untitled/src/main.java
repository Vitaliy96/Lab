import Phone.Phone;
import Phone.childs.GSM.CNS;
import Phone.childs.GSM.GSM_TYPE.Mobile;
import Phone.childs.GSM.GSM_TYPE.Smart;
import Phone.childs.Home;
import Phone.childs.Radio;
import Phone.childs.TRS;


public class main {
    public static void main(String[] args) {
        Radio b = new Radio("Lolcatel","Symbian", "0.458", 15000, 50,"Black", true, TRS.LTR);
        Smart a = new Smart("Samsung","Android", "4.0.4",10000,140,"Red",2, true, CNS.PDC);
        Home c = new Home("loltel","NoPhoneOS","7.012",10,80,"White",true);
        Mobile d = new Mobile("Mobiluck","MyOS","0.3.5",6000,50,"Yellow",1, false, CNS.CDMA);
        b.print();
        a.print();
        c.print();
        d.print();
        b.checkVersion();
        a.checkVersion();
        c.checkVersion();
        d.checkVersion();
        b.isWork();
        a.isWork();
        c.isWork();
        d.isWork();
        b.updateFirmware();
        a.updateFirmware();
        c.updateFirmware();
        d.updateFirmware();
        b.supportedStandarts();
        a.supportedStandarts();
        c.supportedStandarts();
        d.supportedStandarts();
    }

}
