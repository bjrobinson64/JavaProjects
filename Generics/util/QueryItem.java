package dev.lpa.util;

public interface QueryItem {
    boolean matchFieldValue(String fieldName, String value);
}
