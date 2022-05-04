public class Main {
    public static void main (String[] args){
        String myString = "Thus is my string  ";
        System.out.println(myString + " and another");
        myString += " and more in anther way";
        System.out.println(myString);

        //what do numbers do
        String numberString = "100.09";
        numberString += "88.1";
        System.out.println(numberString);

        //how about if it was an int in the first place
        myString = "10";
        int aNUmber = 10;
        myString += aNUmber;
        System.out.println(myString);
        //Note that this wasnt a change in the myString because they are Immutable, it's a new thing
        //This app;roach is inneficient and something that can be changed is a StringBuffer

    }

}
