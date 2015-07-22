/*
 * Copyright 2015 JetBrains s.r.o.
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

@com.fasterxml.jackson.databind.annotation.JsonSerialize(include = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL)
class EnumerationOrPropertyValueOrQualitativeValueOrQuantitativeValueOrStructuredValue {
  @com.fasterxml.jackson.annotation.JsonValue
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
  public void setEnumeration(Enumeration enumeration) { clear(); myEnumeration = enumeration; }
  public Enumeration getEnumeration() { return myEnumeration; }
  private Enumeration myEnumeration;
  public void setPropertyValue(PropertyValue propertyValue) { clear(); myPropertyValue = propertyValue; }
  public PropertyValue getPropertyValue() { return myPropertyValue; }
  private PropertyValue myPropertyValue;
  public void setQualitativeValue(QualitativeValue qualitativeValue) { clear(); myQualitativeValue = qualitativeValue; }
  public QualitativeValue getQualitativeValue() { return myQualitativeValue; }
  private QualitativeValue myQualitativeValue;
  public void setQuantitativeValue(QuantitativeValue quantitativeValue) { clear(); myQuantitativeValue = quantitativeValue; }
  public QuantitativeValue getQuantitativeValue() { return myQuantitativeValue; }
  private QuantitativeValue myQuantitativeValue;
  public void setStructuredValue(StructuredValue structuredValue) { clear(); myStructuredValue = structuredValue; }
  public StructuredValue getStructuredValue() { return myStructuredValue; }
  private StructuredValue myStructuredValue;
  private void clear() {
    myEnumeration = null;
    myPropertyValue = null;
    myQualitativeValue = null;
    myQuantitativeValue = null;
    myStructuredValue = null;
  }
}
