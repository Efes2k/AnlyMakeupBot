package ru.taksebe.telegram.mentalCalculation.tasks;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import ru.taksebe.telegram.mentalCalculation.enums.OperationEnum;
import ru.taksebe.telegram.mentalCalculation.fileProcessor.WordFileProcessorImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class DocumentService {

    WordFileProcessorImpl fileProcessor;

    /**
     * Формирование файла с заданиями
     * @param operations список типов операций
     */
    public FileInputStream getFile(List<OperationEnum> operations)
            throws IOException {
     //todo
        return fileProcessor.createWordFile(Collections.emptyList());
    }
}
