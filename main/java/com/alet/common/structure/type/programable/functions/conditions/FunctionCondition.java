package com.alet.common.structure.type.programable.functions.conditions;

import com.alet.common.structure.type.programable.functions.Function;

public abstract class FunctionCondition extends Function {
    
    public FunctionCondition(String name, int color, boolean sender, boolean reciever) {
        super(name, color, sender, reciever);
        // TODO Auto-generated constructor stub
    }
    
    public abstract boolean conditionRunEvent();
}
