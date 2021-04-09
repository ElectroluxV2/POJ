package com.github.electroluxv2.findings.l5;

public class OverrideAnnotation {
    public static void main(final String[] args) {
        new ConcreteClass().doSmth();
        new ConcreteClass2().doSmth();
    }
}

abstract class BaseClass {
    public abstract void doSmthImpl();
    public final void doSmth(){
        System.out.println("Will doo something >>>");
        // doSmthImpl();
        System.out.println("Finished! <<<");
    }
}
class ConcreteClass extends BaseClass{
    // remove doSmthImpl() from BaseClass with and without @Override and check results
    // dou will think doSmthImpl() will do the job but it is not the case
    //@Override
    public void doSmthImpl() {
        System.out.println("...doing...");
    }
}

class ConcreteClass2 extends BaseClass{
    // remove doSmthImpl() from BaseClass with and without @Override and check results
    // dou will think doSmthImpl() will do the job but it is not the case
    @Override
    public void doSmthImpl() {
        System.out.println("...doing...");
    }
}