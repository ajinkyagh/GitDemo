
public class SelectOperations {
    CarryOperations carryOperations=new CarryOperations();

    public void bank_operations(String line)
    {
        String[] splitInput= line.split("\\s");
            switch (splitInput[0]) {
                case "LOAN" -> carryOperations.takeLoan(splitInput);
                case "BALANCE" -> carryOperations.showBalance(splitInput);
                case "PAYMENT" -> carryOperations.makeLumpSumPayment(splitInput);
            }
    }

}
