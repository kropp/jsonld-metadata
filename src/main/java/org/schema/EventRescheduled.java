/** THIS IS AN AUTO GENERATED CLASS. DO NOT EDIT. Generated on Tue Jul 21 16:07:12 CEST 2015 */

package org.schema;

/**
 * The event has been rescheduled. The event's previousStartDate should be set to the old date and the startDate should be set to the event's new date. (If the event has been rescheduled multiple times, the previousStartDate property may be repeated).
 */
public class EventRescheduled {
  /**
   * Builder for {@see EventRescheduled}
   */
  public static final class Builder {
    public EventRescheduled build() {
      return new EventRescheduled();
    }
  }

  protected EventRescheduled() {
  }
}
