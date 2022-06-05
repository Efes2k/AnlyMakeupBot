package ru.taksebe.telegram.mentalCalculation;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.taksebe.telegram.mentalCalculation.telegram.Bot;

import java.util.Map;

public class MentalCalculationApplication {
    private static final Map<String, String> getenv = System.getenv();

    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new Bot("AnlyMakeupBot", "5597039987:AAFF8OY1E5qAI_OCcgW6Y6h2C_KuVofK2fk"));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}