package de.fakeller.performance.analysis.result.metric;

import de.fakeller.performance.analysis.result.unit.TimeUnit;

/**
 * To be used by time-related performance quantities, such as response times, execution times or service times.
 */
public interface TimeQuantity extends PerformanceQuantity<TimeUnit> {
}
