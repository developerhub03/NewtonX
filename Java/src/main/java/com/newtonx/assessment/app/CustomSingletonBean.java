package com.newtonx.assessment.app;

import org.springframework.stereotype.Component;

/**
 * This singleton Spring bean just exists to
 * test that injections work normally in
 * JAX-RS provider beans
 *
 */
@Component
public class CustomSingletonBean {

    public boolean amIAlive() {
        return true;
    }

}
