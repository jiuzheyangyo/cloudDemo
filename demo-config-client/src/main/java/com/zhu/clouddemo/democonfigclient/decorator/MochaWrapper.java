package com.zhu.clouddemo.democonfigclient.decorator;

public class WhipWrapper extends BeverageWrapper{
    private int price = 10;

    public WhipWrapper(Beverage beverage){
        super(beverage);
    }

    @Override
    public int myCost() {
        return this.price;
    }

}
