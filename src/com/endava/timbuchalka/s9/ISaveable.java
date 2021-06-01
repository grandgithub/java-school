package com.endava.timbuchalka.s9;

import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> values);
}
