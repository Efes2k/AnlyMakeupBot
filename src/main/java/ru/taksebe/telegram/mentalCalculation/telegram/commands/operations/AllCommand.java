package ru.taksebe.telegram.mentalCalculation.telegram.commands.operations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;
import ru.taksebe.telegram.mentalCalculation.Utils;
import ru.taksebe.telegram.mentalCalculation.enums.OperationEnum;

public class AllCommand extends AbstractOperationCommand {
    private Logger logger = LoggerFactory.getLogger(AllCommand.class);

    public AllCommand(String identifier, String description) {
        super(identifier, description);
    }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] strings) {
        String userName = Utils.getUserName(user);

    }

    @Override
    public void executeInner(AbsSender absSender, User user, Chat chat, String[] strings) {
        sendDocument(absSender, chat.getId(), OperationEnum.getAllOperations(), this.getDescription(),
                this.getCommandIdentifier(), getUserName(user));
    }
}
