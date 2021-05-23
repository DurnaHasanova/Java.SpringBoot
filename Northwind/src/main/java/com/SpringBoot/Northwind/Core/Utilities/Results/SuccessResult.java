package com.SpringBoot.Northwind.Core.Utilities.Results;

public class SuccessResult<T> extends  Result {

    public  SuccessResult(){
        super(true);
    }
    public  SuccessResult ( String message){
        super(true, message );
    }
}
