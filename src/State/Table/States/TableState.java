package State.Table.States;

import State.Table.Table;

public interface TableState {
    void next(Table table);
    void printStatus();
}


