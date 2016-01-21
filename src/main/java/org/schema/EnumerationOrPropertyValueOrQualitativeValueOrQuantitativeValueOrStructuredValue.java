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
public class EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue {
  @JsonValue
  public Object getJsonLdValue() {
    if (myEnumeration != null) return myEnumeration;
    if (myPropertyValue != null) return myPropertyValue;
    if (myQualitativeValue != null) return myQualitativeValue;
    if (myQuantitativeValue != null) return myQuantitativeValue;
    if (myStructuredValue != null) return myStructuredValue;
    return null;
  }
  public Thing getThing() {
    if (myEnumeration != null) return myEnumeration;
    if (myPropertyValue != null) return myPropertyValue;
    if (myQualitativeValue != null) return myQualitativeValue;
    if (myQuantitativeValue != null) return myQuantitativeValue;
    if (myStructuredValue != null) return myStructuredValue;
    return null;
  }
  void setEnumeration(Enumeration enumeration) { clear(); myEnumeration = enumeration; }
  public Enumeration getEnumeration() { return myEnumeration; }
  private Enumeration myEnumeration;
  void setPropertyValue(PropertyValue propertyValue) { clear(); myPropertyValue = propertyValue; }
  public PropertyValue getPropertyValue() { return myPropertyValue; }
  private PropertyValue myPropertyValue;
  void setQualitativeValue(QualitativeValue qualitativeValue) { clear(); myQualitativeValue = qualitativeValue; }
  public QualitativeValue getQualitativeValue() { return myQualitativeValue; }
  private QualitativeValue myQualitativeValue;
  void setQuantitativeValue(QuantitativeValue quantitativeValue) { clear(); myQuantitativeValue = quantitativeValue; }
  public QuantitativeValue getQuantitativeValue() { return myQuantitativeValue; }
  private QuantitativeValue myQuantitativeValue;
  void setStructuredValue(StructuredValue structuredValue) { clear(); myStructuredValue = structuredValue; }
  public StructuredValue getStructuredValue() { return myStructuredValue; }
  private StructuredValue myStructuredValue;
  private void clear() {
    myEnumeration = null;
    myPropertyValue = null;
    myQualitativeValue = null;
    myQuantitativeValue = null;
    myStructuredValue = null;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myEnumeration != null ? myEnumeration.hashCode() : 0);
    result = 31 * result + (myPropertyValue != null ? myPropertyValue.hashCode() : 0);
    result = 31 * result + (myQualitativeValue != null ? myQualitativeValue.hashCode() : 0);
    result = 31 * result + (myQuantitativeValue != null ? myQuantitativeValue.hashCode() : 0);
    result = 31 * result + (myStructuredValue != null ? myStructuredValue.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue enumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue = (EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue) o;
    if (myEnumeration != null ? !myEnumeration.equals(enumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue.myEnumeration) : enumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue.myEnumeration != null) return false;
    if (myPropertyValue != null ? !myPropertyValue.equals(enumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue.myPropertyValue) : enumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue.myPropertyValue != null) return false;
    if (myQualitativeValue != null ? !myQualitativeValue.equals(enumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue.myQualitativeValue) : enumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue.myQualitativeValue != null) return false;
    if (myQuantitativeValue != null ? !myQuantitativeValue.equals(enumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue.myQuantitativeValue) : enumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue.myQuantitativeValue != null) return false;
    if (myStructuredValue != null ? !myStructuredValue.equals(enumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue.myStructuredValue) : enumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue.myStructuredValue != null) return false;
    return true;
  }

}
