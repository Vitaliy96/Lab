package Array;
import Phone.childs.GSM.CNS;
import Phone.childs.GSM.GSM_TYPE.Mobile;
import Phone.childs.GSM.GSM_TYPE.Smart;
import Phone.childs.Home;
import Phone.childs.Radio;
import Phone.childs.TRS;

/**
 * Created by Vitaliy on 19.04.2016.
 */
public class main
{
    public static void main(String[] args) {
        PhoneShop Shop = new PhoneShop();
        Shop.addShopProduct(new Radio("Lolcatel","Symbian", "0.458", 15000, 50,"Black", true, TRS.LTR));
        Shop.showShopProducts();
        System.out.print("\n----------------------");
        Shop.addShopProduct(new Smart("Samsung","Android", "4.0.4",10000,140,"Red",2, true, CNS.PDC));
        Shop.addShopProduct(new Home("loltel","NoPhoneOS","7.012",10,80,"White",true));
        Shop.addShopProduct(new Mobile("Mobiluck","MyOS","0.3.5",6000,50,"Yellow",1, false, CNS.CDMA));
        Shop.showShopProducts();
        Shop.deleteShopProduct();
        Shop.showShopProducts();
        Shop.deleteShopProduct();
        Shop.showShopProducts();
    }
}
