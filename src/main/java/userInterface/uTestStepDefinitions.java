package userInterface;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Info;
import tasks.OpenPage;
import tasks.OpenUp;

public class uTestStepDefinitions {
    @Before
    public void setStage (){OnStage.setTheStage(new OnlineCast());}

    @Given("^Then lorena wants to enter the \"([^\"]*)\" section on the uTest page$")
    public void thenLorenaWantsToEnterTheSectionOnTheUTestPage() throws Throwable {
        OnStage.theActorCalled("lorena").wasAbleTo(OpenUp.thePage(),(OpenPage.onThePage()));
    }

    @When("^She completes the (.*) for new user$")
    public void sheCompletesTheFormForNewUser(String personalInformation) {
        OnStage.theActorCalled("lorena").attemptsTo(Info.the(personalInformation));
    }

    @Then("^she filled out the form correctly (.*)$")
    public void sheFilledOutTheFormCorrectly(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}