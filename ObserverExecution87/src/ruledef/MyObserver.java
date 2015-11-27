package ruledef;

import com.ibm.rules.engine.observer.Observable;
import com.ibm.rules.engine.ruledef.runtime.RuleEngine;
import com.ibm.rules.engine.ruledef.runtime.RuleEngineObserver;
import com.ibm.rules.engine.ruledef.runtime.RuleInstance;
import com.ibm.rules.engine.runtime.Engine;
import com.ibm.rules.engine.runtime.EngineInput;
import com.ibm.rules.engine.runtime.EngineObserver;

public class MyObserver implements EngineObserver, RuleEngineObserver {

public void executionStarted(Observable source, EngineInput input) {
System.out.println("Execution started");
}
public void executionEnded(Observable source, EngineInput input) {
System.out.println("Execution ended");
}
public void engineReset(Observable source) {
System.out.println("Engine reset");
}
public void engineStopped(Observable source, String message) {
System.out.println("Engine stopped");
}
public void ruleExecutionStarted(Observable source,
RuleInstance instance) {
System.out.println("Rule " + instance.getRuleName() + " execution started");
for (Object o : instance.getTuple()){
	System.out.println("\t\tInput:"+o);
}
}
public void ruleExecutionEnded(Observable source, 
RuleInstance instance) {
System.out.println("Rule " + instance.getRuleName() + " execution ended");
}
public void exceptionRaisedInCondition(Observable source,
Exception exception,
boolean internallyCatched) {
System.out.println("Exception raised in condition :" + exception.getMessage());
}
public void exceptionRaisedInAction(Observable source,
Exception exception,
RuleInstance ruleInstance,
boolean internallyCatched) {
System.out.println("Exception raised in action of rule " + ruleInstance.getRuleName() + ": " + exception.getMessage());
    }
}