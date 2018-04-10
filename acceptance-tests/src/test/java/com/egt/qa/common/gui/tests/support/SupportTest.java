package com.egt.qa.common.gui.tests.support;

import com.egt.qa.common.gui.annotations.TestCaseID;
import com.egt.qa.common.gui.tests.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SupportTest extends AbstractTest {
    @DataProvider(name = "forSearch")
    public Object[] forSearch() {
        return new Object[]{
                "Как зарегистрироваться на портале",
                "Как получить скидку 30% на оплату госпошлины",
                "Как узнать о наличии налоговой задолженности"
        };
    }

    @Test(description = "Поиск ответа на вопрос с помощью кнопки «увеличительное стекло»", dataProvider = "forSearch")
    @TestCaseID("301")
    public void searchWithButton(String searchText) {
        Assert.assertTrue(false);
    }

    @Test(description = "Поиск ответа на вопрос с помощью всплывающей подсказки", dataProvider = "forSearch")
    @TestCaseID("302")
    public void searchWithHint(String searchText) {
        if (searchText.equals("Как получить скидку 30% на оплату госпошлины")) {
            Assert.assertEquals("Запись на прием в Госавтоинспекцию подтверждена, но оплата госпошлины через портал недоступна", searchText);
        }
        Assert.assertEquals(searchText, searchText);
    }
}