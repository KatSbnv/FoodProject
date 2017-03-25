package staff;

import Dish.Salad;

public class Chef extends Human
{
    public Salad cook (String mainPart, String dressingPart)
    {
        Salad mySalad = new Salad();
        mySalad.mainPart = mainPart + " ";
        mySalad.dressingPart = dressingPart + " ";
        return mySalad;



    }

    @Override
    public void walk() {
        System.out.println("WTF?! I'm cooking!!");
    }
}
