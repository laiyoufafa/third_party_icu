/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2017 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
package ohos.global.icu.impl.number;

import java.math.RoundingMode;
import java.util.Objects;

import ohos.global.icu.number.IntegerWidth;
import ohos.global.icu.number.Notation;
import ohos.global.icu.number.NumberFormatter.DecimalSeparatorDisplay;
import ohos.global.icu.number.NumberFormatter.SignDisplay;
import ohos.global.icu.number.NumberFormatter.UnitWidth;
import ohos.global.icu.number.Precision;
import ohos.global.icu.number.Scale;
import ohos.global.icu.text.PluralRules;
import ohos.global.icu.util.MeasureUnit;
import ohos.global.icu.util.ULocale;

/**
 * @hide exposed on OHOS
 */
public class MacroProps implements Cloneable {
    public Notation notation;
    public MeasureUnit unit;
    public MeasureUnit perUnit;
    public Precision precision;
    public RoundingMode roundingMode;
    public Object grouping;
    public Padder padder;
    public IntegerWidth integerWidth;
    public Object symbols;
    public UnitWidth unitWidth;
    public SignDisplay sign;
    public DecimalSeparatorDisplay decimal;
    public Scale scale;
    public AffixPatternProvider affixProvider; // not in API; for JDK compatibility mode only
    public PluralRules rules; // not in API; could be made public in the future
    public Long threshold; // not in API; controls internal self-regulation threshold
    public ULocale loc;

    /**
     * Copies values from fallback into this instance if they are null in this instance.
     *
     * @param fallback
     *            The instance to copy from; not modified by this operation.
     */
    public void fallback(MacroProps fallback) {
        if (notation == null)
            notation = fallback.notation;
        if (unit == null)
            unit = fallback.unit;
        if (perUnit == null)
            perUnit = fallback.perUnit;
        if (precision == null)
            precision = fallback.precision;
        if (roundingMode == null)
            roundingMode = fallback.roundingMode;
        if (grouping == null)
            grouping = fallback.grouping;
        if (padder == null)
            padder = fallback.padder;
        if (integerWidth == null)
            integerWidth = fallback.integerWidth;
        if (symbols == null)
            symbols = fallback.symbols;
        if (unitWidth == null)
            unitWidth = fallback.unitWidth;
        if (sign == null)
            sign = fallback.sign;
        if (decimal == null)
            decimal = fallback.decimal;
        if (affixProvider == null)
            affixProvider = fallback.affixProvider;
        if (scale == null)
            scale = fallback.scale;
        if (rules == null)
            rules = fallback.rules;
        if (loc == null)
            loc = fallback.loc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(notation,
                unit,
                perUnit,
                precision,
                roundingMode,
                grouping,
                padder,
                integerWidth,
                symbols,
                unitWidth,
                sign,
                decimal,
                affixProvider,
                scale,
                rules,
                loc);
    }

    @Override
    public boolean equals(Object _other) {
        if (_other == null)
            return false;
        if (this == _other)
            return true;
        if (!(_other instanceof MacroProps))
            return false;
        MacroProps other = (MacroProps) _other;
        return Objects.equals(notation, other.notation)
                && Objects.equals(unit, other.unit)
                && Objects.equals(perUnit, other.perUnit)
                && Objects.equals(precision, other.precision)
                && Objects.equals(roundingMode, other.roundingMode)
                && Objects.equals(grouping, other.grouping)
                && Objects.equals(padder, other.padder)
                && Objects.equals(integerWidth, other.integerWidth)
                && Objects.equals(symbols, other.symbols)
                && Objects.equals(unitWidth, other.unitWidth)
                && Objects.equals(sign, other.sign)
                && Objects.equals(decimal, other.decimal)
                && Objects.equals(affixProvider, other.affixProvider)
                && Objects.equals(scale, other.scale)
                && Objects.equals(rules, other.rules)
                && Objects.equals(loc, other.loc);
    }

    @Override
    public Object clone() {
        // TODO: Remove this method?
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
