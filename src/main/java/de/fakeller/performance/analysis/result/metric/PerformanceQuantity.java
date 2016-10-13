package de.fakeller.performance.analysis.result.metric;

import de.fakeller.performance.analysis.result.unit.Unit;
import de.fakeller.performance.analysis.result.valueobject.ValueObject;

/**
 * Defines a metric relevant to performance analyses.
 */
public interface PerformanceQuantity<Q extends PerformanceQuantity<Q>> extends ValueObject {

    /**
     * Returns the value of this quantity as double.
     * <p>
     * Note: Make sure to check the unit of this quantity before doing any calculations!
     */
    double value();

    /**
     * The unit this performance quantity is stored in.
     */
    Unit<Q> unit();

    /**
     * Wraps a double value into a performance quantity object of the same type as this one, using the same unit.
     */
    default PerformanceQuantity wrap(final double value) {
        return wrap(value, unit());
    }

    /**
     * Wraps a double value into a performance quantity object of the same type as this one, using the supplied unit.
     */
    PerformanceQuantity wrap(double value, Unit<Q> unit);
}
