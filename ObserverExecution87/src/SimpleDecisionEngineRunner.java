/*
 * Licensed Materials - Property of IBM 
 * 5724-X98 
 * (c) Copyright IBM Corp. 1987, 2010. All Rights Reserved. 
 * 
 * Note to U.S. Government Users Restricted Rights: 
 * Use, duplication or disclosure restricted by GSA ADP Schedule 
 * Contract with IBM Corp. 
 */

import java.io.File;
import java.util.Map;

import com.ibm.rules.engine.load.EngineLoader;
import com.ibm.rules.engine.runtime.Engine;
import com.ibm.rules.engine.runtime.EngineDefinition;
import com.ibm.rules.engine.runtime.EngineOutput;
import com.ibm.rules.engine.runtime.EngineInput;

import com.ibm.support.logging.*;
import com.ibm.support.PMR.*;

public class SimpleDecisionEngineRunner {

    public static void main(String[] args) {
        try {
            File file = new File("ruleArchive1.dsar");
            long t0 = System.currentTimeMillis();
            EngineLoader loader = new EngineLoader(file);
            EngineDefinition definition = loader.load();
            Engine engine = definition.createEngine();
            engine.addObserver(new ruledef.MyObserver());
            long t1 = System.currentTimeMillis();

            // TODO check input parameters
            // Feed the engine with input parameters
            EngineInput input = engine.createInput();
            input.setParameter("myMainportfolio", new com.ibm.support.PMR.Portfolio());
            input.setParameter("mySecondaryportfolio", new com.ibm.support.PMR.Portfolio());
            input.setParameter("counter", 25);
            input.setParameter("myExtractorParam",new java.util.Date());
            long t2 = System.currentTimeMillis();
            EngineOutput output = engine.execute(input);
            long t3 = System.currentTimeMillis();

            // Display output parameters
            System.out.println("Output parameters:");
            Map<String, Object> outParameters = output.getData().getOut();
            for (Map.Entry<String, Object> p : outParameters.entrySet()) {
                System.out.println("Name: " + p.getKey() + ", Value: " + p.getValue());
            }
            System.out.println("\nLoading time : " + (t1-t0) + " ms");
            System.out.println("Execution time : " + (t3-t2) + " ms");

        } catch (Exception exception) {
            exception.printStackTrace(System.err);
        }
    }
}
