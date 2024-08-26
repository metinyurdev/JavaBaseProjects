//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger(), new ConsoleLogger()};
        for(BaseLogger logger:loggers)
        {
            logger.Log("Log mesajı");
        }

        EmailLogger logger = new EmailLogger();
        logger.Log("Log mesajı");
        */

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}