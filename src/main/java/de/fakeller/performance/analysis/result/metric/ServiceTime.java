package de.fakeller.performance.analysis.result.metric;

import de.fakeller.performance.analysis.result.unit.TimeUnit;
import de.fakeller.performance.analysis.result.valueobject.Duration;

/**
 * The time it takes for a single operation to complete.
 */
public class ServiceTime extends AbstractPerformanceQuantity<TimeUnit, Duration> implements TimeQuantity {

    public ServiceTime(final Duration serviceTime) {
        super(serviceTime, TimeUnit.MILLISECONDS);
    }

    public Duration getServiceTime() {
        return this.value;
    }

    protected String getHumanReadableDescription() {
        return "Service time";
    }


    @Override
    public double value() {
        return this.value.getMilliseconds();
    }

    public ServiceTime wrap(final double value, final TimeUnit unit) {
        assert unit.equals(TimeUnit.MILLISECONDS);
        return new ServiceTime(Duration.ofMilliseconds(value));
    }
}
