package pt.fcmartins.objects;

import java.util.HashMap;
import java.util.Map.Entry;

import static pt.fcmartins.utils.Constants.Core.Error.OBJECT_IS_NULL;
import static pt.fcmartins.utils.Constants.Core.MESSAGE_STR_PREFIX;

/**
 * Validation object used to contain validation's over an request object that used {@link javax.validation}
 * annotation constraints
 *
 * @author Francisco Martins
 * @version 2.000.000, 30/11/2020
 */
public class ValidationResult {

    private boolean isValid;
    private final HashMap<String, String> messages;
    private String root;

    @Override
    public String toString() {
        if (this.root == null) {

            return OBJECT_IS_NULL;
        }
        String str = MESSAGE_STR_PREFIX;
        int index = 0;
        for (Entry<String, String> it : this.messages.entrySet()) {
            if (index > 0) {
                str = str.concat(";");
            }
            str = str.concat("[").concat(it.getKey()).concat(" - ").concat(it.getValue()).concat("]");
            index++;
        }

        return str;
    }

    public ValidationResult(Integer size, String root) {
        this.isValid = true;
        this.messages = new HashMap<>(size);
        this.root = root;
    }

    public ValidationResult(boolean valid) {
        this.messages = new HashMap<>(1);
        this.isValid = valid;
    }

    public void addMessage(String method, String msg) {
        this.isValid = false;
        this.messages.put(method, msg);
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean _valid) {
        this.isValid = _valid;
    }

    public void setObjClass(String _objClass) {
        this.root = _objClass;
    }

    public Object getInvalidFields() {
        return this.messages;
    }

    public String getValidatedClass() {
        return root;
    }

    public ValidationResult addMessage(String msg) {
        this.isValid = false;
        this.messages.put(OBJECT_IS_NULL, msg);

        return this;
    }
}
