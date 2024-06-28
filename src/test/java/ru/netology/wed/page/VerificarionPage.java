package ru.netology.wed.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class VerificarionPage {
    private final SelenideElement codeField = $(".input__control");
    private final SelenideElement verifyButton = $("[data-test-id='action-verify']");

    public VerificarionPage() {
        codeField.shouldBe(Condition.visible);
    }

    public DashboardPage validVerify(String verificationCode) {
        codeField.setValue(verificationCode);
        verifyButton.click();
        return new DashboardPage();
    }
}
