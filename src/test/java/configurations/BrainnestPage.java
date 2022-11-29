package configurations;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class BrainnestPage {public BrainnestPage openPage() {
    open("/");
    return this;
}

    public BrainnestPage openContactPage() {
        open("/contact");
        return this;
    }

    public ElementsCollection
            topMenu = $$("#comp-l3e1cy1a");
    public SelenideElement
            linkedInImg = $("#img_1_comp-l3ufofmt"),
            facebookImg = $("#img_0_comp-l3ufofmt"),
            yellowContactUsButton = $("#comp-l3kfb6kw"),
            contactUsButton = $("#comp-l3e1cy1a3"),
            contactPageHeader = $("#comp-kic44u9d").$("h5");
}

