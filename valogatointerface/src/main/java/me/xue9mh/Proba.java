package me.xue9mh;

import java.util.Random;

public class Proba
{

    private static int getInstanceNumberFromArguments(String[] args) throws ValidationException {
        if (args.length != 1) {
            throw new ValidationException("1 parameter kell", null);
        }
            int instanceNumber = 0;

        try {
            instanceNumber = Integer.parseInt(args[0]);
        } catch (NumberFormatException numberFormatException) {
            throw new ValidationException("1 parameter kell, ami egy egesz szam!", numberFormatException);
        }

        if (instanceNumber < 1) {
            throw new ValidationException("1 parameter kell, ami egy pozitiv egesz szam!", null);
        }
        return instanceNumber;
    }

    private static void printJoalany(Valogato[] valogatoArray){
        for (Valogato valogato : valogatoArray) {
            if(valogato.joAlanyE()){
                System.out.println("jo alany: " + valogato);
            }
        }
    }

    private static void tombFeltoltes(Valogato[] valogatoArray){
        Random random = new Random();
        for (int i = 0; i < valogatoArray.length; i++){
            valogatoArray[i] = random.nextBoolean() ?
                    new Diak("diak"+i, 22, random.nextInt() % 3) :
                    new Tanar("tanar" + i, 50, random.nextDouble() * 5);
        }
    }

    public static void main( String[] args )
    {
        try {
            int instanceNumberFromArguments = getInstanceNumberFromArguments(args);
            Valogato[] valogatoArray = new Valogato[instanceNumberFromArguments];
            tombFeltoltes(valogatoArray);
            printJoalany(valogatoArray);
        } catch (ValidationException e) {
            e.printStackTrace();
        }

    }
}
