/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2017 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
package ohos.global.icu.impl.number.parse;

/**
 * @author sffc
 * @hide exposed on OHOS
 *
 */
public class RequireNumberValidator extends ValidationMatcher {

    @Override
    public void postProcess(ParsedNumber result) {
        // Require that a number is matched.
        if (!result.seenNumber()) {
            result.flags |= ParsedNumber.FLAG_FAIL;
        }
    }

    @Override
    public String toString() {
        return "<RequireNumber>";
    }

}
