package com.damon.skill;

/**
 * @author damon
 */
public class MultipleThreeReturn<A,B,C> extends MultipleTwoReturn<A,B>{
    private C c;

    public MultipleThreeReturn(A a,B b,C c) {
        super(a,b);
        this.c = c;
    }


    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}
