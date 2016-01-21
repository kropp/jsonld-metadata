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
public class EnumerationOrProperty {
  @JsonValue
  public Object getJsonLdValue() {
    if (myEnumeration != null) return myEnumeration;
    if (myProperty != null) return myProperty;
    return null;
  }
  public Thing getThing() {
    if (myEnumeration != null) return myEnumeration;
    if (myProperty != null) return myProperty;
    return null;
  }
  void setEnumeration(Enumeration enumeration) { clear(); myEnumeration = enumeration; }
  public Enumeration getEnumeration() { return myEnumeration; }
  private Enumeration myEnumeration;
  void setProperty(Property property) { clear(); myProperty = property; }
  public Property getProperty() { return myProperty; }
  private Property myProperty;
  private void clear() {
    myEnumeration = null;
    myProperty = null;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myEnumeration != null ? myEnumeration.hashCode() : 0);
    result = 31 * result + (myProperty != null ? myProperty.hashCode() : 0);
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnumerationOrProperty enumerationOrProperty = (EnumerationOrProperty) o;
    if (myEnumeration != null ? !myEnumeration.equals(enumerationOrProperty.myEnumeration) : enumerationOrProperty.myEnumeration != null) return false;
    if (myProperty != null ? !myProperty.equals(enumerationOrProperty.myProperty) : enumerationOrProperty.myProperty != null) return false;
    return true;
  }

}
