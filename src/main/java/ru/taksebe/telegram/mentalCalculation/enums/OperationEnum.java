package ru.taksebe.telegram.mentalCalculation.enums;

import java.util.Arrays;
import java.util.List;

/**
 * Операции, использующиеся в заданиях
 */
public enum OperationEnum {

    GUIDE;//гайд

    public static List<OperationEnum> getAllOperations() {
        return Arrays.asList(values());
    }
}