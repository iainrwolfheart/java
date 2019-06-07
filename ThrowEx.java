class ThrowEx{
    public static void main(String args[]){
        AccountsSlip ref=new AccountsSlip();
        ref.SalarySlip(2000,8);
    }
}
class Accounts{
    public float Tax(int Sal, int Abs) throws AbsentiesException{
        float t;

        if(Abs>=7){
            AbsentiesException exref =new AbsentiesException();
            throw exref;
        }
        else{
            t=Sal*21/100;
        }
    return t;
    }
}

class AccountsSlip{
    public void SalarySlip(int Sal, int Abs){
        Accounts metrep=new Accounts();
        try{
            float ns;
            ns=Sal-metrep.Tax(Sal,Abs);
            System.out.println("Net Sal= "+ns);
        }
        catch(AbsentiesException exref){
            System.out.println("Too many absentee days!");
        }
    }
}
class AbsentiesException extends Exception{}