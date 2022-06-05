package ru.taksebe.telegram.mentalCalculation.telegram.commands.operations;

import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;
import ru.taksebe.telegram.mentalCalculation.enums.OperationEnum;

/**
 * Команда "guide"
 */
import java.util.Collections;

public class GuideCommand extends AbstractOperationCommand {


    public GuideCommand(String identifier, String description) {
        super(identifier, description);
    }

    @Override
    public void executeInner(AbsSender absSender, User user, Chat chat, String[] strings) {
        sendDocument(absSender, chat.getId(), Collections.singletonList(OperationEnum.GUIDE),
                this.getDescription(), this.getCommandIdentifier(), getUserName(user));
    }

}
