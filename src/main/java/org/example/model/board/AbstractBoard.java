package org.example.model.board;

import org.example.model.Field;

import java.util.ArrayList;

public abstract class AbstractBoard {

    protected ArrayList<Field> fields;
    public abstract void move(Field oldField, Field newField) throws illegalMoveException;

}
