package tests;

import com.codeborne.selenide.Configuration;
import configurations.BrainnestPage;
import configurations.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;
import static io.qameta.allure.Allure.step;

public class BrainnestContactTest extends TestBase {

    BrainnestPage brainnestPage = new BrainnestPage();

    @Test
    @DisplayName("Check 'Contact us' yellow button open Get in touch page")
    @Tag("contact")
    void checkYellowContactUsButtonTest() {
        step("Open Brainnest page", () -> {
            brainnestPage.openPage();
        });

        step("Click on contact us", () -> {
            brainnestPage.yellowContactUsButton.click();
        });

        step("Check Get in touch page is open", () -> {
            webdriver().shouldHave(url(Configuration.baseUrl + "/contact"));
            brainnestPage.contactPageHeader.shouldHave(text("GET IN TOUCH"));
        });
    }

    @Test
    @DisplayName("Check Facebook button")
    @Tag("contact")
    void checkFaceBookTest() {
        step("Open contact page", () -> {
            brainnestPage.openContactPage();
        });

        step("Click on Facebook button", () -> {
            brainnestPage.facebookImg.scrollTo().click();
        });

        step("Check company Facebook is open", () -> {
            switchTo().window(2);
            webdriver().shouldHave(urlContaining("https://www.facebook.com"));
        });
    }

    @Test
    @DisplayName("Check LinkedIn button")
    @Tag("contact")
    void checkLinkedInTest() {
        step("Open contact page", () -> {
            brainnestPage.openContactPage();
        });

        step("Click on LinkedIn button", () -> {
            brainnestPage.linkedInImg.scrollTo().click();
        });

        step("Check company LinkedIn is open", () -> {
            switchTo().window(1);
            webdriver().shouldHave(urlContaining("https://www.linkedin.com"));
        });
    }
}