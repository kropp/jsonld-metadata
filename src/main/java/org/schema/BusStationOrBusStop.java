/*
 * Copyright 2015-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 */

package org.schema;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class BusStationOrBusStop {
  void setBusStation(BusStation busStation) { clear(); myBusStation = busStation; }
  public BusStation getBusStation() { return myBusStation; }
  void setBusStop(BusStop busStop) { clear(); myBusStop = busStop; }
  public BusStop getBusStop() { return myBusStop; }
  @com.fasterxml.jackson.annotation.JsonValue public Object getJsonLdValue() {
    if (myBusStation != null) return myBusStation;
    if (myBusStop != null) return myBusStop;
    return null;
  }
  public Thing getThing() {
    if (myBusStation != null) return myBusStation;
    if (myBusStop != null) return myBusStop;
    return null;
  }
  public void clear() {
    myBusStation = null;
    myBusStop = null;
  }
  @Override public int hashCode() {
    int result = 0;
    result = 31 * result + (myBusStation != null ? myBusStation.hashCode() : 0);
    result = 31 * result + (myBusStop != null ? myBusStop.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BusStationOrBusStop busStationOrBusStop = (BusStationOrBusStop) o;
    if (myBusStation != null ? !myBusStation.equals(busStationOrBusStop.myBusStation) : busStationOrBusStop.myBusStation != null) return false;
    if (myBusStop != null ? !myBusStop.equals(busStationOrBusStop.myBusStop) : busStationOrBusStop.myBusStop != null) return false;
    return true;
  }
  private BusStation myBusStation;
  private BusStop myBusStop;
}
