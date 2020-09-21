package starter.steps;

import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;
import starter.Calculator;

public class MathWizSteps {

    Calculator calc;

    @Step("#actor starts with {0}")
    public void startsWith(int amount) {
        calc = new Calculator(amount);
    }

    @Step("#actor adds {0}")
    public void adds(int amount) {
        calc.add(amount);
    }

    @Step("#actor substracts {0}")
    public void subs(int amount) {
        calc.sub(amount);
    }

    @Step("#actor should have {0}")
    public void shouldHave(int expectedTotal) {
        assertThat(calc.getTotal()).isEqualTo(expectedTotal);
    }
}
