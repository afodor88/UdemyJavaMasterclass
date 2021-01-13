import java.sql.Time;

public class App {
    public static void main(String[] args) throws Exception {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24567);
        timsPhone.powerOn();
        timsPhone.callPhone(24567);
        timsPhone.answer();
    }
}
