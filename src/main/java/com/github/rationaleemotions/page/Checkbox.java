package com.github.rationaleemotions.page;

import org.openqa.selenium.WebElement;

/**
 * A wrapper class that represents the html checkbox elements.
 */
public final class Checkbox extends GenericElement {

    Checkbox(WebElement underlyingElement) {
        super(underlyingElement);
    }

    /**
     * Checks the checkbox
     */
    public void check() {
        if (! isSelected()) {
            getUnderlyingElement().click();
        }
    }

    /**
     * Unchecks the checkbox.
     */
    public void uncheck() {
        if (isSelected()) {
            getUnderlyingElement().click();
        }
    }

    /**
     * @return - <code>true</code> if the checkbox is checked.
     */
    public boolean isChecked() {
        return isSelected();
    }
}