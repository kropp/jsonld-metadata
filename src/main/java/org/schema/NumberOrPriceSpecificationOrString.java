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
class NumberOrPriceSpecificationOrString {
  @JsonValue
  public Object getJsonLdValue() {
    if (myNumber != null) return myNumber;
    if (myPriceSpecification != null) return myPriceSpecification;
    if (myString != null) return myString;
    return null;
  }
  public void setNumber(Number number) { clear(); myNumber = number; }
  public Number getNumber() { return myNumber; }
  public void setPriceSpecification(PriceSpecification priceSpecification) { clear(); myPriceSpecification = priceSpecification; }
  public PriceSpecification getPriceSpecification() { return myPriceSpecification; }
  public void setString(String value) { clear(); myString = value; }
  public String getString() { return myString; }
  private Number myNumber;
  private PriceSpecification myPriceSpecification;
  private String myString;
  private void clear() {
    myNumber = null;
    myPriceSpecification = null;
    myString = null;
  }
}
