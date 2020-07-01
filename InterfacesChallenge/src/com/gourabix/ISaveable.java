package com.gourabix;

import java.util.List;

public interface ISaveable {
    List<String> saveState();
    void readState(List<String> state);
}
