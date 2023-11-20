import java.util.Scanner;

public enum Region {
    CHUY
            {@Override
    public String getRegion(){
        return "\n"+"Чуй - Ондуруштун аймагы"+"\n";
    }},

    ISIKKOL{
    @Override
    public String getRegion(){
        return "\n"+" Ысыккол - Кыргызстандын бермети"+"\n";
    }},

        NARYN
                {@Override
    public String getRegion(){
        return "\n"+"Нарын - Кыргызстандын эн суук аймагы"+"\n";
    }},

    JALALABAD
            {@Override
    public String getRegion(){
        return "\n"+"Жалалабад- Жангактын мекени"+"\n";
    }},

        OSH{
    @Override
    public String getRegion(){
       return  "\n"+"Ош- Кылымдарды каарыткан эски шаар"+"\n";
    }},

        BATKEN{
    @Override
public String getRegion(){
       return "\n"+"Баткен- Кыргызстандын журогу"+"\n";
        }},

        TALAS{
@Override
public String getRegion(){
       return "\n"+"Талас- Манас атабыздын кичи мекени"+"\n";
        }};


public abstract String getRegion();
public static void chooseCity() {
    Scanner scanner = new Scanner(System.in);
    String city = scanner.nextLine();

       switch (city) {
            case "Чуй", "1" -> {
                System.out.println(Region.CHUY.getRegion());
            }
            case "Ош", "2" -> {
                System.out.println(Region.OSH.getRegion());
            }
            case "Баткен", "3" -> {
                System.out.println(Region.BATKEN.getRegion());
            }
            case "Жалал-Абад", "4" -> {
                System.out.println(Region.JALALABAD.getRegion());
            }
            case "Талас", "5" -> {
                System.out.println(Region.TALAS.getRegion());
            }
            case "Нарын", "6" -> {
                System.out.println(Region.NARYN.getRegion());
            }
            case "Ысыккол", "7" -> {
                System.out.println(Region.ISIKKOL.getRegion());
            }
        }
    }


}

