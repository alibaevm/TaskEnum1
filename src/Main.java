import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                        Томондогу сиз каалаган шаарды танданыз жана алар жонундо бир суйломду камтыган маалыматтарды алыныз:
                                        (Сураныч цифрасын же атын жазыныз) : 
                    1.Чуй
                    2.Ош
                    3.Баткен
                    4.Жалал-Абад
                    5.Талас
                    6.Нарын
                    7.Ысыккол
                    """);

            Region.chooseCity();

        }
    }
}