package ru.taksebe.telegram.mentalCalculation.telegram.commands.operations;

import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;

/**
 * Команда "tiktok"
 */
public class TikTokCommand extends AbstractOperationCommand {

    public TikTokCommand(String identifier, String description) {
        super(identifier, description);
    }

    @Override
    public void executeInner(AbsSender absSender, User user, Chat chat, String[] strings) {
        sendText(absSender, chat.getId(), "tiki-toki",
                getCommandName(), getUserName(user));
    }
}
