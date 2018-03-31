import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class DORgodBot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
        //System.out.println(update.getMessage().getFrom().getFirstName()+":");
        //System.out.println(update.getMessage().getText());

        String command = update.getMessage().getText();
        SendMessage message = new SendMessage();

        if(command.equals("relation")) {
            System.out.println("Der Mensch will eine Beziehung berechnen");
            message.setText("Je ne sais pas cette commande");
        } else if(command.equals("Jani Jani Jani")) {
            message.setText("Ich werde diese Aufgabe an Jani weitergeben");
        } else {
            System.out.println("Klinger");
            message.setText("Je ne sais pas cette commande");
        }

        message.setChatId(update.getMessage().getChatId());

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public String getBotUsername() {
        return "DORgodBot";
    }

    public String getBotToken() {
        return "595251714:AAG_SPIlxwB3_temKRk9QFEYRzUzxP-NTzA";
    }
}
