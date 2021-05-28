/*
 * MIT License
 *
 * Copyright (c)  2020-2021, Francisco Martins
 */

import org.junit.Assert;
import org.junit.Test;
import pt.fcmartins.Target.Type;
import pt.fcmartins.Sanitize;

/**
 * Process testing steps using Arquillian framework
 *
 * @author Francisco Martins {@link <mailto:francisco.drive.7@gmail.com}
 */
public class SanitizeTest {

    private boolean sanitize(@Sanitize(encoders = {Type.ALL}) Object object) {
        return true;
    }

    @Test
    public void validateString() {
        try {
            Assert.assertTrue(sanitize("Test"));
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void validateNumber() {
        Assert.assertTrue(true);
    }

    @Test
    public void validateDate() {
        Assert.assertTrue(true);
    }

    @Test
    public void validateEmail() {
        Assert.assertTrue(true);
    }

    @Test
    public void validateStringJavaScript() {
        Assert.assertTrue(true);
    }

    @Test
    public void validateStringHtml() {
        Assert.assertTrue(true);
    }

    @Test
    public void validateStringSql() {
        Assert.assertTrue(true);
    }

}
