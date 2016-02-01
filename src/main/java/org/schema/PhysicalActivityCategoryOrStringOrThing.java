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
public class PhysicalActivityCategoryOrStringOrThing {
  void setPhysicalActivityCategory(PhysicalActivityCategory physicalActivityCategory) { clear(); myPhysicalActivityCategory = physicalActivityCategory; }
  public PhysicalActivityCategory getPhysicalActivityCategory() { return myPhysicalActivityCategory; }
  void setString(String value) { clear(); myString = value; }
  public String getString() { return myString; }
  void setThing(Thing thing) { clear(); myThing = thing; }
  public Thing getThing() { return myThing; }
  @com.fasterxml.jackson.annotation.JsonValue public Object getJsonLdValue() {
    if (myPhysicalActivityCategory != null) return myPhysicalActivityCategory;
    if (myString != null) return myString;
    if (myThing != null) return myThing;
    return null;
  }
  public void clear() {
    myPhysicalActivityCategory = null;
    myString = null;
    myThing = null;
  }
  @Override public int hashCode() {
    int result = 0;
    result = 31 * result + (myPhysicalActivityCategory != null ? myPhysicalActivityCategory.hashCode() : 0);
    result = 31 * result + (myString != null ? myString.hashCode() : 0);
    result = 31 * result + (myThing != null ? myThing.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PhysicalActivityCategoryOrStringOrThing physicalActivityCategoryOrStringOrThing = (PhysicalActivityCategoryOrStringOrThing) o;
    if (myPhysicalActivityCategory != null ? !myPhysicalActivityCategory.equals(physicalActivityCategoryOrStringOrThing.myPhysicalActivityCategory) : physicalActivityCategoryOrStringOrThing.myPhysicalActivityCategory != null) return false;
    if (myString != null ? !myString.equals(physicalActivityCategoryOrStringOrThing.myString) : physicalActivityCategoryOrStringOrThing.myString != null) return false;
    if (myThing != null ? !myThing.equals(physicalActivityCategoryOrStringOrThing.myThing) : physicalActivityCategoryOrStringOrThing.myThing != null) return false;
    return true;
  }
  private PhysicalActivityCategory myPhysicalActivityCategory;
  private String myString;
  private Thing myThing;
}
