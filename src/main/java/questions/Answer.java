package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterface.InfoPage;

public class Answer implements Question<Boolean> {
    private String question;
    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean first, last, em, but, but2, month, day, year, mobileD, mobileM, os, but3, inputpass,
                confirmpass,checkS, checkA, checkP, complete;

        String FirstName = Text.of(InfoPage.FirstName).viewedBy(actor).asString();
        if (question.equals(FirstName)){
            first = true;
        }else {
            first = false;
        }
        String LastName = Text.of(InfoPage.LastName).viewedBy(actor).asString();
        if (question.equals(LastName)){
            last = true;
        }else {
            last = false;
        }
        String Email = Text.of(InfoPage.Email).viewedBy(actor).asString();
        if (question.equals(Email)){
            em = true;
        }else {
            em = false;
        }
        String Month = Text.of(InfoPage.Month).viewedBy(actor).asString();
        if (question.equals(Month)){
            month = true;
        }else {
            month = false;
        }
        String Day = Text.of(InfoPage.Day).viewedBy(actor).asString();
        if (question.equals(Day)){
            day = true;
        }else {
            day = false;
        }
        String Year = Text.of(InfoPage.Year).viewedBy(actor).asString();
        if (question.equals(Year)){
            year = true;
        }else {
            year = false;
        }
        String NextButton = Text.of(InfoPage.NextButton).viewedBy(actor).asString();
        if (question.equals(NextButton)){
            but = true;
        }else {
            but = false;
        }
        String NextButton2 = Text.of(InfoPage.NextButton2).viewedBy(actor).asString();
        if (question.equals(NextButton2)){
            but2 = true;
        }else {
            but2 = false;
        }
        String MobileDevice = Text.of(InfoPage.MobileDevice).viewedBy(actor).asString();
        if (question.equals(MobileDevice)){
            mobileD = true;
        }else {
            mobileD = false;
        }
        String ModelDevice = Text.of(InfoPage.ModelDevice).viewedBy(actor).asString();
        if (question.equals(ModelDevice)){
            mobileM = true;
        }else {
            mobileM = false;
        }
        String operatingSystem = Text.of(InfoPage.operatingSystem).viewedBy(actor).asString();
        if (question.equals(operatingSystem)){
            os = true;
        }else {
            os = false;
        }
        String NextButton3 = Text.of(InfoPage.NextButton3).viewedBy(actor).asString();
        if (question.equals(NextButton3)){
            but3 = true;
        }else {
            but3 = false;
        }
        String InputPassword = Text.of(InfoPage.InputPassword).viewedBy(actor).asString();
        if (question.equals(InputPassword)){
            inputpass = true;
        }else {
            inputpass = false;
        }
        String ConfirmPassword = Text.of(InfoPage.ConfirmPassword).viewedBy(actor).asString();
        if (question.equals(ConfirmPassword)){
            confirmpass = true;
        }else {
            confirmpass = false;
        }
        String CheckStayInformed = Text.of(InfoPage.CheckStayInformed).viewedBy(actor).asString();
        if (question.equals(CheckStayInformed)){
            checkS = true;
        }else {
            checkS = false;
        }
        String CheckAcceptConditions = Text.of(InfoPage.CheckAcceptConditions).viewedBy(actor).asString();
        if (question.equals(CheckAcceptConditions)){
            checkA = true;
        }else {
            checkA = false;
        }
        String CheckPrivacyPolicies = Text.of(InfoPage.CheckPrivacyPolicies).viewedBy(actor).asString();
        if (question.equals(CheckPrivacyPolicies)){
            checkP = true;
        }else {
            checkP = false;
        }
        String completeButton = Text.of(InfoPage.completeButton).viewedBy(actor).asString();
        if (question.equals(completeButton)){
            complete = true;
        }else {
            complete = false;
        }
        return null;
    }
}
