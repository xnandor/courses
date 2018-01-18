package com.ebsco.ebischoff.containerpractice.use;

import com.ebsco.ebischoff.containerpractice.models.Chicken;
import com.ebsco.ebischoff.containerpractice.models.Cow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.PrintStream;


// The Component Annotation is needed here. Otherwise @Autowire would not work.
@Component
public class Farmer {

    // Autowire only works on Components
    @Autowired
    private Chicken chicken;

    @Autowired
    private Cow cow;

    public void farm(PrintStream out) {
        out.println("------------------------------FARM WORK:");
        out.println("THE FARMER DOES HIS WORK. HE GETS:");
        out.println(chicken.getEgg());
        out.println(cow.getMilk());
        out.println("");
        out.flush();
    }
}
