package ru.taksebe.telegram.mentalCalculation.telegram.nonCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.taksebe.telegram.mentalCalculation.exceptions.IllegalSettingsException;
import ru.taksebe.telegram.mentalCalculation.telegram.Bot;
/**
 * Обработка сообщения, не являющегося командой (т.е. обычного текста не начинающегося с "/")
 */
public class NonCommand {
    private Logger logger = LoggerFactory.getLogger(NonCommand.class);

    public String nonCommandExecute(Long chatId, String userName, String text) {
        logger.debug(String.format("Пользователь %s. Начата обработка сообщения \"%s\", не являющегося командой",
                userName, text));

        String answer;
        answer = "Не понимать...";

        logger.debug(String.format("Пользователь %s. Завершена обработка сообщения \"%s\", не являющегося командой",
                userName, text));
        return answer;
    }



}