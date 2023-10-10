package ua.page.object.selenide;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageLocators {

    @Step("Checking category quantity {size}")
    public MainPageLogic checkCategoryQuantity(int size) {
        categoriesSideBar.shouldHave(CollectionCondition.size(size));
        return this;
    }

    @Step("Click on category in Side Bar ")
    public CategoryPageLogic clickOnCategoryInSideBar(int category) {
        categoriesSideBar.get(category).click();
        return page(CategoryPageLogic.class);
    }

}
