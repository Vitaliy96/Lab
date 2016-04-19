package ArrayList;

import Phone.Phone;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Vitaliy on 12.04.2016.
 */
public class PhoneShop
{
    protected ArrayList<Phone> stockArray = new ArrayList<Phone>();

    public void addShopProduct (Phone addedPhoneDevice)
    {
        stockArray.add(addedPhoneDevice);
    }

    public void showShopProducts()
    {
        if (stockArray.size()!=0)
        {
            for (int i = 0; i < stockArray.size(); i++)
            {
                stockArray.get(i).print();
            }
        }
        else
        {
            System.out.print("\nSorry, shop is empty!");
        }
    }

    public void deleteShopProduct ()
    {
        if (stockArray.size()!=0) {
            int index;
            Scanner in = new Scanner(System.in);
            System.out.print("\nEnter index of element wich you want to delete : \n ");
            index = in.nextInt();
            if (index > stockArray.size()) System.out.print("\nError : index bigger than size");
            else {
                if (index < 1) System.out.print("\nError : index smaller than 1");
                else {
                    stockArray.remove(index);
                }
            }
        }
        else
        {
            System.out.print("\nArray already empty!");
        }
    }

}
