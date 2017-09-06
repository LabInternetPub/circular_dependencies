package cat.tecnocampus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by josep on 5/9/17.
 */
@Component
public class ClassB_NeedsA {
    private ClassA_NeedsB classA_needsB;
    
    public void setClassA_NeedsB(ClassA_NeedsB classA_needsB) {
        this.classA_needsB = classA_needsB;
    }

    public void action() {
        System.out.println("I'm class A using class B");
    }

}
