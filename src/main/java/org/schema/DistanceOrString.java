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

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class DistanceOrString {
  @JsonValue
  public Object getJsonLdValue() {
    if (myDistance != null) return myDistance;
    if (myString != null) return myString;
    return null;
  }
  void setDistance(Distance distance) { clear(); myDistance = distance; }
  public Distance getDistance() { return myDistance; }
  private Distance myDistance;
  void setString(String value) { clear(); myString = value; }
  public String getString() { return myString; }
  private String myString;
  private void clear() {
    myDistance = null;
    myString = null;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myDistance != null ? myDistance.hashCode() : 0);
    result = 31 * result + (myString != null ? myString.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DistanceOrString distanceOrString = (DistanceOrString) o;
    if (myDistance != null ? !myDistance.equals(distanceOrString.myDistance) : distanceOrString.myDistance != null) return false;
    if (myString != null ? !myString.equals(distanceOrString.myString) : distanceOrString.myString != null) return false;
    return true;
  }

}
