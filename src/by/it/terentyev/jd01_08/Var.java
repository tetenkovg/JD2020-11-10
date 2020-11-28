package by.it.terentyev.jd01_08;

import jdk.dynalink.Operation;

public abstract class Var implements Operation {

    @Override
    public String toString() {
        return "some abstract Var{}";
    }
}
