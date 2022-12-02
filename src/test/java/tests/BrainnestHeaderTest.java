package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import pages.BrainnestPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static io.qameta.allure.Allure.step;

public class BrainnestHeaderTest extends TestBase {

    BrainnestPage brainnestPage = new BrainnestPage();

    @Test
    @DisplayName("Header are displayed")
    @Tag("header")
    void headerAppearanceTest() {
        step("Open Brainnest page", () -> {
            brainnestPage.openPage();
        });

        step("Topics are displayed in header", () -> {
            brainnestPage.topMenu.findBy(Condition.text("HOME")).shouldBe(Condition.visible);
            brainnestPage.topMenu.findBy(Condition.text("OUR SERVICES")).shouldBe(Condition.visible);
            brainnestPage.topMenu.findBy(Condition.text("OUR PARTNERS")).shouldBe(Condition.visible);
            brainnestPage.topMenu.findBy(Condition.text("CONTACT US")).shouldBe(Condition.visible);
        });
    }

    @Test
    @DisplayName("Check 'Contact us' button open Get in touch page")
    @Tag("header")
    @Tag("contact")
    void checkContactUsButtonTest() {
        step("Open Brainnest page", () -> {
            brainnestPage.openPage();
        });

        step("Click on contact us", () -> {
            brainnestPage.contactUsButton.click();
        });

        step("Check Get in touch page is open", () -> {
            webdriver().shouldHave(url(Configuration.baseUrl + "/contact"));
            brainnestPage.contactPageHeader.shouldHave(text("GET IN TOUCH"));
        });
    }
}
