package com.ihorchyzh.thomascook;

import org.openqa.selenium.WebDriver;

/**
 * Created by ihorchyzh on 3/28/17.
 */
public class SearchResultPage extends PageObjectModel {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public int fetchSearchResultQuantity(String input) {
        char[] chars = input.toCharArray();
        String stringNumber = "";
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                stringNumber += ch;
            }
        }
        return Integer.parseInt(stringNumber);
    }

}
