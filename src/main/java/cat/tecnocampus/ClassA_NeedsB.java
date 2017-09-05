package cat.tecnocampus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by josep on 5/9/17.
 */
@Component
public class ClassA_NeedsB {
    ClassB_NeedsA classB_needsA;

    public void setClassB_NeedsA (ClassB_NeedsA classB_needsA) {
        this.classB_needsA = classB_needsA;
    }

    public void action() {
        System.out.println("I'm class B using class A");
    }

}
