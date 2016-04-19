package Array;

import Phone.Phone;

import java.util.Scanner;

/**
 * Created by Vitaly on 12.04.2016.
 */
public class PhoneShop
{
    protected Phone[] stockArray = new Phone[100];
    protected int arrayFactSize =0;

    public void addShopProduct (Phone addedPhoneDevice)
    {
        stockArray[arrayFactSize]=addedPhoneDevice;
        arrayFactSize++;
    }

    public void showShopProducts()
    {
        if (arrayFactSize !=0)
        {
            for (int i = 0; i < arrayFactSize; i++)
            {
                stockArray[i].print();
            }
        }
        else
        {
            System.out.print("\nSorry, shop is empty!");
        }
    }

    public void deleteShopProduct ()
    {
        if (arrayFactSize!=0) {
            int index;
            Scanner in = new Scanner(System.in);
            System.out.print("\nEnter index of element wich you want to delete : \n ");
            index = in.nextInt();
            if (index > arrayFactSize) System.out.print("\nError : index bigger than size");
            else {
                if (index < 1) System.out.print("\nError : index smaller than 1");
                else {
                    for (int i = index; i < arrayFactSize; i++) {
                        stockArray[i - 1] = stockArray[i];
                    }
                    arrayFactSize--;
                }
            }
        }
        else
        {
            System.out.print("\nArray already empty!");
        }
    }

}
