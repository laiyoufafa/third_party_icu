/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
 *******************************************************************************
 * Copyright (C) 2014, International Business Machines Corporation and
 * others. All Rights Reserved.
 *******************************************************************************
 */
package ohos.global.icu.util;

/**
 * Simple struct-like class for int output parameters.
 * Like <code>Output&lt;Integer&gt;</code> but without auto-boxing.
 *
 * @deprecated This API is ICU internal only.
 * @hide exposed on OHOS
 * @hide draft / provisional / internal are hidden on OHOS
 */
@Deprecated
public class OutputInt {
    /**
     * The value field.
     *
     * @deprecated This API is ICU internal only.
     * @hide draft / provisional / internal are hidden on OHOS
     */
    @Deprecated
    public int value;

    /**
     * Constructs an <code>OutputInt</code> with value 0.
     *
     * @deprecated This API is ICU internal only.
     * @hide draft / provisional / internal are hidden on OHOS
     */
    @Deprecated
    public OutputInt() {
    }

    /**
     * Constructs an <code>OutputInt</code> with the given value.
     *
     * @param value the initial value
     * @deprecated This API is ICU internal only.
     * @hide draft / provisional / internal are hidden on OHOS
     */
    @Deprecated
    public OutputInt(int value) {
        this.value = value;
    }

    /**
     * {@inheritDoc}
     * @deprecated This API is ICU internal only.
     * @hide draft / provisional / internal are hidden on OHOS
     */
    @Deprecated
    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
