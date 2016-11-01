package org.powermock.example;

import org.eclipse.core.runtime.IAdaptable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({SomeClass.class, IAdaptable.class})
public class SignedClassTest {

    @Test
    public void test() {
        IAdaptable adaptable = mock(IAdaptable.class);

        mockStatic(SomeClass.class);

        when(SomeClass.getAdaptable()).thenReturn(adaptable);

        assertThat(SomeClass.getAdaptable()).isNotNull();
    }
}
