package ua.page.object.selenide;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;

public class SearchPageLogic extends SearchPageLocators {

    @Step("Checking quantity product on page {size}")
    public SearchPageLogic checkingQuantityProductOnPage(int size) {
        tittlesOfProducts.shouldHave(CollectionCondition.size(size));
        return this;
    }

}
