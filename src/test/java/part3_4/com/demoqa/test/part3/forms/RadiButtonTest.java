package part3_4.com.demoqa.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static java.nio.file.Files.find;

public class RadiButtonTest extends BaseTest {
    @Test
    public void testRadiButtonTest(){
        var formsPage=homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected=formsPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected,
                "\n Female radio button is not selected \n");
    }


}
