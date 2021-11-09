package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.InfoPage;

public class Info implements Task {
    private String personalInformation;

    public Info(String personalInformation) {
        this.personalInformation = personalInformation;
    }

    public static Info the(String personalInformation) {
        return Tasks.instrumented(Info.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("ingresaTuNombre").into(InfoPage.FirstName),
                Enter.theValue("ingresaTuApellido").into(InfoPage.LastName),
                Enter.theValue("ingresaTuEmail").into(InfoPage.Email),
                Enter.theValue("ingresaTuMesNaciemiento").into(InfoPage.Month),
                Enter.theValue("ingresaTuDiaNaciemiento").into(InfoPage.Day),
                Enter.theValue("ingresaTuAnoNaciemiento").into(InfoPage.Year),
                Click.on(InfoPage.NextButton),
                Click.on(InfoPage.NextButton2),
                Enter.theValue("ingreseTipoDispositivo").into(InfoPage.MobileDevice),
                Enter.theValue("ingreseModeloDispositivo").into(InfoPage.ModelDevice),
                Enter.theValue("ingreseSistemaOperativo").into(InfoPage.operatingSystem),
                Click.on(InfoPage.NextButton3),
                Enter.theValue("ingreseContrasena").into(InfoPage.InputPassword),
                Enter.theValue("confirmeContrasena").into(InfoPage.ConfirmPassword),
                Enter.theValue("checkEstarInformado").into(InfoPage.CheckStayInformed),
                Enter.theValue("checkTerminosCondiciones").into(InfoPage.CheckAcceptConditions),
                Enter.theValue("checkPoliticasPrivacidad").into(InfoPage.CheckPrivacyPolicies),
                Click.on(InfoPage.completeButton));
    }
}