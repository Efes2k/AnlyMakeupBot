package ru.taksebe.telegram.mentalCalculation.telegram.commands.operations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;
import ru.taksebe.telegram.mentalCalculation.Utils;

public abstract class AbstractOperationCommand extends OperationCommand {
    private Logger logger = LoggerFactory.getLogger(AbstractOperationCommand.class);

    AbstractOperationCommand(String identifier, String description) {
        super(identifier, description);
    }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] strings) {
        final String userName = getUserName(user);
        logger.debug(String.format("[%s]Пользователь %s. Начато выполнение команды %s", getCommandName(), userName,
                this.getCommandIdentifier()));
        executeInner(absSender, user, chat, strings);
        logger.debug(String.format("[%s]Пользователь %s. Завершено выполнение команды %s", getCommandName(), userName,
                this.getCommandIdentifier()));
    }

    public abstract void executeInner(AbsSender absSender, User user, Chat chat, String[] strings);

    public String getCommandName(){
        return getClass().getName();
    };

    protected String getUserName(final User user){
        return Utils.getUserName(user);
    }
}
