import java.util.Scanner;

abstract class Wallet{
    protected double dollars;
    protected double francs;
    protected double zlotys;

    abstract void setDollars(double dollars);
    abstract void setFrancs(double francs);
    abstract void setZlotys(double zlotys);
    abstract double getDollars();
    abstract double getFrancs();
    abstract double getZlotys();
    abstract void addDollars(double input);
    abstract void addFrancs(double input);
    abstract void addZlotys(double input);
    abstract void removeDollars(double input);
    abstract void removeFrancs(double input);
    abstract void removeZlotys(double input);
    abstract String convertToDollars(double dollars, double francs, double zlotys);
    abstract String convertToFrancs(double francs, double dollars, double zlotys);
    abstract String convertToZlotys(double zlotys, double dollars, double francs);
}
class DollarWallet extends Wallet{
    private Object DollarWallet;

    public DollarWallet(double dollars, double francs, double zlotys){
        this.dollars = dollars;
        this.francs = francs;
        this.zlotys = zlotys;
    }
    public DollarWallet(Object obj){
        DollarWallet = obj;
    }
    public void setDollars(double dollars){
        this.dollars = dollars;
    }
    public void setFrancs(double francs){
        this.francs = francs;
    }
    public void setZlotys(double zlotys){
        this.zlotys = zlotys;
    }
    public double getDollars(){
        return dollars;
    }
    public double getFrancs(){
        return francs;
    }
    public double getZlotys(){
        return zlotys;
    }
    public void addDollars(double input){
        dollars = getDollars();
        dollars += input;
    }
    public void addFrancs(double input){
        francs = getFrancs();
        francs += input;
    }
    public void addZlotys(double input){
        zlotys = getZlotys();
        zlotys += input;
    }
    public void removeDollars(double input){
        dollars = getDollars();
        dollars -= input;
    }
    public void removeFrancs(double input){
        francs = getFrancs();
        francs -= input;
    }
    public void removeZlotys(double input){
        zlotys = getZlotys();
        zlotys -= input;
    }
    public String printDollarWallet(){
        return "The contents of your dollar wallet are currently as follow: " + String.format("%.2f", getDollars()) + " dollars, " + String.format("%.2f", getFrancs()) + " francs, " + String.format("%.2f", getZlotys()) + " zlotys.";
    }
    public String convertToDollars(double dollars, double francs, double zlotys){
        double output = dollars + Franc.convertFrancToDollar(francs) + Zloty.convertZlotyToDollar(zlotys);
        return String.format("%.2f", output);
    }
    public String convertToFrancs(double francs, double dollars, double zlotys){
        double output = francs + Dollar.convertDollarToFranc(dollars) + Zloty.convertZlotyToFranc(zlotys);
        return String.format("%.2f", output);
    }
    public String convertToZlotys(double zlotys, double dollars, double francs){
        double output = zlotys + Dollar.convertDollarToZloty(dollars) + Franc.convertFrancToZloty(francs);
        return String.format("%.2f", output);
    }
}
class FrancWallet extends Wallet{
    private Object FrancWallet;

    public FrancWallet(double francs, double dollars, double zlotys){
        this.francs = francs;
        this.dollars = dollars;
        this.zlotys = zlotys;
    }
    public FrancWallet(Object obj){ FrancWallet = obj;}
    public void setDollars(double dollars){
        this.dollars = dollars;
    }
    public void setFrancs(double francs){
        this.francs = francs;
    }
    public void setZlotys(double zlotys){
        this.zlotys = zlotys;
    }
    public double getDollars(){
        return dollars;
    }
    public double getFrancs(){
        return francs;
    }
    public double getZlotys(){
        return zlotys;
    }
    public void addDollars(double input){
        dollars = getDollars();
        dollars += input;
    }
    public void addFrancs(double input){
        francs = getFrancs();
        francs += input;
    }
    public void addZlotys(double input){
        zlotys = getZlotys();
        zlotys += input;
    }
    public void removeDollars(double input){
        dollars = getDollars();
        dollars -= input;
    }
    public void removeFrancs(double input){
        francs = getFrancs();
        francs -= input;
    }
    public void removeZlotys(double input){
        zlotys = getZlotys();
        zlotys -= input;
    }
    public String printFrancWallet(){
        return "The contents of your franc wallet are currently as follow: " + String.format("%.2f", getDollars()) + " dollars, " + String.format("%.2f", getFrancs()) + " francs, " + String.format("%.2f", getZlotys()) + " zlotys.";
    }
    public String convertToDollars(double dollars, double francs, double zlotys){
        double output = dollars + Franc.convertFrancToDollar(francs) + Zloty.convertZlotyToDollar(zlotys);
        return String.format("%.2f", output);
    }
    public String convertToFrancs(double francs, double dollars, double zlotys){
        double output = francs + Dollar.convertDollarToFranc(dollars) + Zloty.convertZlotyToFranc(zlotys);
        return String.format("%.2f", output);
    }
    public String convertToZlotys(double zlotys, double dollars, double francs){
        double output = zlotys + Dollar.convertDollarToZloty(dollars) + Franc.convertFrancToZloty(francs);
        return String.format("%.2f", output);
    }
}
class ZlotyWallet extends Wallet{
    private Object ZlotyWallet;

    public ZlotyWallet(double zlotys, double dollars, double francs){
        this.dollars = dollars;
        this.francs = francs;
        this.zlotys = zlotys;
    }
    public ZlotyWallet(Object obj){
        ZlotyWallet = obj;
    }
    public void setDollars(double dollars){
        this.dollars = dollars;
    }
    public void setFrancs(double francs){
        this.francs = francs;
    }
    public void setZlotys(double zlotys){
        this.zlotys = zlotys;
    }
    public double getDollars(){
        return dollars;
    }
    public double getFrancs(){
        return francs;
    }
    public double getZlotys(){
        return zlotys;
    }
    public void addDollars(double input){
        dollars = getDollars();
        dollars += input;
    }
    public void addFrancs(double input){
        francs = getFrancs();
        francs += input;
    }
    public void addZlotys(double input){
        zlotys = getZlotys();
        zlotys += input;
    }
    public void removeDollars(double input){
        dollars = getDollars();
        dollars -= input;
    }
    public void removeFrancs(double input){
        francs = getFrancs();
        francs -= input;
    }
    public void removeZlotys(double input){
        zlotys = getZlotys();
        zlotys -= input;
    }
    public String printZlotyWallet(){
        return "The contents of your zloty wallet are currently as follow: " + String.format("%.2f", getDollars()) + " dollars, " + String.format("%.2f", getFrancs()) + " francs, " + String.format("%.2f", getZlotys()) + " zlotys.";
    }
    public String convertToDollars(double dollars, double francs, double zlotys){
        double output = dollars + Franc.convertFrancToDollar(francs) + Zloty.convertZlotyToDollar(zlotys);
        return String.format("%.2f", output);
    }
    public String convertToFrancs(double francs, double dollars, double zlotys){
        double output = francs + Dollar.convertDollarToFranc(dollars) + Zloty.convertZlotyToFranc(zlotys);
        return String.format("%.2f", output);
    }
    public String convertToZlotys(double zlotys, double dollars, double francs){
        double output = zlotys + Dollar.convertDollarToZloty(dollars) + Franc.convertFrancToZloty(francs);
        return String.format("%.2f", output);
    }
}
abstract class Money{
    protected static double dollarToFranc = 0.92;
    protected static double dollarToZloty = 4.18;
    protected static double francToDollar = 1.09;
    protected static double francToZloty = 4.57;
    protected static double zlotyToDollar = 0.24;
    protected static double zlotyToFranc = 0.22;
}
class Dollar extends Money{
    private static double dollar;

    public Dollar(double input){
        dollar = input;
    }

    public Dollar(Object obj){
        if(obj instanceof Franc){
            dollar = Franc.convertFrancToDollar(Franc.getFrancs());
        }
        if(obj instanceof Zloty){
            dollar = Zloty.convertZlotyToDollar(Zloty.getZlotys());
        }
    }
    public static double getDollars(){
        return dollar;
    }
    public static double convertDollarToFranc(double dollarNumber){
        return dollarNumber*dollarToFranc;
    }
    public static double convertDollarToZloty(double dollarNumber){
        return dollarNumber*dollarToZloty;
    }
}
class Franc extends Money{
    private static double franc;

    public Franc(double input){
        franc = input;
    }
    public Franc(Object obj){
        if(obj instanceof Dollar){
            franc = Dollar.convertDollarToFranc(Dollar.getDollars());
        }
        if(obj instanceof Zloty){
            franc = Zloty.convertZlotyToFranc(Zloty.getZlotys());
        }
    }
    public static double getFrancs(){
        return franc;
    }

    public static double convertFrancToDollar(double francNumber){
        return francNumber*francToDollar;
    }
    public static double convertFrancToZloty(double francNumber){
        return francNumber*francToZloty;
    }
}
class Zloty extends Money{
    private static double zloty;

    public Zloty(double input){
        zloty = input;
    }
    public Zloty(Object obj){
        if(obj instanceof Dollar){
            zloty = Dollar.convertDollarToZloty(Dollar.getDollars());
        }
        if(obj instanceof Franc){
            zloty = Franc.convertFrancToZloty(Franc.getFrancs());
        }
    }
    public static double getZlotys(){
        return zloty;
    }

    public static double convertZlotyToDollar(double zlotyNumber){
        return zlotyNumber*zlotyToDollar;
    }
    public static double convertZlotyToFranc(double zlotyNumber){
        return zlotyNumber*zlotyToFranc;
    }
}
public class WalletTest {
    public static void main(String[] args){
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a wallet simulator. To start the program, press '*'. To exit, press press '.':");
        String input = scanner.nextLine();
        while(!exit) {
            if(input.equals(".")){
                exit = true;
            }
            if(input.equals("*")){
                System.out.println("To instantiate a new dollar wallet, press 1. To instantiate a new franc wallet, press 2. To instantiate a new zloty wallet, please press 3. To exit, press '.':");
                Scanner walletScan = new Scanner(System.in);
                String walletScanner = walletScan.nextLine();
                if(walletScanner.equals(".")){System.exit(0);}
                if(walletScanner.equals("1")){
                    System.out.println("Enter your dollar value: ");
                    Scanner firstValue = new Scanner(System.in);
                    double dollarValue = firstValue.nextDouble();
                    System.out.println("Enter your franc value: ");
                    Scanner secondValue = new Scanner(System.in);
                    double francValue = secondValue.nextDouble();
                    System.out.println("Enter your zloty value: ");
                    Scanner thirdValue = new Scanner(System.in);
                    double zlotyValue = thirdValue.nextDouble();
                    DollarWallet dol = new DollarWallet(dollarValue, francValue, zlotyValue);
                    System.out.println(dol.printDollarWallet());
                    System.out.println("The value of all the money currently present in the wallet is roughly equal in value to: " + dol.convertToDollars(dollarValue, francValue, zlotyValue) + " dollars or " + dol.convertToFrancs(dollarValue, francValue, zlotyValue) + " francs, or " + dol.convertToZlotys(dollarValue, francValue, zlotyValue) + " zlotys. ");
                    System.out.println("You're about to modify your instantiated wallet. To see the content of your wallet, press '@'. To exit the subprogram, press '!'.");
                    System.out.println("To add dollars to your wallet, press '$'. To add francs to your wallet, press '&'. To add zlotys to your wallet, please enter '#'. To remove dollars, francs or zlotys, enter '$$', '&&' or '##' respectively. To instantiate a new wallet on the basis of the one already created, enter '-'. ");
                    System.out.println("To convert your francs or zlotys into dollars and to add them to your dollar tally, enter '^' or '=' respectively. To convert dollars or zlotys into francs, press '(' or ')' respectively. To convert dollars or francs into zlotys, press '{' or '}' respectively. ");
                    boolean exitMod = false;
                    Scanner modifyingCurrency = new Scanner(System.in);
                    while(!exitMod){
                        String modCurrency = modifyingCurrency.nextLine();
                        if(modCurrency.equals("!")){
                            exitMod = true;
                        }
                        if(modCurrency.equals("@")){
                            System.out.println(dol.printDollarWallet());
                        }
                        if(modCurrency.equals("$")) {
                            System.out.println("Enter a number of dollars you wish to add to your wallet: ");
                            Scanner newDollars = new Scanner(System.in);
                            double newDollarAdd = newDollars.nextDouble();
                            dol.addDollars(newDollarAdd);
                        }
                        if(modCurrency.equals("&")) {
                            System.out.println("Now enter a number of francs you wish to add to your wallet: ");
                            Scanner addFrancs = new Scanner(System.in);
                            double addedFrancs = addFrancs.nextDouble();
                            dol.addFrancs(addedFrancs);
                        }
                        if(modCurrency.equals("#")) {
                            System.out.println("Now enter a number of zlotys you wish to add to your wallet: ");
                            Scanner addZlotys = new Scanner(System.in);
                            double addedZlotys = addZlotys.nextDouble();
                            dol.addZlotys(addedZlotys);
                        }
                        if(modCurrency.equals("$$")){
                            System.out.println("Enter a number of dollars you wish to remove to your wallet: ");
                            Scanner remDollars = new Scanner(System.in);
                            double removedDollars = remDollars.nextDouble();
                            dol.removeDollars(removedDollars);
                        }
                        if(modCurrency.equals("&&")){
                            System.out.println("Now enter a number of francs you wish to remove from your wallet: ");
                            Scanner remFrancs = new Scanner(System.in);
                            double removedFrancs = remFrancs.nextDouble();
                            dol.removeFrancs(removedFrancs);
                        }
                        if(modCurrency.equals("##")){
                            System.out.println("Now enter a number of zlotys you wish to remove from your wallet: ");
                            Scanner remZlotys = new Scanner(System.in);
                            double removedZlotys = remZlotys.nextDouble();
                            dol.removeZlotys(removedZlotys);
                        }
                        if(modCurrency.equals("-")){
                            System.out.println("Choose the type of wallet you want to create on the basis of the already established one. Press '%' to create a new franc wallet or '+' to create a new zloty wallet. ");
                            Scanner typeWallet = new Scanner(System.in);
                            String chooseType = typeWallet.nextLine();
                            if(chooseType.equals("%")){
                                FrancWallet fran = new FrancWallet(dol);
                                fran.addDollars(dol.getDollars());
                                fran.addFrancs(dol.getFrancs());
                                fran.addZlotys(dol.getZlotys());
                                System.out.println(fran.printFrancWallet());
                            }
                            if(chooseType.equals("+")){
                                ZlotyWallet zlot = new ZlotyWallet(dol);
                                zlot.addDollars(dol.getDollars());
                                zlot.addFrancs(dol.getFrancs());
                                zlot.addZlotys(dol.getZlotys());
                                System.out.println(zlot.printZlotyWallet());
                            }
                        }
                        if(modCurrency.equals("^")){
                            Franc franc01 = new Franc(dol.getFrancs());
                            Dollar dollar01 = new Dollar(franc01);
                            dol.addDollars(dollar01.getDollars());
                            dol.removeFrancs(dol.getFrancs());
                        }
                        if(modCurrency.equals("=")){
                            Zloty zloty01 = new Zloty(dol.getZlotys());
                            Dollar dollar02 = new Dollar(zloty01);
                            dol.addDollars(dollar02.getDollars());
                            dol.removeZlotys(dol.getZlotys());
                        }
                        if(modCurrency.equals("(")){
                            Dollar dollar03 = new Dollar(dol.getDollars());
                            Franc franc02 = new Franc(dollar03);
                            dol.addFrancs(franc02.getFrancs());
                            dol.removeDollars(dol.getDollars());
                        }
                        if(modCurrency.equals(")")){
                            Zloty zloty02 = new Zloty(dol.getZlotys());
                            Franc franc03 = new Franc(zloty02);
                            dol.addFrancs(franc03.getFrancs());
                            dol.removeZlotys(dol.getZlotys());
                        }
                        if(modCurrency.equals("{")){
                            Dollar dollar04 = new Dollar(dol.getDollars());
                            Zloty zloty03 = new Zloty(dollar04);
                            dol.addZlotys(zloty03.getZlotys());
                            dol.removeDollars(dol.getDollars());
                        }
                        if(modCurrency.equals("}")){
                            Franc franc04 = new Franc(dol.getFrancs());
                            Zloty zloty04 = new Zloty(franc04);
                            dol.addZlotys(zloty04.getZlotys());
                            dol.removeFrancs(dol.getFrancs());
                        }
                    }
                }
                if(walletScanner.equals("2")){
                    System.out.println("Enter your dollar value: ");
                    Scanner firstValue = new Scanner(System.in);
                    double dollarValue = firstValue.nextDouble();
                    System.out.println("Enter your franc value: ");
                    Scanner secondValue = new Scanner(System.in);
                    double francValue = secondValue.nextDouble();
                    System.out.println("Enter your zloty value: ");
                    Scanner thirdValue = new Scanner(System.in);
                    double zlotyValue = thirdValue.nextDouble();
                    FrancWallet frank = new FrancWallet(francValue, dollarValue, zlotyValue);
                    System.out.println(frank.printFrancWallet());
                    System.out.println("The value of all the money currently present in the wallet is roughly equal in value to: " + frank.convertToDollars(dollarValue, francValue, zlotyValue) + " dollars or " + frank.convertToFrancs(dollarValue, francValue, zlotyValue) + " francs, or " + frank.convertToZlotys(dollarValue, francValue, zlotyValue) + " zlotys. ");
                    System.out.println("You're about to modify your instantiated wallet. To see the content of your wallet, press '@'. To exit the subprogram, press '!'.");
                    System.out.println("To add dollars to your wallet, press '$'. To add francs to your wallet, press '&'. To add zlotys to your wallet, please enter '#'. To remove dollars, francs or zlotys, enter '$$', '&&' or '##' respectively. To instantiate a new wallet on the basis of the one already created, enter '-'. ");
                    System.out.println("To convert your francs or zlotys into dollars and to add them to your dollar tally, enter '^' or '=' respectively. To convert dollars or zlotys into francs, press '(' or ')' respectively. To convert dollars or francs into zlotys, press '{' or '}' respectively. ");
                    boolean exitMod = false;
                    Scanner modifyingCurrency = new Scanner(System.in);
                    while(!exitMod){
                        String modCurrency = modifyingCurrency.nextLine();
                        if(modCurrency.equals("!")){
                            exitMod = true;
                        }
                        if(modCurrency.equals("@")){
                            System.out.println(frank.printFrancWallet());
                        }
                        if(modCurrency.equals("$")){
                            System.out.println("Enter a number of dollars you wish to add to your wallet: ");
                            Scanner newDollars = new Scanner(System.in);
                            double newDollarAdd = newDollars.nextDouble();
                            frank.addDollars(newDollarAdd);
                        }
                        if(modCurrency.equals("&")){
                            System.out.println("Now enter a number of francs you wish to add to your wallet: ");
                            Scanner addFrancs = new Scanner(System.in);
                            double addedFrancs = addFrancs.nextDouble();
                            frank.addFrancs(addedFrancs);
                        }
                        if(modCurrency.equals("#")){
                            System.out.println("Now enter a number of zlotys you wish to add to your wallet: ");
                            Scanner addZlotys = new Scanner(System.in);
                            double addedZlotys = addZlotys.nextDouble();
                            frank.addZlotys(addedZlotys);
                        }
                        if(modCurrency.equals("$$")){
                            System.out.println("Enter a number of dollars you wish to remove to your wallet: ");
                            Scanner remDollars = new Scanner(System.in);
                            double removedDollars = remDollars.nextDouble();
                            frank.removeDollars(removedDollars);
                        }
                        if(modCurrency.equals("&&")){
                            System.out.println("Now enter a number of francs you wish to remove from your wallet: ");
                            Scanner remFrancs = new Scanner(System.in);
                            double removedFrancs = remFrancs.nextDouble();
                            frank.removeFrancs(removedFrancs);
                        }
                        if(modCurrency.equals("##")){
                            System.out.println("Now enter a number of zlotys you wish to remove from your wallet: ");
                            Scanner remZlotys = new Scanner(System.in);
                            double removedZlotys = remZlotys.nextDouble();
                            frank.removeZlotys(removedZlotys);
                        }
                        if(modCurrency.equals("-")){
                            System.out.println("Choose the type of wallet you want to create on the basis of the already established one. Press '%' to create a new dollar wallet or '+' to create a new zloty wallet. ");
                            Scanner typeWallet = new Scanner(System.in);
                            String chooseType = typeWallet.nextLine();
                            if(chooseType.equals("%")){
                                DollarWallet dols = new DollarWallet(frank);
                                dols.addDollars(frank.getDollars());
                                dols.addFrancs(frank.getFrancs());
                                dols.addZlotys(frank.getZlotys());
                                System.out.println(dols.printDollarWallet());
                            }
                            if(chooseType.equals("+")){
                                ZlotyWallet zlot = new ZlotyWallet(frank);
                                zlot.addDollars(frank.getDollars());
                                zlot.addFrancs(frank.getFrancs());
                                zlot.addZlotys(frank.getZlotys());
                                System.out.println(zlot.printZlotyWallet());
                            }
                        }
                        if(modCurrency.equals("^")){
                            Franc franc01 = new Franc(frank.getFrancs());
                            Dollar dollar01 = new Dollar(franc01);
                            frank.addDollars(dollar01.getDollars());
                            frank.removeFrancs(frank.getFrancs());
                        }
                        if(modCurrency.equals("=")){
                            Zloty zloty01 = new Zloty(frank.getZlotys());
                            Dollar dollar02 = new Dollar(zloty01);
                            frank.addDollars(dollar02.getDollars());
                            frank.removeZlotys(frank.getZlotys());
                        }
                        if(modCurrency.equals("(")){
                            Dollar dollar03 = new Dollar(frank.getDollars());
                            Franc franc02 = new Franc(dollar03);
                            frank.addFrancs(franc02.getFrancs());
                            frank.removeDollars(frank.getDollars());
                        }
                        if(modCurrency.equals(")")){
                            Zloty zloty02 = new Zloty(frank.getZlotys());
                            Franc franc03 = new Franc(zloty02);
                            frank.addFrancs(franc03.getFrancs());
                            frank.removeZlotys(frank.getZlotys());
                        }
                        if(modCurrency.equals("{")){
                            Dollar dollar04 = new Dollar(frank.getDollars());
                            Zloty zloty03 = new Zloty(dollar04);
                            frank.addZlotys(zloty03.getZlotys());
                            frank.removeDollars(frank.getDollars());
                        }
                        if(modCurrency.equals("}")){
                            Franc franc04 = new Franc(frank.getFrancs());
                            Zloty zloty04 = new Zloty(franc04);
                            frank.addZlotys(zloty04.getZlotys());
                            frank.removeFrancs(frank.getFrancs());
                        }
                    }
                }
                if(walletScanner.equals("3")){
                    System.out.println("Enter your dollar value: ");
                    Scanner firstValue = new Scanner(System.in);
                    double dollarValue = firstValue.nextDouble();
                    System.out.println("Enter your franc value: ");
                    Scanner secondValue = new Scanner(System.in);
                    double francValue = secondValue.nextDouble();
                    System.out.println("Enter your zloty value: ");
                    Scanner thirdValue = new Scanner(System.in);
                    double zlotyValue = thirdValue.nextDouble();
                    ZlotyWallet zlots = new ZlotyWallet(zlotyValue, dollarValue, francValue);
                    System.out.println(zlots.printZlotyWallet());
                    System.out.println("The value of all the money currently present in the wallet is roughly equal in value to: " + zlots.convertToDollars(dollarValue, francValue, zlotyValue) + " dollars or " + zlots.convertToFrancs(dollarValue, francValue, zlotyValue) + " francs, or " + zlots.convertToZlotys(dollarValue, francValue, zlotyValue) + " zlotys. ");
                    System.out.println("You're about to modify your instantiated wallet. To see the content of your wallet, press '@'. To exit the subprogram, press '!'.");
                    System.out.println("To add dollars to your wallet, press '$'. To add francs to your wallet, press '&'. To add zlotys to your wallet, please enter '#'. To remove dollars, francs or zlotys, enter '$$', '&&' or '##' respectively. To instantiate a new wallet on the basis of the one already created, enter '-'. ");
                    System.out.println("To convert your francs or zlotys into dollars and to add them to your dollar tally, enter '^' or '=' respectively. To convert dollars or zlotys into francs, press '(' or ')' respectively. To convert dollars or francs into zlotys, press '{' or '}' respectively. ");
                    boolean exitMod = false;
                    Scanner modifyingCurrency = new Scanner(System.in);
                    while(!exitMod){
                        String modCurrency = modifyingCurrency.nextLine();
                        if(modCurrency.equals("!")){
                            exitMod = true;
                        }
                        if(modCurrency.equals("@")){
                            System.out.println(zlots.printZlotyWallet());
                        }
                        if(modCurrency.equals("$")) {
                            System.out.println("Enter a number of dollars you wish to add to your wallet: ");
                            Scanner newDollars = new Scanner(System.in);
                            double newDollarAdd = newDollars.nextDouble();
                            zlots.addDollars(newDollarAdd);
                        }
                        if(modCurrency.equals("&")) {
                            System.out.println("Now enter a number of francs you wish to add to your wallet: ");
                            Scanner addFrancs = new Scanner(System.in);
                            double addedFrancs = addFrancs.nextDouble();
                            zlots.addFrancs(addedFrancs);
                        }
                        if(modCurrency.equals("#")) {
                            System.out.println("Now enter a number of zlotys you wish to add to your wallet: ");
                            Scanner addZlotys = new Scanner(System.in);
                            double addedZlotys = addZlotys.nextDouble();
                            zlots.addZlotys(addedZlotys);
                        }
                        if(modCurrency.equals("$$")){
                            System.out.println("Enter a number of dollars you wish to remove to your wallet: ");
                            Scanner remDollars = new Scanner(System.in);
                            double removedDollars = remDollars.nextDouble();
                            zlots.removeDollars(removedDollars);
                        }
                        if(modCurrency.equals("&&")){
                            System.out.println("Now enter a number of francs you wish to remove from your wallet: ");
                            Scanner remFrancs = new Scanner(System.in);
                            double removedFrancs = remFrancs.nextDouble();
                            zlots.removeFrancs(removedFrancs);
                        }
                        if(modCurrency.equals("##")){
                            System.out.println("Now enter a number of zlotys you wish to remove from your wallet: ");
                            Scanner remZlotys = new Scanner(System.in);
                            double removedZlotys = remZlotys.nextDouble();
                            zlots.removeZlotys(removedZlotys);
                        }
                        if(modCurrency.equals("-")){
                            System.out.println("Choose the type of wallet you want to create on the basis of the already established one. Press '%' to create a new franc wallet or '+' to create a new dollar wallet. ");
                            Scanner typeWallet = new Scanner(System.in);
                            String chooseType = typeWallet.nextLine();
                            if(chooseType.equals("%")){
                                FrancWallet fran = new FrancWallet(zlots);
                                fran.addDollars(zlots.getDollars());
                                fran.addFrancs(zlots.getFrancs());
                                fran.addZlotys(zlots.getZlotys());
                                System.out.println(fran.printFrancWallet());
                            }
                            if(chooseType.equals("+")){
                                DollarWallet dolls = new DollarWallet(zlots);
                                dolls.addDollars(zlots.getDollars());
                                dolls.addFrancs(zlots.getFrancs());
                                dolls.addZlotys(zlots.getZlotys());
                                System.out.println(dolls.printDollarWallet());
                            }
                        }
                        if(modCurrency.equals("^")){
                            Franc franc01 = new Franc(zlots.getFrancs());
                            Dollar dollar01 = new Dollar(franc01);
                            zlots.addDollars(dollar01.getDollars());
                            zlots.removeFrancs(zlots.getFrancs());
                        }
                        if(modCurrency.equals("=")){
                            Zloty zloty01 = new Zloty(zlots.getZlotys());
                            Dollar dollar02 = new Dollar(zloty01);
                            zlots.addDollars(dollar02.getDollars());
                            zlots.removeZlotys(zlots.getZlotys());
                        }
                        if(modCurrency.equals("(")){
                            Dollar dollar03 = new Dollar(zlots.getDollars());
                            Franc franc02 = new Franc(dollar03);
                            zlots.addFrancs(franc02.getFrancs());
                            zlots.removeDollars(zlots.getDollars());
                        }
                        if(modCurrency.equals(")")){
                            Zloty zloty02 = new Zloty(zlots.getZlotys());
                            Franc franc03 = new Franc(zloty02);
                            zlots.addFrancs(franc03.getFrancs());
                            zlots.removeZlotys(zlots.getZlotys());
                        }
                        if(modCurrency.equals("{")){
                            Dollar dollar04 = new Dollar(zlots.getDollars());
                            Zloty zloty03 = new Zloty(dollar04);
                            zlots.addZlotys(zloty03.getZlotys());
                            zlots.removeDollars(zlots.getDollars());
                        }
                        if(modCurrency.equals("}")){
                            Franc franc04 = new Franc(zlots.getFrancs());
                            Zloty zloty04 = new Zloty(franc04);
                            zlots.addZlotys(zloty04.getZlotys());
                            zlots.removeFrancs(zlots.getFrancs());
                        }
                    }
                }
            }
        }
    }
}
