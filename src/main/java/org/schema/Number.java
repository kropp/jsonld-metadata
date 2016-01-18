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
class Number {
  @JsonValue
  public Object getJsonLdValue() {
    if (myInt != null) return myInt;
    if (myLong != null) return myLong;
    if (myFloat != null) return myFloat;
    if (myDouble != null) return myDouble;
    if (myString != null) return myString;
    return null;
  }
  public void setInt(int value) { clear(); myInt = value; }
  public int getInt() { return myInt; }
  public void setLong(long value) { clear(); myLong = value; }
  public long getLong() { return myLong; }
  public void setFloat(float value) { clear(); myFloat = value; }
  public float getFloat() { return myFloat; }
  public void setDouble(double value) { clear(); myDouble = value; }
  public double getDouble() { return myDouble; }
  public void setString(String value) { clear(); myString = value; }
  public String getString() { return myString; }
  private Integer myInt;
  private Long myLong;
  private Float myFloat;
  private Double myDouble;
  private String myString;
  private void clear() {
    myInt = null;
    myLong = null;
    myFloat = null;
    myDouble = null;
    myString = null;
  }
}
