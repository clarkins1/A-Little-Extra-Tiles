package com.alet.common.structure.type.programable;

import java.util.List;

import com.alet.common.structure.type.programable.advanced.Function;
import com.alet.common.structure.type.programable.advanced.activators.FunctionActivator;
import com.alet.common.structure.type.programable.advanced.nodes.values.NodeValue;

import net.minecraft.world.WorldServer;

public class FunctionExecutor {
    
    public static void startScript(LittleProgramableStructureALET executer, FunctionActivator activator, int index) {}
    
    public static void resumeScript(LittleProgramableStructureALET executer, Function startingBlueprint) {}
    
    private static Function findParent(Function function, Class<? extends Function> clazz) {
        return function;
    }
    
    public static void nextMethod(LittleProgramableStructureALET executer, Function blueprint, WorldServer server, int index) {}
    
    private static void buildValues(List<NodeValue> nodes, WorldServer server) {}
}
