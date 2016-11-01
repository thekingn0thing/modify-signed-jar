package org.powermock.example;

import org.eclipse.core.runtime.IAdaptable;

public class SomeClass {

    public static IAdaptable getAdaptable(){
        return new AdaptableImpl();
    }

}
