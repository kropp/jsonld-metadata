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
public class NumberOrQuantitativeValue {
  @JsonValue
  public Object getJsonLdValue() {
    if (myNumber != null) return myNumber;
    if (myQuantitativeValue != null) return myQuantitativeValue;
    return null;
  }
  public Thing getThing() {
    if (myQuantitativeValue != null) return myQuantitativeValue;
    return null;
  }
  void setNumber(Number number) { clear(); myNumber = number; }
  public Number getNumber() { return myNumber; }
  private Number myNumber;
  void setQuantitativeValue(QuantitativeValue quantitativeValue) { clear(); myQuantitativeValue = quantitativeValue; }
  public QuantitativeValue getQuantitativeValue() { return myQuantitativeValue; }
  private QuantitativeValue myQuantitativeValue;
  private void clear() {
    myNumber = null;
    myQuantitativeValue = null;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myNumber != null ? myNumber.hashCode() : 0);
    result = 31 * result + (myQuantitativeValue != null ? myQuantitativeValue.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NumberOrQuantitativeValue numberOrQuantitativeValue = (NumberOrQuantitativeValue) o;
    if (myNumber != null ? !myNumber.equals(numberOrQuantitativeValue.myNumber) : numberOrQuantitativeValue.myNumber != null) return false;
    if (myQuantitativeValue != null ? !myQuantitativeValue.equals(numberOrQuantitativeValue.myQuantitativeValue) : numberOrQuantitativeValue.myQuantitativeValue != null) return false;
    return true;
  }

}
