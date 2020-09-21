package starter.math;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import starter.steps.MathWizSteps;

@RunWith(SerenityRunner.class)
@Narrative(text={"Maths is important."})
public class WhenAddingNumbers {

    @Steps
    MathWizSteps michael;

    @Test
    @WithTag(type="type", name="Add")
    public void addingSums() {
        // Given
        michael.startsWith(1);

        // When
        michael.adds(2);

        // Then
        michael.shouldHave(3);
    }

    @Test
    @WithTag(type="type", name="Sub")
    public void substractSums(){
        // Given
        michael.startsWith(5);

        // When
        michael.subs(2);

        // Then
        michael.shouldHave(3);
    }
}
